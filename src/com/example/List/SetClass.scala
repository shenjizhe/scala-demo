package com.example.List

object SetClass {
  def main(args: Array[String]): Unit = {
    //    val set = Set(1, 2, 3, 4, 1,5,6,7,8)
    //    println(set.mkString(","))

    val set = Set(1, 2, 3, 4)
    println(set + 11)
    println(set - 3)

    import scala.collection.mutable
    val mset = mutable.Set(1, 2, 3, 4)
    println(mset + 12)
    println(mset - 5)
    mset.update(7,true)
    println(mset)
  }
}
