package com

import scala.collection.mutable.ArrayBuffer

/**
 * @author shenjie
 * @version 1.0
 *
 */
//案例: 修改变长数组中的内容.
object ClassDemo03_array {
  def main(args: Array[String]): Unit = {
    //1. 定义一个变长数组，包含以下元素: "hadoop", "spark", "flink"
    val arr = ArrayBuffer("hadoop", "spark", "flink")
    //2. 往该变长数组中添加一个"flume"元素
    arr += "flume"
    //3. 从该变长数组中删除"hadoop"元素
    arr -= "hadoop"
    //4. 将一个包含"hive", "sqoop"元素的数组, 追加到变长数组中.
    arr ++= Array("hive", "sqoop")
    //5. 从该变长数组中删除"sqoop", "spark"这两个元素.
    arr --= Array("sqoop", "spark")
    //6. 打印数组, 查看结果.
    println(s"arr: ${arr}")
  }
}
