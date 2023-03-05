package com.demo06_object

//scala中是没有static关键字的，要想定义类似于Java中的static变量、static方法，就要使用到scala中的单例对象了,  也就是object.
//1. 在object中定义的成员变量类似于Java中的静态变量, 在内存中都只有一个对象.
//2. 在单例对象中, 可以直接使用`单例对象名.`的形式调用成员.

//案例: 演示如何创建单例对象.
object ClassDemo01 {

  //1. 定义单例对象Dog.
  object Dog {
    //2. 定义一个变量, 用来保存狗的腿的数量.
    val leg_num = 4
  }

  //3. 定义main方法, 作为程序的主入口.
  def main(args: Array[String]): Unit = {
    //4. 直接打印狗的腿的数量.
    println(Dog.leg_num)
  }
}
