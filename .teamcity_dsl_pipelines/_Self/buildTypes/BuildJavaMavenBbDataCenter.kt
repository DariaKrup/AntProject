package _Self.buildTypes

import _Self.vcsRoots.HttpsBbdatacenterQaTeamcityComScmOlJavaMavenGitRefsHeadsMaster
import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildFeatures.commitStatusPublisher
import jetbrains.buildServer.configs.kotlin.buildFeatures.pullRequests
import jetbrains.buildServer.configs.kotlin.buildSteps.maven
import jetbrains.buildServer.configs.kotlin.triggers.vcs

object BuildJavaMavenBbDataCenter : BuildType({
    name = "Build: Java Maven (BB Data Center)"

    vcs {
        root(_Self.vcsRoots.HttpsBbdatacenterQaTeamcityComScmOlJavaMavenGitRefsHeadsMaster)
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
            branchFilter = ""
            enableQueueOptimization = false
        }
    }

    features {
        pullRequests {
            vcsRootExtId = "${HttpsBbdatacenterQaTeamcityComScmOlJavaMavenGitRefsHeadsMaster.id}"
            provider = bitbucketServer {
                authType = vcsRoot()
            }
        }
        commitStatusPublisher {
            vcsRootExtId = "${HttpsBbdatacenterQaTeamcityComScmOlJavaMavenGitRefsHeadsMaster.id}"
            publisher = bitbucketServer {
                authType = vcsRoot()
            }
        }
    }
})
