package PipelinesWithDefaultPRSettings.vcsRoots

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.vcs.GitVcsRoot

object PipelinesWithDefaultPRSettings_HttpsBitbucketOrgTeamcityTestSampleMavenAppRefsHeadsMaster : GitVcsRoot({
    name = "https://bitbucket.org/teamcity-test/sample-maven-app#refs/heads/master"
    url = "https://bitbucket.org/teamcity-test/sample-maven-app"
    branch = "refs/heads/master"
    branchSpec = "refs/heads/*"
    authMethod = token {
        userName = "DariaKrupkina"
        tokenId = "tc_token_id:CID_760d9488da48e7ae8b5d9963601d845d:1:d29f05f0-ec19-4e5f-89b2-48e7f1e95830"
    }
    param("pipelines.connectionId", "PROJECT_EXT_606")
    param("tokenType", "refreshable")
})
