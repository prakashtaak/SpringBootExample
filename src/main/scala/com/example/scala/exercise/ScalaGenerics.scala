package com.example.scala.exercise

import java.util.concurrent.CancellationException

import scala.reflect.ClassTag

class ScalaGenerics[H] {

  def mkfunction[I,O](arg : Function2[H,CancellationException,Function1[I,O]]): ClassTag[O] = ???
}
