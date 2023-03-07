package com

import scala.io.Source

/**
 * @author shenjie
 * @version 1.0
 *
 */
//案例: 读取词法单元和数字.
// 词法单元:指的就是按照特定的符号间隔开的字符串。
object ClassDemo55_read {
  def main(args: Array[String]): Unit = {
    //1. 获取Source对象，关联数据原文件.
    val source = Source.fromFile("./e_collectionProject_05/data/2.txt", "UTF-8") // 默认 UTF-8

    //2、将其所有数据封装到一个字符串中。
    // \s 表示空白字符(空格, \t, \r, \n等)
    // + 数量词，前面内容至少出现一次，至多出现无数次
    val strNumber: Array[String] = source.mkString.split("\\s+")
    //3、将字符串转成对应的整数
    val num: Array[Int] = strNumber.map(_.toInt)
    //4、打印
    for(a <- num) println(a + 1)
    //5、关闭source对象
    source.close()
  }
}
