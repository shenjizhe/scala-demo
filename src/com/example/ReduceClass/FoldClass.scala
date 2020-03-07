package com.example.ReduceClass

import scala.collection.mutable

object FoldClass {
  def main(args: Array[String]): Unit = {
    val map1 = mutable.Map("a" -> 1, "b" -> 2, "c" -> 3)
    val map2 = mutable.Map("a" -> 3, "c" -> 2, "d" -> 1)

    map1.foldLeft(map2)((m, t) => {
      m(t._1) = m.getOrElse(t._1, 0) + t._2
      m
    }).foreach(println)
  }
}
