
# JAVA基础

## 概述

##### 什么是程序？

+ 程序： 计算机执行某些操作或解决某个问题而编写的一系列有序指令的集合  

##### Java的技术平台体系

+ JavaSE、JavaEE和JavaME

##### Java的特点

+ 面向对象

+ 健壮的：强类型机制、异常处理、垃圾自动回收等是Java程序健壮性的保证

+ 跨平台：一个编译好的.class 文件可以在多个系统下运行

+ 解释型语言[了解]

##### Java虚拟机【JVM】

​			JVM 是一个虚拟的计算机， 具有指令集并使用不同的存储区域。 负责执行指令， 管理数据、 内存、 寄存器， 包含在
JDK 中 ；对于不同的平台， 有不同的虚拟机；Java 虚拟机机制屏蔽了底层运行平台的差别， 实现了“一次编译， 到处运行” 。

<img src="docs\Java\source\jvm1.png" alt="image-20220208233133000" style="zoom:50%;" />

##### JDK与JRE

+ JDK (Java Development Kit Java 开发工具包)
  JDK = JRE + Java 的开发工具 [java, javac,javadoc,javap 等]  
+ JRE(Java Runtime Environment Java 运行环境)
  JRE = JVM + Java 的核心类库[类] 

##### Java程序的执行流程

+ .![image-20220209215142477](docs\Java\source\java程序执行流程.png)

##### Java转义字符

+ \t ： 一个制表位， 实现对齐的功能
  \n ： 换行符
  \\ ： 一个\
  \" :一个"
  \' ： 一个'
  \r :一个回车  

Java的注释类型

+ 单行注释 //
+ 多行注释 /* */
+ 文档注释 /** */  

## 变量

##### 概念

+ 变量相当于内存中一个数据存储空间的表示， 可以把变量看做是一个房间的门牌号， 通过门牌号我们可以找到房
  间， 而程序可以通过变量名可以访问到变量(值)
+ 变量 = 数据类型 + 变量名 + 变量值

##### Java程序中 + 号的使用

+ 当+号左右两边是数值类型时，做加法运算
+ 当+号左右两边存在字符串时，做拼接运算

##### Java的数据类型

+ 结构![image-20220209220603852](docs\Java\source\java数据类型.png)

+ 基本类型

  + 整型![image-20220209220953921](docs\Java\source\基本数据类型之整型.png)

  + 举例

    ```java
    int i = 1;
    byte b = 1;
    short s = 1;
    long l = 1L;
    ```

  + 浮点类型![image-20220209221424611](docs\Java\source\基本数据类型之浮点类型.png)

  + 举例

    ```java
    float f = 3.14f;
    double d = 3.1415; //默认为double
    ```

  + 说明：

    + 浮点数=符号位+指数位+尾数位  
    + 尾数部分可能丢失， 造成精度损失(小数都是近似值）
    + 浮点常量的两种表示类型：
      + 十进制数形式：5.12  512.01f  .521
      + 科学计数法：5.12e2（5.12 * 10的2次方）5.12e-2（5.12 / 10的2次方）

  + 字符类型

    + 字符常量使用单引号' ' 括起来的单个字符

      ```java
      char c = 'A';
      char c1 = '\n'; //允许使用转义字符
      char c2 = 97; //与 char c2 = 'a';等价
      ```

    + char 的本质是一个整数，输出的是unicode对应的字符

    + char可以进行运算，相当于一个整数

    + 字符编码表

      + [ASCII 码](http://www.asciima.com/)  
      + [Unicode 编码](https://home.unicode.org/) 
      + [UTF-8 编码](https://www.zhihu.com/question/23374078/answer/65352538) 

  + 布尔类型：Boolean

    + 占一个字节
    + 只允许取值 true 或者 false

+ 基本数据类型转换

  + 自动类型转换
    + 自动类型转换注意和细节  
  + 强制类型转换
    + 强制类型转换细节说明  

+ 基本数据类型和 String 类型的转换  

  + 注意事项

## 运算符

## 程序控制结构

## 数组、排序和查找

## 面向对象

## 枚举

## 注解

## 异常

## 常用类

## 泛型

## 导图
![导图](docs\Java\source\java_basic.png)
