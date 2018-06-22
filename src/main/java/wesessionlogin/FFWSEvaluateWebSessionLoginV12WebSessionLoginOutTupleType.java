
package wesessionlogin;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FF_WS_evaluateWebSessionLogin_V12_WebSessionLoginOut_TupleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FF_WS_evaluateWebSessionLogin_V12_WebSessionLoginOut_TupleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actimizeAnalyticsScore" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="actimizeTransactionRiskScore" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="actionResultsSet" type="{http://eh.actimize.com}FF_WS_evaluateWebSessionLogin_V12_ActionResultsSet_SetType" minOccurs="0"/>
 *         &lt;element name="customFieldsSet" type="{http://eh.actimize.com}FF_WS_evaluateWebSessionLogin_V12_CustomFieldsSet_SetType" minOccurs="0"/>
 *         &lt;element name="isAlertGenerated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="responseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userAnalyticsScore" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FF_WS_evaluateWebSessionLogin_V12_WebSessionLoginOut_TupleType", propOrder = {
    "actimizeAnalyticsScore",
    "actimizeTransactionRiskScore",
    "actionResultsSet",
    "customFieldsSet",
    "isAlertGenerated",
    "responseCode",
    "transactionKey",
    "transactionType",
    "userAnalyticsScore"
})
public class FFWSEvaluateWebSessionLoginV12WebSessionLoginOutTupleType {

    @XmlElementRef(name = "actimizeAnalyticsScore", namespace = "http://eh.actimize.com", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> actimizeAnalyticsScore;
    @XmlElementRef(name = "actimizeTransactionRiskScore", namespace = "http://eh.actimize.com", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> actimizeTransactionRiskScore;
    @XmlElementRef(name = "actionResultsSet", namespace = "http://eh.actimize.com", type = JAXBElement.class, required = false)
    protected JAXBElement<FFWSEvaluateWebSessionLoginV12ActionResultsSetSetType> actionResultsSet;
    @XmlElementRef(name = "customFieldsSet", namespace = "http://eh.actimize.com", type = JAXBElement.class, required = false)
    protected JAXBElement<FFWSEvaluateWebSessionLoginV12CustomFieldsSetSetType> customFieldsSet;
    @XmlElementRef(name = "isAlertGenerated", namespace = "http://eh.actimize.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isAlertGenerated;
    @XmlElementRef(name = "responseCode", namespace = "http://eh.actimize.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> responseCode;
    @XmlElementRef(name = "transactionKey", namespace = "http://eh.actimize.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transactionKey;
    @XmlElementRef(name = "transactionType", namespace = "http://eh.actimize.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transactionType;
    @XmlElementRef(name = "userAnalyticsScore", namespace = "http://eh.actimize.com", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> userAnalyticsScore;

    /**
     * Gets the value of the actimizeAnalyticsScore property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getActimizeAnalyticsScore() {
        return actimizeAnalyticsScore;
    }

    /**
     * Sets the value of the actimizeAnalyticsScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setActimizeAnalyticsScore(JAXBElement<BigDecimal> value) {
        this.actimizeAnalyticsScore = value;
    }

    /**
     * Gets the value of the actimizeTransactionRiskScore property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getActimizeTransactionRiskScore() {
        return actimizeTransactionRiskScore;
    }

    /**
     * Sets the value of the actimizeTransactionRiskScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setActimizeTransactionRiskScore(JAXBElement<BigDecimal> value) {
        this.actimizeTransactionRiskScore = value;
    }

    /**
     * Gets the value of the actionResultsSet property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FFWSEvaluateWebSessionLoginV12ActionResultsSetSetType }{@code >}
     *     
     */
    public JAXBElement<FFWSEvaluateWebSessionLoginV12ActionResultsSetSetType> getActionResultsSet() {
        return actionResultsSet;
    }

    /**
     * Sets the value of the actionResultsSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FFWSEvaluateWebSessionLoginV12ActionResultsSetSetType }{@code >}
     *     
     */
    public void setActionResultsSet(JAXBElement<FFWSEvaluateWebSessionLoginV12ActionResultsSetSetType> value) {
        this.actionResultsSet = value;
    }

    /**
     * Gets the value of the customFieldsSet property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FFWSEvaluateWebSessionLoginV12CustomFieldsSetSetType }{@code >}
     *     
     */
    public JAXBElement<FFWSEvaluateWebSessionLoginV12CustomFieldsSetSetType> getCustomFieldsSet() {
        return customFieldsSet;
    }

    /**
     * Sets the value of the customFieldsSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FFWSEvaluateWebSessionLoginV12CustomFieldsSetSetType }{@code >}
     *     
     */
    public void setCustomFieldsSet(JAXBElement<FFWSEvaluateWebSessionLoginV12CustomFieldsSetSetType> value) {
        this.customFieldsSet = value;
    }

    /**
     * Gets the value of the isAlertGenerated property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsAlertGenerated() {
        return isAlertGenerated;
    }

    /**
     * Sets the value of the isAlertGenerated property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsAlertGenerated(JAXBElement<Boolean> value) {
        this.isAlertGenerated = value;
    }

    /**
     * Gets the value of the responseCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResponseCode() {
        return responseCode;
    }

    /**
     * Sets the value of the responseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResponseCode(JAXBElement<String> value) {
        this.responseCode = value;
    }

    /**
     * Gets the value of the transactionKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransactionKey() {
        return transactionKey;
    }

    /**
     * Sets the value of the transactionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransactionKey(JAXBElement<String> value) {
        this.transactionKey = value;
    }

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransactionType(JAXBElement<String> value) {
        this.transactionType = value;
    }

    /**
     * Gets the value of the userAnalyticsScore property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getUserAnalyticsScore() {
        return userAnalyticsScore;
    }

    /**
     * Sets the value of the userAnalyticsScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setUserAnalyticsScore(JAXBElement<BigDecimal> value) {
        this.userAnalyticsScore = value;
    }

}
