package com.demo01_create_actor

import scala.actors.Actor

//案例:Actor并发编程入门, 通过object创建Actor
object ClassDemo02 {
  //1. 创建单例对象Actor1, 继承Actor特质, 并重写act()方法.
  object Actor1 extends Actor {
    //打印1-10之间所有的整数.
    override def act(): Unit = for(i <- 1 to 10) println("Actor1..." + i)
  }
  //2. 创建单例对象Actor2, 继承Actor特质, 并重写act()方法.
  object Actor2 extends Actor {
    //打印11-20之间所有的整数.
    override def act(): Unit = for(i <- 11 to 20) println("Actor2......" + i)
  }

  def main(args: Array[String]): Unit = {
    /*
      需求:
        1. 创建两个Actor，一个Actor打印1-10，另一个Actor打印11-20
        2. 使用object继承Actor实现.（如果在程序中只创建一个Actor）
     */
    //3. 开启Actor.
    Actor1.start()
    Actor2.start()

    /*
      Actor程序的运行流程:
        1. 调用start()方法开启Actor.
        2. 自动执行act()方法.
        3. 向Actor发送消息.
        4. act()方法执行完毕后, 程序会调用exit()方法结束程序的执行.
     */
  }
}
