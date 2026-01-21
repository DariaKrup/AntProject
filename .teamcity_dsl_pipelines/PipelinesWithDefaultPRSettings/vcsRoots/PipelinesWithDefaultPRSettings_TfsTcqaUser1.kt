package PipelinesWithDefaultPRSettings.vcsRoots

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.vcs.TfsVcsRoot

object PipelinesWithDefaultPRSettings_TfsTcqaUser1 : TfsVcsRoot({
    name = "TFS (tcqa.user1)"
    url = "https://dev.azure.com/tcqauser1/"
    root = "${'$'}/test-tfs-project"
    userName = "tcqa.user1@gmail.com"
    password = "credentialsJSON:a94dbaaa-3119-40c9-9056-116f1b633d8f"
})
