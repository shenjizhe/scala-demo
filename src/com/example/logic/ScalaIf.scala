package com.example.logic

object ScalaIf {
  def main(args: Array[String]): Unit = {
    var b = false;

    var s = if (b) 1 else 0

    var s1: Any = if (b) {
      "asd"
    }

    print(s"s = ${s}\n")
  }
}
