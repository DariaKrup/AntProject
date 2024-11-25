package patches.projects

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.Project
import jetbrains.buildServer.configs.kotlin.projectFeatures.KubernetesExecutor
import jetbrains.buildServer.configs.kotlin.projectFeatures.kubernetesExecutor
import jetbrains.buildServer.configs.kotlin.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, change the root project
accordingly, and delete the patch script.
*/
changeProject(DslContext.projectId) {
    features {
        val feature1 = find<KubernetesExecutor> {
            kubernetesExecutor {
                id = "PROJECT_EXT_94"
                connectionId = "PROJECT_EXT_2"
                profileName = "K8S EKS Executor"
                buildsLimit = "3"
                description = "Based on EKS Connection"
                templateName = "aws-ca-certficate-agent"
            }
        }
        feature1.apply {
            serverURL = "https://aws-teamcity.dkrupkina.net:8451/"
        }
    }
}
