package com.example.Class

object Contruct {
  def main(args: Array[String]): Unit = {

    val user = new User05
    println(user)
  }
}

class User05(s: String) {
  println("init 主构造方法")

  // 必须写在调用方的前边
  def this(name: String, address: String) {
    this(name)
    println("（String,String） 构造方法")
  }

  def this() {
    this("王五", "地道")
    println("（） 构造方法")
  }
}

