package com.akka.demo

import akka.actor.Actor

//自定义的MasterActor对象, 用来接收WorkerActor发送过来的消息, 并给出回执信息.
//负责管理MasterActor的ActorSystem对象的地址: akka.tcp://actorSystem@127.0.0.1:8888
object MasterActor extends Actor{
  override def receive: Receive = {
    //1. 接收WorkerActor发送过来的数据.
    case "connect" => {
      //2. 打印接收到的内容.
      println("MasterActor接收到的内容是: connect")
      //3. 给发送者(WorkerActor)一个回执信息.
      sender ! "success"
    }
  }
}
