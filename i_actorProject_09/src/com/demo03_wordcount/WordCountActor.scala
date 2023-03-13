package com.demo03_wordcount

import scala.actors.Actor
import scala.io.Source

//自定义的WordCountActor类, 用来统计每个数据中的单词数量的.
class WordCountActor extends Actor {
  override def act(): Unit = {
    //循环接收.
    loop {
      react {
        //3.4 接收具体的任务.
        case WordCountTask(fileName) =>
          //3.5 打印具体的任务.
          println(s"获取到的具体任务是: ${fileName}")

          //4. 统计接收到的文件中的每个单词的数量.
          //4.1 获取指定文件中的所有的单词.
          //List("hadoop sqoop hadoop", "hadoop hadoop flume")
          val lineList = Source.fromFile(fileName).getLines().toList
          //4.2 将上述获取到的数据, 转换成一个一个的单词.
          //List("hadoop", "sqoop", "hadoop", "hadoop", "hadoop", "flume")
          val strList = lineList.flatMap(_.split(" "))
          //4.3 给每一个字符串(单词)后边都加上次数, 默认为1.
          //List("hadoop"->1, "sqoop"->1, "hadoop"->1, "hadoop"->1, "hadoop"->1, "flume"->1)
          val wordAndCount = strList.map(_ -> 1)
          //4.4 按照字符串内容(单词本身的值)进行分组.
          //"hadoop" -> List("hadoop"->1, "hadoop"->1),    "sqoop" -> List("sqoop"->1)
          val groupMap = wordAndCount.groupBy(_._1)
          //4.5 对分组后的内容进行统计, 统计每个单词的总数量.
          //"hadoop" -> 2,  "sqoop" -> 1
          val wordCountMap = groupMap.map(keyVal => keyVal._1 -> keyVal._2.map(_._2).sum)
          //4.6 打印统计后的结果.
          //println(wordCountMap)

          //5. 将统计后的结果, 返回给MainActor.
          //5.1 返回具体的值.
          sender ! WordCountResult(wordCountMap)
      }
    }
  }
}
