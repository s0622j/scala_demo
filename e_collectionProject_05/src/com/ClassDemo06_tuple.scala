package com

/**
 * @author shenjie
 * @version 1.0
 *
 */
//案例: 演示元组的定义格式
// 元组一般用来存储多个不同类型的值。例如同时存储姓名，年龄，性别，出生年月这些数据, 就要用到元组来存储了。并且元组的长度和元素都是不可变的。
/*
格式一: 通过小括号实现
val/var 元组 = (元素1, 元素2, 元素3....)

格式二: 通过箭头来实现
val/var 元组 = 元素1->元素2
注意: 上述这种方式, 只适用于元组中只有两个元素的情况.
 */
object ClassDemo06_tuple {
  def main(args: Array[String]): Unit = {
    //1. 定义一个元组，包含学生的姓名和年龄.
    //2. 分别使用小括号以及箭头的方式来定义元组.
    val tuple1 = ("张三", 23)
    val tuple2 = "张三" -> 23
    println(tuple1)
    println(tuple2)
  }
}
