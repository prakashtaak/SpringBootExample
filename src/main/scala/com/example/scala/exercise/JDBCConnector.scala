package com.example.scala.exercise

import java.sql.{Driver, DriverManager, PreparedStatement}
import java.util.Properties
import java.util.concurrent.BlockingQueue

import scala.collection.mutable._
import scala.io.Source.fromURL

object JDBCConnector {

 /* val propFile =fromURL(getClass.getResource("config.properties")).bufferedReader
  val prop =new Properties
  prop.load(propFile)
  val queryString =prop.getProperty("query")*/

  // JDBC driver name and database URL

  val DB_URL = "jdbc:oracle:thin:@ILPERFDATA:1521:orcl"

  //  Database credentials
  val USER = "FF_DATA"
  val PASS = "password"
   //STEP 2: Register JDBC driver
    Class.forName( "oracle.jdbc.driver.OracleDriver" )
    //STEP 3: Open a connection
    lazy val  conn = DriverManager.getConnection( DB_URL, USER, PASS )
    //STEP 4: Execute a query

   lazy val stmt = conn.createStatement
    val queryStr ="SELECT * FROM CHECK_INCLEARING_TRX_NEW where ROWNUM between ? and ?"


  def executeQuery(rowNumStart: Int,maxRecords:Int) : ListBuffer[Array[Object]]={


    val preparedStmt = conn.prepareStatement(queryStr)
    preparedStmt.setInt(1,rowNumStart)
    preparedStmt.setInt(2,maxRecords)
    val resultSet = preparedStmt.executeQuery()

    var resultArray = new ListBuffer[Array[Object]]()

    // Extract data from result set

    while ( {
      resultSet.next()
    }) { //Retrieve by column name
      resultArray += Array(
         resultSet.getString( "PARTITION_KEY" )

      )

    }

    resultArray
  }
  def getTotolRecordCount ={

  }

def closeConnection()={
  conn.close()
}
 /* def main(args: Array[String]): Unit = {


    try { //STEP 2: Register JDBC driver
      Class.forName( "oracle.jdbc.driver.OracleDriver" )
      //STEP 3: Open a connection
      System.out.println( "Connecting to database..." )
      var conn = getConnection( DB_URL, USER, PASS )
      //STEP 4: Execute a query
      System.out.println( "Creating statement..." )
      var stmt = conn.createStatement

      var sql = "SELECT * FROM CHECK_INCLEARING_TRX_NEW where ROWNUM between ? and ?"

      val rs = stmt.executeQuery( sql )
      //STEP 5: Extract data from result set
      while ( {
        rs.next()
      }) { //Retrieve by column name
        println(rs.getInt("PARTITION_KEY"))
      }
      //STEP 6: Clean-up environment
      rs.close()
      stmt.close
      conn.close
    } catch {
      case se: SQLException =>
        //Handle errors for JDBC
        se.printStackTrace()
      case e: Exception =>
        //Handle errors for Class.forName
        e.printStackTrace()
    }

  }*/
    //end main}
}

object MainApp{
  def main(args: Array[String]): Unit = {
    var sql = "SELECT * FROM CHECK_INCLEARING_TRX_NEW where ROWNUM between ? and ?"
    val obj=JDBCConnector
    for(i <- (0 to 10)) {
      val result = obj.executeQuery( 1, 10 )
      println(result.size)
    }
    obj.closeConnection()

  }
}