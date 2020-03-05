package com.example.Class

object Field {
  def main(args: Array[String]): Unit = {
    val user = new User1
    println(user.name)

    user.name = "zhangsan"
    println(user.name)

    //    user.age
    //    user.email = "zhangsan@163.com"
  }
}

class User1 {
  var name: String = _
  private var age: Int = _
  //必须初始化为非空值
  val email: String = "zhangsan@126.com"
}
