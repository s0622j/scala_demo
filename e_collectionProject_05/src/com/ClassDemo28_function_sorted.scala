package com

/**
 * @author shenjie
 * @version 1.0
 *
 */
//案例: 演示默认排序(sorted)
object ClassDemo28_function_sorted {
  def main(args: Array[String]): Unit = {
    //1. 定义一个列表，包含以下元素: 3, 1, 2, 9, 7
    val list1 = List(3, 1, 2, 9, 7,20)
    //2. 对列表进行升序排序
    val list2 = list1.sorted
    println(s"list2: ${list2}")
    //3. 对列表进行降序排列.
    val list3 = list2.reverse
    println(s"list3: ${list3}")
  }
}
