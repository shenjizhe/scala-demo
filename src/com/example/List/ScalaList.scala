package com.example.List

object ScalaList {
  def main(args: Array[String]): Unit = {
    val ints: Array[Int] = Array(1, 2, 3, 4, 5)
    println(ints(0))

    println(ints.mkString(","))

    for (elem <- ints) {
      println(elem)
    }

    def test(i: Int): Unit = {
      println(i)
    }
    //    ints.foreach(test)
    //    ints.foreach((i:Int)=>{println(i)})
    //    ints.foreach((i)=>{println(i)})
    //    ints.foreach({println(_)})
    //    ints.foreach(println(_))
    ints.foreach(println)

    //    ints.update(3,18)

    val ints1 = ints :+ 6
    val ints2 = 6 +: ints
    println(ints1.mkString(","))
    println(ints2.mkString(","))
  }
}


