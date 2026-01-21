package LocalNewSubproject

import LocalNewSubproject.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.Project

object Project : Project({
    id("LocalNewSubproject")
    name = "Local new subproject"

    vcsRoot(LocalNewSubproject_HttpGitlabvcsQaTeamcityComContextTestDanilaGroup1simplepr1gitRefsHeadsMain)
    vcsRoot(LocalNewSubproject_HttpsGithubComDariaKrupAzureFunctionsVsBuildSdkRefsHeadsMain)
    vcsRoot(LocalNewSubproject_HttpsBbdatacenterQaTeamcityComScmDksJavaMavenJunitGitRefsHeadsMaster)
    vcsRoot(LocalNewSubproject_HttpGitlabvcsQaTeamcityComContextTestDanilaGroup1simplepr1gitRefsHeadsMain1)
    vcsRoot(LocalNewSubproject_HttpsDariaKrupkina0066devAzureComDariaKrupkina0066TeamCity20ProjectGitTeamCity20ProjectRefsHeadsMaster)
    vcsRoot(LocalNewSubproject_GitGithubComDariaKrupNunitCsharpTestsProjectGitRefsHeadsMain)
})
