
package wesessionlogin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfFF_WS_evaluateDeposit_V7_ActionResultsSet_InnerSet_TupleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFF_WS_evaluateDeposit_V7_ActionResultsSet_InnerSet_TupleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FF_WS_evaluateDeposit_V7_ActionResultsSet_InnerSet_TupleType" type="{http://eh.actimize.com}FF_WS_evaluateDeposit_V7_ActionResultsSet_InnerSet_TupleType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFF_WS_evaluateDeposit_V7_ActionResultsSet_InnerSet_TupleType", propOrder = {
    "ffwsEvaluateDepositV7ActionResultsSetInnerSetTupleType"
})
public class ArrayOfFFWSEvaluateDepositV7ActionResultsSetInnerSetTupleType {

    @XmlElement(name = "FF_WS_evaluateDeposit_V7_ActionResultsSet_InnerSet_TupleType", nillable = true)
    protected List<FFWSEvaluateDepositV7ActionResultsSetInnerSetTupleType> ffwsEvaluateDepositV7ActionResultsSetInnerSetTupleType;

    /**
     * Gets the value of the ffwsEvaluateDepositV7ActionResultsSetInnerSetTupleType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ffwsEvaluateDepositV7ActionResultsSetInnerSetTupleType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFFWSEvaluateDepositV7ActionResultsSetInnerSetTupleType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FFWSEvaluateDepositV7ActionResultsSetInnerSetTupleType }
     * 
     * 
     */
    public List<FFWSEvaluateDepositV7ActionResultsSetInnerSetTupleType> getFFWSEvaluateDepositV7ActionResultsSetInnerSetTupleType() {
        if (ffwsEvaluateDepositV7ActionResultsSetInnerSetTupleType == null) {
            ffwsEvaluateDepositV7ActionResultsSetInnerSetTupleType = new ArrayList<FFWSEvaluateDepositV7ActionResultsSetInnerSetTupleType>();
        }
        return this.ffwsEvaluateDepositV7ActionResultsSetInnerSetTupleType;
    }

}
