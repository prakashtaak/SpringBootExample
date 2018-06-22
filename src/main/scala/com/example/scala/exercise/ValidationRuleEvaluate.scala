package com.example.scala.exercise

object ValidationRuleEvaluate extends App{

  case class RawData(str:Option[String])

  type ValidationRules = (RawData => Seq[ValidationResult])

  def performValidationOnRawData(data :RawData): Seq[ValidationResult] ={
    ValidationSet.map(x => x(data)).flatten
  }


  val validation0: ValidationRules= (rawBulkPayment: RawData) => {

 val validationResult=  rawBulkPayment.str match  {
   case None => Some(new ValidationResult(101,"Cannot be empty"))
   case Some(_) => None
 }
    Seq(validationResult).flatten
  }


  val validation1: ValidationRules= (rawBulkPayment: RawData) => {

    val validationResult=  rawBulkPayment.str match  {
      case None => Some(new ValidationResult(101,"Cannot be empty"))
      case Some(_) => None
    }
    Seq(validationResult).flatten
  }

  val validation2: ValidationRules= (rawBulkPayment: RawData) => {

    val validationResult=  rawBulkPayment.str match  {
      case None => Some(new ValidationResult(101,"Cannot be empty"))
      case Some(_) => None
    }
    Seq(validationResult).flatten
  }

  val ValidationSet = Seq[ValidationRules](validation2,validation0,validation1)


  val rawData =RawData(None)

  performValidationOnRawData(rawData).foreach(x => print("Error Code :"+x.errorCode+"\n"))
}
