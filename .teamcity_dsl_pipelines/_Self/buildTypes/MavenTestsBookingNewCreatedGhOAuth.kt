package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.maven

object MavenTestsBookingNewCreatedGhOAuth : BuildType({
    name = "Maven tests: Booking (new created GH OAuth)"

    vcs {
        root(_Self.vcsRoots.HttpsGithubComDariaKrupBookingApiPayconiqRefsHeadsMaster)
    }

    steps {
        maven {
            id = "Maven2"
            goals = "clean test"
            runnerArgs = "-Dmaven.test.failure.ignore=true"
        }
    }
})
