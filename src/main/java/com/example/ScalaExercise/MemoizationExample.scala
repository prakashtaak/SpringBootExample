package com.example.ScalaExercise

import java.util.concurrent.ConcurrentHashMap
import scala.languageFeature.implicitConversions._


object MemoizationExample extends App{
  /*private val concurrentMemoized = new ConcurrentHashMap[String,String]


  val key ="p12"
  val value="prakash"
  (0 to 5).foreach(x => {

    val future = concurrentMemoized.putIfAbsent( key, value ) match {
      case null => concurrentMemoized.get( key )
      case value => value
    }
    println(future)
  }
  )*/






    var n1=1
    var n2=5
    def calculateSomeVal(number :Int): Int ={

      if(number==1){
        n1+=1
        n1
      }
      else {
        n2+=1
        n2
      }
    }

  def main(args: Array[String]): Unit = {

  }
    val obj=GenericTestMemo
    val res= obj(calculateSomeVal)
    //val data=res(1)


}

