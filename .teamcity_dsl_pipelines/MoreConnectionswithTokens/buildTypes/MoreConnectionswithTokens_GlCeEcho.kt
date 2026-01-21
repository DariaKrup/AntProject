package MoreConnectionswithTokens.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.script
import jetbrains.buildServer.configs.kotlin.triggers.vcs

object MoreConnectionswithTokens_GlCeEcho : BuildType({
    name = "GL CE: echo"

    vcs {
        root(MoreConnectionswithTokens.vcsRoots.MoreConnectionswithTokens_HttpGitlabvcsQaTeamcityComContextTestDanilaGroup1simplepr1gitRefsHeadsMain)
    }

    steps {
        script {
            id = "simpleRunner"
            scriptContent = "less ./main.txt"
        }
    }

    triggers {
        vcs {
            branchFilter = ""
            enableQueueOptimization = false
        }
    }
})
