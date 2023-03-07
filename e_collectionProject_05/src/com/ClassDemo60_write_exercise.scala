package com

import java.io.{BufferedWriter, FileWriter}
import scala.collection.mutable.ListBuffer
import scala.io.Source

/**
 * @author shenjie
 * @version 1.0
 *
 */
//案例: 按照学员的总分降序排列.
object ClassDemo60_write_exercise {
  //1. 定义样例类Person, 属性: 姓名, 语文成绩, 数学成绩, 英语成绩, 且该类中有一个获取总成绩的方法.
  case class Student(name: String, chinese: Int, math: Int, english: Int) {
    def getSum() = chinese + math + english
  }

  def main(args: Array[String]): Unit = {
    //2. 获取数据源文件对象.
    val source = Source.fromFile("./e_collectionProject_05/data/student.txt")
    //3. 读取指定文件(./data/student.txt)中所有的数据, 并将其封装到List列表中.
    // Iterator[String]"张三 37 90 100","李四 90 73 81" -> Iterator[Array[String]]:("张三","37","90","100")
    val stringses: Iterator[Array[String]] = source.getLines().map(_.split(" "))
    var studentList: Iterator[List[String]] = source.getLines().map(_.split(" ")).map(_.toList)
    //4. 定义可变的列表ListBuffer[Student], 用来记录所有学生的信息.
    val list = new ListBuffer[Student]()
    //5. 遍历第二步获取到的数据, 将其封装成Person类的对象后, 并添加到ListBuffer中.
    for (s <- studentList) {
      list += Student(s(0), s(1).toInt, s(2).toInt, s(3).toInt)
    }
    //6. 对第5步获取到的数据进行排序操作, 并将其转换成List列表.
    val sortList = list.sortBy(_.getSum()).reverse.toList
    //println(sortList)
    //7. 按照指定格式, 通过BufferWriter将排序后的数据写入到目的地文件中(./data/stu.txt)
    //BufferedWriter高效的字符输出流  FileWriter普通的字符输出流
    val bw = new BufferedWriter(new FileWriter("./e_collectionProject_05/data/stu.txt"))
    for (s <- sortList) bw.write(s"${s.name} ${s.chinese} ${s.math} ${s.english} ${s.getSum()}\r\n")
/*    for(s <- sortList){
      bw.write(s"${s.name} ${s.chinese} ${s.math} ${s.english}")
      bw.newLine()
    }*/
    //8. 关闭流对象
    bw.close()
    source.close()
  }
}
