package MoreConnectionswithTokens.vcsRoots

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.vcs.GitVcsRoot

object MoreConnectionswithTokens_HttpsGithubComDariaKrupBookingApiPayconiqRefsHeadsMaster : GitVcsRoot({
    name = "https://github.com/DariaKrup/BookingApiPayconiq#refs/heads/master"
    url = "https://github.com/DariaKrup/BookingApiPayconiq"
    branch = "refs/heads/master"
    branchSpec = "refs/heads/*"
    authMethod = token {
        userName = "DariaKrup"
        tokenId = "tc_token_id:CID_bd894affd27faab671f2e89780bad523:1:46b18bb5-b035-442b-ac70-8ddd6d0a94d3"
    }
})
