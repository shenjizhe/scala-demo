package com.example.Class

object ScalaClass {
  def main(args: Array[String]): Unit = {
    val per: Person = new SubPerson
    // 打印子类的方法
    per.test1();
  }
}

abstract class Person {
  val name: String = "abc"
  var sex:String

  def test()
  def test1(): Unit = {
    println("parent ...")
  }
}

class SubPerson extends Person {
  override val name: String = "sub name"
  var sex = "male"
  def test(): Unit = {
    println("重写抽象方法")
  }

  override def test1(): Unit = {
    println("child ...")
  }
}
