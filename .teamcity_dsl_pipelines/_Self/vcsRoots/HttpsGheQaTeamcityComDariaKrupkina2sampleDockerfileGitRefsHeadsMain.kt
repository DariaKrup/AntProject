package _Self.vcsRoots

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.vcs.GitVcsRoot

object HttpsGheQaTeamcityComDariaKrupkina2sampleDockerfileGitRefsHeadsMain : GitVcsRoot({
    name = "https://ghe.qa.teamcity.com/daria-krupkina2/sample-dockerfile.git#refs/heads/main"
    url = "https://ghe.qa.teamcity.com/daria-krupkina2/sample-dockerfile.git"
    branch = "refs/heads/main"
    branchSpec = "refs/heads/*"
    authMethod = password {
        userName = "daria-krupkina2"
        password = "credentialsJSON:cebbd341-2ff4-4301-9726-3d8502fa55e7"
    }
    param("pipelines.connectionId", "PROJECT_EXT_574")
})
