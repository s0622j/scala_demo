package com.akka.demo01

import akka.actor.Actor

//自定义的用来接收消息的Actor对象.
object ReceiverActor extends Actor{
  override def receive: Receive = {
    //1. 接收SenderActor发送过来的消息.
    case SubmitTaskMessage(msg) => {
      //2. 打印接收到的消息.
      println(s"我是ReceiverActor, 我接受到的消息是: ${msg}")
      //3. 给发送者(SenderActor)一个回执信息.
      sender ! SuccessSubmitTaskMessage("接收任务成功!. 我是ReceiverActor")
    }
  }
}
