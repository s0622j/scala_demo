package com.akka.demo01

import akka.actor.{ActorSystem, Props}
import com.typesafe.config.ConfigFactory

//表示程序的入口
object Entrance {
  def main(args: Array[String]): Unit = {
    //1. 创建自定义的Actor对象.   上述的步骤已经实现了.
    //2. 创建ActorSystem, 用来管理 我们自定义的Actor.
    //参数1: ActorSystem的名字
    //参数2: 加载配置文件对象
    val actorSystem = ActorSystem("actorSystem", ConfigFactory.load())
    //3. 通过ActorSystem, 来加载自定义的Actor对象, 从而来管理它们.
    //参数1: 具体的要被ActorSystem管理的 自定义的Actor对象.
    //参数2: 该Actor对象的名字.
    val senderActor = actorSystem.actorOf(Props(SenderActor), "senderActor")
    val receiverActor = actorSystem.actorOf(Props(ReceiverActor), "receiverActor")

    //4. 由ActorSystem发送一个字符串消息"start", 给SenderActor
    senderActor ! "start"
  }
}
