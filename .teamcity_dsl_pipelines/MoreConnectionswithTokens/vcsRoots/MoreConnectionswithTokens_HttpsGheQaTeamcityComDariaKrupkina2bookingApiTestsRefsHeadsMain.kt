package MoreConnectionswithTokens.vcsRoots

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.vcs.GitVcsRoot

object MoreConnectionswithTokens_HttpsGheQaTeamcityComDariaKrupkina2bookingApiTestsRefsHeadsMain : GitVcsRoot({
    name = "https://ghe.qa.teamcity.com/daria-krupkina2/booking-api-tests#refs/heads/main"
    url = "https://ghe.qa.teamcity.com/daria-krupkina2/booking-api-tests"
    branch = "refs/heads/main"
    branchSpec = "refs/heads/*"
    authMethod = token {
        userName = "daria-krupkina2"
        tokenId = "tc_token_id:CID_e0aa799bb33595df1ec0dace29fd0c4b:1:08e7068d-59f9-4007-b4ad-4e4673a2f84b"
    }
})
