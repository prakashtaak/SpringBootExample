val pool = java.util.concurrent.Executors.newFixedThreadPool( 5 )
/*for (elem <- (0 to 10)) {
  pool.execute( new Runnable {
    override def run(): Unit = println( "pakdjsa" )
  } )
}*/

val  t1 = new Thread(new Runnable {
  override def run(): Unit = println("asdsa")
})


t1.start()
