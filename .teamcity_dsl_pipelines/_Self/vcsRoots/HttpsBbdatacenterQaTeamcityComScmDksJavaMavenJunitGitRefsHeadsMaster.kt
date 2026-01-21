package _Self.vcsRoots

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.vcs.GitVcsRoot

object HttpsBbdatacenterQaTeamcityComScmDksJavaMavenJunitGitRefsHeadsMaster : GitVcsRoot({
    name = "https://bbdatacenter.qa.teamcity.com/scm/dks/java-maven-junit.git#refs/heads/master"
    url = "https://bbdatacenter.qa.teamcity.com/scm/dks/java-maven-junit.git"
    branch = "refs/heads/master"
    branchSpec = "refs/heads/*"
    authMethod = token {
        userName = "admin"
        tokenId = "tc_token_id:CID_dcfd763a28156ffd3f034fc1c717a26f:1:fee25e59-88f4-4a86-a865-95d831353fb0"
    }
})
