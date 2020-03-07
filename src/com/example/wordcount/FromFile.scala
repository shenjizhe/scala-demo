package com.example.wordcount

import scala.io.Source

object FromFile {
  def main(args: Array[String]): Unit = {
    Source.fromFile("in/file.txt").getLines().toList.foreach(println)
  }
}
