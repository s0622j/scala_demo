package com

/**
 * @author shenjie
 * @version 1.0
 *
 */
//案例: 演示简化函数定义.
object ClassDemo24_function_foreach {
  def main(args: Array[String]): Unit = {
    //1. 有一个列表，包含元素1,2,3,4，请使用foreach方法遍历打印每个元素.
    val list1 = List(1, 2, 3, 4)
    list1.foreach((x:Int) => {println(x)})
    println("-" * 15)
    //2. 使用类型推断来简化函数定义.
    list1.foreach(x => println(x))
    println("-" * 15)
    //3. 使用下划线来简化函数定义
    list1.foreach(println(_))
  }
}