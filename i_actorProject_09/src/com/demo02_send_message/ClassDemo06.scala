package com.demo02_send_message

import scala.actors.{Actor, Future}

//案例: Actor发送和接收自定义消息, 采用 异步有返回的形式
/*
  需求:
    1. 创建一个MsgActor，并向它发送一个异步有返回消息，该消息包含两个字段（id、message）
    2. MsgActor回复一个消息，该消息包含两个字段（message、name）
    3. 打印回复消息
 */
object ClassDemo06 {
  //1. 定义两个样例类.
  //Message(id, message), 表示发送消息.
  case class Message(id:Int, message:String)
  //ReplyMessage(message, name), 表示回复信息.
  case class ReplyMessage(message:String, name:String)

  //2. 创建MsgActor, 用来接收MainActor发送过来的数据, 并给出回复信息.
  object MsgActor extends Actor {
    override def act(): Unit = {
      //2.1 接收MainActor发送过来的数据.
      loop{
        react{
          //具体的接收动作.
          case Message(id, message) => {
            //打印接收到的内容
            println(s"我是MsgActor, 我接收到的数据是: ${id}, ${message}")

            //2.2 需要给发送者一个 回复信息.
            sender ! ReplyMessage("我很好", "赵丽颖")
          }
        }
      }
    }
  }


  def main(args: Array[String]): Unit = {
    //3. 开启MsgActor.
    MsgActor.start()

    //4. 通过MainActor给MsgActor采用 异步有返回的形式发送数据, 并接收.
    //补充: 采用同步又返回的形式发送.在没有接收到返回信息时不会往下执行
    /*println(1)
    val result = MsgActor !? Message(1, "你好呀, 我是MainActor, 我在给你发送消息")
    println(result)
    println(2)*/

    //println(1)
    val future: Future[Any] = MsgActor !! Message(1, "你好呀, 我是MainActor, 我在给你发送消息")

    //核心细节: 因为是采用异步的形式发送消息, 所以我们判断一下是否有接收到数据, 如果接收到了数据, 程序继续执行.
    //如果没有接收到回复信息, 这里就一直死循环.
    while(!future.isSet){}

    //获取具体的返回值.
    val reply: ReplyMessage = future.apply().asInstanceOf[ReplyMessage]
    //5. 打印结果.
    println(s"我是MainActor, 我接收到的回复信息是: ${reply.message}, ${reply.name}")
    //println(2)
  }
}
