package com.akka.demo

import akka.actor.{ActorSystem, Props}
import com.typesafe.config.ConfigFactory

//作为程序的入口.
object Entrance {
  def main(args: Array[String]): Unit = {
    //1. 创建ActorSystem, 用来管理所有的用户自定义的Actor对象.
    val actorSystem = ActorSystem("actorSystem", ConfigFactory.load())
    //2. 关联ActorSystem和WorkerActor.
    val workerActor = actorSystem.actorOf(Props(WorkerActor), "workerActor")
    //3. 由ActorSystem给WorkerActor发送一句话: "setup"
    workerActor ! "setup"
  }
}
