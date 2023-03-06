package com

/**
 * @author shenjie
 * @version 1.0
 *
 */
//案例: 演示偏函数
object ClassDemo45_partialfunction {
  def main(args: Array[String]): Unit = {
    //1. 定义一个偏函数, 根据指定格式返回
    val pf:PartialFunction[Int,String] = {
      case 1 => "一"
      case 2 => "二"
      case 3 => "三"
      case _ => "其他"
    }
    //2. 调用方法
    println(pf(1))
    println(pf(2))
    println(pf(3))
    println(pf(4))
  }
}
