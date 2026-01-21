package _Self.vcsRoots

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.vcs.PerforceVcsRoot

object Perforce : PerforceVcsRoot({
    name = "Perforce"
    port = "sss:aaa"
    mode = stream {
        streamName = "//streamdepot/aa"
    }
    userName = "a"
    password = "credentialsJSON:c758946a-11a2-423d-a7cf-bef4f7f6bc42"
    workspaceOptions = """
        Options:        noallwrite clobber nocompress unlocked nomodtime rmdir
        Host:           %teamcity.agent.hostname%
        SubmitOptions:  revertunchanged
        LineEnd:        local
    """.trimIndent()
})
