package com

import java.io.File

/**
 * @author shenjie
 * @version 1.0
 *
 */
//案例: 获取指定目录下所有的文件.
object ClassDemo74_recurrence_dir {
  //1. 定义printFile()方法, 用来打印指定目录下所有的文件信息.
  def printFile(dir: File): Unit = {
    //判断传入路径是否存在
    if (!dir.exists()) {
      println("您录入的路径不存在")
    } else {
      //通过listFiles()获取到目录下所有的文件或者文件夹的File对象
      //listFiles：就是dir目录下每一个文件，或者文件夹对象
      val listFiles:Array[File] = dir.listFiles()
      //遍历listFiles获取每一个File对象
      for(listFile <- listFiles) {
        //listFile:就表示dir目录下每一个  具体的文件或者文件夹对象
        //判断：如果是文件就直接输出  //相当于：出口
        if(listFile.isFile) println(listFile)
        //判断：如果是文件夹就递归  //相当于：规律
        else printFile(listFile)
      }
    }
  }
  //2.main方法, 作为程序的主入口.
  def main(args: Array[String]): Unit = {
    //3. 调用方法show()
    printFile(new File("d://01test"))
  }
}
