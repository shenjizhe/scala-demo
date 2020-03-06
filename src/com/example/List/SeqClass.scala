package com.example.List

object SeqClass {
  def main(args: Array[String]): Unit = {
    val ints = List(1, 2, 3, 4)
    val ints1 = 0 +: ints :+ 5
    val ints2 = List(5, 6, 7, 8)
    val ints3 = ints ++ ints2
    val ints4 = 7 :: 8 :: 9 :: ints
    val ints5: List[Any] = 9 :: ints1 :: ints
    val ints6 = 9 :: ints1 ::: ints

    println(ints == ints1)
    println(ints.mkString(","))
    println(ints1.mkString(","))
    println(ints3.mkString(","))
    println(ints4.mkString(","))
    println(ints5.mkString(","))
    println(ints6.mkString(","))
    println(List())
    println(Nil)
    1::2::3::Nil

    val ints7 = ints.updated(2, 5)
    println(ints7.mkString(","))
    println(ints7(0))

    val ints8 = ints.drop(2)
    println(ints8.mkString(","))
    val ints9 = ints.drop(10)
    println(ints9.mkString(","))
  }
}
