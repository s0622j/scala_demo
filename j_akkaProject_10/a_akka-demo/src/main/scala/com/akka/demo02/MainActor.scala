package com.akka.demo02

import akka.actor.{Actor, ActorSystem, Props}
import com.typesafe.config.ConfigFactory

//表示程序的主入口.
object MainActor {
  //1. 定义一个ReceiverActor, 用来循环接收消息, 并打印接收到的内容.
  object ReceiverActor extends Actor {
    override def receive: Receive = {
      //不管接收到什么, 都打印.
      case x => println(x)
    }
  }

  def main(args: Array[String]): Unit = {
    //2. 创建一个ActorSystem, 用来管理所有用户自定义的Actor.
    val actorSystem = ActorSystem("actorSystem",ConfigFactory.load())
    //3. 关联ActorSystem和ReceiverActor.
    val receiverActor = actorSystem.actorOf(Props(ReceiverActor), "receiverActor")
    //4. 导入隐式转换和隐式参数.
    //导入隐式转换, 用来支持 定时器.
    import actorSystem.dispatcher
    //导入隐式参数, 用来给定时器设置默认值.
    import scala.concurrent.duration._

    //5. 通过定时器, 定时(间隔2秒)给ReceiverActor发送一句话.
    //方式一: 采用发送消息的形式实现.
    //actorSystem.scheduler.schedule(3 seconds, 2 seconds, receiverActor, "恭喜您, 成为本月的寿星, 祝您生日快乐!")

    //方式二: 采用发送自定义消息, 结合函数实现.
    //actorSystem.scheduler.schedule(3 seconds, 2 seconds)(receiverActor ! "恭喜您, 成为本月的寿星, 祝您生日快乐!")

    //实际开发中的写法
    actorSystem.scheduler.schedule(0 seconds, 2 seconds){
      receiverActor ! "恭喜您, 成为本月的寿星, 祝您生日快乐!"
    }
  }
}
