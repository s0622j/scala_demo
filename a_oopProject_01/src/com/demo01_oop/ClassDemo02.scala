package com.demo01_oop

/**
 * @author shenjie
 * @version 1.0
 *
 */
//
object ClassDemo02 {
  //1、创建类
  class Persion{}
  //2、定义main
  def main(args: Array[String]): Unit = {
    //3、创建对象
    val persion: Persion = new Persion()
    //4、打印对象
    println(persion)
  }

}
