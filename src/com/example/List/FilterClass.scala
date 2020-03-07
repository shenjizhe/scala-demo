package com.example.List

object FilterClass {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4)
    println(list.filter(_ % 2 == 0).mkString(","))


    val list1 = List(1,2,3)
    val list2 = List(4, 5, 6)
    val tuples: List[(Int, Int)] = list1 zip list2
    println(tuples.mkString(","))
  }
}
