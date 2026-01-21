package _Self.vcsRoots

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.vcs.GitVcsRoot

object HttpsGithubComDariaKrupTeamCityDynamicTestsGitMain : GitVcsRoot({
    name = "https://github.com/DariaKrup/TeamCityDynamicTests.git#main"
    url = "https://github.com/DariaKrup/TeamCityDynamicTests.git"
    branch = "main"
    branchSpec = "refs/heads/*"
    authMethod = password {
        userName = ""
        password = "credentialsJSON:2b97a7f4-5df8-4f2d-b468-a7ad191c1f41"
    }
})
