package _Self.vcsRoots

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.vcs.GitVcsRoot

object HttpsGithubComDariaKrupTeamCityDynamicTestsGitRefsHeadsMain : GitVcsRoot({
    name = "TeamCityDynamicTests"
    url = "https://github.com/DariaKrup/TeamCityDynamicTests.git"
    branch = "refs/heads/main"
    branchSpec = "refs/heads/*"
    checkoutSubmodules = GitVcsRoot.CheckoutSubmodules.IGNORE
    checkoutPolicy = GitVcsRoot.AgentCheckoutPolicy.NO_MIRRORS
    authMethod = token {
        userName = "DariaKrup"
        tokenId = "tc_token_id:CID_4b4df26346ed38498f51c0d6bee05baa:1:8566f292-8528-4ac2-a483-0da5d4f66b79"
    }
})
