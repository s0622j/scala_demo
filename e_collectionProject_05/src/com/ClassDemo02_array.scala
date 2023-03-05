package com
//1. 导包.
import scala.collection.mutable.ArrayBuffer
/**
 * @author shenjie
 * @version 1.0
 *
 */
//案例: 演示变长数组
object ClassDemo02_array {
  def main(args: Array[String]): Unit = {
    //2. 定义一个长度为0的整型变长数组.
    val arr1 = new ArrayBuffer[Int]()
    println("arr1:" + arr1)
    //3. 定义一个包含"hadoop", "storm", "spark"这三个元素的变长数组.
    val arr2 = ArrayBuffer("hadoop", "storm", "spark")
    println("arr2:" + arr2)
  }
}
