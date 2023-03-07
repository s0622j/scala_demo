package com

import scala.io.Source

/**
 * @author shenjie
 * @version 1.0
 *
 */
//案例: 演示读取行
object ClassDemo53_read {
  def main(args: Array[String]): Unit = {
    //1. 获取数据源对象.
    //val source = Source.fromFile("./e_collectionProject_05/data/1.txt","UTF-8")
    val source = Source.fromFile("./e_collectionProject_05/data/1.txt")
    //2.通过getLines()方法, 逐行获取文件中的数据.
    var lines: Iterator[String] = source.getLines()
    //while(lines.hasNext){println(lines.next)} // 如果有, 则获取下一个元素, 并打印.
    //3. 将获取到的每一条数据都封装到列表中.
    val list1 = lines.toList
    //4. 打印结果
    for(s <- list1) println(s)
    //5. 记得关闭source对象.
    source.close()
  }
}
