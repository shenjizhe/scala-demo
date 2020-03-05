package com.example.Class {

  object Package2 {
    def main(args: Array[String]): Unit = {

    }
  }
}

package p1 {
  package p2 {
    class User{
      var name = "zhangsan"
      private var password = "123456"
      protected var email = "xxx@125.com"
      private[p2] var address = "XXXXXXXXXXX"
    }
    class B{
      val user = new User
      user.address = "new address"
    }


  }
}

package p3{
  import p1.p2.User
  class A{
    def test: Unit ={
      val user = new User
      user.name = "lisi"
    }
  }
  class C extends User{
    def test: Unit ={
      this.email = "new@emain.com"
    }
  }
}
