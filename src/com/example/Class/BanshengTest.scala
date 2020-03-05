package com.example.Class

object BanshengTest {
  def main(args: Array[String]): Unit = {
    // 采用伴生类生成伴生对象
    // 相当于 用 Test.apply
    val test = Test
    println(test)
    println(Test("test 123"))
  }
}
