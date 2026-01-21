package PipelineParameterInheritanceSecurityTest.vcsRoots

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.vcs.GitVcsRoot

object PipelineParameterInheritanceSecurityTest_HttpsGithubComDariaKrupAntProjectRefsHeadsMaster : GitVcsRoot({
    name = "https://github.com/DariaKrup/AntProject#refs/heads/master"
    url = "https://github.com/DariaKrup/AntProject"
    branch = "refs/heads/master"
    branchSpec = "refs/heads/*"
    authMethod = token {
        userName = "oauth2"
        tokenId = "tc_token_id:CID_bd894affd27faab671f2e89780bad523:131:604e3c36-ceb2-4e43-a860-5477a299e605"
    }
    param("pipelines.connectionId", "PROJECT_EXT_30")
    param("tokenType", "refreshable")
})
