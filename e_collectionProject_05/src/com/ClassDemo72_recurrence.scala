package com

import scala.util.control.Breaks.break

/**
 * @author shenjie
 * @version 1.0
 *
 */

/*
递归指的就是 方法自己调用自己的情况 . 在涉及到复杂操作时, 我们会经常用到它. 在使用递归时, 要注意以下三点:
1. 递归必须有出口, 否则容易造成 死递归 .
2. 递归必须要有规律.
3. 构造方法不能递归.
4. 递归方法必有 返回值的数据类型 .
 */

//案例: 求5的阶乘.
object ClassDemo72_recurrence {
  var count = 1
  def show():Int = {
    //打印show()方法的调用次数
    println(s"第${count}次调用")
    count += 1
    //if (count == 100) break
    //递归就是方法自己调用自己
    show()
    1
  }
  //1. 定义方法, 用来求数字n的阶乘.
  //规律：n! = n * (n-1)！
  //出口：1! = 1
  //def factorial(n:Int):Int = if(n == 1) 1 else n * factorial(n - 1)
  def factorial(n:Int):Int = {
    //出口：
    if(n == 1) 1
    //规律：
    else n * factorial(n - 1)
  }
  def main(args: Array[String]): Unit = {
    //show()  // .StackOverflowError
    //2. 调用factorial方法, 用来获取5的阶乘.
    val num = factorial(5)
    //3. 打印结果.
    println(num)
  }
}
