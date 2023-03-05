package com

/**
 * @author shenjie
 * @version 1.0
 *
 */
//案例: 演示折叠计算(fold)
object ClassDemo33_function_fold {
  def main(args: Array[String]): Unit = {
    //1. 定义一个列表，包含以下元素：1,2,3,4,5,6,7,8,9,10
    val list1 = (1 to 10).toList
    //2. 假设初始化值是100, 使用fold计算所有元素的和
    //val list2 = list1.fold(100)((x, y) => x + y)
    //简写形式:
    val list2 = list1.fold(100)(_ + _)
    val list3 = list1.foldLeft(100)(_ + _)
    val list4 = list1.foldRight(100)(_ + _)
    println(s"list2: ${list2}")
    println(s"list3: ${list3}")
    println(s"list4: ${list4}")
  }
}
