package com

/**
 * @author shenjie
 * @version 1.0
 *
 */
//案例: 演示map函数(映射)
object ClassDemo25_function_map {
  def main(args: Array[String]): Unit = {
    //1. 创建一个列表，包含元素1,2,3,4
    val list1 = List(1, 2, 3, 4)
    //2. 将上述的数字转换成对应个数的`*`, 即: 1变为*, 2变为**, 以此类推.
    //方式一: 普通写法
    val list2 = list1.map((x:Int) => "*" * x)
    println(s"list2: ${list2}")
    //方式二: 通过类型推断实现.
    val list3 = list1.map(x => "*" * x)
    println(s"list3: ${list3}")
    //方式三: 通过下划线实现.
    val list4 = list1.map("*" * _)
    println(s"list4: ${list4}")
  }
}
