package com.example.List

object Tuple {
  def main(args: Array[String]): Unit = {
    val tuple: (String, String, Int) = ("zhangsan", "thirdlucky@126.com", 12)
    println(tuple._1)
    println(tuple._2)
    println(tuple._3)

    tuple.productIterator.foreach(println)

    val tupleMap: Map[Int, String] = Map((1, "zhangsan"))
    tupleMap.foreach(t => println(t._1 + "=" + t._2))
  }
}
