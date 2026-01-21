package _Self.vcsRoots

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.vcs.GitVcsRoot

object GitGithubComDariaKrupCommandLineRunnerGitRefsHeadsMaster : GitVcsRoot({
    name = "git@github.com:DariaKrup/command_line_runner.git#refs/heads/master"
    url = "git@github.com:DariaKrup/command_line_runner.git"
    branch = "refs/heads/master"
    branchSpec = "refs/heads/*"
    authMethod = uploadedKey {
        uploadedKey = "id_rsa"
    }
})
