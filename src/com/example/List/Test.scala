package com.example.List

object Test {
  def main(args: Array[String]): Unit = {
    val list = List(1, List(2, 3), List(4, 5))

    val list1 = list.flatMap(e => {
      if (e.isInstanceOf[List[Int]]) {
        e.asInstanceOf[List[Int]]
      } else {
        List(e)
      }
    })

    println(list1.mkString(","))



//    println(list1.flatMap(_).mkString(","))
  }
}
