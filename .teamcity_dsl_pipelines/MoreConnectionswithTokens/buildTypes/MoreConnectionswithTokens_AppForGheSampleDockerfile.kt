package MoreConnectionswithTokens.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.dockerCommand

object MoreConnectionswithTokens_AppForGheSampleDockerfile : BuildType({
    name = "App (auto) for GHE: Sample Dockerfile"

    vcs {
        root(MoreConnectionswithTokens.vcsRoots.MoreConnectionswithTokens_HttpsGheQaTeamcityComDariaKrupkina2sampleDockerfileRefsHeadsMain)
    }

    steps {
        dockerCommand {
            id = "DockerCommand"
            commandType = build {
                source = file {
                    path = "Dockerfile"
                }
                namesAndTags = "image:tag"
            }
        }
    }
})
