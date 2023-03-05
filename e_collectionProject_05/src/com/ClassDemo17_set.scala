package com

/**
 * @author shenjie
 * @version 1.0
 *
 */
//案例: 演示不可变集的常用操作.
object ClassDemo17_set {
  def main(args: Array[String]): Unit = {
    //1. 创建一个集，包含以下元素：1,1,2,3,4,5
    val set1 = Set(1, 1, 2, 3, 4, 5)
    //2. 获取集的大小
    println("set1的长度为: " + set1.size)
    //3. 遍历集，打印每个元素
    println("set1集中的元素为: ")
    for(i <- set1) println(i)
    println("-" * 15)
    //4. 删除元素1，生成新的集
    val set2 = set1 - 1
    println("set2: " + set2)
    //5. 拼接另一个集（6, 7, 8)
    val set3 = set1 ++ Set(6, 7, 8)
    println("set3: " + set3)
    //6. 拼接一个列表(6,7,8, 9)
    val set4 = set1 ++ List(6, 7, 8, 9)
    println("set4: " + set4)
  }
}
