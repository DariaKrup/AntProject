package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.dotnetBuild
import jetbrains.buildServer.configs.kotlin.triggers.vcs

object NUnitTestsGha : BuildType({
    name = "NUnitTests: GHA"

    vcs {
        root(_Self.vcsRoots.HttpsGithubComDariaKrupNUnitTestsRefsHeadsMain)
    }

    steps {
        dotnetBuild {
            id = "dotnet"
            projects = "NUnitTests.sln"
            sdk = "8"
        }
    }

    triggers {
        vcs {
        }
    }
})
