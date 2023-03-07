package com

/**
 * @author shenjie
 * @version 1.0
 *
 */
//案例: 演示闭包.
//闭包: 指的是可以访问不在当前作用域范围数据的一个函数.
object ClassDemo64_highfunction {
  def main(args: Array[String]): Unit = {
    //需求: 定义一个函数, 用来获取两个整数的和.
    //1. 在getSum函数外定义一个变量.
    val a = 10
    //2. 定义一个getSum函数, 用来获取两个整数的和.
    val getSum = (b:Int) => a + b
    //3. 调用函数
    println(getSum(3))
  }
}
