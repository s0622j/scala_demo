package com

/**
 * @author shenjie
 * @version 1.0
 *
 */
//案例: 斐波那契数列
object ClassDemo73_recurrence {
  //即: 已知数列1, 1, 2, 3, 5, 8, 13..., 问: 第12个数字是多少?
  //出口：第一个月和第二个月的兔子数都是1
  //规律：从第3个月开始，每个月的兔子数 = 他前两个月兔子数之和
  //1. 定义方法, 用来获取兔子的对数.
  def rabbit(month:Int):Int = {
    //出口
    if(month == 1 || month == 2) 1
    //规律
    else rabbit(month -1) + rabbit(month - 2)
  }
  def main(args: Array[String]): Unit = {
    //2. 调用方法, 获取第12个月的兔子对数.
    val num = rabbit(12)
    //3. 打印结果.
    println(num)
  }
}
