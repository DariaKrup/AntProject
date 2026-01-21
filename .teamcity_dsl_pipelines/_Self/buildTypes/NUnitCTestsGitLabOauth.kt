package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.dotnetTest

object NUnitCTestsGitLabOauth : BuildType({
    name = "NUnit C# tests: GitLab Oauth"

    vcs {
        root(_Self.vcsRoots.HttpsGitlabComTcqaNunitCsharpTestsProjectRefsHeadsMaster)
    }

    steps {
        dotnetTest {
            id = "dotnet"
            projects = "money/Money.csproj"
            sdk = "6"
        }
        dotnetTest {
            id = "dotnet_1"
            projects = "syntax/AssertSyntax.csproj"
            sdk = "6"
        }
    }
})
