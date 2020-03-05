package com.example.logic

import scala.util.control.Breaks._

object ScalaBreaks {
  def main(args: Array[String]): Unit = {

    //    类似 try
    breakable {
      for (i <- 1 to 10) {
        if (i == 5) {
          //          跑出异常
          break
        }
        println(s"${i}")
      }
    }
    //    必须breakable 才可以执行到
    println("循环结束")
  }
}
