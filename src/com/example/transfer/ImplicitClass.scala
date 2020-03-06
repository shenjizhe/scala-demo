package com.example.transfer

import com.example.transfer.ImplicitClass.User8

object ImplicitClass {
  def main(args: Array[String]): Unit = {

    val u = new User8
    u.select
    u.delete()
  }

  class User8 extends User7 {
    def select(): Unit = {
    }
  }
}
trait User7 {
}
object User7 {

  implicit class Operator(user: User8) {
    def delete(): Unit = {
    }
  }
}
