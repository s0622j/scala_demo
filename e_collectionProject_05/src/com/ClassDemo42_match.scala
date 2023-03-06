package com

/**
 * @author shenjie
 * @version 1.0
 *
 */
//案例: 演示变量声明中的模式匹配.
object ClassDemo42_match {
  def main(args: Array[String]): Unit = {
    //1. 生成包含0-10数字的数组，使用模式匹配分别获取第二个、第三个、第四个元素
    //1.1 生成包含0-10数字的数组
    val arr = (0 to 10).toArray
    //1.2 使用模式匹配分别获取第二个、第三个、第四个元素
    val Array(_, x, y, z, _*) = arr;
    //1.3 打印结果.
    println(x, y, z)
    println("-" * 15)

    //2. 生成包含0-10数字的列表，使用模式匹配分别获取第一个、第二个元素
    //2.1 生成包含0-10数字的列表，
    val list = (0 to 10).toList
    //2.2 使用模式匹配分别获取第一个、第二个元素
    //思路一: List() 实现
    val List(a, b, _*) = list
    //思路二: ::, tail 实现.
    val c :: d :: tail = list
    //2.3 打印结果.
    println(a, b)
    println(c, d)
  }
}
