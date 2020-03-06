package com.example.Class

object Interfaces {
  def main(args: Array[String]): Unit = {
    val sub = new SubClass
    sub.name = "wangwu"
    sub.test
    sub.test1
  }
}

trait Trait1 {
  println("进入 Trait1")

  var name: String = "zhangsan"

  def test: Unit = {
    println("trait1 test 方法:name=" + name)
  }

  def test1()
}

class RootClass {

}

class SubClass extends RootClass with Trait1 {
  def test1(): Unit = {
    println("SubClass 重写 抽象方法")
  }
}
