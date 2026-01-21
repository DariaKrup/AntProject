package _Self.vcsRoots

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.vcs.PerforceVcsRoot

object KIlinaPerforceRoot : PerforceVcsRoot({
    name = "KIlina Perforce Root"
    port = "10.128.93.169:1665"
    mode = stream {
        streamName = "//kilina-vers-settings/main/"
    }
    userName = "jetbrains"
    password = "credentialsJSON:5e75fc1e-ac18-479d-b85e-92445e6d2da5"
    workspaceOptions = """
        Options:        noallwrite clobber nocompress unlocked nomodtime rmdir
        Host:           %teamcity.agent.hostname%
        SubmitOptions:  revertunchanged
        LineEnd:        local
    """.trimIndent()
})
