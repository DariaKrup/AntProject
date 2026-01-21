package PipelinesWithDefaultPRSettings.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.script

object PipelinesWithDefaultPRSettings_BuildTfs2015 : BuildType({
    name = "Build: TFS (2015)"

    vcs {
        root(PipelinesWithDefaultPRSettings.vcsRoots.PipelinesWithDefaultPRSettings_Tfs2015)
    }

    steps {
        script {
            id = "simpleRunner"
            scriptContent = "less ./file1"
        }
    }
})
