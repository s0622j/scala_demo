package com

/**
 * @author shenjie
 * @version 1.0
 *
 */
//案例: 演示foreach方法函数
object ClassDemo23_function_foreach {
  def main(args: Array[String]): Unit = {
    //1. 定义一个列表, 包含1, 2, 3, 4
    val list1 = List(1, 2, 3, 4)
    //2. 通过foreach函数遍历上述的列表.
    //x:表示集合中的每个元素 函数体表示输出集合中的每个元素.
    list1.foreach((x:Int) => {println(x)})

    println("-"*20)
    //简写版本：
    list1.foreach(x => println(x))
  }
}
