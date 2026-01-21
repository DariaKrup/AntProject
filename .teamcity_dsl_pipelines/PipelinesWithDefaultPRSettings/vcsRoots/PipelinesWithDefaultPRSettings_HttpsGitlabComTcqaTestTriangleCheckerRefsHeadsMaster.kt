package PipelinesWithDefaultPRSettings.vcsRoots

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.vcs.GitVcsRoot

object PipelinesWithDefaultPRSettings_HttpsGitlabComTcqaTestTriangleCheckerRefsHeadsMaster : GitVcsRoot({
    name = "https://gitlab.com/tcqa-test/triangle-checker#refs/heads/master"
    url = "https://gitlab.com/tcqa-test/triangle-checker"
    branch = "refs/heads/master"
    branchSpec = "refs/heads/*"
    authMethod = token {
        userName = "oauth2"
        tokenId = "tc_token_id:CID_9a8ad940ae68f6d2974ddb31a89bc074:1:bb1cd638-d06b-472c-a24c-4a6965a03dd0"
    }
    param("pipelines.connectionId", "PROJECT_EXT_655")
    param("tokenType", "refreshable")
})
