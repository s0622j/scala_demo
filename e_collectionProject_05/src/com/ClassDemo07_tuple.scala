package com

/**
 * @author shenjie
 * @version 1.0
 *
 */
//案例: 获取元组中的元组.
object ClassDemo07_tuple {
  def main(args: Array[String]): Unit = {
    //1. 定义一个元组，包含一个学生的姓名和性别，"zhangsan", "male"
    val tuple1 = "zhangsan" -> "male"
    //2. 分别获取该学生的姓名和性别
    //方式一: 通过 _编号 的形式实现.

    println(s"姓名: ${tuple1._1}, 性别: ${tuple1._2}")
    //方式二: 通过迭代器遍历的方式实现.
    //获取元组对应的迭代器对象.
    val it = tuple1.productIterator
    //遍历元组.
    for(i <- it) println(i)
  }
}
