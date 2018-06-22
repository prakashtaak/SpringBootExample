package com.example.scala.exercise

object ForYieldParamCombo extends App {
  val tempMap = (for (arg1 <- List(1, 2);
                      arg2 <- List("secondArg","asd"))
    yield (arg1, arg2) -> ("this is argument " + arg1 + " and arg " +arg2)).toMap


  //constructs the distinct value list from the  map values
  val distinctVal = tempMap.values.toList.distinct

  val wrapperMap = tempMap.mapValues(str => distinctVal.indexOf(str))
  val indexOfmatchedparameterQueryString=wrapperMap(2,"asd")
val queryStringforparmCombination = distinctVal(indexOfmatchedparameterQueryString)
  print(queryStringforparmCombination)




}
