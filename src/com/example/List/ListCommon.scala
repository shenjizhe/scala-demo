package com.example.List

object ListCommon {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 4, 3, 2, 1, 5, 2)

    println("max min product...")
    println(list.max)
    println(list.min)
    println(list.product)
    println(s"reverse=${list.reverse}")

    println("groupBy...")
    val map: Map[Int, List[Int]] = list.groupBy(_ % 2)
    map.foreach(t => println(s"key=${t._1},value=${t._2}"))

    println("orderBy...")
    val list1 = list.sortBy(x => x)
    println(list1.mkString(","))

    println("sortWith...")
    val list2 = list.sortWith((i, j) => i > j)
    println(list2.mkString(","))

    println("iterator...")
    println(list.iterator.mkString(","))
  }
}
