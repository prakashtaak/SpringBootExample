def productPrice(price :Double)(vatCharges :Double)(serviceCharge :Double) ={
  price + (price * vatCharges /100) + serviceCharge
}

val productPriceOnly= productPrice(100)_

val productPriceWithVat = productPriceOnly(10)

val finalProductPrice = productPriceWithVat(10)




val isEven = new PartialFunction[Int,String] {
def apply(value :Int):String ={
    value + " is even"
}

 def isDefinedAt(x :Int)={
    x > 0 && (x % 2 == 0)
  }


}

val isOdd = new PartialFunction[Int,String] {
  def apply(value :Int):String ={
      value + " is Odd"
  }

  def isDefinedAt(x :Int)={
    x > 0 && x % 2 == 1
  }


}


val sample=Seq(1,3,2,-4)

sample map ( isOdd orElse  isEven)

sample collect(isEven)
sample collect(isOdd)
/*val isEven: PartialFunction[Int, String] = {
  case x   if x % 2 == 0 => x + " is even"



}

val isOdd: PartialFunction[Int, String] = {
  case x if x % 2 == 1 => x+" is odd"

}*/
import scala.reflect.runtime.universe._
case class TestClass(name :String,age :Int)

//val obj=Class[TestClass]
val objec=TestClass("pra",24)



