
package magento;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for giftcardAccountCreateGiftcardAccountData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="giftcardAccountCreateGiftcardAccountData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="date_expires" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="website_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="balance" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="is_redeemable" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "giftcardAccountCreateGiftcardAccountData", propOrder = {
    "status",
    "dateExpires",
    "websiteId",
    "balance",
    "state",
    "isRedeemable"
})
public class GiftcardAccountCreateGiftcardAccountData {

    @XmlElement(required = true)
    protected String status;
    @XmlElement(name = "date_expires")
    protected String dateExpires;
    @XmlElement(name = "website_id", required = true)
    protected String websiteId;
    @XmlElement(required = true)
    protected String balance;
    protected String state;
    @XmlElement(name = "is_redeemable", required = true)
    protected String isRedeemable;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the dateExpires property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateExpires() {
        return dateExpires;
    }

    /**
     * Sets the value of the dateExpires property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateExpires(String value) {
        this.dateExpires = value;
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
     * Gets the value of the balance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalance(String value) {
        this.balance = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the isRedeemable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsRedeemable() {
        return isRedeemable;
    }

    /**
     * Sets the value of the isRedeemable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsRedeemable(String value) {
        this.isRedeemable = value;
    }

}
