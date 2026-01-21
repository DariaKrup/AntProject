package _Self.vcsRoots

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.vcs.GitVcsRoot

object HttpsDariakrupkinaDevAzureComDariakrupkinaTeamCity20Test20ProjectGitTeamcityProjectDslRefsHeadsMain : GitVcsRoot({
    name = "https://dariakrupkina@dev.azure.com/dariakrupkina/TeamCity%20Test%20Project/_git/teamcity-project-dsl#refs/heads/main"
    url = "https://dariakrupkina@dev.azure.com/dariakrupkina/TeamCity%20Test%20Project/_git/teamcity-project-dsl"
    branch = "refs/heads/main"
    branchSpec = "refs/heads/*"
    authMethod = password {
        userName = "dkrupkina"
        password = "credentialsJSON:707727dc-efc6-454c-b904-750c7a05a2fd"
    }
})
