package com
import scala.collection.mutable.Map
/**
 * @author shenjie
 * @version 1.0
 *
 */
//案例: 演示Map的常见操作
object ClassDemo21_map {
  def main(args: Array[String]): Unit = {
    //1. 定义一个映射，包含以下学生姓名和年龄数据: 张三 -> 23, 李四 -> 24
    //键值对："张三" -> 23
    val map1 = Map("张三" -> 23, "李四" -> 24)
    //2. 获取张三的年龄, 并打印.
    println(map1.get("张三"))
    //3. 获取所有的学生姓名, 并打印.
    println(map1.keys)
    //4. 获取所有的学生年龄, 并打印.
    println(map1.values)
    //5. 打印所有的学生姓名和年龄.
    for((k, v) <- map1) println(s"键:${k}, 值:${v}")
    println("-" * 15)
    //6. 获取`王五`的年龄，如果`王五`不存在，则返回-1, 并打印.
    println(map1.getOrElse("王五", -1))
    println("-" * 15)
    //7. 新增一个学生：王五, 25, 并打印结果.
    /*//不可变Map
    val map2 = map1 + ("王五" -> 25)
    println(s"map1: ${map1}")
    println(s"map2: ${map2}")*/
    map1 += ("王五" -> 25)
    //8. 将`李四`从可变映射中移除, 并打印.
    map1 -= "李四"  //根据键删除对应的键值对
    println(s"map1: ${map1}")
  }
}
