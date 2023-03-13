package com.demo02_send_message

import scala.actors.Actor

//案例: Actor发送和接收自定义消息, 采用 异步 无返回的形式
//需求: 创建一个MsgActor，并向它发送一个异步无返回消息，该消息包含两个字段（id, message）
object ClassDemo05 {
  //1. 定义样例类Message(id, message), 表示发送消息.
  case class Message(id:Int, message:String)

  //2. 创建MsgActor, 用来接收消息, 并打印.
  object MsgActor extends Actor {
    override def act(): Unit = {
      //接收MainActor发送过来的消息, 并打印结果.
      //循环接收.
      loop {
        react{
          case Message(id, message) => println(s"我是MsgActor, 我接受到的消息是: ${id}, ${message}")
        }
      }
    }
  }

  def main(args: Array[String]): Unit = {
    //3. 开启MsgActor.
    MsgActor.start()

    //4. 给MsgActor发送一句话.
    //采用 ! 发送的 异步无返回的消息.
    MsgActor ! Message(1, "你好呀, 我是MainActor, 我在给你发消息!")
  }
}
