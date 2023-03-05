package com

/**
 * @author shenjie
 * @version 1.0
 *
 */
//案例: 演示不可变列表.
object ClassDemo08_list {
  def main(args: Array[String]): Unit = {
    //1. 创建一个不可变列表，存放以下几个元素（1,2,3,4）
    val list1 = List(1, 2, 3, 4)
    //2. 使用`Nil`创建一个不可变的空列表
    val list2 = Nil
    //3. 使用`::`方法创建列表，包含-2、-1两个元素
    val list3 = -2 :: -1 :: Nil
    //4. 打印结果.
    println(s"list1: ${list1}")
    println(s"list2: ${list2}")
    println(s"list3: ${list3}")
  }
}
