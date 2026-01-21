package PipelinesWithDefaultPRSettings.vcsRoots

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.vcs.GitVcsRoot

object PipelinesWithDefaultPRSettings_HttpsDariaKrupkina0066devAzureComDariaKrupkina0066TeamCity20ProjectGitTeamCity20ProjectRefsHeadsMaster1 : GitVcsRoot({
    name = "https://DariaKrupkina0066@dev.azure.com/DariaKrupkina0066/TeamCity%20Project/_git/TeamCity%20Project#refs/heads/master (1)"
    url = "https://DariaKrupkina0066@dev.azure.com/DariaKrupkina0066/TeamCity%20Project/_git/TeamCity%20Project"
    branch = "refs/heads/master"
    branchSpec = "refs/heads/*"
    authMethod = password {
        userName = "dkrupkina"
        password = "credentialsJSON:56f48446-9200-4071-aa02-9a8b9c705b17"
    }
    param("pipelines.connectionId", "PROJECT_EXT_638")
})
