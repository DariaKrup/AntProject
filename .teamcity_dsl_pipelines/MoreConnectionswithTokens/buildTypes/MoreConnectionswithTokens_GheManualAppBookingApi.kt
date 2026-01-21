package MoreConnectionswithTokens.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.script

object MoreConnectionswithTokens_GheManualAppBookingApi : BuildType({
    name = "GHE manual app: booking api"

    vcs {
        root(MoreConnectionswithTokens.vcsRoots.MoreConnectionswithTokens_HttpsGheQaTeamcityComDariaKrupkina2bookingApiTestsRefsHeadsMain)
    }

    steps {
        script {
            id = "simpleRunner"
            scriptContent = "less ./README.md"
        }
    }
})
