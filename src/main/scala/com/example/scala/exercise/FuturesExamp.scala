package com.example.scala.exercise

import com.example.ScalaExercise.App

object FuturesExamp extends App{
  import java.util.concurrent.Executors

  import scala.concurrent.{ExecutionContext, Future}

  implicit val ec = ExecutionContext.fromExecutor(Executors.newFixedThreadPool(4))

  val eve= {
    for (elem <- (0 to 10)) {
      Future {

        for (elem <- (0 to 100)) {
          println( "Thread " + Thread.currentThread().getName + "executing " )
        }

      }
    }
  }
}
