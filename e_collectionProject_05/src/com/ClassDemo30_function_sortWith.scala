package com

/**
 * @author shenjie
 * @version 1.0
 *
 */
//案例: 演示自定义排序(sortWith)
object ClassDemo30_function_sortWith {
  def main(args: Array[String]): Unit = {
    //1. 有一个列表，包含以下元素：2,3,1,6,4,5
    val list1 = List(2,3,1,6,4,5)

    //2. 使用sortWith对列表进行降序排序
    //x:表示前边的元素
    //y:表示后边的元素
    //val list2 = list1.sortWith((x, y)=> x > y) //降序

    //简写形式:
    //第一个下划线(_)相当于上面的：x
    //第二个下划线(_)相当于上面的：y
    val list2 = list1.sortWith(_ > _) //降序
    println(s"list2: ${list2}")
  }
}
