package com

/**
 * @author shenjie
 * @version 1.0
 *
 */
//案例: 演示将列表转成其对应的字符串形式.
object ClassDemo14_list {
  def main(args: Array[String]): Unit = {
    //1. 定义一个列表，包含元素：1,2,3,4
    val list1 = List(1, 2, 3, 4)
    //2. 使用toString方法输出该列表的元素
    println(list1.toString)
    //简写形式, 因为: 输出语句打印对象, 默认调用了该对象的toString()方法
    println(list1)
    println("-" * 15)
    //3. 使用mkString方法, 用冒号将元素都拼接起来, 并打印结果.
    println(list1.mkString(":"))
  }
}
