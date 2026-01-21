package PipelinesWithDefaultPRSettings.vcsRoots

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.vcs.TfsVcsRoot

object PipelinesWithDefaultPRSettings_Tfs2015 : TfsVcsRoot({
    name = "TFS (2015)"
    url = "https://10.128.93.177:8443/tfs/ChubatovaCollection1/"
    root = "${'$'}/ChubatovaProject"
    userName = "Administrator"
    password = "credentialsJSON:40e2b57c-fb43-4c2a-82bc-04653a00b99c"
})
