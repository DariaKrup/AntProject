package _Self.buildTypes

import _Self.vcsRoots.HttpsBitbucketOrgTeamcityqaOllvenJavaMavenRefsHeadsMaster
import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildFeatures.commitStatusPublisher
import jetbrains.buildServer.configs.kotlin.buildFeatures.pullRequests
import jetbrains.buildServer.configs.kotlin.buildSteps.maven
import jetbrains.buildServer.configs.kotlin.triggers.vcs

object Build : BuildType({
    name = "Build: BB Cloud"

    vcs {
        root(_Self.vcsRoots.HttpsBitbucketOrgTeamcityqaOllvenJavaMavenRefsHeadsMaster)
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
            vcsRootExtId = "${HttpsBitbucketOrgTeamcityqaOllvenJavaMavenRefsHeadsMaster.id}"
            provider = bitbucketCloud {
                authType = vcsRoot()
            }
        }
        commitStatusPublisher {
            vcsRootExtId = "${HttpsBitbucketOrgTeamcityqaOllvenJavaMavenRefsHeadsMaster.id}"
            publisher = bitbucketCloud {
                authType = vcsRoot()
            }
        }
    }
})
