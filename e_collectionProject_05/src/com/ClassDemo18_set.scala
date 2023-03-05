package com
import scala.collection.mutable.Set
/**
 * @author shenjie
 * @version 1.0
 *
 */
//案例: 演示可变集.
object ClassDemo18_set {
  def main(args: Array[String]): Unit = {
    //1. 定义一个可变集，包含以下元素: 1,2,3, 4
    val set1 = Set(1, 2, 3, 4)
    //2. 添加元素5到可变集中
    set1 += 5
    //3. 添加元素6, 7, 8到可变集中
    //set1 ++= Set(6, 7, 8)
    set1 ++= List(6, 7, 8) //两种写法均可.
    //4. 从可变集中移除元素1
    set1 -= 1
    //5. 从可变集中移除元素3, 5, 7
    //set1 --= Set(3, 5, 7)
    set1 --= List(3, 5, 7) //两种写法均可.
    //6. 打印结果.
    println(set1)
  }
}
