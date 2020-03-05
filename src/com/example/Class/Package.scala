package com.example.Class
package test
package test1 {

  class Test {

  }
  package test2 {

    object Package {
      def main(args: Array[String]): Unit = {
        var v = new Test
      }
    }
  }

  package object packageObject{
    var v = "test"
    def f = {"test"}
  }
}




