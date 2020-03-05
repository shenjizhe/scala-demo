package com.example.Class

object ScalaObject {
  def main(args: Array[String]): Unit = {
    val p = new User
    p.name = "张三"
    println(p.name)
  }
}

class User {
  var name: String = _
  var age: Int = _

  def login(): Boolean = {
    true
  }
}
