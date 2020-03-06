package com.example.List

object QueueClass {
  def main(args: Array[String]): Unit = {
    import scala.collection.mutable
    val queue = mutable.Queue(1, 2, 3, 4)

    println("初始化:"+queue)
    queue.enqueue(5)
    println("进队列:" + queue)
    val i = queue.dequeue()
    println(s"出队列:i=${i}q=${queue}")
  }
}
