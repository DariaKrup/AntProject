package patches.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.BuildType
import jetbrains.buildServer.configs.kotlin.buildSteps.script
import jetbrains.buildServer.configs.kotlin.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, create a buildType with id = 'GradleSimple1stProject_New'
in the project with id = 'GradleSimple1stProject', and delete the patch script.
*/
create(RelativeId("GradleSimple1stProject"), BuildType({
    id("GradleSimple1stProject_New")
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
}))

