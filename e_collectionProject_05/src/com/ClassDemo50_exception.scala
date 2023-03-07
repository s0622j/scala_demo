package com

/**
 * @author shenjie
 * @version 1.0
 *
 */
//案例: 演示异常处理.
object ClassDemo50_exception {
  def main(args: Array[String]): Unit = {
    //1. 通过try.catch来处理 除数为零异常.
    try {
      //可能出问题的代码
      val i = 10 / 0
    } catch {
      //出现问题后的解决方案.
      //case ex:Exception => println("代码出问题了!")
      //case ex: NullPointerException => println("空指针异常")
      //case ex: ArithmeticException => println("算数异常")
      case ex: Exception => ex.printStackTrace()  //1、异常类型 2、异常的描述信息 3、异常出现的位置 3个打印到控制台

    } finally {
      //一般用来释放资源
      println("我是用来释放资源的")
    }
    println("你好！")
    println("-" * 15) //我是分割线.
    //2. 抛出一个异常对象.
    throw new Exception("我是一个Bug!")
    println("Hello, Scala!") //这行代码并不会被执行.
  }
}
