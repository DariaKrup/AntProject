import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildFeatures.perfmon
import jetbrains.buildServer.configs.kotlin.buildSteps.ant
import jetbrains.buildServer.configs.kotlin.buildSteps.script
import jetbrains.buildServer.configs.kotlin.projectFeatures.dockerRegistry
import jetbrains.buildServer.configs.kotlin.projectFeatures.hashiCorpVaultConnection
import jetbrains.buildServer.configs.kotlin.remoteParameters.hashiCorpVaultParameter
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

version = "2024.07"

project {

    buildType(Build)

    params {
        hashiCorpVaultParameter {
            name = "env.AWS_SECRET_ACCESS_KEY"
            query = "aws/data/access!/AWS_SECRET_ACCESS_KEY"
            vaultId = "VaultID"
        }
        param("a", "a")
        hashiCorpVaultParameter {
            name = "env.AWS_ACCESS_KEY_ID"
            query = "aws/data/access!/AWS_ACCESS_KEY_ID"
        }
    }

    features {
        dockerRegistry {
            id = "PROJECT_EXT_3"
            name = "Docker Registry"
            userName = "dariakrup"
            password = "credentialsJSON:12b0efe2-15bb-41b7-ad87-15fed089b8a5"
        }
        hashiCorpVaultConnection {
            id = "PROJECT_EXT_4"
            name = "HashiCorp Vault (empty, fail!)"
            vaultId = ""
            url = "https://localhost:8200"
            authMethod = appRole {
                roleId = "e0d9ef3e-a837-c70c-ea96-46e9870e6567"
                secretId = "credentialsJSON:0bb1cb6c-29b8-4e3a-bbb2-6203ce6f374e"
            }
        }
    }
}

object Build : BuildType({
    name = "Build"

    params {
        param("empty_github_token", "%vault:passwords_storage_v1/github!/token%")
        param("vaultID_docker_password", "%vault:VaultID:passwords_storage_v1/docker!/password%")
    }

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
            scriptContent = "echo %empty_github_token% %env.AWS_ACCESS_KEY_ID% %env.AWS_SECRET_ACCESS_KEY% %vaultID_docker_password% >> secrets.txt"
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
