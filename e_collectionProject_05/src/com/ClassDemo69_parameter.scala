package com

/**
 * @author shenjie
 * @version 1.0
 *
 */
//案例: 演示隐式参数, 手动导入.
//演示参数: 如果方法的某个参数列表用implicit修饰了, 则该参数列表就是: 隐式参数.
//好处: 我们再调用方法的时候, 关于隐式参数是可以调用默认的值, 不需要我们传入参数.
object ClassDemo69_parameter {
  //需求: 定义一个方法, 传入一个姓名, 然后用指定的前缀和后缀将该名字包裹.

  /**
   * 格式：
   * 具有一个隐式参数的函数：
   * def function_name (implicit value : type)
   *
   * 具有多个隐式参数的函数：
   * def function_name (implicit value1 : type, value2 : type)
   *
   * 混合使用隐式参数和常规参数的函数：
   * def function_name (value1 : type)(implicit value2 : type)
   */

  //1. 定义一个方法show(), 接收一个姓名, 在接受一个前缀, 后缀信息(这个是隐式参数).
  def show(name:String)(implicit delimit:(String, String)) = delimit._1 + name + delimit._2
  //2. 定义一个单例对象, 给隐式参数设置默认值.
  object ImplicitParam {
    //implicit val delimit_defalut = ("<<<" , ">>>")
    implicit val delimit_defalut = "<<<" -> ">>>"
  }
  def main(args: Array[String]): Unit = {
    //3. 手动导入: 隐式参数.
    import ImplicitParam.delimit_defalut
    //4. 尝试调用show()方法.
    println(show("张三"))
    println(show("张三")("(((" -> ")))"))
  }
}
