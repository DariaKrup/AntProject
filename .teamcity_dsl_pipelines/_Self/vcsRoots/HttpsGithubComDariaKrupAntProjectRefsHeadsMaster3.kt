package _Self.vcsRoots

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.vcs.GitVcsRoot

object HttpsGithubComDariaKrupAntProjectRefsHeadsMaster3 : GitVcsRoot({
    name = "https://github.com/DariaKrup/AntProject#refs/heads/master (3)"
    url = "https://github.com/DariaKrup/AntProject"
    branch = "refs/heads/master"
    branchSpec = "refs/heads/*"
    authMethod = password {
        userName = "DariaKrup"
        password = "credentialsJSON:8b7b8fc3-ca87-451b-9fda-64460a6201e6"
    }
})
