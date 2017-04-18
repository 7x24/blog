# [译]怎么发布二方包到中心仓库（How To Publish Software Artifacts To Central Repository）

原文注：添加了最佳实践和最新的相关文档链接。

我已经发布过了几次软件构件（software artifacts）到中心仓库（也就是maven中心），但我发现每次在发布的过程中，我都是一步步摸索着走下去的，有的时候还不得不借助谷歌来搜索下一步到底该干啥。这个文章基本上是我在“黑暗中摸索”的总结，因为这个摸索的过程太艰辛，不是说只要点一下按钮，或者运行一个命令，就可以将你写的代码发布到中心仓库，从而让全世界的人都能下载来使用。

## 我为什么写此文

I wrote this post to serve as a reference for myself and for anyone else out there who might find it useful: a place to document the necessary steps needed to publish software artifacts to the Central Repository.  While iterating the recurrent hurdles that I kept on encountering in the process of getting the publishing to Central successful. I have also included a couple of useful links at the end of the post.

A rundown of the steps involved can be roughly summarized to be:

Create an account on oss.sonatype.org
Create and share a PGP signature.
Update settings.xml and pom.xml appropriately.
Upload your artifact to oss.sonatype.org.
Promote the release.
Before proceeding with the steps, I would like to highlight some of the principal entities that come to play in the process. Sonatype, Nexus, OSSHR…as there is that small possibility that these entities might not be known…So I will quickly touch upon on what they represent, and how they relate to our mission of moving software to Central Repository.

[原文链接](http://www.sonatype.org/nexus/2015/06/02/how-to-publish-software-artifacts-to-maven-central/)
