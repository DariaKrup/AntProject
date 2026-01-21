package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildFeatures.perfmon
import jetbrains.buildServer.configs.kotlin.buildSteps.maven

object BuildMavenTests : BuildType({
    name = "Build: Maven tests"

    vcs {
        root(_Self.vcsRoots.HttpsGitlabComTcqaTestTriangleCheckerRefsHeadsMaster)
    }

    steps {
        maven {
            id = "Maven2"
            goals = "clean test"
            runnerArgs = "-Dmaven.test.failure.ignore=true"
        }
    }

    features {
        perfmon {
        }
    }
})
