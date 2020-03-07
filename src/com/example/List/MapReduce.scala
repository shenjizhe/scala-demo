package com.example.List

import scala.collection.mutable.ListBuffer

object MapReduce {
  def main(args: Array[String]): Unit = {

    println("map...")
    val strings = List("hello", "third", "jsonshen", "hello", "third")
    val tuples = strings.map(x => (x, 1))
    val stringToTuples: Map[String, List[(String, Int)]] = tuples.groupBy(t => t._1)
    val stringToInt = stringToTuples.map(t => (t._1, t._2.size))
    stringToInt.foreach(println(_))

    //    val strings = List("hello world", "thirdlucy json hello", "hello json world")
    //    strings.flatMap(arr=>arr.foreach())
  }
}
