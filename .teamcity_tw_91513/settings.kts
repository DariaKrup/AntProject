import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildFeatures.perfmon
import jetbrains.buildServer.configs.kotlin.buildSteps.ant
import jetbrains.buildServer.configs.kotlin.buildSteps.gradle
import jetbrains.buildServer.configs.kotlin.buildSteps.script
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

    subProject(GradleSimple1stProject)
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
    }

    triggers {
        vcs {
        }
    }

    features {
        perfmon {
        }
    }

    dependencies {
        dependency(GradleSimple1stProject_New) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }

            artifacts {
                artifactRules = "*.zip"
            }
        }
    }
})


object GradleSimple1stProject : Project({
    name = "Gradle Simple [1st project]"

    vcsRoot(GradleSimple1stProject_HttpsGithubComDariaKrupGradleSimpleGitRefsHeadsMaster)

    buildType(GradleSimple1stProject_Config)
    buildType(GradleSimple1stProject_New)
    buildType(GradleSimple1stProject_Build)
    buildType(GradleSimple1stProject_CmdSubproject)
})

object GradleSimple1stProject_Build : BuildType({
    name = "Build"

    artifactRules = "**/* => sources.zip"

    vcs {
        root(GradleSimple1stProject_HttpsGithubComDariaKrupGradleSimpleGitRefsHeadsMaster)
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

object GradleSimple1stProject_CmdSubproject : BuildType({
    name = "CMD subproject"

    steps {
        script {
            id = "simpleRunner"
            scriptContent = "ls -la"
        }
    }
})

object GradleSimple1stProject_Config : BuildType({
    name = "Config"

    params {
        param("param", "a")
    }

    steps {
        script {
            id = "simpleRunner"
            scriptContent = "echo %param%"
        }
    }
})

object GradleSimple1stProject_New : BuildType({
    name = "New"

    vcs {
        root(DslContext.settingsRoot)
    }

    steps {
        script {
            id = "simpleRunner"
            scriptContent = "ls ./"
        }
    }
})

object GradleSimple1stProject_HttpsGithubComDariaKrupGradleSimpleGitRefsHeadsMaster : GitVcsRoot({
    name = "https://github.com/DariaKrup/gradle-simple.git#refs/heads/master"
    url = "https://github.com/DariaKrup/gradle-simple.git"
    branch = "refs/heads/master"
    branchSpec = "refs/heads/*"
})
