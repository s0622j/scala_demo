package com

import java.io.{File, FileInputStream}

/**
 * @author shenjie
 * @version 1.0
 *
 */
//案例: 读取二进制文件数据.
object ClassDemo57_read {
  def main(args: Array[String]): Unit = {
    //1、创建File对象，关联数据源文件
    val file = new File("./e_collectionProject_05/data/3.jpeg")
    //2、创建字节输入流，用来读取数据
    val fis = new FileInputStream(file)
    //3、创建字节数组，用来存储读取到的内容(字节)
    //val bys = new Array[Byte](5000000)
    val bys = new Array[Byte](file.length().toInt)
    //4、开始读取，将读取到的数据存储到字节数组中，并返回读取到的有效字节数
    val len = fis.read(bys)
    fis.read(bys)
    //5、打印结果
    //5.1、打印读取到的有效字节数
    println("读取到的有效字节数:" + len)
    //5.2、打印字节数组长度
    println("字节数组的长度：" + bys.length)
    //6、关闭字节输入流
    fis.close()

  }
}
