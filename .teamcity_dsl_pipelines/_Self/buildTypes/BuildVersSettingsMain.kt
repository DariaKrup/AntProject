package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.script

object BuildVersSettingsMain : BuildType({
    name = "Build: vers-settings/main"

    vcs {
        root(_Self.vcsRoots.KIlinaPerforceRoot)
    }

    steps {
        script {
            id = "simpleRunner"
            scriptContent = "less ./test1.txt"
        }
    }
})
