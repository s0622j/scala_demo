package com

import scala.io.Source

/**
 * @author shenjie
 * @version 1.0
 *
 */
//案例: 从URL或者其他源读取数据
object ClassDemo56_read {
  def main(args: Array[String]): Unit = {
    //1. 获取Source对象，关联指定URL地址
    val source = Source.fromURL("https://www.itcast.cn/")
    println(source.mkString)

    //2、直接加载
    val str = Source.fromString("黑马程序员")
    println(str.getLines())
  }
}
