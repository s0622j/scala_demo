package com

/**
 * @author shenjie
 * @version 1.0
 *
 */
//案例: 演示 匿名函数.
object ClassDemo62_highfunction {
  def main(args: Array[String]): Unit = {
    //需求: 定义一个列表, 记录1~10的数组, 将该数字转换成对应个数的*.
    //1: * , 2: **, 3: ***...
    //1. 定义一个列表, 记录1~10的数字.
    val list1 = (1 to 10).toList
    //2. 通过map函数用来进行转换, 该函数内部接收一个: 匿名函数.
    //(x:Int) => {"*" * x}
    val list2 = list1.map((x:Int) => "*" * x)
    //3. 打印结果.
    println(list2)
    //简写版: 通过下划线实现.
    val list3 = list1.map("*" * _)
    //val list4 = list1.map(_ * "*") //不能这样写, 会报错.
    println(list3)
  }
}
