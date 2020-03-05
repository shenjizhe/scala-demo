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
    def f7(f: () => Unit): Unit = {
      f()
    }

    f7(() => println("123456"))

    // 带参数的函数参数
    def f8(f: (Int) => Unit, i: Int): Unit = {
      f(i)
    }

    def f9(i: Int): Unit = {
      println(i)
    }

    f8(f9, 10)

    println("=" * 12 + "简化")

    // 调用时可以简化
    def f10(f: (Int) => Unit): Unit = {
      f(10)
    }
    // 正常写法
    f10((i: Int) => {
      println(i)
    })
    // 省略大括号，只有一句
    f10((i: Int) => println(i))
    // 自动推断，省略参数类型
    f10(i => println(i))
    // 参数名省略
    f10(println(_))
    // 只有一个参数，可以省略掉
    f10(println)

    // 加法匿名函数
    def f11(f: (Int, Int) => Int): Int = {
      f(10, 10)
    }

    def f12(i: Int, j: Int): Int = {
      i + j
    }
    // 普通写法
    f11(f12)

    println("=" * 12 + "多参数简化")
    println(f11((i: Int, j: Int) => {
      i + j
    }))
    println(f11((i, j) => {
      i + j
    }))
    println(f11((i, j) => i + j))
    println(f11(_ + _))

    // 递归阶乘 n!
    def !!(i: Int): Int = {
      if (i > 1) {
        i * !!(i - 1)
      } else {
        1
      }
    }

    println(!!(5))

    // 最多只能到<function22
    val fun = () => {} //<function0>
    var fun1 = (i: Int) => {}
    var fun2 = (i: Int, j: Int) => {}
    println(fun)
    println(fun1)
    println(fun2)

    // 柯里化
    println("=" * 12 + "柯里化")
    def f15(a: Int) = (b: Int) => (c: Int) => (a + b) * c
    def f16(a: Int)(b: Int)(c: Int) = (a + b) * c
    println(f15(20)(80)(30))
    println(f16(20)(80)(30))
  }
}
