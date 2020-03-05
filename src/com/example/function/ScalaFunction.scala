package com.example.function

object ScalaFunction {
  def main(args: Array[String]): Unit = {
    // 无参数 无返回值
    def test(): Unit = {
      println("没有参数和返回值")
    }
    test

    def test1(string: String):Unit={
      println(string)
    }
    test1("有参数，没返回值")

    def test2():String = {
      "没参数，有返回值"
    }
    println(test2)

    def test3(string: String):String = {
      string + "..."
    }
    println(test3("有参数和返回值"))
  }
}
