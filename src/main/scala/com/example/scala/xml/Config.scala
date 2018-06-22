package com.example.scala.xml

import javax.xml.bind.annotation.{XmlAccessType, XmlAccessorType, XmlAnyElement, XmlRootElement}

@XmlRootElement(name="config")
@XmlAccessorType(XmlAccessType.FIELD)
case class Config(  @XmlAnyElement(lax=true) val connectors :List[Iconnector]){
  def this() = this(List.empty[Iconnector])
}

