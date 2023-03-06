package com

/**
 * @author shenjie
 * @version 1.0
 *
 */
//案例: 模式匹配之匹配for表达式.
object ClassDemo43_match_for {
  def main(args: Array[String]): Unit = {
    //1. 定义变量记录学生的姓名和年龄.
    val map1 = Map("张三" -> 23, "李四" -> 24, "王五" -> 23, "赵六" -> 26)
    //2. 获取所有年龄为23的学生信息.
    //2.1 格式一: 通过if语句实现.
    for((k,v) <- map1 if v == 23) println(s"${k} = ${v}")
    //分割线.
    println("-" * 15)
    //2.2 格式二: 通过固定值实现.
    for((k, 23) <- map1) println(k + " = 23")
  }
}
