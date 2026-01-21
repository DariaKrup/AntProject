package _Self.vcsRoots

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.vcs.GitVcsRoot

object HttpsGitlabComTcqaNunitCsharpTestsProjectRefsHeadsMaster : GitVcsRoot({
    name = "https://gitlab.com/tcqa_/nunit-csharp-tests-project#refs/heads/master"
    url = "https://gitlab.com/tcqa_/nunit-csharp-tests-project"
    branch = "refs/heads/master"
    branchSpec = "refs/heads/*"
    authMethod = token {
        userName = "tcqa-test"
        tokenId = "tc_token_id:CID_9dc92ded6f865fa766a794fd8ffccfeb:1:3828e94f-f5ab-4569-8e31-98ecf0283100"
    }
})
