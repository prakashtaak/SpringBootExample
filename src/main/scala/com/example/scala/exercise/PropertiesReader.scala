package com.example.scala.exercise

import java.io.File

import scala.util.{Failure, Success, Try}

object PropertiesReader {

  def readConfiguration(file :File) ={

  }

  implicit class OptionWrapper[T](data : Option[T]) {
    def getOrError(str: String) : T={
      data match {
        case Some(x) => x
        case None => throw new Exception(str)
      }
    }

  }

 /* val mapOfValues = Map.empty[String,String]

  def getStrValue(key: String) = {
    mapOfValues.get(key).getOrError(s"Config key $key is empty")
  }

  def getValueAsString[T](key: String, parseInt: (String, String) => T) = {
    val keyValueAsStr = getStrValue(key)
    parseInt(key,keyValueAsStr)
  }

  def getIntValue(key :String) = getValueAsString(key,parseInt)

  def parseInt = parseType("Int",_.toInt)

  def parseType[T](valueType:String,convert : String => T)(key:String,value :String)={
    Try(convert(value)).transform(Success(_),exp => Failure(new Exception("",exp)))
  }*/

}
