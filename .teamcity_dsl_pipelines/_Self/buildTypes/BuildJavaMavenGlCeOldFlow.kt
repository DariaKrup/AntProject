package _Self.buildTypes

import _Self.vcsRoots.Http101289311jetbrainsJavaMavenJunitGitRefsHeadsMaster
import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildFeatures.commitStatusPublisher
import jetbrains.buildServer.configs.kotlin.buildFeatures.perfmon
import jetbrains.buildServer.configs.kotlin.buildFeatures.pullRequests
import jetbrains.buildServer.configs.kotlin.buildSteps.maven
import jetbrains.buildServer.configs.kotlin.triggers.vcs

object BuildJavaMavenGlCeOldFlow : BuildType({
    name = "Build: Java Maven (GL CE, old flow)"

    vcs {
        root(_Self.vcsRoots.Http101289311jetbrainsJavaMavenJunitGitRefsHeadsMaster)
    }

    steps {
        maven {
            id = "Maven2"
            goals = "clean test"
            runnerArgs = "-Dmaven.test.failure.ignore=true"
        }
    }

    triggers {
        vcs {
        }
    }

    features {
        perfmon {
        }
        pullRequests {
            vcsRootExtId = "${Http101289311jetbrainsJavaMavenJunitGitRefsHeadsMaster.id}"
            provider = gitlab {
                authType = vcsRoot()
            }
        }
        commitStatusPublisher {
            vcsRootExtId = "${Http101289311jetbrainsJavaMavenJunitGitRefsHeadsMaster.id}"
            publisher = gitlab {
                authType = storedToken {
                    tokenId = "tc_token_id:CID_7075199182e3b1a61fd3483ceb273d98:1:621d3883-9fd6-40c3-989f-25f6565cfc28"
                }
            }
        }
    }
})
