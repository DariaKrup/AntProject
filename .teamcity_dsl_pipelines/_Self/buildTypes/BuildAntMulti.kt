package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.ant
import jetbrains.buildServer.configs.kotlin.triggers.vcs

object BuildAntMulti : BuildType({
    name = "Build: Ant (multi)"

    vcs {
        root(_Self.vcsRoots.HttpsGithubComDariaKrupAntProjectRefsHeadsMaster3)
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
            branchFilter = """
                +:m*
                -:br*
            """.trimIndent()
        }
    }
})
