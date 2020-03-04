package com.example

object PrintString {
  def main(args: Array[String]): Unit = {
    println("打印字符串")

    // 变量
    var name = "apache";
    var age = 1
    var address = "www.address.com"

    println(name + age + address)

    printf("%s%d%s\n", name, age, address)

    // 插值字符串
    print(s"name=${name},age=${age},address=${address}\n")

    // 格式字符串
    print(f"name=${name},age=${age}%.2f,address=${address}\n")

    // 原值
    print(raw"name=${name},age=${age}%.2f,address=${address}\n")
  }
}
