package com.example.function

object ScalaException {
  def main(args: Array[String]): Unit = {
    try{
      val i = 10
      val j = 0
      val k = i/j
    }catch {
      case ex:ArithmeticException => println("这是数学计算异常")
      case ex:Exception => println("这是通用异常")
    }finally {
      println("这是 finally")
    }
  }
}
