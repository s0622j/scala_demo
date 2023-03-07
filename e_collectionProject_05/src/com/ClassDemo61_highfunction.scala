package com

/**
 * @author shenjie
 * @version 1.0
 *
 */
//案例(高阶函数): 演示函数可以作为 对象传递.
object ClassDemo61_highfunction {
  def main(args: Array[String]): Unit = {
    //需求: 定义一个列表, 记录1~10的数组, 将该数字转换成对应个数的*.
    //1: * , 2: **, 3: ***...
    //1. 定义一个列表, 记录1~10的数字.
    val list1 = (1 to 10).toList
    //2. 定义一个函数对象(函数是Scala中的头等公民), 用来将Int -> String
    val func = (a:Int) => {"*" * a}
    //3. 调用函数map, 用来转换数字.
    //list1.map(这里需要一个函数)
    val list2 = list1.map(func)
    //4. 打印结果.
    println(list2)
  }
}
