
package wesessionlogin;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FF_WS_evaluateDeposit_V7_ActionResultsSet_SetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FF_WS_evaluateDeposit_V7_ActionResultsSet_SetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actionResultsSet_InnerSet" type="{http://eh.actimize.com}ArrayOfFF_WS_evaluateDeposit_V7_ActionResultsSet_InnerSet_TupleType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FF_WS_evaluateDeposit_V7_ActionResultsSet_SetType", propOrder = {
    "actionResultsSetInnerSet"
})
public class FFWSEvaluateDepositV7ActionResultsSetSetType {

    @XmlElementRef(name = "actionResultsSet_InnerSet", namespace = "http://eh.actimize.com", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfFFWSEvaluateDepositV7ActionResultsSetInnerSetTupleType> actionResultsSetInnerSet;

    /**
     * Gets the value of the actionResultsSetInnerSet property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFFWSEvaluateDepositV7ActionResultsSetInnerSetTupleType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfFFWSEvaluateDepositV7ActionResultsSetInnerSetTupleType> getActionResultsSetInnerSet() {
        return actionResultsSetInnerSet;
    }

    /**
     * Sets the value of the actionResultsSetInnerSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFFWSEvaluateDepositV7ActionResultsSetInnerSetTupleType }{@code >}
     *     
     */
    public void setActionResultsSetInnerSet(JAXBElement<ArrayOfFFWSEvaluateDepositV7ActionResultsSetInnerSetTupleType> value) {
        this.actionResultsSetInnerSet = value;
    }

}
