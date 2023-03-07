package com

/**
 * @author shenjie
 * @version 1.0
 *
 */
//案例: 演示Scala中的提取器.
//所谓的提取器就是: 在类的伴生对象中, 重写一个unapply()方法即可.
object ClassDemo51_extractor {
  //1. 创建一个Student类，包含姓名年龄两个字段
  class Student(var name: String, var age: Int)

  //2. 实现一个类的提取器，并使用match表达式进行模式匹配，提取类中的字段。
  object Student { //伴生对象.
    //apply() 根据给定的字段，将其封装成一个Student类型的对象
    def apply(name: String, age: Int) = new Student(name, age) //免new

    //unapply() 根据传入的学生对象,获取其对应的各个属性值。
    def unapply(s: Student): Option[(String, Int)] = { //相当于把对象 拆解成 其各个属性.
      if (s != null)
        Some(s.name, s.age)
      else
        None
    }
  }

  //main方法, 作为程序的主入口.
  def main(args: Array[String]): Unit = {
    //3. 创建Student类的对象.
    //方式一：普通方式
    val s = new Student("糖糖", 73) //普通方式创建对象.
    //方式二：免new
    val s2 = Student("糖糖", 73) //免new, 创建对象, apply方法保证

    //4. 打印对象的属性值
    //方式一：普通获取
    println(s2.name + "..." + s.age) //普通方式获取对象的属性值
    println("-" * 20)
    //5. 通过提取器获取对象中的方法.
    //方式二：直接调用unapply()方法。
    val result = Student.unapply(s2)
    println(result)
    println("-" * 20)
    //方式三：通过模式匹配获取
    s2 match {
      case Student(name,age) => println(name,age)
      case _ => println("未匹配")
    }

  }
}
