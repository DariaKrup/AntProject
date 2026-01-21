package MoreConnectionswithTokens

import MoreConnectionswithTokens.buildTypes.*
import MoreConnectionswithTokens.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.Project
import jetbrains.buildServer.configs.kotlin.projectFeatures.githubAppConnection
import jetbrains.buildServer.configs.kotlin.projectFeatures.gitlabEEConnection

object Project : Project({
    id("MoreConnectionswithTokens")
    name = "More connections (with tokens)"

    vcsRoot(MoreConnectionswithTokens_HttpsGheQaTeamcityComDariaKrupkina2bookingApiTestsRefsHeadsMain)
    vcsRoot(MoreConnectionswithTokens_HttpsBbdatacenterQaTeamcityComScmDksJavaMavenJunitGitRefsHeadsMaster)
    vcsRoot(MoreConnectionswithTokens_HttpsGithubComDariaKrupBookingApiPayconiqRefsHeadsMaster)
    vcsRoot(MoreConnectionswithTokens_HttpGitlabvcsQaTeamcityComContextTestDanilaGroup1simplepr1gitRefsHeadsMain)
    vcsRoot(MoreConnectionswithTokens_HttpsGheQaTeamcityComDariaKrupkina2sampleDockerfileRefsHeadsMain)
    vcsRoot(MoreConnectionswithTokens_HttpsGheQaTeamcityComDariaKrupkina2bookingApiTestsGitRefsHeadsMain)

    buildType(MoreConnectionswithTokens_JavaMavenBbDataCenter)
    buildType(MoreConnectionswithTokens_DockerBuildGheNewAppWithToken)
    buildType(MoreConnectionswithTokens_GheManualAppBookingApi)
    buildType(MoreConnectionswithTokens_GlCeEcho)
    buildType(MoreConnectionswithTokens_AppForGheSampleDockerfile)
    buildType(MoreConnectionswithTokens_GhaAutoGitHubComBuildBookingApiPayconiq)

    features {
        gitlabEEConnection {
            id = "PROJECT_EXT_42"
            displayName = "GitLab CE (new connection flow)"
            serverUrl = "http://gitlabvcs.qa.teamcity.com/context/test/"
            applicationId = "b5a1004d90c1354c1e9e7c66e414d220ba74abaa54d2cb9c89fb8f7769b64168"
            clientSecret = "credentialsJSON:5577c9cc-f438-4dc5-bcfa-4830631d5715"
            useUniqueRedirect = true
        }
        gitlabEEConnection {
            id = "PROJECT_EXT_623"
            displayName = "GitLab CE/EE (2)"
            serverUrl = "http://gitlabvcs.qa.teamcity.com"
            applicationId = "a"
            clientSecret = "credentialsJSON:c758946a-11a2-423d-a7cf-bef4f7f6bc42"
            useUniqueRedirect = true
        }
        githubAppConnection {
            id = "PROJECT_EXT_625"
            displayName = "GitHub App (manual)"
            appId = "43"
            clientId = "Iv1.6f70fbb6f736e8b1"
            clientSecret = "credentialsJSON:06aa9c4c-236a-4306-a6ce-5ed18c8a0772"
            privateKey = "credentialsJSON:4ab4beba-7716-4294-853f-7d3b30e06122"
            ownerUrl = "https://ghe.qa.teamcity.com/daria-krupkina2"
            useUniqueCallback = true
        }
    }
})
