package com

/**
 * @author shenjie
 * @version 1.0
 *
 */
//案例: 遍历数组
object ClassDemo04_array {
  def main(args: Array[String]): Unit = {
    //1. 定义一个数组，包含以下元素1,2,3,4,5
    val arr = Array(1, 2, 3, 4, 5)
    //2. 通过两种遍历方式遍历数组，并打印数组中的元素.
    //方式一: 遍历索引的形式实现.
    //i:表示的是数组中每个元素的索引。to:包左也包右
    for(i <- 0 to arr.length -1) println(arr(i))
    println("-" * 15) //分割线
    //i:表示的是数组中每个元素的索引。until:包左不包右
    for(i <- 0 until arr.length) println(arr(i))
    println("-" * 15) //分割线

    //方式二: 直接遍历数组元素.
    //i:表示的是数组中每个元素。
    for(i <- arr) println(i)
  }
}
