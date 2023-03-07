package com

import java.io.FileOutputStream

/**
 * @author shenjie
 * @version 1.0
 *
 */
//案例: 写入数据到文本文件.
object ClassDemo58_write {
  def main(args: Array[String]): Unit = {
    //1、创建字节输出流对象，关联目的地文件
    val pw = new FileOutputStream("./e_collectionProject_05/data/4.txt") //细节：目的地文件不存在，程序会自动创建

    //2、直接往目的地文件中编写指定内容
    pw.write("好好学习,\r\n".getBytes())
    pw.write("天天向上!".getBytes())

    //3、关闭字节输出流
    pw.close()
  }
}
