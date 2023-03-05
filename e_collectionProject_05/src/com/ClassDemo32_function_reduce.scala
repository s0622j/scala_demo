package com

/**
 * @author shenjie
 * @version 1.0
 *
 */
//案例: 演示聚合计算(reduce)
object ClassDemo32_function_reduce {
  def main(args: Array[String]): Unit = {
    //1. 定义一个列表，包含以下元素：1,2,3,4,5,6,7,8,9,10
    val list1 = (1 to 10).toList
    //2. 使用reduce计算所有元素的和
    //x:表示聚合操作后的结果
    //y:表示后一个元素
    //val list2 = list1.reduce((x, y) => x + y)
    //简写形式:
    //第一个下划线相当于上边的x,第二个下划线相当于上边的y
    val list2 = list1.reduce(_ + _)
    val list3 = list1.reduceLeft(_ + _)
    val list4 = list1.reduceRight(_ + _)
    println(s"list2: ${list2}")
    println(s"list3: ${list3}")
    println(s"list4: ${list4}")

    println("-" * 30)
    //如果相见操作，则reduceLeft和reduceRight得到的结果不一样
    //计算规则1-2-3-4-5-6-7-8-9-10 = -53
    println(list1.reduce(_ - _))

    /*
    * 计算规则：从右往左相减 1,2,3,4,5,6,7,8,9,10
    * 第一次计算：9 - 10 = -1
    * 第二次计算：8 - (-1) = 9
    * 第三次计算：7 - 9 = -2
    * 第四次计算：6 - (-2) = 8
    * ......
    * */
    println(list1.reduceRight(_ - _))
  }
}