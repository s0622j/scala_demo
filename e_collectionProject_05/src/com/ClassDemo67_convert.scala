package com

import java.io.File
import scala.io.Source

/**
 * @author shenjie
 * @version 1.0
 *
 */

//案例: 演示 隐式转换, 手动导入.
/*
隐式转换:
概述:
用implicit修饰的 带有单个参数的方法, 该方法会被自动调用. //前提: 需要手动引入.
作用:
用来丰富某些对象的功能的. 大白话解释: 某个对象没有某个功能, 通过特定手段让他具有此功能.
//简单理解: 这个类似于Java中的装饰设计模式.
//BufferedReader br = new BufferedReader(new FileReader("a.txt))
//这样写会报错, 必须传入一个 要被升级功能的 对象.
//BufferedReader br = new BufferedReader("a.txt")
*/
object ClassDemo67_convert {
  //1. 定义一个RichFile类, 用来给普通的File对象添加 read()功能.
  class RichFile(file:File) {
    //定义一个read()方法, 用来读取数据.
    def read() = Source.fromFile(file).mkString
  }
  //2. 定义一个单例对象, 包含一个方法, 该方法用于将: 普通的File对象 转换成 RichFile对象.
  object ImplicitDemo {
    //定义一个方法, 该方法用于将: 普通的File对象 转换成 RichFile对象.
    implicit def file2RichFile(file:File) = new RichFile(file)
  }
  def main(args: Array[String]): Unit = {
    //3. 非常非常非常重要的地方: 手动导入 隐式转换.
    import ImplicitDemo.file2RichFile
    //4. 创建普通的File对象, 尝试调用其read()功能.
    val file = new File("./e_collectionProject_05/data/1.txt")
    /*
    执行流程:
    1. 先找File类有没有read(), 有就用.
    2. 没有就去, 查看有没有该类型的隐式转换, 将该对象转成其他对象.
    3. 如果没有隐式转换, 直接报错.
    4. 如果可以将该对象升级为其他对象, 则查看升级后的对象中有没有指定方法, 有, 不报错, 没有就报
    错.
    如下的案例执行流程:
    1. file对象中没有read()方法.
    2. 检测到有 隐式转换将 file对象 转成 RichFile对象.
    3. 调用RichFile对象的read()方法, 打印结果.
    */
    println(file.read())
  }
}
