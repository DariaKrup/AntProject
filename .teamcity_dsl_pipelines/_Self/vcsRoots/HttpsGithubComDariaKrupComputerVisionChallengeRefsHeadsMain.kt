package _Self.vcsRoots

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.vcs.GitVcsRoot

object HttpsGithubComDariaKrupComputerVisionChallengeRefsHeadsMain : GitVcsRoot({
    name = "https://github.com/DariaKrup/Computer_vision_challenge#refs/heads/main"
    url = "https://github.com/DariaKrup/Computer_vision_challenge"
    branch = "refs/heads/main"
    branchSpec = "refs/heads/*"
    authMethod = token {
        userName = "oauth2"
        tokenId = "tc_token_id:CID_bd894affd27faab671f2e89780bad523:1:46b18bb5-b035-442b-ac70-8ddd6d0a94d3"
    }
    param("pipelines.connectionId", "PROJECT_EXT_30")
    param("tokenType", "refreshable")
})
