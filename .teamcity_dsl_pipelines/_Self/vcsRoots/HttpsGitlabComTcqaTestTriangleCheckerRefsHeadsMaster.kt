package _Self.vcsRoots

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.vcs.GitVcsRoot

object HttpsGitlabComTcqaTestTriangleCheckerRefsHeadsMaster : GitVcsRoot({
    name = "https://gitlab.com/tcqa-test/triangle-checker#refs/heads/master"
    url = "https://gitlab.com/tcqa-test/triangle-checker"
    branch = "refs/heads/master"
    branchSpec = "refs/heads/*"
    authMethod = token {
        userName = "oauth2"
        tokenId = "tc_token_id:CID_9dc92ded6f865fa766a794fd8ffccfeb:1:3828e94f-f5ab-4569-8e31-98ecf0283100"
    }
    param("tokenType", "refreshable")
})
