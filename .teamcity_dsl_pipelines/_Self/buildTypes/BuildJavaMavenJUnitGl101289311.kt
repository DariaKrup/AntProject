package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.maven
import jetbrains.buildServer.configs.kotlin.triggers.vcs

object BuildJavaMavenJUnitGl101289311 : BuildType({
    name = "Build: Java Maven JUnit (GL 10.128.93.11)"

    vcs {
        root(_Self.vcsRoots.Http101289311jetbrainsJavaMavenJunitGitRefsHeadsMaster1)
    }

    steps {
        maven {
            id = "Maven2"
            goals = "clean test"
            runnerArgs = "-Dmaven.test.failure.ignore=true"
        }
    }

    triggers {
        vcs {
            branchFilter = """
                +:master*
                +:DariaKrup*
            """.trimIndent()
        }
    }
})
