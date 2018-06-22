package com.example.scala.exercise

import java.util.concurrent.{ExecutorService, Executors, LinkedBlockingQueue}

import scala.concurrent.ExecutionContext
 class RecordProducer( queue :LinkedBlockingQueue[Array[String]], initCapacity :Int) extends Runnable{




  var initialRowNum =1
  var maxRows =10

  //val obj=JDBCConnector

  override def run(): Unit = {



      //if(queue.size()   <= initCapacity  * 50 / 100){
      println("yes jjdajds ")
        //val records =obj.executeQuery(maxRows,maxRows)
        var listObObj =
           (0 to 100000).foreach( x => queue.put(Array(x.toString, "asd","asdsa" )))

               // if(listObObj==null && listObObj.isEmpty)
        //  obj.closeConnection()

        //listObObj.iterator.foreach( x => queue.put(x))

     // }

  }
}

 /*class Sample{
   def display(v1:String,v2:String,v4:String,v5:String,v6:String)={
     println("yes I am in")
   }
 }*/
 class Consumer( queue :LinkedBlockingQueue[Array[String]],totalRecords :Int) extends  Runnable {
  override def run(): Unit = {
    var it = 0
    implicit val pool = ExecutionContext.fromExecutor(Executors.newFixedThreadPool(4))
    while (true) {
      val msg = queue.take()


      if (msg( 0 ).equals( totalRecords.toString )) return;
      pool.execute( new Runnable {
        override def run(): Unit = {
          msg.foreach( x => {
            println( "Current Thread " + Thread.currentThread().getName + " " + x.toString )
          } )

        }
      } )
    }
  }
}

