package com

import scala.io.StdIn

/**
 * @author shenjie
 * @version 1.0
 *
 */
//案例: 模式匹配之守卫
object ClassDemo37_match_if {
  def main(args: Array[String]): Unit = {
    //1. 从控制台读入一个数字a（使用StdIn.readInt）
    println("请录入一个整数: ")
    var num = StdIn.readInt()
    //2. 模式匹配
    num match {
      //格式：case 变量名 if条件1 => 表达式1
      //2.1 如果 a >= 0 而且 a <= 3，打印[0-3]
      case a if a >= 0 && a <= 3 => println("[0-3]")
      //2.2 如果 a >= 4 而且 a <= 8，打印[4,8]
      case a if a >= 4 && a <= 8 => println("[4-8]")
      //2.3 否则，打印未匹配
      case _ => println("未匹配")
    }
  }
}
