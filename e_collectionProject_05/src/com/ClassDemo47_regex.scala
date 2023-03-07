package com

/**
 * @author shenjie
 * @version 1.0
 *
 */
//案例: 校验邮箱是否合法.
object ClassDemo47_regex {
  def main(args: Array[String]): Unit = {
    //需求: 定义一个正则表达式，来匹配邮箱是否合法
    //1. 定义一个字符串, 表示邮箱.
    val email = "qq12344@163.com"
    //2. 定义一个正则表达式, 用来校验邮箱.
    //格式："""正则规则""".r  获取的就是一个正则对象。
    /*
    . 表示任意字符
    + 数量词, 表示前边的字符出现至少1次, 至多无所谓.
    @ 表示必须是@符号, 无特殊含义.
    \. 因为.在正则中有特殊的含义, 所以要转移一下, 使它变成普通的.
    */
    val regex = """.+@.+\..+""".r
    //3. 打印结果.
    /*
    regex：表示正则对象
    email：表示要被校验的邮箱。 qq12344@163.com|qq12344163.com|qq12344@13.com|sfaf
    regex.findAllMatchIn(email)：从email字符串中，获取所有满足regex规则的字符串。
     */
    if (regex.findAllMatchIn(email).size != 0) {
      //合法邮箱
      println(s"${email} 是一个合法的邮箱!")
    } else {
      println(s"${email} 是一个非法的邮箱!")
    }
  }
}
