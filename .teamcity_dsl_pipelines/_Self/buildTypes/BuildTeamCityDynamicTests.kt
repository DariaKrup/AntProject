package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.dotnetBuild

object BuildTeamCityDynamicTests : BuildType({
    name = "Build: TeamCityDynamicTests"

    vcs {
        root(_Self.vcsRoots.HttpsGithubComDariaKrupTeamCityDynamicTestsGitRefsHeadsMain)
    }

    steps {
        dotnetBuild {
            id = "dotnet"
            projects = "TeamCityTestCount.sln"
            sdk = "4.8"
        }
    }
})
