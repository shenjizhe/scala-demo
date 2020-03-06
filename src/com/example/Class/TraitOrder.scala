package com.example.Class

object TraitOrder {
  def main(args: Array[String]): Unit = {
    var sub = new SubClass3
  }
}

trait Trai3 {
  println("Trai3")
}

class ParentClass extends Trai3{
  println("ParentClass")
}

class SubClass3 extends ParentClass with Trai3 {
  println("SubClass3")
}
