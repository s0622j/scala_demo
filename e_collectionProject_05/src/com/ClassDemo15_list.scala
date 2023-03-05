package com

/**
 * @author shenjie
 * @version 1.0
 *
 */
//案例: 演示获取并集, 交集, 差集.
object ClassDemo15_list {
  def main(args: Array[String]): Unit = {
    //1. 定义列表list1，包含以下元素：1,2,3,4
    val list1 = List(1, 2, 3, 4)
    //2. 定义列表list2，包含以下元素：3,4,5,6
    val list2 = List(3, 4, 5, 6)
    //3. 使用union获取这两个列表的并集
    val unionList = list1.union(list2)
    //4. 在第三步的基础上, 使用distinct去除重复的元素
    val distinctList = unionList distinct
    //5. 使用intersect获取列表list1和list2的交集
    val intersectList = list1.intersect(list2)
    //6. 使用diff获取列表list1和list2的差集
    val diffList = list1.diff(list2)
    //7. 打印结果
    println("并集, 不去重: " + unionList)
    println("并集, 去重: " + distinctList)
    println("交集: " + intersectList)
    println("差集: " + diffList)
  }
}
