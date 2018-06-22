package com.example.scala.exercise

class MainClass extends  App{


  object test {
    def main(args: Array[String]): Unit = {

      val tempMap = (for (arg1 <- List(1, 2);
                          arg2 <- List("secondArg","asd"))
        yield (arg1, arg2) -> "this is argument {1} and arg {2}").toMap

      val distinctVal = tempMap.values.toList.distinct


      val wrapperMap = tempMap.mapValues(str => distinctVal.indexOf(str))

      print(wrapperMap(2,"prakash"))
    }
  }

}

