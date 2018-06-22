package com.example.scala.exercise

import java.util.Properties

import com.example.scala.exercise.ApplicationConfigReader.getPropertyValue

import com.example.scala.exercise.WebServiceType.WebServiceType

import scala.collection.JavaConverters._
import scala.util.{Failure, Random, Success, Try}

trait ApplicationConfigReader {

  def senderConfig: SenderConfig

  def dbConfig: DBConfig

  def httpRequestData: HttpRequestInfo

}

trait SenderConfig {
  def webServiceType: WebServiceType

  def batchSize: Int

  def tps: Int

  def noOfThreads: Int

}

trait DBConfig {
  def dsUrl: String

  def userName: String

  def passWord: String

  def query: String
}

object WebServiceType extends Enumeration {
  type WebServiceType = Value
  val SOAP, REST = Value
}

trait HttpRequestInfo

trait SOAPRequestData extends HttpRequestInfo {
  def wsdlURL: Option[String]

  def webServiceName: Option[String]

  def authentication: Option[AuthenticationBase]

  def webServiceMethodName: Option[String]

  def jarName: String
}

sealed abstract class AuthenticationBase

case class Authentication(userName: String, password: String) extends AuthenticationBase

object DefaultAuthentication extends Authentication( "admin", "password" )


object HttpRequestInfo {


  def apply(webServiceType: WebServiceType)(implicit properties: Map[String, String]): HttpRequestInfo = {

    if (webServiceType.equals( WebServiceType.SOAP )) {
      new SOAPRequestData {
        val rd = new Random

        override def jarName: String = s"wsStubs${rd.nextInt( 1000 )}.jar"

        val wsdlUrl = getPropertyValue( "wsdlURL", _.toString )


        val webServiceName: Option[String] = Option( wsdlUrl.substring( wsdlUrl.lastIndexOf( "/" ) + 1, wsdlUrl.indexOf( '?' ) ) )

        val webServiceMethodName: Option[String] = Option( properties.get( "serviceMethodName" ).get )

        val wsdlURL: Option[String] = Option( wsdlUrl )

        val isAuthenticationEnabled = getPropertyValue( "isAuthenticationEnabled", _.toBoolean )


        val authenticationObject: Authentication = if (isAuthenticationEnabled) {
          val userName = getPropertyValue( "userName", _.toString )
          val password = getPropertyValue( "password", _.toString )
          Some( Authentication( userName, password ) )
        }.getOrElse( DefaultAuthentication )
        else null


        override def authentication: Option[AuthenticationBase] = Option( authenticationObject )


      }
    }
    else {
      new HttpRequestInfo {}
    }
  }
}

object ApplicationConfigReader {

  implicit class OptionWithGetOrError[T](option: Option[T]) {
    def getOrError(errMsg: String): T = {


      option match {
        case Some( x ) => x
        case None => throw new Exception( errMsg )
      }
    }
  }

  def getPropertyValue[T](key: String, f: (String => T))(implicit properties: Map[String, String]) = {

    Try( f( properties.get( key ).get ) ).transform( Success( _ ), ex => Failure( new Exception( s"Failed to get value for key $key", ex ) ) ).get
  }

  def apply(props: Properties): ApplicationConfigReader = new ApplicationConfigReader() {

    implicit val properties = props.asScala.map {
      case (key, value) => (key, value.trim)
    }.toMap

    override def senderConfig: SenderConfig = new SenderConfig {

      val tps: Int = properties.getOrElse( "tps", "150" ).toInt

      val batchSize: Int = getPropertyValue( "batchSize", _.toInt )

      val noOfThreads: Int = getPropertyValue( "noOfThreads", _.toInt )

      import WebServiceType._

      val webServiceType: WebServiceType = {
        val serviceType = getPropertyValue( "webServiceType", _.toString )
        if (serviceType.equalsIgnoreCase( WebServiceType.SOAP.toString ))
          WebServiceType.SOAP
        else
          WebServiceType.REST
      }

    }

    override def dbConfig: DBConfig = new DBConfig {

      val passWord: String = getPropertyValue( "dbPassword", _.toString )

      val query: String = getPropertyValue( "query", _.toString )

      val userName: String = getPropertyValue( "dbUserName", _.toString )

      val dsUrl: String = getPropertyValue( "dsUrl", _.toString )
    }

    override def httpRequestData: HttpRequestInfo = HttpRequestInfo( senderConfig.webServiceType )

  }
}







