package MoreConnectionswithTokens.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.maven
import jetbrains.buildServer.configs.kotlin.triggers.vcs

object MoreConnectionswithTokens_JavaMavenBbDataCenter : BuildType({
    name = "Java Maven: BB DataCenter"

    vcs {
        root(MoreConnectionswithTokens.vcsRoots.MoreConnectionswithTokens_HttpsBbdatacenterQaTeamcityComScmDksJavaMavenJunitGitRefsHeadsMaster)
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
})
