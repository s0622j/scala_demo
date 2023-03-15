package com.akka.demo01

/**
  * 表示 提交任务的 消息格式.
  * @param msg 具体的发送信息.
  */
case class SubmitTaskMessage(msg:String)

/**
  * 表示 提交任务成功后的回执信息的格式
  * @param msg 具体的回执信息.
  */
case class SuccessSubmitTaskMessage(msg:String)
