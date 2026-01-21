package MoreConnectionswithTokens.vcsRoots

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.vcs.GitVcsRoot

object MoreConnectionswithTokens_HttpsGheQaTeamcityComDariaKrupkina2bookingApiTestsGitRefsHeadsMain : GitVcsRoot({
    name = "https://ghe.qa.teamcity.com/daria-krupkina2/booking-api-tests.git#refs/heads/main"
    url = "https://ghe.qa.teamcity.com/daria-krupkina2/booking-api-tests.git"
    branch = "refs/heads/main"
    branchSpec = "refs/heads/*"
    authMethod = password {
        userName = "daria-krupkina2"
        password = "credentialsJSON:e04fcb91-53ef-4ab1-bd07-b2485d9b62a2"
    }
})
