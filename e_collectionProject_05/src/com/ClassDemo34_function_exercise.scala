package com

/**
 * @author shenjie
 * @version 1.0
 *
 */
//案例: 学生成绩单.
object ClassDemo34_function_exercise {
  def main(args: Array[String]): Unit = {
    //1. 定义列表, 记录学生的成绩, 格式为: 姓名, 语文成绩, 数学成绩, 英语成绩
    val stuList = List(("张三",37,90,100), ("李四",90,73,81), ("王五",60,90,76), ("赵六",59,21,72), ("田七",100,100,100))
    //2. 获取所有语文成绩在60分(含)及以上的同学信息.
    //val chineseList = stuList.filter(x => x._2 >= 60)
    val chineseList = stuList.filter(_._2 >= 60)

    //3. 获取所有学生的总成绩. ("田七",100,100,100) 转换成 ("田七",300)
    //x表示：stuList集合中的每一个元素： ("张三",37,90,100)...
    //x._1表示：姓名 例如 "张三"
    //x._2,x._3,x._4分别表示：语文成绩, 数学成绩, 英语成绩
    val countList = stuList.map(x => x._1 -> (x._2 + x._3 + x._4))

    //4. 按照总成绩降序排列.
    val sortList1 = countList.sortBy(_._2).reverse
    //也可以通过sortWith实现.
    //x:表示前一个元素  (张三,227)
    //y:表示后一个元素  (李四,244)
    val sortList2 = countList.sortWith((x, y) => x._2 > y._2)
    val sortList3 = countList.sortWith(_._2 > _._2)
    //5. 打印结果.
    println(s"语文成绩及格的学生信息: ${chineseList}")

    println(s"所有学生及其总成绩: ${countList}")
    println(s"总成绩降序排列: ${sortList1}")
    println(s"总成绩降序排列: ${sortList2}")
  }
}
