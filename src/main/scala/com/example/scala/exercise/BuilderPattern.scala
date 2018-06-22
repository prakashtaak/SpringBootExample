package com.example.scala.exercise



class BuilderPattern  {


 class Main {

   case class P1(var name: String, var age: Int)

   case class P2(name: String, age: Int)

   case class P3(name: String, age: Int)
   def withP1(name: String, age: Int):this.type = {
     this.P1(name,age)
     this
   }

   def withP2(name: String, age: Int):this.type  = {
     this.P2(name, age)
     this
   }

   def withP3(name: String, age: Int):this.type  = {
     this.P3(name,age)
     this}

 }

  override def toString: String = super.toString
}

object main{
  def main(args: Array[String]): Unit = {


  }
}