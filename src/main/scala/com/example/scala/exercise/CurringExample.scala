package com.example.scala.exercise

object CurringExample extends App{
  /*val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  numbers.foldLeft(0)((m,n) => m+n)*/
  val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

 /*val newNumer= numbers:+ 2
  print(newNumer.toString())
  val numberFunc = numbers.foldLeft(List[Int]())_
printf("adsa")
  val squares = numberFunc((xs, x) => xs:+ x*x)
  print(squares.toString())*/
 /* case class People(var name :String,var )*/
 case class FeatureUseCase(feature: String, useCase: String){
   def clue: String = this + ":"
 }
object People{
     def getValueOfX(awws:Int)(implicit deafaultVal:FeatureUseCase)=getValue(2,"prakash")

    private def getValue(awws:Int,sad:String)(implicit deafaultVal:FeatureUseCase)={
         println(s" 1st value :$awws  2nd value :$sad  and the default value is ${deafaultVal.feature}")
      awws + "_" +sad +"_"+ deafaultVal

       }
  }
  /*def transaction[T](op: Transactional[T]) = {
    implicit val trans: Transaction = new Transaction
    op
    trans.commit()
  }*/

 /* ff.display(12,"praks")("asd")*/
 /* def tempFunc=display(12,"asdas")(_ :Int)
  tempFunc(12)
  tempFunc(3123)*/

case class TestImplicait(name : Option[String]=None , age :Option[Int]= None )(implicit deafaultVal:FeatureUseCase){

  private val obj=People
  private lazy val masterFeed = age.map(obj.getValueOfX)




}
//implicit val impObj=FeatureUseCase("uu","ss")





 /* def main(args: Array[String]) = {
    /*transaction {
      val res = f1(args.length)
      println(if (thisTransaction.isAborted) "aborted" else s"result: $res")
    }*/
  }*/





}
