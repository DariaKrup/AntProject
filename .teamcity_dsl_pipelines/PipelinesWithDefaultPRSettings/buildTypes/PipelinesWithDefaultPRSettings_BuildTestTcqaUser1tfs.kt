package PipelinesWithDefaultPRSettings.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.script

object PipelinesWithDefaultPRSettings_BuildTestTcqaUser1tfs : BuildType({
    name = "Build: test (tcqa.user1 TFS)"

    vcs {
        root(PipelinesWithDefaultPRSettings.vcsRoots.PipelinesWithDefaultPRSettings_TfsTcqaUser1)
    }

    steps {
        script {
            id = "simpleRunner"
            scriptContent = "less ./test/test_file.txt"
        }
    }
})
