package com.example.transfer

object ImplicitValue {
  def main(args: Array[String]): Unit = {
    // 隐式参数
    def test(implicit name: String = "zhangsan"): Unit = {
      println("hello " + name)
    }


    //隐式值
    implicit val zhangsan: String = "wangwu"
    // 打印 hello wangwu 隐式值
    test
    // 打印 hello zhangsan 隐式函数
    test()

    def test1(implicit name: String): Unit = {
      println("hello " + name)
    }

    test1
  }
}
