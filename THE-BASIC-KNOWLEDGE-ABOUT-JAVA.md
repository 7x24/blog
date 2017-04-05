# THE BASIC KNOWLEDEG ABOUT JAVA


## 基本语法

支持Unicode字符作为标识符：

    String 测试="xxxx"；

Unicode字符“\uXXXX”表示法的u数量可以是多个，这么设计的是考虑到Unicode格式的源码转换成ASCII时，可以添加额外的u来标识

    \uXXXX \uuXXXX \uuuuXXXX

右移 >> 和 >>> 的区别，>>是带符号位右移，>>>是不带符号位右移

## 多线程
### 线程及线程池
### 进程间通信机制
#### 同步
监视器（Monitor）是Java提供的最基本的一种线程间通信机制，它就像只有一个坑位（临界区/critical zone）的公共洗手间一样，同时只有一个人（线程/Thread）能使用这个坑位，其它的人需要在门口等待，当坑位空出来的时候，待在等待区的人就可以进去使用。

Java中的每一个对象（包括Class对象）都关联着一个监视器，所以任何一个对象都可以用作一把锁，简单地使用关键字synchronized就可以设置一个临界区。synchronized可以修饰方法（Method）和代码块，下面是一个简单的例子。

    synchronized(this) {
        this.count++;
    }
  
* **构造方法（constructor）是没有必要使用synchronized来进行修饰的，因为只有等构造方法调用完成之后，对象的实例才能被线程使用。**

关键字synchronized修饰非静态（非Static）方法时关联的是对象的实例，修饰静态方法时关联的是类的Class实例，进入临界区需要获得关联实例的监视器控制权。

每一个Java对象都继承自Object，都默认有wait和notify方法，这两个方法可以用来协调不同线程的任务调度，线程调用wait方法之后便会放弃对监视器的控制权，然后等待其他线程调用notify。
  



