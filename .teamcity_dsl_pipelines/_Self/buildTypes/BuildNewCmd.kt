package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.script
import jetbrains.buildServer.configs.kotlin.triggers.vcs

object BuildNewCmd : BuildType({
    name = "Build: new cmd"

    vcs {
        root(_Self.vcsRoots.HttpsGithubComDariaKrupCommandLineRunnerRefsHeadsMaster)
    }

    steps {
        script {
            id = "simpleRunner"
            scriptContent = "sh echo.sh"
        }
        script {
            id = "simpleRunner_1"
            scriptContent = "echo 'Success'c"
        }
    }

    triggers {
        vcs {
            branchFilter = "+:master*"
        }
    }

    requirements {
        equals("teamcity.agent.jvm.os.name", "Linux")
    }
})
