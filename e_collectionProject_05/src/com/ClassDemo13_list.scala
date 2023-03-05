package com

/**
 * @author shenjie
 * @version 1.0
 *
 */
//案例: 演示拉链与拉开
object ClassDemo13_list {
  def main(args: Array[String]): Unit = {
    //1. 定义列表names, 保存三个学生的姓名，分别为：张三、李四、王五
    val names = List("张三", "李四", "王五")
    //2. 定义列表ages, 保存三个学生的年龄，分别为：23, 24, 25
    val ages = List(23, 24, 25)
    //3. 使用zip将列表names和ages, 组合成一个元素为元组的列表list1.
    val list1 = names.zip(ages)
    //4. 使用unzip将列表list1拆解成包含两个列表的元组tuple1
    val tuple1 = list1.unzip
    //5. 打印结果
    println("拉链: "+ list1)
    println("拉开: " + tuple1)
  }
}
