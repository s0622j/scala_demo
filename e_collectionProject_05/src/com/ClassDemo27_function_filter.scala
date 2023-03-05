package com

/**
 * @author shenjie
 * @version 1.0
 *
 */
//案例: 演示过滤(filter)
object ClassDemo27_function_filter {
  def main(args: Array[String]): Unit = {
    //1. 有一个数字列表，元素为：1,2,3,4,5,6,7,8,9
    val list1 = (1 to 9).toList
    //2. 请过滤出所有的偶数
    //val list2 = list1.filter(x => x % 2 == 0)
    val list2 = list1.filter(_ % 2 == 0)
    println(s"list2: ${list2}")
  }
}
