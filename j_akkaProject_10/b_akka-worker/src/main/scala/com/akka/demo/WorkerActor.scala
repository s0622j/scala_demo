package com.akka.demo

import akka.actor.Actor

//自定义的用来给MaterActor发送消息的: Actor对象.
//负责管理WorkerActor的 ActorSystem的地址: akka.tcp://actorSystem@127.0.0.1:9999
object WorkerActor extends Actor{
  override def receive: Receive = {
    //1. 接收Entrance发送过来的: setup.
    case "setup" => {
      //2. 打印接收到的内容.
      println("WorkerActor接收到消息: setup!")
      //3. 获取MasterActor的应用.
      //要获取的远程Actor的路径格式: akka.tcp://ActorSystem的地址/user/具体的要获取的Actor对象的名字
      val masterActor = context.system.actorSelection("akka.tcp://actorSystem@127.0.0.1:8888/user/masterActor")
      //4. 给MasterActor发送一句话.
      masterActor ! "connect"
    }


    //5. 接收Master的回执信息.
    case "success" => println("WorkerActor接收到消息: success")
  }
}
