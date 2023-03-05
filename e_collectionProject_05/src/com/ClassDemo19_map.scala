package com

/**
 * @author shenjie
 * @version 1.0
 *
 */
//案例: 演示不可变Map
object ClassDemo19_map {
  def main(args: Array[String]): Unit = {
    //1. 定义一个映射，包含以下学生姓名和年龄数据.
    val map1 = Map("张三" -> 23, "李四" -> 24, "李四" -> 40)
    val map2 = Map(("张三", 23),("李四", 24), ("李四" -> 40))
    //2. 打印结果.
    println(s"map1: ${map1}")
    println(s"map2: ${map2}")
  }
}
