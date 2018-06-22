package com.example.scala.xml

import java.io.File
import javax.naming.spi.ObjectFactory
import javax.xml.bind.JAXBContext










object XmlMarshlar {

  def main(args: Array[String]): Unit = {

    val clss= Class.forName("com.example.scala.xml.Config")


    import javax.xml.bind.JAXBContext
    //1. We need to create JAXContext instance//1. We need to create JAXContext instance

    val jaxbContext = JAXBContext.newInstance( classOf[Nothing] )
    //val jc: JAXBContext = JAXBContext.newInstance( "com.example.scala.xml.Config" )

    val unmarshaller = jc.createUnmarshaller
    val file = new File("resources//appConfig.xml" )
    val message = unmarshaller.unmarshal( file )
    println(message.asInstanceOf[Config].connectors.foreach( println(_)))
  }

  /*val marshaller: Marshaller = jc.createMarshaller
  marshaller.setProperty( Marshaller.JAXB_FORMATTED_OUTPUT, true )
  marshaller.marshal( message, System.out )*/

}
