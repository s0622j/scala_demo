package com

/**
 * @author shenjie
 * @version 1.0
 *
 */
//案例: 演示柯里化.
object ClassDemo63_highfunction_Currying {
  //需求: 定义方法, 完成两个字符串的拼接.
  //方式一: 普通写法.
  def merge1(s1: String, s2: String) = s1 + s2

  //方式二: 柯里化操作.
  //f1表示函数 这里传入的函数是要把两个字符串转换成一个字符串
  def merge2(s1: String, s2: String)(f1: (String, String) => String) = f1(s1, s2)

  def main(args: Array[String]): Unit = {
    //调用普通写法
    println(merge1("abc", "xyz"))
    println("-" * 20)
    //调用柯里化写法.
    println(merge2("abc", "xyz")(_ + _))
    println(merge2("abc", "xyz")(_.toUpperCase() + _))
  }
}
