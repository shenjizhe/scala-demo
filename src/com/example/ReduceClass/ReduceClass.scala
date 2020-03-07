package com.example.ReduceClass

object ReduceClass {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4)
    println(list.reduce(_ + _))
    println(list.reduce(_ - _))
    println(list.reduceLeft(_ - _))
    println(list.reduceRight(_ - _))
  }
}
