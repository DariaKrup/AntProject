package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.dotnetTest

object BuildDuplicate : BuildType({
    name = "Build: duplicate"

    vcs {
        root(_Self.vcsRoots.Svn1httpsSvnRiouxsvnComVisualstudiotes)
    }

    steps {
        dotnetTest {
            id = "dotnet"
            projects = "ConsoleApplication1.sln"
        }
    }
})
