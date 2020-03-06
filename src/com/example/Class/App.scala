package com.example.Class

object TestApp extends App {
  println("app")
  NewColor.Blue
}

object NewColor extends Enumeration {
  val Red = Value(1,"red")
  val Blue = Value(2,"blue")
}
