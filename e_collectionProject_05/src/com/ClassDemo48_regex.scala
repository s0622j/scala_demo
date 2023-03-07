package com

/**
 * @author shenjie
 * @version 1.0
 *
 */
//案例: 过滤所有不合法的邮箱.
object ClassDemo48_regex {
  def main(args: Array[String]): Unit = {
    //1. 定义列表, 记录邮箱.
    val emlList = List("38123845@qq.com", "a1da88123f@gmail.com", "zhansan@163.com", "123afadff.com")
    //2. 定义正则表达式.
    val regex = """.+@.+\..+""".r
    //3. 通过 过滤器 获取所有的不合法的邮箱.
    //val list = emlList.filter(x => regex.findAllMatchIn(x).size == 0)
    val list = emlList.filter(regex.findAllMatchIn(_).size == 0)
    //4. 打印结果.
    println(list)
  }
}
