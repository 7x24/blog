# THE BASIC KNOWLEDEG ABOUT JAVA

1. 支持Unicode字符作为标识符：

  String 测试="xxxx"
  
2. Unicode字符“\uXXXX”表示法的u数量可以是多个，这么设计的是考虑到Unicode格式的源码转换成ASCII时，可以添加额外的u来标识
  
  \uXXXX \uuXXXX \uuuuXXXX
  
3. 右移 >> 和 >>> 的区别，>>是带符号位右移，>>>是不带符号位右移

## 多线程
### 线程及线程池
### 进程间通信机制
#### 同步
监视器（Monitor）是Java提供的最基本的一种线程间通信机制，它就像只有一个坑位（临界区/critical zone）的公共洗手间一样，同时只有一个人（线程/Thread）能使用这个坑位，其它的人需要在门口等待，当坑位空出来的时候，待在等待区的人就可以进去使用。

Java中的每一个对象（包括Class对象）都关联着一个监视器，所以任何一个对象都可以用作一把锁，简单地使用关键字synchronized就可以设置一个临界区。synchronized可以修饰方法（Method），以及作用域（）。


 没有必要在对象的初始化方法
There is no practical need for a constructor to be synchronized,
because it would lock the object under construction, which is normally
not made available to other threads until all constructors for the object have
completed their work.

来对对象进行加锁或解锁，每一个对象都有wait和notify方法，使用wait可以独占对象，

  



