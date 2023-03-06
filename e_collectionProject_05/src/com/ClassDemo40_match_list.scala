package com

/**
 * @author shenjie
 * @version 1.0
 *
 */
//案例: 模式匹配之匹配列表
object ClassDemo40_match_list {
  def main(args: Array[String]): Unit = {
    //1. 定义列表.
    var list1 = List(0)
    var list2 = List(0, 1, 2, 3, 4, 5)
    var list3 = List(1, 2)
    //2. 通过match进行模式匹配
    //思路一: 通过List()来实现.
    list1 match {
      case List(0) => println("匹配: 只有一个0元素的列表")
      case List(0, _*) => println("匹配: 0开头, 后边元素无所谓的列表")
      case List(x, y) => println(s"匹配: 只有两个元素的列表, 元素为: ${x}, ${y}")
      case _ => println("未匹配")
    }
    //思路二: 采用关键字优化 Nil（创建一个空的列表）, tail（获取首元素以外所有的数据）
    list1 match {
      case 0 :: Nil => println("匹配: 只有一个0元素的列表")
      case 0 :: tail => println("匹配: 0开头, 后边元素无所谓的列表")
      case x :: y :: Nil => println(s"匹配: 只有两个元素的列表, 元素为: ${x}, ${y}")
      case _ => println("未匹配")
    }
  }
}
