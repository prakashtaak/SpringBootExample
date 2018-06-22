package com.example.scala.xml

import javax.xml.bind.annotation.{XmlAccessType, XmlAccessorType, XmlAttribute, XmlRootElement}

@XmlRootElement(name="CassandraConnector")
@XmlAccessorType(XmlAccessType.FIELD)
class CassandraConnector(
                          @XmlAttribute(name="name")  private var name:String,
                          @XmlAttribute(name="type")  private var `type`:String,
                          @XmlAttribute(name="dataSourceUrl") private var  dsStr:String
                        )  extends Iconnector{

  def this() = this("","","")
}
