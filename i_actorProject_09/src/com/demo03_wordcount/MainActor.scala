package com.demo03_wordcount

import java.io.File

import scala.actors.Future

object MainActor {
  def main(args: Array[String]): Unit = {
    //1. 获取所有要统计的文件的路径.
    //1.1 定义变量dir, 记录保存所有文件的: 文件夹路径.   ./data/
    var dir = "./data/"
    //1.2 获取文件夹下, 所有的文件名.     List("1.txt", "2.txt")
    var fileNameList = new File(dir).list().toList
    //1.3 对获取到的文件名进行拼接, 获取其全路径.
    // ./data/1.txt    ./data/2.txt
    val fileDirList = fileNameList.map(dir + _)
    //println(fileDirList)

    //2. 根据文件数量创建对应个数的WordCountActor对象.
    //2.1 先创建WordCountActor类, 用来获取WordCountActor对象.
    //2.2 根据文件数量创建对应个数的WordCountActor对象.
    val wordCountList = fileNameList.map(_ => new WordCountActor)
    //2.3 将WordCountActor对象 和 文件的全路径关联在一起.
    //WordCountActor1 -> ./data/1.txt    WordCountActor2 -> ./data/2.txt
    val actorWithFile = wordCountList.zip(fileDirList)
    //println(actorWithFile)

    //3. 启动所有WordCountActor对象，并发送单词统计任务消息给每个WordCountActor对象.
    //futureList: 记录的是所有的WordCountActor统计的结果.
    val futureList:List[Future[Any]] = actorWithFile.map{
      //keyVal的格式:     WordCountActor1 -> ./data/1.txt
      keyVal =>
        //3.1 获取具体的要启动的WordCountActor对象.
        val actor = keyVal._1       //WordCountActor1
        //3.2 启动具体的WordCountActor对象.
        actor.start()

        //3.3 给每个WordCountActor发送具体的任务(文件路径), 异步有返回.
        val future: Future[Any] = actor !! WordCountTask(keyVal._2)
        future      //记录的是某一个WordCountActor返回的统计结果
    }

    //5.2 判断所有的future是否都是返回值, 如果都返回后, 则往下继续执行.
    //futureList.filter(!_.isSet):   过滤出所有没有返回具体值的: future对象.
    //futureList.filter(!_.isSet).size != 0  如果没有返回具体值的: future对象的个数不为0, 说明还有Actor没有返回值.
    while(futureList.filter(!_.isSet).size != 0) {}

    //5.3 从每一个future中, 获取数据.
    //List(Map(spark -> 1, hadoop -> 7, sqoop -> 1, flume -> 1), Map(sqoop -> 1, flink -> 1, hadoop -> 6, spark -> 1, hive -> 1))
    val wordCountMap = futureList.map(_.apply().asInstanceOf[WordCountResult].wordCountMap)
    //6. 统计, 并打印.
    /*
       wordCountMap.flatten:
              List(spark -> 1, hadoop -> 7, sqoop -> 1, flume -> 1,sqoop -> 1, flink -> 1, hadoop -> 6, spark -> 1, hive -> 1)
       groupBy:
              "spark" -> List(spark -> 1, spark -> 1)         "hadoop" -> List(hadoop -> 7,  hadoop -> 6)
       map:
          "spark" -> 2,   "hadoop" -> 13
     */
    val result = wordCountMap.flatten.groupBy(_._1).map(keyVal => keyVal._1 -> keyVal._2.map(_._2).sum)
    println(result)
  }
}
