package com

import scala.io.StdIn

/**
 * @author shenjie
 * @version 1.0
 *
 */
//案例: 随机职业
object ClassDemo52_exercise {
  def main(args: Array[String]): Unit = {
    //1. 提示用户录入数字, 并接收.
    println("请录入一个数字(1~5), 我来告诉您上辈子的职业: ")
    val num = StdIn.readInt()
    //2. 通过模式匹配获取该用户上辈子的职业.
    //假设: 1-> 一品带刀侍卫, 2 -> 宰相, 3 -> 江湖郎中, 4 -> 打铁匠, 5 -> 店小二.
    val occupation = num match {
      case 1 => "一品带刀侍卫"
      case 2 => "宰相"
      case 3 => "江湖郎中"
      case 4 => "打铁匠"
      case 5 => "店小二"
      case _ => "公公"
    }
    //3. 打印结果.
    println(s"您上辈子的职业是: ${occupation}")
  }
}
