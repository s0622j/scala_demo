package com.demo02_send_message

import scala.actors.Actor

//案例: Actor发送和接收自定义消息, 采用 同步有返回的形式
/*
  需求:
    1. 创建一个MsgActor，并向它发送一个同步消息，该消息包含两个字段（id、message）
    2. MsgActor回复一个消息，该消息包含两个字段（message、name）
    3. 打印回复消息
 */
object ClassDemo04 {

  //1. 定义两个样例类.
  //Message(id, message), 表示发送消息.
  case class Message(id: Int, message: String)

  //ReplyMessage(message, name), 表示回复信息.
  case class ReplyMessage(message: String, name: String)

  //2. 创建MsgActor, 用来接收消息, 并且给出回复信息.
  object MsgActor extends Actor {
    override def act(): Unit = {
      //细节: 循环接收.
      loop {
        react {
          //具体的接收的代码.
          case Message(id, message) => {
            println(s"我是MsgActor, 我接收到的消息是: ${id}, ${message}")
            //细节: 要给发送者一个回复信息.
            //sender: 表示发送者.
            sender ! ReplyMessage("我很好", "赵丽颖")
          }
        }
      }
    }
  }

  //main方法, 就是程序的主入口, 所有的代码都是从这里开始执行的.
  //main方法的底层也是一个Actor, 它叫: MainActor
  def main(args: Array[String]): Unit = {
    //3. 开启MsgActor.
    MsgActor.start()

    //4. 通过MainActor来给MsgActor发送一句话, 并且接收回复信息.
    //细节: !? 发送同步有返回的消息.
    val result: Any = MsgActor !? Message(1, "你好呀, 我是MainActor, 我在给你发消息!")
    //细节: 向下转型.
    val reply: ReplyMessage = result.asInstanceOf[ReplyMessage]
    //5. 打印结果(接收到的MsgActor发送的: 回复信息).
    println(s"我是MainActor, 我接收到的回复信息是: ${reply.message}, ${reply.name}")
  }
}
