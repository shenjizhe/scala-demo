package com.example.List

object MapClass {
  def main(args: Array[String]): Unit = {
    val map = Map("a" -> 1, "b" -> 2, "c" -> 3)
    val map1: Map[String, Int] = map + ("d"->4)
    val map2 = map - "b"
    val map3 = map.updated("f", 7)

    println(map.mkString(","))
    println(map1.mkString(","))
    println(map2.mkString(","))
    println(map3.mkString(","))
    println(map == map1)

    println(map.get("c"))
    println(map.get("z"))

    println(map.get("c").get)
    println(map.get("z").getOrElse(0))
  }
}
