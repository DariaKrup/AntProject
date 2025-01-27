import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildFeatures.perfmon
import jetbrains.buildServer.configs.kotlin.buildSteps.ant
import jetbrains.buildServer.configs.kotlin.buildSteps.gradle
import jetbrains.buildServer.configs.kotlin.buildSteps.script
import jetbrains.buildServer.configs.kotlin.kubernetesCloudProfile
import jetbrains.buildServer.configs.kotlin.projectFeatures.kubernetesConnection
import jetbrains.buildServer.configs.kotlin.projectFeatures.kubernetesExecutor
import jetbrains.buildServer.configs.kotlin.triggers.vcs
import jetbrains.buildServer.configs.kotlin.vcs.GitVcsRoot

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

    buildType(Build)

    features {
        kubernetesConnection {
            id = "PROJECT_EXT_2"
            name = "Kubernetes Connection"
            apiServerUrl = "https://A51B42A65F7E54005C95A4D353916627.gr7.eu-west-1.eks.amazonaws.com"
            authStrategy = eks {
                accessId = "AKIA5JH2VERVI62P5XDY"
                secretKey = "credentialsJSON:25c02f83-4d94-46f7-a14a-b76f5459451e"
                clusterName = "tc-dkrupkina-eks-cluster"
            }
        }
        kubernetesExecutor {
            id = "PROJECT_EXT_3"
            connectionId = "PROJECT_EXT_2"
            profileName = "K8s"
            serverURL = "http://10.128.93.57:8251/"
            templateName = "ubuntu-agent"
        }
        kubernetesCloudProfile {
            id = "kube-1"
            name = "K8s Cloud profile"
            description = "S"
            terminateAfterBuild = true
            terminateIdleMinutes = 30
            apiServerURL = "https://A51B42A65F7E54005C95A4D353916627.gr7.eu-west-1.eks.amazonaws.com"
            authStrategy = eks {
                accessId = "AKIA5JH2VERVI62P5XDY"
                secretKey = "credentialsJSON:25c02f83-4d94-46f7-a14a-b76f5459451e"
                clusterName = "tc-dkrupkina-eks-cluster"
            }
        }
        kubernetesCloudProfile {
            id = "kube-2"
            name = "K8s created"
            terminateIdleMinutes = 30
            apiServerURL = "https://A51B42A65F7E54005C95A4D353916627.gr7.eu-west-1.eks.amazonaws.com"
            authStrategy = unauthorized()
        }
    }

    subProject(GradleSimple)
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
            scriptContent = "ls"
            param("teamcity.kubernetes.executor.pull.policy", "IfNotPresent")
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


object GradleSimple : Project({
    name = "Gradle Simple"

    vcsRoot(GradleSimple_HttpsGithubComDariaKrupGradleSimpleGitRefsHeadsMaster)

    buildType(GradleSimple_Build)
})

object GradleSimple_Build : BuildType({
    name = "Build"

    vcs {
        root(GradleSimple_HttpsGithubComDariaKrupGradleSimpleGitRefsHeadsMaster)
    }

    steps {
        gradle {
            id = "gradle_runner"
            tasks = "clean build"
            gradleWrapperPath = ""
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

object GradleSimple_HttpsGithubComDariaKrupGradleSimpleGitRefsHeadsMaster : GitVcsRoot({
    name = "https://github.com/DariaKrup/gradle-simple.git#refs/heads/master"
    url = "https://github.com/DariaKrup/gradle-simple.git"
    branch = "refs/heads/master"
    branchSpec = "refs/heads/*"
})
