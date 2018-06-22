package com.example.scala.exercise

object ListExercise extends App{

  case class SampleCls(val name:String,val age:Int)



  val listObj= List(SampleCls("n1",4521),SampleCls("n2",2111),SampleCls("n3",321),SampleCls("n4",211),SampleCls("n5",114))

  listObj.foreach(print(_))

  object Profile extends AnyRef{

    def profiling[T](message :String)(body : =>  T): T={

      val t0 = System.nanoTime()
      val result = body    // call-by-name
      val t1 = System.nanoTime()
      println("Elapsed time: " + (t1 - t0)/1000000 + "ms")
      result

    }
  }


  Profile.profiling("This is the method call for task1"){
    print("Hello world")
  }
}
