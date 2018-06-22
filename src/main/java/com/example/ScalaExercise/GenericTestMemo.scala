package com.example.ScalaExercise

import java.util.concurrent.{BlockingQueue, ConcurrentHashMap}

import scala.collection.mutable
import scala.runtime.Nothing$
import scala.language.implicitConversions

class GenericTestMemo[A,B ](f: A => B) extends (A => B){

  private val conMap = new ConcurrentHashMap[  A  ,B]()
  private val memoized =mutable.Map.empty[A,B]
  override def apply(v1: A) = memoized.getOrElseUpdate(v1,f(v1))


}


object GenericTestMemo{

  def apply[A,B](f: A => B)= new GenericTestMemo(f)
}

class sender[D](f: List[D] => Unit) {

 /* def start[D](data:List[D]) = {
    val thread=new Thread(new Runnable {
      override def run(): Unit = f(data)
    })
    thread.start()
   // this.client=client
  }*/


}
object sender{


  def apply[D](f: (List[D]) => Unit) = new sender( f )
}



object testGeneric extends App{

  import scala.languageFeature.implicitConversions._

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
def compute(data:List[String])={
  data.foreach(println(_))
}
  def main(args: Array[String]): Unit = {

    val obj=sender(compute)
    val numbersAsc = 1::2::3::4::5::Nil
    //obj.start(numbersAsc)

  }


}