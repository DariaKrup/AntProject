package _Self.vcsRoots

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.vcs.GitVcsRoot

object HttpGitlabvcsQaTeamcityComContextTestDanilaGroup1simplepr1gitRefsHeadsMain : GitVcsRoot({
    name = "http://gitlabvcs.qa.teamcity.com/context/test/danila_group1/simplepr1.git#refs/heads/main"
    url = "http://gitlabvcs.qa.teamcity.com/context/test/danila_group1/simplepr1.git"
    branch = "refs/heads/main"
    branchSpec = "refs/heads/*"
    authMethod = token {
        userName = "root"
        tokenId = "tc_token_id:CID_0927b6ed118d7f5e4abed598470485ff:1:c268ddbc-d4ec-410a-8a8b-45f6ed8075ef"
    }
})
