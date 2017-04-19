# [译]怎么发布软件构件到中心仓库

原文注：添加了最佳实践和最新的相关文档链接。

我已经发布过了几次软件构件（software artifacts）到中心仓库（也就是maven中心），但我发现每次在发布的过程中，我都是一步步摸索着走下去的，有的时候还不得不借助谷歌来搜索下一步到底该干啥。这个文章基本上是我在“黑暗中摸索”的总结，因为这个摸索的过程太艰辛，不是说只要点一下按钮，或者运行一个命令，就可以将你写的代码发布到中心仓库，从而让全世界的人都能下载来使用。

## 我为什么写此文

之所以写这篇文章，是因为我想给我自己或者其他人一个参考，于是，在这里记录下了发布软件构件到中心仓库的必要步骤。在“黑暗中摸索”的时候也沉淀了一些有用的链接，放在了文章的最后。

所有要做的事情可以概括为以下几步：

1.创建一个oss.sonatype.org帐号
2.创建PGP签名，然后分享
3.更新settings.xml和pom.xml
4.上传构件到oss.sonatype.org
5.发布

Before proceeding with the steps, I would like to highlight some of the principal entities that come to play in the process. Sonatype, Nexus, OSSHR…as there is that small possibility that these entities might not be known…So I will quickly touch upon on what they represent, and how they relate to our mission of moving software to Central Repository.

[原文链接](http://www.sonatype.org/nexus/2015/06/02/how-to-publish-software-artifacts-to-maven-central/)
