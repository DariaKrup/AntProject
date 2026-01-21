package PipelinesWithDefaultPRSettings.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.gradle

object PipelinesWithDefaultPRSettings_BuildAzurePat : BuildType({
    name = "Build: Azure PAT"

    vcs {
        root(PipelinesWithDefaultPRSettings.vcsRoots.PipelinesWithDefaultPRSettings_HttpsDariaKrupkina0066devAzureComDariaKrupkina0066TeamCity20ProjectGitTeamCity20ProjectRefsHeadsMaster2)
    }

    steps {
        gradle {
            id = "gradle_runner"
            tasks = "clean build"
            gradleWrapperPath = ""
        }
    }
})
