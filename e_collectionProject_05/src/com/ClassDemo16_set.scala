package com

/**
 * @author shenjie
 * @version 1.0
 *
 */
//案例: 演示不可变集.
object ClassDemo16_set {
  def main(args: Array[String]): Unit = {
    //1. 定义一个空的整型不可变集.
    val set1 = Set[Int]()
    //2. 定义一个不可变集，保存以下元素：1,1,3,2,4,8.
    val set2 = Set(1, 1, 3, 2, 4, 8)
    //3. 打印结果.
    println(s"set1: ${set1}")
    println(s"set2: ${set2}")
  }
}