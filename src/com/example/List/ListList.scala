package com.example.List

object ListList {
  def main(args: Array[String]): Unit = {
    val list1 = List(1, 2, 3, 4, 5, 6, 7)
    val list2 = List(5, 6, 7, 8, 9)

    println("union = " + list1.union(list2).mkString(","))
    println("intersect=" + list1.intersect(list2).mkString(","))
    println("diff=" + list1.diff(list2).mkString(","))
  }
}
