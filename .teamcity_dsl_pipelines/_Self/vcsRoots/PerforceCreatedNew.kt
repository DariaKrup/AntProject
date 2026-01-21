package _Self.vcsRoots

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.vcs.PerforceVcsRoot

object PerforceCreatedNew : PerforceVcsRoot({
    name = "PerforceCreated: new"
    port = "ssl:10.128.93.57:1666"
    mode = stream {
        streamName = "//tc-qa-maven-project/tc-qa-maven-mainline"
    }
    userName = "teamcity-testers"
    password = "credentialsJSON:12afbd36-8a65-445d-bf1e-78cd7bb6f31e"
    workspaceOptions = """
        Options:        noallwrite clobber nocompress unlocked nomodtime rmdir
        Host:           %teamcity.agent.hostname%
        SubmitOptions:  revertunchanged
        LineEnd:        local
    """.trimIndent()
})
