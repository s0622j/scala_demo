package com.demo02_send_message

import scala.actors.Actor

//案例: 采用 异步无返回的形式, 发送消息.
/*
  需求:
    1. 创建两个Actor（ActorSender、ActorReceiver）
    2. ActorSender发送一个异步字符串消息给ActorReceiver
    3. ActorReceiver接收到该消息后，打印出来
 */
object ClassDemo01 {
  //1. 创建ActorSender, 发送一个异步字符串消息给ActorReceiver
  object ActorSender extends Actor {
    override def act(): Unit = {
      //发送一个异步字符串消息给ActorReceiver
      ActorReceiver ! "你好呀, 我是ActorSender"

      ActorReceiver ! "你叫什么名字呀?"
    }
  }

  //2. 创建ActorReceiver, 接收到该消息后，打印出来
  object ActorReceiver extends Actor {
    override def act(): Unit = {
      //接收到该消息后，打印出来
      //细节: receive()只能接收一次.
      receive{
        case x:String => println(x)
      }
    }
  }

  def main(args: Array[String]): Unit = {
    //3. 开启Actor.
    ActorSender.start()
    ActorReceiver.start()
  }
}
