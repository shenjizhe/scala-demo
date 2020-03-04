package com.example

object ScalaVar {
  def main(args: Array[String]): Unit = {
    //    声明  var 变量名 : 变量类型 = 值
    val name: String = "zhangsan"
    var age : Int = 1
    var sex : Boolean = false
    var c : Char = 'a'
    // 不允许修改
    val text : String = "123"
    val text1 = "text"

    val dog = new Dog()
    dog.name = "234"
  }
  class Dog{
    var name ="123"
  }
}


