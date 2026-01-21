package PipelineParameterInheritanceSecurityTest

import PipelineParameterInheritanceSecurityTest.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.Project

object Project : Project({
    id("PipelineParameterInheritanceSecurityTest")
    name = "PipelineParameterInheritanceSecurityTest"

    vcsRoot(PipelineParameterInheritanceSecurityTest_HttpsGithubComPavelsuprJbTestLinksGitRefsHeadsMain)
    vcsRoot(PipelineParameterInheritanceSecurityTest_HttpsGithubComDariaKrupAntProjectRefsHeadsMaster)

    params {
        password("env.verysecretenvname", "credentialsJSON:5df14b15-1998-4855-93e5-afcbe3c2d9a6")
        password("verysecretparametername", "credentialsJSON:409d501e-da08-47b3-adf0-015e88967b5b")
    }
})
