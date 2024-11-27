import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.ant
import jetbrains.buildServer.configs.kotlin.projectFeatures.dockerRegistry
import jetbrains.buildServer.configs.kotlin.projectFeatures.hashiCorpVaultConnection
import jetbrains.buildServer.configs.kotlin.projectFeatures.kubernetesConnection
import jetbrains.buildServer.configs.kotlin.projectFeatures.kubernetesExecutor

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

version = "2024.07"

project {

    buildType(AntBuild)

    features {
        hashiCorpVaultConnection {
            id = """#"><img src=x onerrror=alert(1)>"""
            name = "HashiCorp Vault (1)"
            url = """http://localhost:8200#"><img src=x onerrror=alert(1)>"""
            authMethod = appRole {
                roleId = """http://localhost:8200#"><img src=x onerrror=alert(1)>"""
                secretId = "credentialsJSON:bdaab2db-86b3-4dd4-b202-3c0e11f9bf66"
            }
        }
        kubernetesConnection {
            id = "K8S_CONNECTION"
            name = "EKS Kubernetes Connection"
            apiServerUrl = "https://A51B42A65F7E54005C95A4D353916627.gr7.eu-west-1.eks.amazonaws.com"
            namespace = "default"
            authStrategy = eks {
                accessId = "AKIA5JH2VERVI62P5XDY"
                secretKey = "credentialsJSON:5956c87f-9f8f-4ec4-8c89-2874bed09e35"
                clusterName = "tc-dkrupkina-eks-cluster"
            }
        }
        kubernetesExecutor {
            id = "K8S_EXECUTOR"
            connectionId = "K8S_CONNECTION"
            profileName = "K8S Executor"
            buildsLimit = "3"
            description = "EKS Connection"
            templateName = "aws-ca-certficate-agent"
        }
        hashiCorpVaultConnection {
            id = "LocalVault"
            name = "HashiCorp Vault (Local)"
            url = "https://localhost:8200"
            authMethod = appRole {
                roleId = "e0d9ef3e-a837-c70c-ea96-46e9870e6567"
                secretId = "credentialsJSON:48cd3827-a9c5-420c-ab72-3957ed2da18a"
            }
        }
        kubernetesConnection {
            id = "PROJECT_EXT_38"
            name = "EKS (IAM) Kubernetes Connection"
            apiServerUrl = "https://A51B42A65F7E54005C95A4D353916627.gr7.eu-west-1.eks.amazonaws.com"
            namespace = "default"
            authStrategy = eks {
                accessId = "AKIA5JH2VERVI62P5XDY"
                secretKey = "credentialsJSON:5956c87f-9f8f-4ec4-8c89-2874bed09e35"
                assumeIamRole = true
                iamRoleArn = "arn:aws:iam::913206223978:role/dkrupkina-eks-cluster"
                clusterName = "tc-dkrupkina-eks-cluster"
            }
        }
        kubernetesConnection {
            id = "PROJECT_EXT_55"
            name = "EKS (server profile) Kubernetes Connection"
            apiServerUrl = "https://A51B42A65F7E54005C95A4D353916627.gr7.eu-west-1.eks.amazonaws.com"
            namespace = "default"
            authStrategy = eks {
                eksUseInstanceProfile = true
                clusterName = "tc-dkrupkina-eks-cluster"
            }
        }
        kubernetesConnection {
            id = "PROJECT_EXT_56"
            name = "Unauthorized Kubernetes Connection"
            apiServerUrl = "https://A51B42A65F7E54005C95A4D353916627.gr7.eu-west-1.eks.amazonaws.com"
            authStrategy = unauthorized()
        }
        kubernetesConnection {
            id = "PROJECT_EXT_59"
            name = "AKS OpenID Kubernetes Connection"
            apiServerUrl = "dkrupkinaa-tc-dkrupkina-ins-759c9f-4ozsrmd7.hcp.northeurope.azmk8s.io"
            authStrategy = openId {
                idpIssuerUrl = "https://northeurope.oic.prod-aks.azure.com/080e4d1b-3521-4847-94da-37050321d1ad/30bbc5fd-baea-4da3-8afd-b21ea0340801/"
                clientId = "b6f82b73-e2ed-4a4a-8091-2f150dc41274"
                clientSecret = "credentialsJSON:49f2e1f4-f779-445f-93d5-2d27248952ed"
                refreshToken = "credentialsJSON:9ce470f9-bcc9-4c9d-a995-adf5768ca7f9"
            }
        }
        kubernetesConnection {
            id = "PROJECT_EXT_90"
            name = "AKS Kubernetes Connection (token)"
            apiServerUrl = "https://dkrupkinaa-tc-dkrupkina-ins-759c9f-4ozsrmd7.hcp.northeurope.azmk8s.io"
            namespace = "default"
            authStrategy = token {
                token = "credentialsJSON:9a785d7d-aed5-4f4a-a985-05feeb715e91"
            }
        }
        kubernetesConnection {
            id = "PROJECT_EXT_91"
            name = "(Key + certificate) Kubernetes Connection"
            apiServerUrl = "https://A51B42A65F7E54005C95A4D353916627.gr7.eu-west-1.eks.amazonaws.com"
            caCertificate = "credentialsJSON:97b8daf4-0504-4ac3-9df0-b9ab550cb9e7"
            authStrategy = clientCertificateAndKey {
                clientKey = "credentialsJSON:dfa09549-88d5-4b3c-a1d5-a541202a4e48"
                clientCertificate = "credentialsJSON:a22ffc3e-38b9-4123-a27e-6d86f12478b1"
            }
        }
        kubernetesConnection {
            id = "PROJECT_EXT_92"
            name = "(Username + password) Kubernetes Connection"
            apiServerUrl = "https://dkrupkinaa-tc-dkrupkina-ins-759c9f-4ozsrmd7.hcp.northeurope.azmk8s.io"
            authStrategy = usernameAndPassword {
                username = "Daria.Krupkina@office365.jetbrains.com"
                password = "credentialsJSON:3182b704-321a-409e-aac5-a838bcb34057"
            }
        }
        kubernetesConnection {
            id = "PROJECT_EXT_93"
            name = "(Default Account) Kubernetes Connection"
            apiServerUrl = "https://A51B42A65F7E54005C95A4D353916627.gr7.eu-west-1.eks.amazonaws.com"
            authStrategy = serviceAccount()
        }
        kubernetesExecutor {
            id = "PROJECT_EXT_94"
            connectionId = "PROJECT_EXT_2"
            profileName = "K8S EKS Executor"
            buildsLimit = "3"
            description = "Based on EKS Connection"
            serverURL = "https://aws-teamcity.dkrupkina.net:8451/"
            templateName = "aws-ca-certficate-agent"
        }
        kubernetesExecutor {
            id = "PROJECT_EXT_98"
            connectionId = "K8S_CONNECTION"
            profileName = "K8s XSS"
            containerParameters = """test"} </script><img src=x onerror=alert(1)>//"""
            templateName = "ubuntu-jdk8-agent"
        }
        dockerRegistry {
            id = "PROJECT_EXT_99"
            name = "Docker Registry (Local)"
            userName = "dariakrup"
            password = "credentialsJSON:82cbcea7-18a1-4a18-9e08-c383d88d5f4f"
        }
    }
}

object AntBuild : BuildType({
    name = "AntBuild"

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
    }
})
