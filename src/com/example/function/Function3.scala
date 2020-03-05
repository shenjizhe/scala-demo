package com.example.function

object Function3 {
  def main(args: Array[String]): Unit = {
    //    可变参数，用 *,也可以不传递参数
    def test(string: String*) = {
      println(string)
    }

    test("张三", "李四", "王五")
    test()
  }

  //默认参数
  def test1(string: String, int: Int = 18) = {
    println(s"${string} - ${int}")
  }
  test1("张三")

  // 带名参数调用
  def test2(name1:String="张三",name2:String) ={
    println(s"${name1}和${name2}")
  }
  test2(name2="李四")
}
