package com.example.Class

object TraitExtend {
  def main(args: Array[String]): Unit = {
    val mysql = new Mysql
    mysql.insert
  }
}

trait Operator {
  println("Operate ...")

  def insert(): Unit = {
    println("插入数据")
  }
}

trait DB extends Operator {
  println("DB ...")

  override def insert(): Unit = {
    print("向数据库")
    super[Operator].insert
  }
}

trait File extends Operator {
  println("File ...")

  override def insert(): Unit = {
    print("向文件")
    super.insert
  }
}

class Mysql extends File with DB {


}
