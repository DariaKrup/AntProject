package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.script
import jetbrains.buildServer.configs.kotlin.triggers.vcs

object BuildGitLabEe : BuildType({
    name = "Build: GitLab EE"

    params {
        param("parameter_p", "p")
    }

    vcs {
        root(_Self.vcsRoots.HttpGitlabvcsQaTeamcityComContextTestDanilaGroup1simplepr1gitRefsHeadsMain)
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
