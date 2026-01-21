package PipelineParameterInheritanceSecurityTest.vcsRoots

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.vcs.GitVcsRoot

object PipelineParameterInheritanceSecurityTest_HttpsGithubComPavelsuprJbTestLinksGitRefsHeadsMain : GitVcsRoot({
    name = "https://github.com/pavelsupr-jb-test/links.git#refs/heads/main"
    url = "https://github.com/pavelsupr-jb-test/links.git"
    branch = "refs/heads/main"
    branchSpec = "refs/heads/*"
})
