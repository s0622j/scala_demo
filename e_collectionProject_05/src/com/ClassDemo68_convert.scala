package com

import java.io.File
import scala.io.Source

/**
 * @author shenjie
 * @version 1.0
 *
 */
//演示 隐式转换, 自动导入.
object ClassDemo68_convert {
  //1. 定义一个RichFile类, 里边定义一个read()方法.
  class RichFile(file:File) {
    def read() = Source.fromFile(file).mkString
  }
  def main(args: Array[String]): Unit = {
    //2. 自定义一个方法, 该方法用implicit修饰,
    //用来将: 普通的File -> RichFile, 当程序需要使用的时候, 会自动调用.
    implicit def file2RichFile(file:File) = new RichFile(file)
    //3. 创建File对象, 调用read()方法.
    val file = new File("./e_collectionProject_05/data/2.txt")
    println(file.read())
  }
}
