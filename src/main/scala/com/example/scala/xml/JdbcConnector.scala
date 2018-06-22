package com.example.scala.xml

import javax.xml.bind.annotation.{XmlAccessType, XmlAccessorType, XmlAttribute, XmlRootElement}

@XmlRootElement(name="JdbcConnector")
@XmlAccessorType(XmlAccessType.FIELD)
class JdbcConnector(
                     @XmlAttribute(name="name")  private var name:String,
                     @XmlAttribute(name="type")  private var `type`:String,
                     @XmlAttribute(name="dataSourceUrl") private var  dsStr:String,
                     @XmlAttribute(name="userName") private var userName:String,
                     @XmlAttribute(name="password")  private var password:String="")  extends Iconnector{

  def this() = this("","","","","")
}
