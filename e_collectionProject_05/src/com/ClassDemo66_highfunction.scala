package com

/**
 * @author shenjie
 * @version 1.0
 *
 */

//案例: 演示柯里化.
//柯里化(Currying): 将一个有多个参数的参数列表 转换成 多个只有一个参数的参数列表.
/*
示例:
方法名(数值){ //就是一个方法的调用, 只不过让方法的调用更加灵活.
函数
}
*/
object ClassDemo66_highfunction {
  //需求: 定义一个方法, 用来完成两个整数的计算(例如: 加减乘除).
  //方式一: 普通写法.
  def add(a:Int, b:Int) = a + b
  def subtract(a:Int, b:Int) = a - b
  def multiply(a:Int, b:Int) = a * b
  def divide(a:Int, b:Int) = a / b
  //方式二: 柯里化操作.
  //参数列表1: 记录要进行操作的两个数据.
  //参数列表2: 记录 具体的操作(加减乘除)
  def calculate(a:Int, b:Int)(func: (Int, Int) => Int) = func(a, b)
  def main(args: Array[String]): Unit = {
    //测试普通方法.
    println(add(10, 3))
    println(subtract(10, 3))
    println(multiply(10, 3))
    println(divide(10, 3))
    println("-" * 20)
    //测试柯里化方法.
    // 数值 函数
    println(calculate(7, 3)(_ + _))
    println(calculate(7, 3)(_ - _))
    println(calculate(7, 3)(_ * _))
    println(calculate(7, 3)(_ / _))
  }
}
