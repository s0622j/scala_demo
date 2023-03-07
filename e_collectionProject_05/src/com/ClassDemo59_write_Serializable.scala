package com

import java.io.{FileInputStream, FileOutputStream, ObjectInputStream, ObjectOutputStream}

/**
 * @author shenjie
 * @version 1.0
 *
 */
//案例: 演示序列化和反序列化操作.
//记忆：一个类的对象想实现序列化或者反序列化操作，则该类必须继承Serializable特质
object ClassDemo59_write_Serializable {
  //1、创建样例类Person
  //class Person(var name:String, var age:Int) extends Serializable
  case class Person(var name:String, var age:Int)  // 已经继承Serializable特质
  def main(args: Array[String]): Unit = {
    //序列化操作. 即：将对象写入到文件中
    /*
    //1、创建Person对象
    val p = new Person("张三", 23)
    //2、创建序列化流，用来将对象写入到文件中
    val oos = new ObjectOutputStream(new FileOutputStream("./e_collectionProject_05/data/5.txt")) //细节：目的地文件不存在，程序会自动创建
    //3、调用writeObject()方法，将对象写入到文件中
    oos.writeObject(p)
    //4、关闭序列化流
    oos.close()
    */


    //反序列化操作. 即：从文件中直接读取对象
    //1、创建反序列化流，关联数据源文件
    val ois = new ObjectInputStream(new FileInputStream("./e_collectionProject_05/data/5.txt"))
    //2、调用readObject()方法，从数据源文件中读取指定的对象
    //细节：我们获取到的对象是AnyRef类型，所以需要转换成Person类型
    //val value: AnyRef = ois.readObject()
    var p: Person = ois.readObject().asInstanceOf[Person]
    //3、打印
    println(p)
    println(p.name,p.age)
    //4、关闭反序列化流
    ois.close()
  }
}
