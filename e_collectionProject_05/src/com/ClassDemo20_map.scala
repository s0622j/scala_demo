package com
import scala.collection.mutable.Map
/**
 * @author shenjie
 * @version 1.0
 *
 */
//案例: 演示可变Map.
object ClassDemo20_map {
  def main(args: Array[String]): Unit = {
    //1. 定义一个映射，包含以下学生姓名和年龄数据.
    val map1 = Map("张三" -> 23, "李四" -> 24)
    val map2 = Map(("张三", 23),("李四", 24))
    //2. 修改张三的年龄为30
    map1("张三") = 30
    //3. 打印结果
    println(s"map1: ${map1}")
    println(s"map2: ${map2}")
  }
}
