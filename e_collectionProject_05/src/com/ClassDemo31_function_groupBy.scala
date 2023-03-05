package com

/**
 * @author shenjie
 * @version 1.0
 *
 */
//案例: 演示分组函数(groupBy)
object ClassDemo31_function_groupBy {
  def main(args: Array[String]): Unit = {
    //1. 有一个列表，包含了学生的姓名和性别: "刘德华" -> "男", "刘亦菲" -> "女", "胡歌" -> "男"
    val list1 = List("刘德华" -> "男", "刘亦菲" -> "女", "胡歌" -> "男")
    //2. 请按照性别进行分组.
    //x表示列表list1中的每个元组元素："刘德华" -> "男", "刘亦菲" -> "女", "胡歌" -> "男"
    //x._2表示获取的是性别："男"
    //val list2 = list1.groupBy(x => x._2)  //Map("男" -> List("刘德华" -> "男","胡歌" -> "男"),"女" -> List("刘亦菲" -> "女"))
    //简写形式
    val list2 = list1.groupBy(_._2)
    //println(s"list2: ${list2}")

    //3. 统计不同性别的学生人数.
    //x表示列表list2中的每个元素，格式："男" -> List("刘德华" -> "男","胡歌" -> "男")
    val list3 = list2.map(x => x._1 -> x._2.size)
    println(s"list3: ${list3}")
  }
}
