package com

import scala.collection.mutable.ListBuffer

/**
 * @author shenjie
 * @version 1.0
 *
 */
//案例: 演示可变列表的常见操作.
object ClassDemo10_list {
  def main(args: Array[String]): Unit = {
    //1. 定义一个可变列表包含以下元素：1,2,3
    val list1 = ListBuffer(1, 2, 3)

    //2. 获取第一个元素, 并打印结果到控制台.
    //list1(0)=11
    println(list1(0))
    //3. 添加一个新的元素：4
    list1 += 4
    //4. 追加一个列表，该列表包含以下元素：5,6,7
    list1 ++= List(5, 6, 7)
    //5. 删除元素7
    list1 -= 7
    //6. 删除元素3, 4
    list1 --= List(3, 4)
    //7. 将可变列表转换为不可变列表
    val list2 = list1.toList
    //8. 将可变列表转换为数组
    val arr = list1.toArray
    //9. 打印结果.
    println(s"list1: ${list1}")  // ListBuffer(1, 2, 5, 6)
    println(s"list2: ${list2}")  // List(1, 2, 5, 6)
    println(s"arr: ${arr}")      // 有点特殊 ,输出语句直接打印数组,打印的是数组的地址值
  }
}
