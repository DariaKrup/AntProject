package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.maven

object BuildBbCloudSampleMaven : BuildType({
    name = "Build: BB Cloud sample Maven"

    vcs {
        root(_Self.vcsRoots.HttpsBitbucketOrgTeamcityTestSampleMavenAppRefsHeadsMaster)
    }

    steps {
        maven {
            id = "Maven2"
            goals = "clean test"
            runnerArgs = "-Dmaven.test.failure.ignore=true"
            mavenVersion = bundled_3_9()
            jdkHome = "%env.JDK_11_0%"
        }
    }
})
