package patches.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, change the buildType with id = 'Build'
accordingly, and delete the patch script.
*/
changeBuildType(RelativeId("Build")) {
    dependencies {
        expect(RelativeId("GradleSimple1stProject_Build")) {
            snapshot {
            }

            artifacts {
                artifactRules = "*.zip"
            }
        }
        update(RelativeId("GradleSimple1stProject_Build")) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }

            artifacts {
                artifactRules = "*.zip"
            }
        }

    }
}