package com.example.List

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object TransferToJava {
  def main(args: Array[String]): Unit = {
    val arr = ArrayBuffer("1", "2", "3")
    import scala.collection.JavaConverters._

    val list: java.util.List[String] = arr.asJava
    val buffer: mutable.Buffer[String] = list.asScala
  }
}
