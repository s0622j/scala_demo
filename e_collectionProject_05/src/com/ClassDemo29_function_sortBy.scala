package com

/**
 * @author shenjie
 * @version 1.0
 *
 */
//案例: 演示根据指定字段排序(sortBy)
object ClassDemo29_function_sortBy {
  def main(args: Array[String]): Unit = {
    //1. 有一个列表，分别包含几下文本行："01 hadoop", "02 flume", "03 hive", "04 spark"
    val list1 = List("01 hadoop", "02 flume", "03 hive", "04 spark")
    //2. 请按照单词字母进行排序
    // x表示:list1列表中的每个元素。  "01 hadoop", "02 flume", "03 hive", "04 spark"
    // x.split(" ")表示:            Array("01", "hadoop"), Array("02","flume")......
    // x.split(" ")(1)表示:         "hadoop","flume"......
    //val list2 = list1.sortBy(x => x.split(" ")(1))
    //简写形式:
    val list2 = list1.sortBy(_.split(" ")(1))
    println(s"list2: ${list2}")
  }
}
