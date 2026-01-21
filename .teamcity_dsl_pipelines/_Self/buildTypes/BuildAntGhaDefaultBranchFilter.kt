package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.ant
import jetbrains.buildServer.configs.kotlin.triggers.vcs

object BuildAntGhaDefaultBranchFilter : BuildType({
    name = "Build: Ant (GHA), default branch filter"

    vcs {
        root(_Self.vcsRoots.HttpsGithubComDariaKrupAntProjectRefsHeadsMaster)
    }

    steps {
        ant {
            id = "Ant"
            mode = antFile {
            }
            targets = "build"
        }
    }

    triggers {
        vcs {
            branchFilter = ""
            enableQueueOptimization = false
        }
    }
})
