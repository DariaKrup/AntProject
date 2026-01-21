package _Self

import _Self.buildTypes.*
import _Self.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.Project
import jetbrains.buildServer.configs.kotlin.projectFeatures.azureDevopsConnection
import jetbrains.buildServer.configs.kotlin.projectFeatures.bitbucketServerConnection
import jetbrains.buildServer.configs.kotlin.projectFeatures.gheConnection
import jetbrains.buildServer.configs.kotlin.projectFeatures.gitlabConnection

object Project : Project({

    vcsRoot(HttpsGithubComDariaKrupAntProjectRefsHeadsMaster2)
    vcsRoot(HttpGitlabvcsQaTeamcityComContextTestDanilaGroup1simplepr1gitRefsHeadsMain1)
    vcsRoot(PerforceCreatedNew)
    vcsRoot(HttpsGithubComDariaKrupAntProjectRefsHeadsMaster3)
    vcsRoot(HttpsGithubComDariaKrupNUnitTestsRefsHeadsMain)
    vcsRoot(HttpsGithubComDariaKrupNUnitTestsRefsHeadsMain1)
    vcsRoot(HttpsGithubComDariaKrupBookingApiPayconiqRefsHeadsMaster)
    vcsRoot(HttpsGithubComDariaKrupComputerVisionChallengeRefsHeadsMain)
    vcsRoot(HttpsGithubComDariaKrupTeamCityDynamicTestsGitMain)
    vcsRoot(HttpsBitbucketOrgTeamcityTestSampleMavenAppRefsHeadsMaster)
    vcsRoot(SampleDockerfileGheMain)
    vcsRoot(HttpsDariaKrupkina0066devAzureComDariaKrupkina0066TeamCity20ProjectGitTeamCity20ProjectRefsHeadsMasterBuildComment)
    vcsRoot(HttpsBbdatacenterQaTeamcityComScmOlJavaMavenGitRefsHeadsMaster)
    vcsRoot(HttpsGithubComDariaKrupNunitCsharpTestsProjectRefsHeadsMaster)
    vcsRoot(HttpsGithubComDariaKrupComputationalComplexesRefsHeadsMaster)
    vcsRoot(HttpsGithubComDariaKrupNunitProjectLoaderRefsHeadsMain)
    vcsRoot(HttpsGithubComDariaKrupTeamCityDynamicTestsGitRefsHeadsMain)
    vcsRoot(HttpsGitlabComTcqaTestTriangleCheckerRefsHeadsMaster)
    vcsRoot(HttpsGheQaTeamcityComDariaKrupkina2sampleDockerfileGitRefsHeadsMain)
    vcsRoot(HttpsGithubComDariaKrupCommandLineRunnerRefsHeadsMaster)
    vcsRoot(Http101289311jetbrainsJavaMavenJunitGitRefsHeadsMaster1)
    vcsRoot(HttpsDariaKrupkinaBitbucketOrgTeamcityqaOllvenJavaMavenGitRefsHeadsMaster)
    vcsRoot(HttpsGheQaTeamcityComDariaKrupkina2bookingApiTestsRefsHeadsMain)
    vcsRoot(HttpsDariaKrupkina0066devAzureComDariaKrupkina0066TeamCity20ProjectGitTeamCity20ProjectRefsHeadsMaster1)
    vcsRoot(HttpsDariakrupkinaDevAzureComDariakrupkinaTeamCity20Test20ProjectGitTeamcityProjectDslRefsHeadsMain)
    vcsRoot(HttpsDariaKrupkina0066devAzureComDariaKrupkina0066TeamCity20ProjectGitTeamCity20ProjectRefsHeadsMaster2)
    vcsRoot(SampleMavenAppBitBucketMain)
    vcsRoot(HttpsGitlabComTcqaNunitCsharpTestsProjectRefsHeadsMaster)
    vcsRoot(KIlinaPerforceRoot)
    vcsRoot(SvnNew)
    vcsRoot(Http101289311jetbrainsJavaMavenJunitGitRefsHeadsMaster)
    vcsRoot(SpringPetclinicAzureDevOpsMain)
    vcsRoot(HttpsBbdatacenterQaTeamcityComScmDksJavaMavenJunitGitRefsHeadsMaster)
    vcsRoot(HttpsBitbucketOrgTeamcityqaOllvenJavaMavenRefsHeadsMaster)
    vcsRoot(HttpsGitlabComTcqaNunitCsharpTestsProjectRefsHeadsMaster1)
    vcsRoot(HttpsGithubComDariaKrupBookingApiPayconiqRefsHeadsMaster1_2)
    vcsRoot(SvnHttpsSvnRiouxsvnComVisualstudiotes)
    vcsRoot(HttpsGithubComDariaKrupJetBrainsAcademyJavaRefsHeadsMaster)
    vcsRoot(HttpsGithubComDariaKrupAntProjectRefsHeadsMaster)
    vcsRoot(Svn)
    vcsRoot(HttpsDariaKrupkina0066devAzureComDariaKrupkina0066TeamCity20ProjectGitTeamCity20ProjectRefsHeadsMaster)
    vcsRoot(MercurialLocalRoot)
    vcsRoot(Perforce)
    vcsRoot(Kse1920svn)
    vcsRoot(TfsAzure)
    vcsRoot(HttpGitlabvcsQaTeamcityComContextTestDanilaGroup1simplepr1gitRefsHeadsMain)
    vcsRoot(Svn1httpsSvnRiouxsvnComVisualstudiotes)
    vcsRoot(GitGithubComDariaKrupCommandLineRunnerGitRefsHeadsMaster)
    vcsRoot(HttpsGithubComDariaKrupBookingApiPayconiqRefsHeadsMaster1)

    buildType(BuildJavaMavenBbDataCenter)
    buildType(BuildAzureDevOpsEntraID)
    buildType(NUnitTestsGha)
    buildType(BuildJavaMavenGlCeOldFlow)
    buildType(Build1)
    buildType(BuildBookingGhaSpecificTriggerRules)
    buildType(NUnitCTestsGitLabOauth)
    buildType(BuildTeamCityDynamicTests)
    buildType(MavenTestsBookingNewCreatedGhOAuth)
    buildType(BuildVersSettingsMain)
    buildType(GradleBuildAzureDevOpsPat)
    buildType(BuildMavenTests)
    buildType(BuildPatAzureDevOps)
    buildType(BuildAntGhaDefaultBranchFilter)
    buildType(BuildBbCloudSampleMaven)
    buildType(Build)
    buildType(BuildGitHubComBookingApi)
    buildType(BuildGlComNUnitCTests)
    buildType(BuildDevAzurePat)
    buildType(BuildBbOldFlow)
    buildType(BuildGitLabEe)
    buildType(BuildJavaMavenJUnitGl101289311)
    buildType(BuildNewCmd)
    buildType(Build_2)
    buildType(BuildAntMulti)
    buildType(BuildDuplicate)

    params {
        param("teamcity.internal.pipelines.creation.enabled", "true")
    }

    features {
        gitlabConnection {
            id = "PROJECT_EXT_572"
            displayName = "GitLab.com"
            applicationId = "6c7122d5ee333e8e78b4d86889b350a0e4a756ff3d5b33a30016bcac2c291218"
            clientSecret = "credentialsJSON:72f4be5a-82b9-443f-8b03-e61bf02f44a3"
        }
        gheConnection {
            id = "PROJECT_EXT_573"
            displayName = "GitHub Enterprise (new)"
            serverUrl = "https://ghe.qa.teamcity.com/"
            clientId = "2856e669716bed759ba4"
            clientSecret = "credentialsJSON:aaaa91ec-61d4-4771-8138-6d7a18aeea4a"
            useUniqueCallback = true
        }
        gheConnection {
            id = "PROJECT_EXT_574"
            displayName = "GitHub Enterprise"
            serverUrl = "https://ghe.qa.teamcity.com/"
            clientId = "2856e669716bed759ba4"
            clientSecret = "credentialsJSON:aaaa91ec-61d4-4771-8138-6d7a18aeea4a"
        }
        gheConnection {
            id = "PROJECT_EXT_575"
            displayName = "GitHub Enterprise (one more)"
            serverUrl = "https://ghe.qa.teamcity.com"
            clientId = "574ef681885130a3820c"
            clientSecret = "credentialsJSON:122d9a8d-346f-44f8-a5fc-307f542375f4"
        }
        bitbucketServerConnection {
            id = "PROJECT_EXT_611"
            displayName = "Bitbucket Server / Data Center (local)"
            serverUrl = "https://bbdatacenter.qa.teamcity.com/"
            clientId = "4718db3814c5d335578d608c27efb800"
            clientSecret = "credentialsJSON:261189df-ef64-4b38-a51e-1c8f7f39e9eb"
            useUniqueRedirect = true
        }
        azureDevopsConnection {
            id = "PROJECT_EXT_638"
            displayName = "Azure DevOps PAT (local)"
            serverUrl = "https://dev.azure.com/DariaKrupkina0066/"
            accessToken = "credentialsJSON:56f48446-9200-4071-aa02-9a8b9c705b17"
        }
        gitlabConnection {
            id = "PROJECT_EXT_655"
            displayName = "[New] GitLab.com"
            applicationId = "25a4ad39ca8883d66737f696d0fb727710c1bcf5468b0e22492ff9048e3a47f1"
            clientSecret = "credentialsJSON:5aeea164-d1b0-43d4-9406-9a748d469b66"
        }
    }

    subProject(LocalNewSubproject.Project)
    subProject(PipelineParameterInheritanceSecurityTest.Project)
    subProject(PipelinesWithDefaultPRSettings.Project)
    subProject(MoreConnectionswithTokens.Project)
    subProject(SubProject.Project)
})
