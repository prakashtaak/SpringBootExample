package com.example.scala.exercise

object ImplicitExample {

  implicit def toOption[T](x : T):Option[T] = if (x== null) None else Some(x)
}
