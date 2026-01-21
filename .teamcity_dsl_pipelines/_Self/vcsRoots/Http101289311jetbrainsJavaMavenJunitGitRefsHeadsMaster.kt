package _Self.vcsRoots

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.vcs.GitVcsRoot

object Http101289311jetbrainsJavaMavenJunitGitRefsHeadsMaster : GitVcsRoot({
    name = "http://10.128.93.11/jetbrains/java-maven-junit.git#refs/heads/master"
    url = "http://10.128.93.11/jetbrains/java-maven-junit.git"
    branch = "refs/heads/master"
    branchSpec = "refs/heads/*"
    authMethod = token {
        userName = "oauth2"
        tokenId = "tc_token_id:CID_7075199182e3b1a61fd3483ceb273d98:1:0334e781-415f-446b-9314-76b11b713bcc"
    }
})
