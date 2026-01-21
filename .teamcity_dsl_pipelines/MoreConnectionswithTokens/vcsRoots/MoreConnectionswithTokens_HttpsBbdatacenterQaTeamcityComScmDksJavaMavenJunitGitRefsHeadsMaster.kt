package MoreConnectionswithTokens.vcsRoots

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.vcs.GitVcsRoot

object MoreConnectionswithTokens_HttpsBbdatacenterQaTeamcityComScmDksJavaMavenJunitGitRefsHeadsMaster : GitVcsRoot({
    name = "https://bbdatacenter.qa.teamcity.com/scm/dks/java-maven-junit.git#refs/heads/master"
    url = "https://bbdatacenter.qa.teamcity.com/scm/dks/java-maven-junit.git"
    branch = "refs/heads/master"
    branchSpec = "refs/heads/*"
    authMethod = token {
        userName = "admin"
        tokenId = "tc_token_id:CID_7e24aa5c65aa16843650130d71e32905:1:1de679b8-62f0-4ea5-98af-2901ff953e84"
    }
})
