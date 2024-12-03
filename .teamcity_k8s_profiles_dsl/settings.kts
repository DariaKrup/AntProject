import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.amazonEC2CloudProfile
import jetbrains.buildServer.configs.kotlin.buildFeatures.investigationsAutoAssigner
import jetbrains.buildServer.configs.kotlin.buildFeatures.perfmon
import jetbrains.buildServer.configs.kotlin.buildSteps.ant
import jetbrains.buildServer.configs.kotlin.buildSteps.script
import jetbrains.buildServer.configs.kotlin.failureConditions.BuildFailureOnText
import jetbrains.buildServer.configs.kotlin.failureConditions.failOnText
import jetbrains.buildServer.configs.kotlin.kubernetesCloudImage
import jetbrains.buildServer.configs.kotlin.kubernetesCloudProfile
import jetbrains.buildServer.configs.kotlin.triggers.vcs

/*
The settings script is an entry point for defining a TeamCity
project hierarchy. The script should contain a single call to the
project() function with a Project instance or an init function as
an argument.

VcsRoots, BuildTypes, Templates, and subprojects can be
registered inside the project using the vcsRoot(), buildType(),
template(), and subProject() methods respectively.

To debug settings scripts in command-line, run the

    mvnDebug org.jetbrains.teamcity:teamcity-configs-maven-plugin:generate

command and attach your debugger to the port 8000.

To debug in IntelliJ Idea, open the 'Maven Projects' tool window (View
-> Tool Windows -> Maven Projects), find the generate task node
(Plugins -> teamcity-configs -> teamcity-configs:generate), the
'Debug' option is available in the context menu for the task.
*/

version = "2024.12"

project {

    buildType(CustomFailure)
    buildType(Build)

    features {
        kubernetesCloudImage {
            id = "PROJECT_EXT_112"
            profileId = "kube-2"
            agentPoolId = "-2"
            agentNamePrefix = "k8s-tc-agent"
            podSpecification = runContainer {
                dockerImage = "jetbrains/teamcity-agent:latest"
            }
        }
        kubernetesCloudImage {
            id = "PROJECT_EXT_117"
            profileId = "kube-3"
            agentPoolId = "-2"
            podSpecification = runContainer {
                dockerImage = "jetbrains/teamcity-agent:latest"
            }
        }
        amazonEC2CloudProfile {
            id = "amazon-34"
            name = "asd"
            description = "asd"
            terminateIdleMinutes = 30
            region = AmazonEC2CloudProfile.Regions.US_EAST_N_VIRGINIA
            awsConnectionId = "AmazonWebServicesAws_2"
        }
        amazonEC2CloudProfile {
            id = "amazon-35"
            name = "idor123"
            description = """asd"><img src=x onerror=alert(1)>"""
            terminateIdleMinutes = 30
            region = AmazonEC2CloudProfile.Regions.US_EAST_N_VIRGINIA
            awsConnectionId = "AwsEc2Profile_AsdImgSrcXOnerrorAlert111"
        }
        amazonEC2CloudProfile {
            id = "amazon-37"
            name = "test got private connection"
            description = "test"
            terminateIdleMinutes = 30
            region = AmazonEC2CloudProfile.Regions.US_EAST_N_VIRGINIA
            awsConnectionId = "AwsEc2Profile_AmazonWebServicesAws_2"
        }
        amazonEC2CloudProfile {
            id = "amazon-38"
            name = "test got private connection 2"
            description = "test"
            terminateIdleMinutes = 30
            region = AmazonEC2CloudProfile.Regions.US_EAST_N_VIRGINIA
            awsConnectionId = """AwsEc2Profile_AmazonWebServicesAws_2"><img src=x onerror=alert(1)>"""
        }
        amazonEC2CloudProfile {
            id = "amazon-39"
            name = """test got private connection 2"><img src=x onerror=alert(1)>"""
            description = "test"
            terminateIdleMinutes = 30
            region = AmazonEC2CloudProfile.Regions.US_EAST_N_VIRGINIA
            awsConnectionId = """AwsEc2Profile_AmazonWebServicesAws_2"><img src=x onerror=alert(1)>"""
        }
        kubernetesCloudProfile {
            id = "kube-2"
            name = "K8s Cloud Profile (EKS, server instance)"
            terminateIdleMinutes = 30
            apiServerURL = "https://A51B42A65F7E54005C95A4D353916627.gr7.eu-west-1.eks.amazonaws.com"
            authStrategy = eks {
                useInstanceProfile = true
                clusterName = "tc-dkrupkina-eks-cluster"
            }
        }
        kubernetesCloudProfile {
            id = "kube-3"
            name = "K8s Cloud Profile (EKS)"
            terminateIdleMinutes = 30
            apiServerURL = "https://A51B42A65F7E54005C95A4D353916627.gr7.eu-west-1.eks.amazonaws.com"
            authStrategy = eks {
                accessId = "AKIA5JH2VERVI62P5XDY"
                secretKey = "credentialsJSON:5956c87f-9f8f-4ec4-8c89-2874bed09e35"
                clusterName = "tc-dkrupkina-eks-cluster"
            }
        }
    }
}

object Build : BuildType({
    name = "Build"

    vcs {
        root(DslContext.settingsRoot)
    }

    steps {
        ant {
            id = "Ant"
            mode = antFile {
            }
            targets = "build"
        }
        script {
            id = "simpleRunner"
            scriptContent = """echo "A""""
        }
    }

    triggers {
        vcs {
        }
    }

    features {
        perfmon {
        }
    }
})

object CustomFailure : BuildType({
    name = "Custom failure"

    steps {
        script {
            id = "simpleRunner_1"
            scriptContent = """echo "##teamcity[message text='Fail' errorDetails='Fail' status='ERROR']""""
            param("teamcity.kubernetes.executor.pull.policy", "IfNotPresent")
        }
        script {
            id = "simpleRunner"
            scriptContent = "sleep 10"
            param("teamcity.kubernetes.executor.pull.policy", "IfNotPresent")
        }
    }

    failureConditions {
        executionTimeoutMin = 5
        failOnText {
            conditionType = BuildFailureOnText.ConditionType.CONTAINS
            pattern = "Fail"
            failureMessage = "!Build should be failed!"
            reverse = false
            stopBuildOnFailure = true
        }
    }

    features {
        investigationsAutoAssigner {
            defaultAssignee = "dkrupkina"
        }
    }
})
