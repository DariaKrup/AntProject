package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.dotnetBuild
import jetbrains.buildServer.configs.kotlin.triggers.vcs

object BuildGlComNUnitCTests : BuildType({
    name = "Build GL.com: NUnit C# tests"

    vcs {
        root(_Self.vcsRoots.HttpsGitlabComTcqaNunitCsharpTestsProjectRefsHeadsMaster1)
    }

    steps {
        dotnetBuild {
            id = "dotnet"
            projects = "Samples.sln"
            sdk = "6"
        }
    }

    triggers {
        vcs {
            branchFilter = ""
            enableQueueOptimization = false
        }
    }
})
