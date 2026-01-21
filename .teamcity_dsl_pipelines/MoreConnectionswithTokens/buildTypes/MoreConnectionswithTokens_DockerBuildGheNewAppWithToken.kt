package MoreConnectionswithTokens.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.script

object MoreConnectionswithTokens_DockerBuildGheNewAppWithToken : BuildType({
    name = "Docker Build: GHE (new app with token)"

    vcs {
        root(MoreConnectionswithTokens.vcsRoots.MoreConnectionswithTokens_HttpsGheQaTeamcityComDariaKrupkina2bookingApiTestsGitRefsHeadsMain)
    }

    steps {
        script {
            id = "simpleRunner"
            scriptContent = "less ./pom.xml"
        }
    }
})
