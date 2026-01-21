package MoreConnectionswithTokens.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.maven

object MoreConnectionswithTokens_GhaAutoGitHubComBuildBookingApiPayconiq : BuildType({
    name = "GHA (auto, GitHub.com): Build BookingApiPayconiq"

    vcs {
        root(MoreConnectionswithTokens.vcsRoots.MoreConnectionswithTokens_HttpsGithubComDariaKrupBookingApiPayconiqRefsHeadsMaster)
    }

    steps {
        maven {
            id = "Maven2"
            goals = "clean test"
            runnerArgs = "-Dmaven.test.failure.ignore=true"
        }
    }
})
