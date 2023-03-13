package com.demo02_send_message

import java.util.concurrent.TimeUnit

import scala.actors.Actor

//案例:Actor 持续发送和接收消息.
/*
  需求:
    1. 创建两个Actor（ActorSender、ActorReceiver）
    2. ActorSender持续发送一个异步字符串消息给ActorReceiver
    3. ActorReceiver持续接收消息，并打印出来
 */
object ClassDemo02 {
  //1. 创建ActorSender, 持续发送一个异步字符串消息给ActorReceiver
  object ActorSender extends Actor {
    override def act(): Unit = {
      //持续发送一个异步字符串消息给ActorReceiver
      while(true) {
        //发送一次消息
        ActorReceiver ! "你好呀, 我是ActorSender"

        //为了让效果更明显, 我们加入: 休眠线程, 3秒发送一次.
        TimeUnit.SECONDS.sleep(3)     //单位: 秒
      }
    }
  }
  //2. 创建ActorReceiver, 持续接收消息，并打印出来
  object ActorReceiver extends Actor {
    override def act(): Unit = {
      //持续接收消息，并打印出来
      while(true) {
        //receive()方法, 只能接收一次数据
        receive{
          case x:String => println(x)
        }
      }
    }
  }

  def main(args: Array[String]): Unit = {
    //3. 开启Actor
    ActorSender.start()
    ActorReceiver.start()
  }
}
