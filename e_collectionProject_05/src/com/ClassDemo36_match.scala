package com

/**
 * @author shenjie
 * @version 1.0
 *
 */
//案例: 模式匹配之匹配类型
object ClassDemo36_match {
  def main(args: Array[String]): Unit = {
    //1. 定义一个变量为Any类型，然后分别给其赋值为"hadoop"、1、1.0
    val a:Any = 1.0
    //2. 定义模式匹配，然后分别打印类型的名称
    val result = a match {
      case x:String => s"${x} 是String类型的数据"
      case x:Double => s"${x} 是Double类型的数据"
      case x:Int => s"${x} 是Int类型的数据"
      case _ => "未匹配"
    }
    //3. 打印结果
    println(result)
    //4. 优化版, 如果在case校验的时候, 变量没有被使用, 则可以用_替代.
    val result2 = a match {
      case _:String => "String"
      case _:Double => "Double"
      case _:Int => "Int"
      case _ => "未匹配"
    }
    //打印结果
    println(result2)
  }
}
