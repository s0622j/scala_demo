package com

/**
 * @author shenjie
 * @version 1.0
 *
 */
//案例: 模式匹配之匹配样例类
object ClassDemo38_match_caseclass {
  //1. 创建两个样例类Customer、Order
  //1.1 Customer包含姓名、年龄字段
  case class Customer(var name: String, var age: Int)
  //1.2 Order包含id字段
  case class Order(id: Int)
  def main(args: Array[String]): Unit = {
    //2. 分别定义两个案例类的对象，并指定为Any类型
    val c: Any = Customer("糖糖", 73)
    val o: Any = Order(123)
    val arr: Any = Array(0, 1)
    //3. 使用模式匹配这两个对象，并分别打印它们的成员变量值
    c match {
      case Customer(a, b) => println(s"Customer类型的对象, name=${a}, age=${b}")
      case Order(c) => println(s"Order类型, id=${c}")
      case _ => println("未匹配")
    }
  }
}
