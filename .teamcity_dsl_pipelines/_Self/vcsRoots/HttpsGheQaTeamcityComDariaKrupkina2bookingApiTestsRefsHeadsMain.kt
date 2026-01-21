package _Self.vcsRoots

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.vcs.GitVcsRoot

object HttpsGheQaTeamcityComDariaKrupkina2bookingApiTestsRefsHeadsMain : GitVcsRoot({
    name = "https://ghe.qa.teamcity.com/daria-krupkina2/booking-api-tests#refs/heads/main"
    url = "https://ghe.qa.teamcity.com/daria-krupkina2/booking-api-tests"
    branch = "refs/heads/main"
    branchSpec = "refs/heads/*"
    authMethod = token {
        userName = "oauth2"
        tokenId = "tc_token_id:CID_89d2edad33e20e8aaae828e0ceef853c:1:b0547f7e-1432-45f7-a687-b220965afe63"
    }
    param("pipelines.connectionId", "PROJECT_EXT_624")
    param("tokenType", "refreshable")
})
