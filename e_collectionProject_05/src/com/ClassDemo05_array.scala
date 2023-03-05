package com

/**
 * @author shenjie
 * @version 1.0
 *
 */
//案例: 数组的常用算法
object ClassDemo05_array {
  def main(args: Array[String]): Unit = {
    //1. 定义一个数组, 包含4, 1, 6, 5, 2, 3这些元素.
    val arr = Array(4, 1, 6, 5, 2, 3)
    //2. 在main方法中, 测试上述的常用算法.
    //测试sum
    println(s"sum: ${arr.sum}")
    //测试max
    println(s"max: ${arr.max}")
    //测试min
    println(s"min: ${arr.min}")
    //测试sorted
    val arr2 = arr.sorted //即: arr2的内容为:1, 2, 3, 4, 5, 6
    //测试reverse
    val arr3 = arr.sorted.reverse //即: arr3的内容为: 6, 5, 4, 3, 2, 1
    //3. 打印数组.
    for(i <- arr) println(i)
    println("-" * 15)
    for(i <- arr2) println(i)
    println("-" * 15)
    for(i <- arr3) println(i)

    println("-" * 15)
    println("-" * 15)
   for(i <- arr.sorted ) println(i)  // 升序
   for(i <- arr.sortBy(v=>v) ) println(i)  // 升序
   for(i <- arr.sortWith(_<_) ) println(i)  // 升序
   for(i <- arr.sorted.reverse ) println(i)  // 降序
   for(i <- arr.sortBy(v=>v).reverse ) println(i)  // 降序
   for(i <- arr.sortWith(_>_) ) println(i)  // 降序
    println("-" * 15)
    println("-" * 15)
  }
}
