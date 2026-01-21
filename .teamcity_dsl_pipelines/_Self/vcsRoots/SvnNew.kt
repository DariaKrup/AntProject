package _Self.vcsRoots

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.vcs.SvnVcsRoot

object SvnNew : SvnVcsRoot({
    name = "SVN NEW"
    url = "https://svn.riouxsvn.com/visualstudiotes/"
    userName = "kse1920"
    password = "credentialsJSON:fafe48d5-90a3-4a0b-9d0a-5e91e9f59c91"
})
