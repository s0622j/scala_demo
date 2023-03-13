package com.demo01_create_actor

import scala.actors.Actor

//案例:Actor并发编程入门, 通过class创建Actor
object ClassDemo01 {
  //1. 定义class Actor1 继承Actor特质, 然后重写act()方法, 用来打印1-10
  class Actor1 extends Actor {
    override def act(): Unit = {
      //用来打印1-10
      for(i <- 1 to 10) println("Actor1..." + i)
    }
  }

  //2. 定义class Actor2 继承Actor特质, 然后重写act()方法, 用来打印11-20
  class Actor2 extends Actor {
    override def act(): Unit = {
      //用来打印1-10
      for(i <- 11 to 20) println("Actor2........." + i)
    }
  }

  def main(args: Array[String]): Unit = {
    /*
      需求:
        1. 创建两个Actor，一个Actor打印1-10，另一个Actor打印11-20
        2. 使用class继承Actor实现.（如果需要在程序中创建多个相同的Actor）
     */
    //3. 创建Actor对象, 并开启Actor.
    //3.1 普通写法.
    var a1 = new Actor1()
    a1.start()

    //3.2 采用匿名对象实现.
    new Actor2().start()
  }
}
