package com.example.List

object WordCount {
  def main(args: Array[String]): Unit = {
    val list = List(("hello world", 4), ("hello thirdlucky", 3), ("hello world aaa", 3), ("abc world aaa", 2), ("hello hadoop", 1))
    //    //     扁平化元组
    //    val list2: List[(String, Int)] = list.flatMap(t => t._1.split(" ").map(e => (e, t._2)))
    //    println(list2.mkString(","))
    //    //    分组映射并且加起来
    //    val group: Map[String, List[(String, Int)]] = list2.groupBy(_._1)
    //    val map: Map[String, Int] = group.map(g => (g._1, g._2.map(_._2).sum))
    //    println(map.mkString(","))
    //
    //    map.toList.sortWith((x,y)=>x._2>y._2).take(3).foreach(println)

    list.flatMap(t => t._1.split(" ").map((_, t._2))).groupBy(_._1).mapValues(_.map(_._2).sum).toList.sortWith(_._2 > _._2).take(3).foreach(println)

    //  扁平化元组
    val tuples: List[(String, Int)] = list.flatMap(t => t._1.split(" ").map((_, t._2)))
    //  分组映射
    val map: Map[String, Int] = tuples.groupBy(_._1).mapValues(_.map(_._2).sum)
    //  排序取得前三个循环打印
    map.toList.sortWith(_._2 > _._2).take(3).foreach(println)
  }
}
