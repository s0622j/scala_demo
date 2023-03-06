package com

/**
 * @author shenjie
 * @version 1.0
 *
 */
//案例: 模式匹配之匹配元组
object ClassDemo41_match_tuple {
  def main(args: Array[String]): Unit = {
    //1. 定义两个元组.
    val a = (1, 2, 3)
    val b = (3, 4, 5)
    val c = (3, 4)
    //2. 通过模式匹配, 匹配指定的元素
    a match {
      case (1, x, y) => println(s"匹配: 长度为3, 以1开头, 后两个元素无所谓的元组, 这里后两个元素是: ${x}, ${y}")
      case (x, y, 5) => println(s"匹配: 长度为3, 以5结尾, 前两个元素无所谓的元素, 这里前两个元素是: ${x}, ${y}")
      case _ => println("未匹配")
    }
  }
}
