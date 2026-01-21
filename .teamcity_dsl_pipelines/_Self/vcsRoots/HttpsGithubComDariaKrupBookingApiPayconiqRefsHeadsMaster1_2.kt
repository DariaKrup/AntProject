package _Self.vcsRoots

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.vcs.GitVcsRoot

object HttpsGithubComDariaKrupBookingApiPayconiqRefsHeadsMaster1_2 : GitVcsRoot({
    name = "https://github.com/DariaKrup/BookingApiPayconiq#refs/heads/master (1)"
    url = "https://github.com/DariaKrup/BookingApiPayconiq"
    branch = "refs/heads/master"
    branchSpec = "refs/heads/*"
    checkoutSubmodules = GitVcsRoot.CheckoutSubmodules.IGNORE
    checkoutPolicy = GitVcsRoot.AgentCheckoutPolicy.NO_MIRRORS
    authMethod = password {
        userName = "DariaKrup"
        password = "credentialsJSON:a9f10039-e193-4665-afab-91b5b38ce930"
    }
})
