object TailRecWithHigerOrderFunction {

  //Higher order function which takes function as arguments and apply the itself on the
  //argument list
  def sumOfIntegerRangeFunction(func: Int => Int, a: Int, b: Int): Int = {

    def tailRecFunction(a: Int, acc: Int): Int = {
      if (a > b) acc
      else tailRecFunction(a + 1, func(a) + acc)

    }

    tailRecFunction(a, 0)
  }

  sumOfIntegerRangeFunction(x => x * x, 2, 5)


  // Currying.. used when we are dealing with multiple parameter
  def sums(f: Int => Int)(a: Int, b: Int): Int = {
     def sumF(a:Int,b:Int):Int= {
       if (a > b) 0
       else f(a) + sumF(a + 1, b)
     }

    sumF(a,b)
  }


  //Above function can further be reduced to below
  def sumsImporved(f: Int => Int)(a: Int, b: Int): Int = {

      if (a > b) 0
      else f(a) + sumsImporved(f)(a + 1, b)

  }

  sums(x=> x*x)(1,7)



  def cube:Int => Int =  x => x*x*x
  def square:Int => Int =  x => x*x

  // sum of cubes
  sums(cube)(1,2)
  //sum of squares
  sumsImporved(square)(1,3)

  //above curried function can be also represented as below
  // return a function which accepts 2 parameters
  def sumInts= sums(x => x*x)_

  sumInts(1,5)






  

}