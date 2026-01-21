package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.script
import jetbrains.buildServer.configs.kotlin.triggers.vcs

object BuildDevAzurePat : BuildType({
    name = "Build: dev.azure (PAT)"
    description = "Build from Azure DevOps PAT connection"

    vcs {
        root(_Self.vcsRoots.HttpsDariakrupkinaDevAzureComDariakrupkinaTeamCity20Test20ProjectGitTeamcityProjectDslRefsHeadsMain)
    }

    steps {
        script {
            id = "simpleRunner"
            scriptContent = "less ./README.md"
        }
    }

    triggers {
        vcs {
            branchFilter = "+:<default>"
        }
    }
})
