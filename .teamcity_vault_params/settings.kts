import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.ant
import jetbrains.buildServer.configs.kotlin.buildSteps.script
import jetbrains.buildServer.configs.kotlin.projectFeatures.hashiCorpVaultConnection
import jetbrains.buildServer.configs.kotlin.remoteParameters.hashiCorpVaultParameter

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

version = "2024.03"

project {

    buildType(Build)

    params {
        param("empty_github_token", "%vault:passwords_storage_v1/github!/token%")
        param("vaultID_docker_password", "%vault:VaultID:passwords_storage_v1/docker!/password%")
    }

    features {
        hashiCorpVaultConnection {
            id = "PROJECT_EXT_6"
            name = "HashiCorp Vault (default empty namespace)"
            url = "https://localhost:8200"
            authMethod = appRole {
                roleId = "e0d9ef3e-a837-c70c-ea96-46e9870e6567"
                secretId = "credentialsJSON:339ea782-bc93-4d03-9922-8f56d209a394"
            }
        }
        hashiCorpVaultConnection {
            id = "PROJECT_EXT_7"
            name = "HashiCorp Vault (VaultID namespace)"
            vaultId = "VaultID"
            url = "https://localhost:8200"
            authMethod = appRole {
                roleId = "e0d9ef3e-a837-c70c-ea96-46e9870e6567"
                secretId = "credentialsJSON:339ea782-bc93-4d03-9922-8f56d209a394"
            }
            failOnError = false
        }
    }
}

object Build : BuildType({
    name = "Build"

    params {
        hashiCorpVaultParameter {
            name = "env.AWS_SECRET_ACCESS_KEY"
            query = "aws/data/access!/AWS_SECRET_ACCESS_KEY"
        }
        hashiCorpVaultParameter {
            name = "env.AWS_ACCESS_KEY_ID"
            query = "aws/data/access!/AWS_ACCESS_KEY_ID"
            vaultId = "VaultID"
        }
    }

    vcs {
        root(DslContext.settingsRoot)
    }

    steps {
        script {
            name = "EchoParameters"
            id = "EchoParameters"
            scriptContent = """
                echo %empty_github_token%
                echo %vaultID_docker_password%
                echo %env.AWS_ACCESS_KEY_ID%
                echo %env.AWS_SECRET_ACCESS_KEY%
            """.trimIndent()
        }
        ant {
            id = "Ant"
            mode = antFile {
            }
            targets = "build"
        }
    }
})
