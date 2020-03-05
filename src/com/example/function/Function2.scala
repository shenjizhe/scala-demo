package com.example.function

object Function2 {
  def main(args: Array[String]): Unit = {
    // 1. 明确无返回值，那么有 return 也不起作用
    def test(): Unit = {
      return "123"
    }
    // 将会打印 (),而不是 123
    println(test)

    //2. 最后一行返回不需要加 return
    // 而且不用写返回值
    def test1() = {
      "zhang san"
    }
    println(test1)

    //3.如果只有一行代码，大括号可以省略
    //如果没有参数，小括号可以省略
    // 如果声明时省略了(),调用函数时不能用()
    def test2 = "张三"
    println(test2)

    // 4. 不写等号，相当于明确告诉没有返回值
    def test3(){
      "不会返回这个值"
    }
    println(test3)

    // 匿名函数
    () ->{println("xxxxxxxxx")}
  }
}
