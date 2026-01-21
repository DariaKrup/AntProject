package _Self.vcsRoots

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.vcs.GitVcsRoot

object SampleMavenAppBitBucketMain : GitVcsRoot({
    name = "Sample Maven App: BitBucket: main"
    url = "https://bitbucket.org/teamcity-test/sample-maven-app"
    branch = "master"
    branchSpec = "refs/heads/*"
    authMethod = token {
        userName = "DariaKrupkina"
        tokenId = "tc_token_id:CID_760d9488da48e7ae8b5d9963601d845d:1:c287f7de-8c9c-41bd-989a-e051a30789a3"
    }
    param("pipelines.connectionId", "PROJECT_EXT_606")
})
