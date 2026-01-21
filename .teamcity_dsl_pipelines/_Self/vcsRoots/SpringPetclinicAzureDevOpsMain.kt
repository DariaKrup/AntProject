package _Self.vcsRoots

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.vcs.GitVcsRoot

object SpringPetclinicAzureDevOpsMain : GitVcsRoot({
    name = "Spring Petclinic: Azure DevOps: main"
    url = "https://DariaKrupkina0066@dev.azure.com/DariaKrupkina0066/TeamCity%20Project/_git/spring-petclinic.git"
    branch = "main"
    branchSpec = "refs/heads/*"
    authMethod = token {
        userName = "Daria.Krupkina@jetbrains.com"
        tokenId = "tc_token_id:CID_049968f7e913a40f7d00bed4721dabb3:1:0b121823-cf01-45c0-8ceb-6d30a910abb1"
    }
    param("pipelines.connectionId", "PROJECT_EXT_577")
})
