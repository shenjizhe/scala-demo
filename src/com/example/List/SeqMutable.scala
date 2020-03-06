package com.example.List

import scala.collection.mutable.ListBuffer

object SeqMutable {
  def main(args: Array[String]): Unit = {
    val list = ListBuffer(1, 2, 3, 4)

//    println(list(0))
//    list.insert(1, 2)
//    list.update(2, 11)
//    list.remove(0)
//    list.drop(2)
//    println(list.mkString(","))

    println(list.head)
    println(list.last)
    println(list.init)
    println(list.tail)
  }
}
