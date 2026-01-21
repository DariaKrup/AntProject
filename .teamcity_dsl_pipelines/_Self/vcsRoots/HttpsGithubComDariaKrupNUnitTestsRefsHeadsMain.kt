package _Self.vcsRoots

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.vcs.GitVcsRoot

object HttpsGithubComDariaKrupNUnitTestsRefsHeadsMain : GitVcsRoot({
    name = "https://github.com/DariaKrup/NUnitTests#refs/heads/main"
    url = "https://github.com/DariaKrup/NUnitTests"
    branch = "refs/heads/main"
    branchSpec = "refs/heads/*"
    authMethod = token {
        userName = "DariaKrup"
        tokenId = "tc_token_id:CID_4b4df26346ed38498f51c0d6bee05baa:1:8566f292-8528-4ac2-a483-0da5d4f66b79"
    }
})
