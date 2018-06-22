
package wesessionlogin;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FF_WS_evaluateWebSessionLogin_V12_CustomFieldsSet_SetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FF_WS_evaluateWebSessionLogin_V12_CustomFieldsSet_SetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customFieldsSet_InnerSet" type="{http://eh.actimize.com}ArrayOfFF_WS_evaluateWebSessionLogin_V12_CustomFieldsSet_InnerSet_TupleType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FF_WS_evaluateWebSessionLogin_V12_CustomFieldsSet_SetType", propOrder = {
    "customFieldsSetInnerSet"
})
public class FFWSEvaluateWebSessionLoginV12CustomFieldsSetSetType {

    @XmlElementRef(name = "customFieldsSet_InnerSet", namespace = "http://eh.actimize.com", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfFFWSEvaluateWebSessionLoginV12CustomFieldsSetInnerSetTupleType> customFieldsSetInnerSet;

    /**
     * Gets the value of the customFieldsSetInnerSet property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFFWSEvaluateWebSessionLoginV12CustomFieldsSetInnerSetTupleType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfFFWSEvaluateWebSessionLoginV12CustomFieldsSetInnerSetTupleType> getCustomFieldsSetInnerSet() {
        return customFieldsSetInnerSet;
    }

    /**
     * Sets the value of the customFieldsSetInnerSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFFWSEvaluateWebSessionLoginV12CustomFieldsSetInnerSetTupleType }{@code >}
     *     
     */
    public void setCustomFieldsSetInnerSet(JAXBElement<ArrayOfFFWSEvaluateWebSessionLoginV12CustomFieldsSetInnerSetTupleType> value) {
        this.customFieldsSetInnerSet = value;
    }

}
