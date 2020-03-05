package com.example.Class

object ScalaMethod {
  def main(args: Array[String]): Unit = {
    val user = new User3
    user.login
    user.logout
    // 相当于 user + "X"*6
    val str = user.+("X" * 6)
    println(str)
  }
}

class User3 {
  def login(): Unit = {

  }

  def logout = true
}
