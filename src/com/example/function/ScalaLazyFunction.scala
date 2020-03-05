package com.example.function

object ScalaLazyFunction {
  def main(args: Array[String]): Unit = {
    def sum(i:Int,j:Int):Int = {
      println( s"这时候执行${i}+${j}")
      i+j
    }
    // 后print（v） 时候才会执行
    lazy val v = sum(10,20)
    // 会先执行这句
    val v1 = sum(20,30)

    println("="*12 + "惰性函数")
    println(v)
  }
}
