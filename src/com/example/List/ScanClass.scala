package com.example.List

object ScanClass {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4)
    // 10 - 1 - 2 - 3 - 4
    // 10 , 9 , 7 , 4 , 0
    println(list.scanLeft(10)(_ - _).mkString(","))
  }
}
