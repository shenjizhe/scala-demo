package com.example.List

object ParallelClass {
  def main(args: Array[String]): Unit = {
    val result1 = (1 to 100).map { case _ => Thread.currentThread().getName }
    val result2 = (1 to 100).par.map { case _ => Thread.currentThread().getName }

    println(result1)
    println(result2)
  }
}
