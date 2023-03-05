package com

/**
 * @author shenjie
 * @version 1.0
 *
 */
//案例: 演示迭代器
object ClassDemo22_iterator {
  def main(args: Array[String]): Unit = {
    //1. 定义一个列表，包含以下元素：1,2,3,4,5
    val list1 = List(1, 2, 3, 4, 5)
    //2. 使用while循环和迭代器，遍历打印该列表.
    //2.1 根据列表获取其对应的迭代器对象.
    val it = list1.iterator   // 1, 2, 3, 4, 5
    //2.2 判断迭代器中是否有下一个元素.
    while(it.hasNext){
      //2.3 如果有, 则获取下一个元素, 并打印.
      println(it.next)
    }
    //分割线.
    println("-" * 15)
    //迭代完后, 再次使用该迭代器获取元素, 则抛异常: NoSuchElementException
    println(it.next)
  }
}
