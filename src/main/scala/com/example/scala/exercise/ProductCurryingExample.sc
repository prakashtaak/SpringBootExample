// More advanced version of currying

object Product{

  def product(f : Int => Int)(a:Int,b : Int):Int={
      if(a > b) 0
      else  f(a) + product(f)(a+1,b)

  }

  product(x => x*x)(1,4)

  //here we replace unit of return type to some Variable which is 'Zero'
  //and '+'  which is a aggregate function between the range of inputs can
  //be replaced with a function that does this operation.
  // This example can be leveraged where we need to compute some operation  on range of inputs
  // where each value has some operation applied on itself and some operation to combine these values..
   def mapReduce(f : Int => Int, combine : (Int,Int) => Int, zero :Int)(a:Int,b:Int):Int={

    if(a>b) zero
    else combine(f(a), mapReduce(f,combine,zero)(a+1,b))

  }

  def newProduct(f : Int => Int)(a:Int,b : Int):Int=mapReduce(f,(x,y) => x*y,1)(a,b)

  newProduct(x=>x*x)(2,3)

def factorial(a :Int)= newProduct( x => x)(1,a)

  factorial(5)


}