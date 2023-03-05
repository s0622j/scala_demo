package com

/**
 * @author shenjie
 * @version 1.0
 *
 */
//案例: 演示定长数组
object ClassDemo01_array {
  def main(args: Array[String]): Unit = {
    //1. 定义一个长度为10的整型数组, 设置第1个元素为11, 并打印第1个元素.
    val arr1 = new Array[Int](10)
    arr1(0) = 11

    println(arr1(0)) //打印数组的第1个元素.
    println("-" * 15) //分割线
    //2. 定义一个包含"java", "scala", "python"这三个元素的数组, 并打印数组长度.
    val arr2 = Array("java", "scala", "python")  // 底层是使用Array的 apply()方法
    println(arr2.length) //打印数组的长度
    println(arr2.size) //打印数组的长度

    val arr11 = Array[Int](10)
    arr11(0) = 11
    println(arr11(0))
  }
}