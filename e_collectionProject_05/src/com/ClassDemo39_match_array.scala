package com

/**
 * @author shenjie
 * @version 1.0
 *
 */
//案例: 模式匹配之匹配数组
object ClassDemo39_match_array {
  def main(args: Array[String]): Unit = {
    //1. 定义三个数组.
    val arr1 = Array(1, 2, 3)
    val arr2 = Array(0)
    val arr3 = Array(1, 2, 3, 4, 5)
    //2. 通过模式匹配, 找到指定的数组.
    arr3 match {
      //匹配: 长度为3, 首元素为1, 后两个元素无所谓.
      case Array(1, x, y) => println(s"匹配长度为3, 首元素为1, 后两个元素是: ${x}, ${y}")
      //匹配: 只有一个0元素的数组
      case Array(0) => println("匹配: 只有一个0元素的数组")
      //匹配: 第一个元素是1, 后边元素无所谓的数组._表示任意元素、*表示多个
      case Array(1, _*) => println("匹配: 第一个元素是1, 后边元素无所谓的数组")
      //其他校验项
      case _ => println("未匹配")
    }
  }
}
