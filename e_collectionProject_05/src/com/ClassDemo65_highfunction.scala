package com

/**
 * @author shenjie
 * @version 1.0
 *
 */
//案例: 演示控制抽象.
//控制抽象函数指的是：如果一个函数的参数列表接收了一个 无参无返回值的函数，那么这个函数就是，控制抽象函数。
object ClassDemo65_highfunction {
  def main(args: Array[String]): Unit = {
    //1. 定义函数
    val myShop = (f1: () => Unit) => {
      println("Welcome in!")
      f1()  // 表示顾客具体购买的商品
      println("Thanks for coming!")
    }
    //2. 调用函数
    //格式：myshop(无参无返回值的函数)
    myShop (
      () => {
        println("我想买一个笔记版电脑")
        println("我想买一个平板电脑")
        println("我想买一个手机")
      }
    )

    myShop {
      () => {
        println("我想买一个笔记版电脑")
        println("我想买一个平板电脑")
        println("我想买一个手机")
      }
    }

    myShop {
      () =>
        println("我想买一个笔记版电脑")
        println("我想买一个平板电脑")
        println("我想买一个手机")
    }

  }
}
