package com

/**
 * @author shenjie
 * @version 1.0
 *
 */
//案例: 演示元组的定义格式
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
