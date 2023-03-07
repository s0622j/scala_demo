package com

/**
 * @author shenjie
 * @version 1.0
 *
 */
object ClassDemo71_parameter_exe {
  //1. 定义一个RichList类, 用来给普通的List添加avg()方法.
  class RichList(list:List[Int]) {
    //2. 定义avg()方法, 用来获取List列表中所有元素的平均值.
    def avg() = {
      if(list.size == 0) None
      else Some(list.sum / list.size)
    }
  }
  //main方法, 作为程序的主入口.
  def main(args: Array[String]): Unit = {
    //3. 定义隐式转换方法.
    implicit def list2RichList(list:List[Int]) = new RichList(list)
    //4. 定义List列表, 获取其中所有元素的平均值.
    val list1 = List(1, 2, 5, 4, 3)
    println(list1.avg())
  }
}
