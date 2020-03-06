package com.example.Class

object ClassOf {
  def main(args: Array[String]): Unit = {
    var userClass: Class[User6] = classOf[User6]
    userClass.getInterfaces

    type XXX = User6

    var user:Object = new User6
    val bool = user.isInstanceOf[XXX]
    if(bool){
      val user1:User6 = user.asInstanceOf[XXX]
    }
  }
}

class User6{

}
