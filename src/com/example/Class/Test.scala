package com.example.Class

// 伴生类 ( 成员 )
class Test {
  var name = "张三"
  Test.test
}

// 伴生对象（ 静态 ）
// 可以访问伴生类的私有属性
// 创建伴生类的对象，需要提供特殊的方法，实现相应的功能
object Test {
  def apply(): Test = new Test()

  def apply(s: String):Test = {
    var test = new Test
    test.name = s
    test
  }

  def test: Unit = {
    // 不需要这样写 ，只需要实现 apply方法
    //    new Test().name
  }
}
