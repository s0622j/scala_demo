package com

import scala.io.StdIn

/**
 * @author shenjie
 * @version 1.0
 *
 */
//案例: 模式匹配之简单匹配
object ClassDemo35_match {
  def main(args: Array[String]): Unit = {
    //1. 提示用户录入字符串并接收.
    println("请录入一个字符串: ")
    var str = StdIn.readLine()
    //2. 判断字符串是否是指定的内容, 并接收结果.
    val result = str match {
      case "hadoop" => "大数据分布式存储和计算框架"
      case "zookeeper" => "大数据分布式协调服务框架"
      case "spark" => "大数据分布式内存计算框架"
      case _ => "未匹配"
    }
    //3. 打印结果.
    println(result)
    println("-" * 15) //分割线.
    //简写形式
    str match {
      case "hadoop" => println("大数据分布式存储和计算框架")
      case "zookeeper" => println("大数据分布式协调服务框架")
      case "spark" => println("大数据分布式内存计算框架")
      case _ => println("未匹配")
    }
  }
}
