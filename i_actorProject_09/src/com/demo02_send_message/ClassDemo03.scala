package com.demo02_send_message

import java.util.concurrent.TimeUnit

import scala.actors.Actor

//案例: 使用loop + react循环接收消息.
/*
  需求:
    1. 创建两个Actor（ActorSender、ActorReceiver）
    2. ActorSender持续发送一个异步字符串消息给ActorReceiver
    3. ActorReceiver持续接收消息，并打印出来
 */
object ClassDemo03 {
  //1. 创建ActorSender, 持续发送一个异步字符串消息给ActorReceiver
  object ActorSender extends Actor{
    override def act(): Unit = {
      //持续发送一个异步字符串消息给ActorReceiver
      while(true) {
        ActorReceiver ! "你好呀, 我是ActorSender"

        //休眠3秒
        TimeUnit.SECONDS.sleep(3)
      }
    }
  }
  //2. 创建ActorReceiver, 持续接收消息，并打印出来
  object ActorReceiver extends Actor{
    override def act(): Unit = {
      //方式一: 通过while循环 + receive()方法实现.

      //方式二: 通过loop() + react()方法实现.
      loop{
        react{
          //具体的接收动作
          case x:String  => println(x)
        }
      }
    }
  }

  def main(args: Array[String]): Unit = {
    //3. 开启Actor
    ActorSender.start()
    ActorReceiver.start()
  }
}
