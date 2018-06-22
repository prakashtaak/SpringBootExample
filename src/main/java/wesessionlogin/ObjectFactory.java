
package wesessionlogin;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wsclient package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FFWSEvaluateDepositV7ActionResultsSetSetTypeActionResultsSetInnerSet_QNAME = new QName("http://eh.actimize.com", "actionResultsSet_InnerSet");
    private final static QName _FFWSEvaluateDepositV7ActionResultsSetInnerSetTupleTypeName_QNAME = new QName("http://eh.actimize.com", "name");
    private final static QName _FFWSEvaluateDepositV7ActionResultsSetInnerSetTupleTypeValue_QNAME = new QName("http://eh.actimize.com", "value");
    private final static QName _FFWSEvaluateWebSessionLoginV12CustomFieldsSetSetTypeCustomFieldsSetInnerSet_QNAME = new QName("http://eh.actimize.com", "customFieldsSet_InnerSet");
    private final static QName _FFWSEvaluateWebSessionLoginV12WebSessionLoginOutTupleTypeActimizeAnalyticsScore_QNAME = new QName("http://eh.actimize.com", "actimizeAnalyticsScore");
    private final static QName _FFWSEvaluateWebSessionLoginV12WebSessionLoginOutTupleTypeIsAlertGenerated_QNAME = new QName("http://eh.actimize.com", "isAlertGenerated");
    private final static QName _FFWSEvaluateWebSessionLoginV12WebSessionLoginOutTupleTypeTransactionType_QNAME = new QName("http://eh.actimize.com", "transactionType");
    private final static QName _FFWSEvaluateWebSessionLoginV12WebSessionLoginOutTupleTypeCustomFieldsSet_QNAME = new QName("http://eh.actimize.com", "customFieldsSet");
    private final static QName _FFWSEvaluateWebSessionLoginV12WebSessionLoginOutTupleTypeActionResultsSet_QNAME = new QName("http://eh.actimize.com", "actionResultsSet");
    private final static QName _FFWSEvaluateWebSessionLoginV12WebSessionLoginOutTupleTypeActimizeTransactionRiskScore_QNAME = new QName("http://eh.actimize.com", "actimizeTransactionRiskScore");
    private final static QName _FFWSEvaluateWebSessionLoginV12WebSessionLoginOutTupleTypeUserAnalyticsScore_QNAME = new QName("http://eh.actimize.com", "userAnalyticsScore");
    private final static QName _FFWSEvaluateWebSessionLoginV12WebSessionLoginOutTupleTypeTransactionKey_QNAME = new QName("http://eh.actimize.com", "transactionKey");
    private final static QName _FFWSEvaluateWebSessionLoginV12WebSessionLoginOutTupleTypeResponseCode_QNAME = new QName("http://eh.actimize.com", "responseCode");
    private final static QName _EHResultReturnCode_QNAME = new QName("http://eh.actimize.com", "returnCode");
    private final static QName _EHResultAdditionalData_QNAME = new QName("http://eh.actimize.com", "additionalData");
    private final static QName _EHResultMessage_QNAME = new QName("http://eh.actimize.com", "message");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wsclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EHResult }
     * 
     */
    public EHResult createEHResult() {
        return new EHResult();
    }

    /**
     * Create an instance of {@link FFWSEvaluateWebSessionLoginV12ActionResultsSetInnerSetTupleType }
     * 
     */
    public FFWSEvaluateWebSessionLoginV12ActionResultsSetInnerSetTupleType createFFWSEvaluateWebSessionLoginV12ActionResultsSetInnerSetTupleType() {
        return new FFWSEvaluateWebSessionLoginV12ActionResultsSetInnerSetTupleType();
    }

    /**
     * Create an instance of {@link FFWSEvaluateDepositV7DepositOutTupleType }
     * 
     */
    public FFWSEvaluateDepositV7DepositOutTupleType createFFWSEvaluateDepositV7DepositOutTupleType() {
        return new FFWSEvaluateDepositV7DepositOutTupleType();
    }

    /**
     * Create an instance of {@link FFWSEvaluateDepositV7CustomFieldsSetSetType }
     * 
     */
    public FFWSEvaluateDepositV7CustomFieldsSetSetType createFFWSEvaluateDepositV7CustomFieldsSetSetType() {
        return new FFWSEvaluateDepositV7CustomFieldsSetSetType();
    }

    /**
     * Create an instance of {@link FFWSEvaluateDepositV7ActionResultsSetSetType }
     * 
     */
    public FFWSEvaluateDepositV7ActionResultsSetSetType createFFWSEvaluateDepositV7ActionResultsSetSetType() {
        return new FFWSEvaluateDepositV7ActionResultsSetSetType();
    }

    /**
     * Create an instance of {@link ArrayOfFFWSEvaluateDepositV7ActionResultsSetInnerSetTupleType }
     * 
     */
    public ArrayOfFFWSEvaluateDepositV7ActionResultsSetInnerSetTupleType createArrayOfFFWSEvaluateDepositV7ActionResultsSetInnerSetTupleType() {
        return new ArrayOfFFWSEvaluateDepositV7ActionResultsSetInnerSetTupleType();
    }

    /**
     * Create an instance of {@link ArrayOfFFWSEvaluateDepositV7CustomFieldsSetInnerSetTupleType }
     * 
     */
    public ArrayOfFFWSEvaluateDepositV7CustomFieldsSetInnerSetTupleType createArrayOfFFWSEvaluateDepositV7CustomFieldsSetInnerSetTupleType() {
        return new ArrayOfFFWSEvaluateDepositV7CustomFieldsSetInnerSetTupleType();
    }

    /**
     * Create an instance of {@link ArrayOfFFWSEvaluateWebSessionLoginV12CustomFieldsSetInnerSetTupleType }
     * 
     */
    public ArrayOfFFWSEvaluateWebSessionLoginV12CustomFieldsSetInnerSetTupleType createArrayOfFFWSEvaluateWebSessionLoginV12CustomFieldsSetInnerSetTupleType() {
        return new ArrayOfFFWSEvaluateWebSessionLoginV12CustomFieldsSetInnerSetTupleType();
    }

    /**
     * Create an instance of {@link FFWSEvaluateWebSessionLoginV12ActionResultsSetSetType }
     * 
     */
    public FFWSEvaluateWebSessionLoginV12ActionResultsSetSetType createFFWSEvaluateWebSessionLoginV12ActionResultsSetSetType() {
        return new FFWSEvaluateWebSessionLoginV12ActionResultsSetSetType();
    }

    /**
     * Create an instance of {@link FFWSEvaluateWebSessionLoginV12WebSessionLoginOutTupleType }
     * 
     */
    public FFWSEvaluateWebSessionLoginV12WebSessionLoginOutTupleType createFFWSEvaluateWebSessionLoginV12WebSessionLoginOutTupleType() {
        return new FFWSEvaluateWebSessionLoginV12WebSessionLoginOutTupleType();
    }

    /**
     * Create an instance of {@link FFWSEvaluateWebSessionLoginV12CustomFieldsSetInnerSetTupleType }
     * 
     */
    public FFWSEvaluateWebSessionLoginV12CustomFieldsSetInnerSetTupleType createFFWSEvaluateWebSessionLoginV12CustomFieldsSetInnerSetTupleType() {
        return new FFWSEvaluateWebSessionLoginV12CustomFieldsSetInnerSetTupleType();
    }

    /**
     * Create an instance of {@link FFWSEvaluateDepositV7CustomFieldsSetInnerSetTupleType }
     * 
     */
    public FFWSEvaluateDepositV7CustomFieldsSetInnerSetTupleType createFFWSEvaluateDepositV7CustomFieldsSetInnerSetTupleType() {
        return new FFWSEvaluateDepositV7CustomFieldsSetInnerSetTupleType();
    }

    /**
     * Create an instance of {@link FFWSEvaluateDepositV7ActionResultsSetInnerSetTupleType }
     * 
     */
    public FFWSEvaluateDepositV7ActionResultsSetInnerSetTupleType createFFWSEvaluateDepositV7ActionResultsSetInnerSetTupleType() {
        return new FFWSEvaluateDepositV7ActionResultsSetInnerSetTupleType();
    }

    /**
     * Create an instance of {@link ArrayOfFFWSEvaluateWebSessionLoginV12ActionResultsSetInnerSetTupleType }
     * 
     */
    public ArrayOfFFWSEvaluateWebSessionLoginV12ActionResultsSetInnerSetTupleType createArrayOfFFWSEvaluateWebSessionLoginV12ActionResultsSetInnerSetTupleType() {
        return new ArrayOfFFWSEvaluateWebSessionLoginV12ActionResultsSetInnerSetTupleType();
    }

    /**
     * Create an instance of {@link FFWSEvaluateWebSessionLoginV12CustomFieldsSetSetType }
     * 
     */
    public FFWSEvaluateWebSessionLoginV12CustomFieldsSetSetType createFFWSEvaluateWebSessionLoginV12CustomFieldsSetSetType() {
        return new FFWSEvaluateWebSessionLoginV12CustomFieldsSetSetType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFFWSEvaluateDepositV7ActionResultsSetInnerSetTupleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eh.actimize.com", name = "actionResultsSet_InnerSet", scope = FFWSEvaluateDepositV7ActionResultsSetSetType.class)
    public JAXBElement<ArrayOfFFWSEvaluateDepositV7ActionResultsSetInnerSetTupleType> createFFWSEvaluateDepositV7ActionResultsSetSetTypeActionResultsSetInnerSet(ArrayOfFFWSEvaluateDepositV7ActionResultsSetInnerSetTupleType value) {
        return new JAXBElement<ArrayOfFFWSEvaluateDepositV7ActionResultsSetInnerSetTupleType>(_FFWSEvaluateDepositV7ActionResultsSetSetTypeActionResultsSetInnerSet_QNAME, ArrayOfFFWSEvaluateDepositV7ActionResultsSetInnerSetTupleType.class, FFWSEvaluateDepositV7ActionResultsSetSetType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eh.actimize.com", name = "name", scope = FFWSEvaluateDepositV7ActionResultsSetInnerSetTupleType.class)
    public JAXBElement<String> createFFWSEvaluateDepositV7ActionResultsSetInnerSetTupleTypeName(String value) {
        return new JAXBElement<String>(_FFWSEvaluateDepositV7ActionResultsSetInnerSetTupleTypeName_QNAME, String.class, FFWSEvaluateDepositV7ActionResultsSetInnerSetTupleType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eh.actimize.com", name = "value", scope = FFWSEvaluateDepositV7ActionResultsSetInnerSetTupleType.class)
    public JAXBElement<String> createFFWSEvaluateDepositV7ActionResultsSetInnerSetTupleTypeValue(String value) {
        return new JAXBElement<String>(_FFWSEvaluateDepositV7ActionResultsSetInnerSetTupleTypeValue_QNAME, String.class, FFWSEvaluateDepositV7ActionResultsSetInnerSetTupleType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eh.actimize.com", name = "name", scope = FFWSEvaluateDepositV7CustomFieldsSetInnerSetTupleType.class)
    public JAXBElement<String> createFFWSEvaluateDepositV7CustomFieldsSetInnerSetTupleTypeName(String value) {
        return new JAXBElement<String>(_FFWSEvaluateDepositV7ActionResultsSetInnerSetTupleTypeName_QNAME, String.class, FFWSEvaluateDepositV7CustomFieldsSetInnerSetTupleType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eh.actimize.com", name = "value", scope = FFWSEvaluateDepositV7CustomFieldsSetInnerSetTupleType.class)
    public JAXBElement<String> createFFWSEvaluateDepositV7CustomFieldsSetInnerSetTupleTypeValue(String value) {
        return new JAXBElement<String>(_FFWSEvaluateDepositV7ActionResultsSetInnerSetTupleTypeValue_QNAME, String.class, FFWSEvaluateDepositV7CustomFieldsSetInnerSetTupleType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFFWSEvaluateWebSessionLoginV12CustomFieldsSetInnerSetTupleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eh.actimize.com", name = "customFieldsSet_InnerSet", scope = FFWSEvaluateWebSessionLoginV12CustomFieldsSetSetType.class)
    public JAXBElement<ArrayOfFFWSEvaluateWebSessionLoginV12CustomFieldsSetInnerSetTupleType> createFFWSEvaluateWebSessionLoginV12CustomFieldsSetSetTypeCustomFieldsSetInnerSet(ArrayOfFFWSEvaluateWebSessionLoginV12CustomFieldsSetInnerSetTupleType value) {
        return new JAXBElement<ArrayOfFFWSEvaluateWebSessionLoginV12CustomFieldsSetInnerSetTupleType>(_FFWSEvaluateWebSessionLoginV12CustomFieldsSetSetTypeCustomFieldsSetInnerSet_QNAME, ArrayOfFFWSEvaluateWebSessionLoginV12CustomFieldsSetInnerSetTupleType.class, FFWSEvaluateWebSessionLoginV12CustomFieldsSetSetType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eh.actimize.com", name = "name", scope = FFWSEvaluateWebSessionLoginV12CustomFieldsSetInnerSetTupleType.class)
    public JAXBElement<String> createFFWSEvaluateWebSessionLoginV12CustomFieldsSetInnerSetTupleTypeName(String value) {
        return new JAXBElement<String>(_FFWSEvaluateDepositV7ActionResultsSetInnerSetTupleTypeName_QNAME, String.class, FFWSEvaluateWebSessionLoginV12CustomFieldsSetInnerSetTupleType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eh.actimize.com", name = "value", scope = FFWSEvaluateWebSessionLoginV12CustomFieldsSetInnerSetTupleType.class)
    public JAXBElement<String> createFFWSEvaluateWebSessionLoginV12CustomFieldsSetInnerSetTupleTypeValue(String value) {
        return new JAXBElement<String>(_FFWSEvaluateDepositV7ActionResultsSetInnerSetTupleTypeValue_QNAME, String.class, FFWSEvaluateWebSessionLoginV12CustomFieldsSetInnerSetTupleType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFFWSEvaluateDepositV7CustomFieldsSetInnerSetTupleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eh.actimize.com", name = "customFieldsSet_InnerSet", scope = FFWSEvaluateDepositV7CustomFieldsSetSetType.class)
    public JAXBElement<ArrayOfFFWSEvaluateDepositV7CustomFieldsSetInnerSetTupleType> createFFWSEvaluateDepositV7CustomFieldsSetSetTypeCustomFieldsSetInnerSet(ArrayOfFFWSEvaluateDepositV7CustomFieldsSetInnerSetTupleType value) {
        return new JAXBElement<ArrayOfFFWSEvaluateDepositV7CustomFieldsSetInnerSetTupleType>(_FFWSEvaluateWebSessionLoginV12CustomFieldsSetSetTypeCustomFieldsSetInnerSet_QNAME, ArrayOfFFWSEvaluateDepositV7CustomFieldsSetInnerSetTupleType.class, FFWSEvaluateDepositV7CustomFieldsSetSetType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFFWSEvaluateWebSessionLoginV12ActionResultsSetInnerSetTupleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eh.actimize.com", name = "actionResultsSet_InnerSet", scope = FFWSEvaluateWebSessionLoginV12ActionResultsSetSetType.class)
    public JAXBElement<ArrayOfFFWSEvaluateWebSessionLoginV12ActionResultsSetInnerSetTupleType> createFFWSEvaluateWebSessionLoginV12ActionResultsSetSetTypeActionResultsSetInnerSet(ArrayOfFFWSEvaluateWebSessionLoginV12ActionResultsSetInnerSetTupleType value) {
        return new JAXBElement<ArrayOfFFWSEvaluateWebSessionLoginV12ActionResultsSetInnerSetTupleType>(_FFWSEvaluateDepositV7ActionResultsSetSetTypeActionResultsSetInnerSet_QNAME, ArrayOfFFWSEvaluateWebSessionLoginV12ActionResultsSetInnerSetTupleType.class, FFWSEvaluateWebSessionLoginV12ActionResultsSetSetType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eh.actimize.com", name = "name", scope = FFWSEvaluateWebSessionLoginV12ActionResultsSetInnerSetTupleType.class)
    public JAXBElement<String> createFFWSEvaluateWebSessionLoginV12ActionResultsSetInnerSetTupleTypeName(String value) {
        return new JAXBElement<String>(_FFWSEvaluateDepositV7ActionResultsSetInnerSetTupleTypeName_QNAME, String.class, FFWSEvaluateWebSessionLoginV12ActionResultsSetInnerSetTupleType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eh.actimize.com", name = "value", scope = FFWSEvaluateWebSessionLoginV12ActionResultsSetInnerSetTupleType.class)
    public JAXBElement<String> createFFWSEvaluateWebSessionLoginV12ActionResultsSetInnerSetTupleTypeValue(String value) {
        return new JAXBElement<String>(_FFWSEvaluateDepositV7ActionResultsSetInnerSetTupleTypeValue_QNAME, String.class, FFWSEvaluateWebSessionLoginV12ActionResultsSetInnerSetTupleType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eh.actimize.com", name = "actimizeAnalyticsScore", scope = FFWSEvaluateWebSessionLoginV12WebSessionLoginOutTupleType.class)
    public JAXBElement<BigDecimal> createFFWSEvaluateWebSessionLoginV12WebSessionLoginOutTupleTypeActimizeAnalyticsScore(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_FFWSEvaluateWebSessionLoginV12WebSessionLoginOutTupleTypeActimizeAnalyticsScore_QNAME, BigDecimal.class, FFWSEvaluateWebSessionLoginV12WebSessionLoginOutTupleType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eh.actimize.com", name = "isAlertGenerated", scope = FFWSEvaluateWebSessionLoginV12WebSessionLoginOutTupleType.class)
    public JAXBElement<Boolean> createFFWSEvaluateWebSessionLoginV12WebSessionLoginOutTupleTypeIsAlertGenerated(Boolean value) {
        return new JAXBElement<Boolean>(_FFWSEvaluateWebSessionLoginV12WebSessionLoginOutTupleTypeIsAlertGenerated_QNAME, Boolean.class, FFWSEvaluateWebSessionLoginV12WebSessionLoginOutTupleType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eh.actimize.com", name = "transactionType", scope = FFWSEvaluateWebSessionLoginV12WebSessionLoginOutTupleType.class)
    public JAXBElement<String> createFFWSEvaluateWebSessionLoginV12WebSessionLoginOutTupleTypeTransactionType(String value) {
        return new JAXBElement<String>(_FFWSEvaluateWebSessionLoginV12WebSessionLoginOutTupleTypeTransactionType_QNAME, String.class, FFWSEvaluateWebSessionLoginV12WebSessionLoginOutTupleType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FFWSEvaluateWebSessionLoginV12CustomFieldsSetSetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eh.actimize.com", name = "customFieldsSet", scope = FFWSEvaluateWebSessionLoginV12WebSessionLoginOutTupleType.class)
    public JAXBElement<FFWSEvaluateWebSessionLoginV12CustomFieldsSetSetType> createFFWSEvaluateWebSessionLoginV12WebSessionLoginOutTupleTypeCustomFieldsSet(FFWSEvaluateWebSessionLoginV12CustomFieldsSetSetType value) {
        return new JAXBElement<FFWSEvaluateWebSessionLoginV12CustomFieldsSetSetType>(_FFWSEvaluateWebSessionLoginV12WebSessionLoginOutTupleTypeCustomFieldsSet_QNAME, FFWSEvaluateWebSessionLoginV12CustomFieldsSetSetType.class, FFWSEvaluateWebSessionLoginV12WebSessionLoginOutTupleType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FFWSEvaluateWebSessionLoginV12ActionResultsSetSetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eh.actimize.com", name = "actionResultsSet", scope = FFWSEvaluateWebSessionLoginV12WebSessionLoginOutTupleType.class)
    public JAXBElement<FFWSEvaluateWebSessionLoginV12ActionResultsSetSetType> createFFWSEvaluateWebSessionLoginV12WebSessionLoginOutTupleTypeActionResultsSet(FFWSEvaluateWebSessionLoginV12ActionResultsSetSetType value) {
        return new JAXBElement<FFWSEvaluateWebSessionLoginV12ActionResultsSetSetType>(_FFWSEvaluateWebSessionLoginV12WebSessionLoginOutTupleTypeActionResultsSet_QNAME, FFWSEvaluateWebSessionLoginV12ActionResultsSetSetType.class, FFWSEvaluateWebSessionLoginV12WebSessionLoginOutTupleType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eh.actimize.com", name = "actimizeTransactionRiskScore", scope = FFWSEvaluateWebSessionLoginV12WebSessionLoginOutTupleType.class)
    public JAXBElement<BigDecimal> createFFWSEvaluateWebSessionLoginV12WebSessionLoginOutTupleTypeActimizeTransactionRiskScore(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_FFWSEvaluateWebSessionLoginV12WebSessionLoginOutTupleTypeActimizeTransactionRiskScore_QNAME, BigDecimal.class, FFWSEvaluateWebSessionLoginV12WebSessionLoginOutTupleType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eh.actimize.com", name = "userAnalyticsScore", scope = FFWSEvaluateWebSessionLoginV12WebSessionLoginOutTupleType.class)
    public JAXBElement<BigDecimal> createFFWSEvaluateWebSessionLoginV12WebSessionLoginOutTupleTypeUserAnalyticsScore(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_FFWSEvaluateWebSessionLoginV12WebSessionLoginOutTupleTypeUserAnalyticsScore_QNAME, BigDecimal.class, FFWSEvaluateWebSessionLoginV12WebSessionLoginOutTupleType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eh.actimize.com", name = "transactionKey", scope = FFWSEvaluateWebSessionLoginV12WebSessionLoginOutTupleType.class)
    public JAXBElement<String> createFFWSEvaluateWebSessionLoginV12WebSessionLoginOutTupleTypeTransactionKey(String value) {
        return new JAXBElement<String>(_FFWSEvaluateWebSessionLoginV12WebSessionLoginOutTupleTypeTransactionKey_QNAME, String.class, FFWSEvaluateWebSessionLoginV12WebSessionLoginOutTupleType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eh.actimize.com", name = "responseCode", scope = FFWSEvaluateWebSessionLoginV12WebSessionLoginOutTupleType.class)
    public JAXBElement<String> createFFWSEvaluateWebSessionLoginV12WebSessionLoginOutTupleTypeResponseCode(String value) {
        return new JAXBElement<String>(_FFWSEvaluateWebSessionLoginV12WebSessionLoginOutTupleTypeResponseCode_QNAME, String.class, FFWSEvaluateWebSessionLoginV12WebSessionLoginOutTupleType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eh.actimize.com", name = "returnCode", scope = EHResult.class)
    public JAXBElement<Integer> createEHResultReturnCode(Integer value) {
        return new JAXBElement<Integer>(_EHResultReturnCode_QNAME, Integer.class, EHResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eh.actimize.com", name = "additionalData", scope = EHResult.class)
    public JAXBElement<String> createEHResultAdditionalData(String value) {
        return new JAXBElement<String>(_EHResultAdditionalData_QNAME, String.class, EHResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eh.actimize.com", name = "message", scope = EHResult.class)
    public JAXBElement<String> createEHResultMessage(String value) {
        return new JAXBElement<String>(_EHResultMessage_QNAME, String.class, EHResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eh.actimize.com", name = "actimizeAnalyticsScore", scope = FFWSEvaluateDepositV7DepositOutTupleType.class)
    public JAXBElement<BigDecimal> createFFWSEvaluateDepositV7DepositOutTupleTypeActimizeAnalyticsScore(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_FFWSEvaluateWebSessionLoginV12WebSessionLoginOutTupleTypeActimizeAnalyticsScore_QNAME, BigDecimal.class, FFWSEvaluateDepositV7DepositOutTupleType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eh.actimize.com", name = "isAlertGenerated", scope = FFWSEvaluateDepositV7DepositOutTupleType.class)
    public JAXBElement<Boolean> createFFWSEvaluateDepositV7DepositOutTupleTypeIsAlertGenerated(Boolean value) {
        return new JAXBElement<Boolean>(_FFWSEvaluateWebSessionLoginV12WebSessionLoginOutTupleTypeIsAlertGenerated_QNAME, Boolean.class, FFWSEvaluateDepositV7DepositOutTupleType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eh.actimize.com", name = "transactionType", scope = FFWSEvaluateDepositV7DepositOutTupleType.class)
    public JAXBElement<String> createFFWSEvaluateDepositV7DepositOutTupleTypeTransactionType(String value) {
        return new JAXBElement<String>(_FFWSEvaluateWebSessionLoginV12WebSessionLoginOutTupleTypeTransactionType_QNAME, String.class, FFWSEvaluateDepositV7DepositOutTupleType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FFWSEvaluateDepositV7CustomFieldsSetSetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eh.actimize.com", name = "customFieldsSet", scope = FFWSEvaluateDepositV7DepositOutTupleType.class)
    public JAXBElement<FFWSEvaluateDepositV7CustomFieldsSetSetType> createFFWSEvaluateDepositV7DepositOutTupleTypeCustomFieldsSet(FFWSEvaluateDepositV7CustomFieldsSetSetType value) {
        return new JAXBElement<FFWSEvaluateDepositV7CustomFieldsSetSetType>(_FFWSEvaluateWebSessionLoginV12WebSessionLoginOutTupleTypeCustomFieldsSet_QNAME, FFWSEvaluateDepositV7CustomFieldsSetSetType.class, FFWSEvaluateDepositV7DepositOutTupleType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FFWSEvaluateDepositV7ActionResultsSetSetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eh.actimize.com", name = "actionResultsSet", scope = FFWSEvaluateDepositV7DepositOutTupleType.class)
    public JAXBElement<FFWSEvaluateDepositV7ActionResultsSetSetType> createFFWSEvaluateDepositV7DepositOutTupleTypeActionResultsSet(FFWSEvaluateDepositV7ActionResultsSetSetType value) {
        return new JAXBElement<FFWSEvaluateDepositV7ActionResultsSetSetType>(_FFWSEvaluateWebSessionLoginV12WebSessionLoginOutTupleTypeActionResultsSet_QNAME, FFWSEvaluateDepositV7ActionResultsSetSetType.class, FFWSEvaluateDepositV7DepositOutTupleType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eh.actimize.com", name = "actimizeTransactionRiskScore", scope = FFWSEvaluateDepositV7DepositOutTupleType.class)
    public JAXBElement<BigDecimal> createFFWSEvaluateDepositV7DepositOutTupleTypeActimizeTransactionRiskScore(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_FFWSEvaluateWebSessionLoginV12WebSessionLoginOutTupleTypeActimizeTransactionRiskScore_QNAME, BigDecimal.class, FFWSEvaluateDepositV7DepositOutTupleType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eh.actimize.com", name = "userAnalyticsScore", scope = FFWSEvaluateDepositV7DepositOutTupleType.class)
    public JAXBElement<BigDecimal> createFFWSEvaluateDepositV7DepositOutTupleTypeUserAnalyticsScore(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_FFWSEvaluateWebSessionLoginV12WebSessionLoginOutTupleTypeUserAnalyticsScore_QNAME, BigDecimal.class, FFWSEvaluateDepositV7DepositOutTupleType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eh.actimize.com", name = "transactionKey", scope = FFWSEvaluateDepositV7DepositOutTupleType.class)
    public JAXBElement<String> createFFWSEvaluateDepositV7DepositOutTupleTypeTransactionKey(String value) {
        return new JAXBElement<String>(_FFWSEvaluateWebSessionLoginV12WebSessionLoginOutTupleTypeTransactionKey_QNAME, String.class, FFWSEvaluateDepositV7DepositOutTupleType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eh.actimize.com", name = "responseCode", scope = FFWSEvaluateDepositV7DepositOutTupleType.class)
    public JAXBElement<String> createFFWSEvaluateDepositV7DepositOutTupleTypeResponseCode(String value) {
        return new JAXBElement<String>(_FFWSEvaluateWebSessionLoginV12WebSessionLoginOutTupleTypeResponseCode_QNAME, String.class, FFWSEvaluateDepositV7DepositOutTupleType.class, value);
    }

}
