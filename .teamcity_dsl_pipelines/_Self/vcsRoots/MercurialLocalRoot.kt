package _Self.vcsRoots

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.vcs.HgVcsRoot

object MercurialLocalRoot : HgVcsRoot({
    name = "Mercurial Local root"
    url = "test/test"
})
