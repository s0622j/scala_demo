package com

import scala.io.Source

/**
 * @author shenjie
 * @version 1.0
 *
 */
//案例: 演示读取单个字符.
object ClassDemo54_read {
  def main(args: Array[String]): Unit = {
    //1. 获取数据源对象.
    val source = Source.fromFile("./e_collectionProject_05/data/1.txt", "UTF-8") // 默认 UTF-8
    //2. 获取数据源文件中的每一个字符.
    val iter = source.buffered //这里, source对象的用法相当于迭代器.
    //3. 通过hasNext(), next()方法获取数据.
    while (iter.hasNext) {
      print(iter.next()) //细节, 这里不要用println(), 否则输出结果可能不是你想要的.
    }

    println()
    println("-" * 20)
    //如果文件中的内容较少
    //4. 通过mkString方法, 直接把文件中的所有数据封装到一个字符串中.
    val source2 = Source.fromFile("./e_collectionProject_05/data/1.txt")
    val str = source2.mkString
    //5. 打印结果.
    println(str)
    //6. 关闭source对象, 节约资源, 提高效率.
    source.close()
  }
}
