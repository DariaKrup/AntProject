version = "2025.03"

project {
    id("AntProject")
    name = "Ant Project"

    vcsRoot {
        id("AntProjectVcsRoot")
        name = "Ant Project VCS Root"
        url = "https://github.com/DariaKrup/AntProject.git"
        branch = "refs/heads/main" // Adjust if needed
    }

    buildType {
        id("BuildAndTest")
        name = "Build and Test"
        
        vcs {
            root("AntProjectVcsRoot")
        }

        steps {
            step {
                name = "Compile"
                ant {
                    buildFile = "build.xml" // Adjust if your build file has a different name
                    targets = "compile" // Adjust as necessary
                }
            }
            step {
                name = "Run Tests"
                ant {
                    buildFile = "build.xml" // Same build file
                    targets = "test" // Adjust where your test targets are defined
                }
            }
        }

        triggers {
            vcs {
                id = "VcsTrigger"
                branchFilter = "+:refs/heads/*" // Triggers on all branch updates
            }
        }

        requirements {
            equals("teamcity.agent.jvm.os.version", "Linux") // Specify the OS requirements if needed
        }
    }
}
