package com.example.Class

object ScalaParent {
  def main(args: Array[String]): Unit = {
    var user = new Sub("abc")
  }
}

class Root(s:String) {
  println("Root 主构造方法")
}

class Sub extends Root("Sub") {
  println("Sub 主构造方法")

  def this(s: String) {
    this()
    println("Sub 辅助构造方法")
  }
}
