package LocalNewSubproject.vcsRoots

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.vcs.GitVcsRoot

object LocalNewSubproject_GitGithubComDariaKrupNunitCsharpTestsProjectGitRefsHeadsMain : GitVcsRoot({
    name = "git@github.com:DariaKrup/nunit-csharp-tests-project.git#refs/heads/main"
    url = "git@github.com:DariaKrup/nunit-csharp-tests-project.git"
    branch = "refs/heads/main"
    branchSpec = "refs/heads/*"
    authMethod = uploadedKey {
        uploadedKey = "id_rsa"
    }
})
