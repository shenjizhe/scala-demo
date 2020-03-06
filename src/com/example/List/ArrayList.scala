package com.example.List

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object ArrayList {
  def main(args: Array[String]): Unit = {
    val ints: ArrayBuffer[Int] = ArrayBuffer(1, 2, 3, 4, 5)
    println(ints(0))
    println("length=" + ints.length)
    ints.foreach(println)

    ints.insert(1, 7, 8, 9)
    val ints1 = ints += 10
    ints -= 1
    println(ints == ints1)
    println(ints.mkString(","))

    val v = ints.remove(1)
    println("值为 " + v)
    println(ints.mkString(","))

    ints.remove(1, 3)
    println(ints.mkString(","))

    val array: Array[Int] = Array(1, 2, 3, 4)
    val arrayBuffer: ArrayBuffer[Int] = ArrayBuffer(5, 6, 7, 8, 9)

    val buffer: mutable.Buffer[Int] = array.toBuffer
    val array1: Array[Int] = arrayBuffer.toArray
  }
}


