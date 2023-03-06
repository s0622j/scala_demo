package com

/**
 * @author shenjie
 * @version 1.0
 *
 */
//案例: 演示Option类型
object ClassDemo44_option {
  //1. 定义一个两个数相除的方法，使用Option类型来封装结果
  def div(a: Int, b: Int) = {
    if (b == 0) {
      None //除数为0, 没有结果.
    } else {
      Some(a / b) //除数不为0, 返回具体的结果.
    }
  }

  def main(args: Array[String]): Unit = {
    //2. 然后使用模式匹配来打印结果
    val result = div(10, 0)
    println(result)
    //思路一: 通过模式匹配来打印结果.
    result match {
      //不是除零，打印结果
      case Some(x) => println(x)
      //除零打印异常错误
      case None => println("除数不能为0")
    }
    println("-" * 15)
    //思路二: 采用getOrElse()方法实现.
    println(result.getOrElse(0))
  }

}
