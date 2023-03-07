package com

/**
 * @author shenjie
 * @version 1.0
 *
 */
//案例: 获取邮箱运营商.
object ClassDemo49_regex {
  def main(args: Array[String]): Unit = {
    //1. 定义列表, 记录邮箱.
    val emlList = List("38123845@qq.com", "a1da88123f@gmail.com", "zhansan@163.com","123afadff.com")
    //2. 定义正则表达式.
    val regex = """.+@(.+)\..+""".r

    //3. 根据 模式匹配 匹配出所有合法的邮箱及其对应的运营商.
    val result = emlList.map {
      //email就是emlList这个列表中的每一个元素.
      //company表示: 正则表达式中你用()括起来的内容, 也就是分组的数据.
      //固定格式   要校验的邮箱  固定格式  正则对象(对应的是正则中的分组内容)  固定格式   邮箱 -> 运营商
      //case      email        @        regex(company)                  =>        email -> company
      case email @ regex(company) => email -> s"${company}"
      case email => email -> "未匹配"
    }
    //4. 打印结果
    println(result)
  }
}
