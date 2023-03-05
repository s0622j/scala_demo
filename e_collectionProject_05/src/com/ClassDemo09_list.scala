package com

import scala.collection.mutable.ListBuffer

/**
 * @author shenjie
 * @version 1.0
 *
 */
//案例: 演示可变列表.
object ClassDemo09_list {
  def main(args: Array[String]): Unit = {
    //2. 创建空的整形可变列表.
    val list1 = new ListBuffer[Int]()
    //3. 创建一个可变列表，包含以下元素：1,2,3,4
    val list2 = ListBuffer(1, 2, 3, 4)
    println(s"list1: ${list1}")
    println(s"list2: ${list2}")
  }
}