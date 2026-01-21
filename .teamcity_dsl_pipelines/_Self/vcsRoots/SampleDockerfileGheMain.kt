package _Self.vcsRoots

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.vcs.GitVcsRoot

object SampleDockerfileGheMain : GitVcsRoot({
    name = "Sample Dockerfile: GHE: main"
    url = "https://ghe.qa.teamcity.com/daria-krupkina2/sample-dockerfile.git"
    branch = "main"
    branchSpec = "refs/heads/*"
    authMethod = password {
        userName = "daria-krupkina2"
        password = "credentialsJSON:cebbd341-2ff4-4301-9726-3d8502fa55e7"
    }
    param("pipelines.connectionId", "PROJECT_EXT_574")
})
