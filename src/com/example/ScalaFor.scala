package com.example

object ScalaFor {
  def main(args: Array[String]): Unit = {
    // 包含最后一次
    for (i <- 1 to 5) {
      print(s"i=${i}\n")
    }

    // 不包含最后一次 , 等同于 Range(0,5)
    for (i <- 0 until 5) {
      print(s"i=${i}\n")
    }

    // 步长不是1的循环
    for (i <- Range(0, 5, 2)) {
      print(s"i=${i}\n")
    }

    // 可以写成 0 until 5(返回集合  Range)
    0.until(5)
    0.to(5)
    // 可以写成 1 + 1
    1.+(1)

    for (i <- 1 to 3) {
      for (j <- 1 until 3) {
        print(s"i=${i},j=${j}\n")
      }
    }
    // 杨辉三角，一个循环
    for (i <- 1 to 9) {
      print(" " * (9 - i) + "* " * i + "\n")
    }

    // 九层妖塔，一个循环
    for (j <- 1 to 9) {
      print(" " * (9 - j) + "*" * (2 * j - 1) + "\n")
    }

    // 循环守卫
    for (k <- 1 to 5 if k % 2 == 0) {
      print(s"k = ${k}\n")
    }

    // 返回了 Vector对象 Vector(2, 4, 6, 8, 10)
    // 除此之外，for 都返回 () Uint 的对象
    var v = for (i <- 1 to 5) yield i * 2
    println(v)
  }
}
