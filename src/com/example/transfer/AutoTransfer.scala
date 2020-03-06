package com.example.transfer

object AutoTransfer {
  def main(args: Array[String]): Unit = {
    implicit def tran1(d: Double): Int = {
      d.toInt
    }
    val i: Int = 5.0
    println(i)


    implicit def tran2(sql: MySql): Operator = {
      new Operator
    }
    var sql: MySql = new MySql
    sql.select()
    sql.delete()
  }
}

class Operator {
  def delete(): Unit = {
  }
}

class MySql {
  def select(): Unit = {
  }
}


