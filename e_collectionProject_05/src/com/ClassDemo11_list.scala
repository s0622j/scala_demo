package com

/**
 * @author shenjie
 * @version 1.0
 *
 */
//案例: 演示列表的基础操作.
object ClassDemo11_list {
  def main(args: Array[String]): Unit = {
    //1. 定义一个列表list1，包含以下元素：1,2,3,4
    val list1 = List(1, 2, 3, 4)
    //2. 使用isEmpty方法判断列表是否为空, 并打印结果.
    println(s"isEmpty: ${list1.isEmpty}")

    //3. 再定义一个列表list2，包含以下元素: 4,5,6
    val list2 = List(4, 5, 6)
    //4. 使用`++`将两个列表拼接起来, 并打印结果.
    val list3 = list1 ++ list2
    println(s"list3: ${list3}")
    //5. 使用head方法，获取列表的首个元素, 并打印结果.
    println(s"head: ${list3.head}")
    //6. 使用tail方法，获取列表中除首个元素之外, 其他所有的元素, 并打印结果.
    println(s"tail: ${list3.tail}")
    //7. 使用reverse方法将列表的元素反转, 并打印反转后的结果.
    val list4 = list3.reverse
    println(s"list4: ${list4}")
    //8. 使用take方法获取列表的前缀元素(前三个元素), 并打印结果.
    //这里的3表示：前3个元素都是前缀元素
    println(s"take: ${list3.take(3)}")
    //9. 使用drop方法获取列表的后缀元素(除前三个以外的元素), 并打印结果.
    //这里的3表示：前3个元素是前缀元素,除它们以外,剩下的都是后缀元素
    println(s"drop: ${list3.drop(3)}")
  }
}
