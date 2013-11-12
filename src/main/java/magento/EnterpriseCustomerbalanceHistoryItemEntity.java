
package magento;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for enterpriseCustomerbalanceHistoryItemEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="enterpriseCustomerbalanceHistoryItemEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="history_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="balance_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="updated_at" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="balance_amount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="balance_delta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="additional_info" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="is_customer_notified" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customer_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="website_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="base_currency_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enterpriseCustomerbalanceHistoryItemEntity", propOrder = {
    "historyId",
    "balanceId",
    "updatedAt",
    "action",
    "balanceAmount",
    "balanceDelta",
    "additionalInfo",
    "isCustomerNotified",
    "customerId",
    "websiteId",
    "baseCurrencyCode"
})
public class EnterpriseCustomerbalanceHistoryItemEntity {

    @XmlElement(name = "history_id", required = true)
    protected String historyId;
    @XmlElement(name = "balance_id", required = true)
    protected String balanceId;
    @XmlElement(name = "updated_at", required = true)
    protected String updatedAt;
    @XmlElement(required = true)
    protected String action;
    @XmlElement(name = "balance_amount", required = true)
    protected String balanceAmount;
    @XmlElement(name = "balance_delta", required = true)
    protected String balanceDelta;
    @XmlElement(name = "additional_info", required = true)
    protected String additionalInfo;
    @XmlElement(name = "is_customer_notified", required = true)
    protected String isCustomerNotified;
    @XmlElement(name = "customer_id", required = true)
    protected String customerId;
    @XmlElement(name = "website_id", required = true)
    protected String websiteId;
    @XmlElement(name = "base_currency_code", required = true)
    protected String baseCurrencyCode;

    /**
     * Gets the value of the historyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHistoryId() {
        return historyId;
    }

    /**
     * Sets the value of the historyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHistoryId(String value) {
        this.historyId = value;
    }

    /**
     * Gets the value of the balanceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalanceId() {
        return balanceId;
    }

    /**
     * Sets the value of the balanceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalanceId(String value) {
        this.balanceId = value;
    }

    /**
     * Gets the value of the updatedAt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Sets the value of the updatedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdatedAt(String value) {
        this.updatedAt = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

    /**
     * Gets the value of the balanceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalanceAmount() {
        return balanceAmount;
    }

    /**
     * Sets the value of the balanceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalanceAmount(String value) {
        this.balanceAmount = value;
    }

    /**
     * Gets the value of the balanceDelta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalanceDelta() {
        return balanceDelta;
    }

    /**
     * Sets the value of the balanceDelta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalanceDelta(String value) {
        this.balanceDelta = value;
    }

    /**
     * Gets the value of the additionalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * Sets the value of the additionalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalInfo(String value) {
        this.additionalInfo = value;
    }

    /**
     * Gets the value of the isCustomerNotified property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsCustomerNotified() {
        return isCustomerNotified;
    }

    /**
     * Sets the value of the isCustomerNotified property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsCustomerNotified(String value) {
        this.isCustomerNotified = value;
    }

    /**
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerId(String value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the websiteId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebsiteId() {
        return websiteId;
    }

    /**
     * Sets the value of the websiteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebsiteId(String value) {
        this.websiteId = value;
    }

    /**
     * Gets the value of the baseCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseCurrencyCode() {
        return baseCurrencyCode;
    }

    /**
     * Sets the value of the baseCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseCurrencyCode(String value) {
        this.baseCurrencyCode = value;
    }

}
