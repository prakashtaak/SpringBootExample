class Base(val1:Int){

  def dispplay(): Unit ={
    print("this is value of val "+this.val1)
  }


}
class Derived(val1 :Int =20) extends Base(val1:Int) {



  def test(): Unit = {

    dispplay();
  }
}

var obj=new Derived
obj.test()


val seqIndex= Seq(1,2,3,4)
val result=
(
  for(
    i <- 1 to 2;
    j <- 1 to 2
    )
    yield {
seqIndex.map( x => (x*i + x*j))
}

).flatten
print(result)