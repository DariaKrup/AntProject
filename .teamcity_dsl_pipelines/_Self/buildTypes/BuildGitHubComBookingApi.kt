package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.maven

object BuildGitHubComBookingApi : BuildType({
    name = "Build: GitHub.com Booking API"

    vcs {
        root(_Self.vcsRoots.HttpsGithubComDariaKrupBookingApiPayconiqRefsHeadsMaster1_2)
    }

    steps {
        maven {
            id = "Maven2"
            goals = "clean test"
            runnerArgs = "-Dmaven.test.failure.ignore=true"
        }
    }
})
