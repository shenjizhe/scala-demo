package com.example.Class

import scala.beans.BeanProperty

object ScalaObject {
  def main(args: Array[String]): Unit = {
    val p = new User
    p.name = "张三"
    println(p.name)

    p.setAddress("张三")
    p.getAddress();
  }
}

class User {
  var name: String = _
  var age: Int = _
  @BeanProperty var address:String = _

  def login(): Boolean = {
    true
  }
}
