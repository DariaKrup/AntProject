package LocalNewSubproject.vcsRoots

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.vcs.GitVcsRoot

object LocalNewSubproject_HttpsGithubComDariaKrupAzureFunctionsVsBuildSdkRefsHeadsMain : GitVcsRoot({
    name = "https://github.com/DariaKrup/azure-functions-vs-build-sdk#refs/heads/main"
    url = "https://github.com/DariaKrup/azure-functions-vs-build-sdk"
    branch = "refs/heads/main"
    branchSpec = "refs/heads/*"
    authMethod = password {
        userName = "DariaKrup"
        password = "credentialsJSON:a9f10039-e193-4665-afab-91b5b38ce930"
    }
    param("pipelines.connectionId", "PROJECT_EXT_238")
})
