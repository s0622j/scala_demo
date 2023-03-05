//案例: 演示包对象

//1. 定义父包com.itheima, 并在其中定义子包scala.
package com.itheima {     //父包
  package scala {         //子包.
    class A
    trait B

    //3. 在scala包中定义测试类, 并测试.
    object ClassDemo03 {
      def main(args: Array[String]): Unit = {
        //测试包对象中的成员
        println(scala.name)
        scala.sayHello()
      }
    }
  }

  //2. 定义scala包的包对象, 并在其中定义变量和方法.
  package object scala {    //scala包的包对象
    var name = "张三"
    def sayHello() = println("Hello, Scala!")
  }
}


