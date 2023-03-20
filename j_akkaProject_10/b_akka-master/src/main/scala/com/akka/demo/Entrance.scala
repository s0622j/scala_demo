package com.akka.demo

import akka.actor.{ActorSystem, Props}
import com.typesafe.config.ConfigFactory

//表示主入口
object Entrance {
  def main(args: Array[String]): Unit = {
    //1. 创建ActorSystem, 用来管理用户自定义的Actor.
    val actorSystem = ActorSystem("actorSystem", ConfigFactory.load())
    //2. 关联ActorSystem和MasterActor.
    val masterActor = actorSystem.actorOf(Props(MasterActor), "masterActor")
    //3. 给MasterActor发送一个测试数据:
    //masterActor ! "测试数据"
  }
}
