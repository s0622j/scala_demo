package com.akka.demo01

import akka.actor.Actor

//自定义的用来发送消息的Actor对象.
/*
  细节:
    在Actor并发编程模型中:  实现act()方法, 如果想持续接收消息, 需要通过loop() + react()组合方法实现.
    在Akka并发编程模型中:   实现receive(), 直接在该方法中通过偏函数来处理数据即可.
 */
object SenderActor extends Actor {
  override def receive: Receive = {
    //1. 接收Entrance发送过来的消息: start
    case "start" => {
      //2. 打印接收到的消息.
      println("SenderActor接收到消息: start")
      //3. 获取ReceiverActor的路径.
      //参数: 要获取的Actor的路径.
      //格式: akka://actorSystem的名字/user/具体的要获取的Actor对象的名字.
      val receiverActor = context.actorSelection("akka://actorSystem/user/receiverActor")
      //4. 给ReceiverActor发送一句话, 采用样例类封装.
      receiverActor ! SubmitTaskMessage("我是SenderActor, 我在给你发消息...")
    }

    //5. 接收ReceiverActor返回的 回执信息.
    case SuccessSubmitTaskMessage(msg) => println(s"SenderActor接收到消息: ${msg}")
  }
}
