package com.example.function

object ScalaFunctionHell {
  def main(args: Array[String]): Unit = {
    def f0() = {
      // 嵌套函数
      def f(): Unit = {
        println("function")
      }
      // 1. 返回函数类型，需要在后边加上下划线 _
      f _
    }

    // 调用f0 函数的返回值函数
    f0()()

    // 简化写法
    def f4(i: Int)(j: Int) = {
      i * j
    }

    println(f4(2)(3))

    // 嵌套函数的调用
    def f2(i: Int) = {
      def f3(j: Int): Int = {
        i * j
      }

      f3 _
    }

    println(f2(2)(3))

    // 函数参数
    // ()=> Unit
    // 参数列表=>返回值类型
    def test5(f: () => Int): Int = {
      f() + 10
    }

    def f6(): Int = {
      10
    }

    println(test5(f6))

    // 匿名函数
    def f7(f:()=>Unit): Unit ={
      f()
    }
    f7(()=>println("123456"))

  }
}
