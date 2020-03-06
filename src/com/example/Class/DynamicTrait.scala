package com.example.Class

object DynamicTrait {
  def main(args: Array[String]): Unit = {
    val obj = new OldClass with NewTrait
    obj.print
  }
}

trait NewTrait {
  // 特质的使用范围
  this:Exception =>
  def print: Unit = {
    println("新特性")
    this.getMessage
  }
}

class OldClass extends Exception with NewTrait {
}
