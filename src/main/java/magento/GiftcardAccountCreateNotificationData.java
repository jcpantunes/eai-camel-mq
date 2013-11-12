
package magento;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for giftcardAccountCreateNotificationData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="giftcardAccountCreateNotificationData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="recipient_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="recipient_email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="recipient_store" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "giftcardAccountCreateNotificationData", propOrder = {
    "recipientName",
    "recipientEmail",
    "recipientStore"
})
public class GiftcardAccountCreateNotificationData {

    @XmlElement(name = "recipient_name", required = true)
    protected String recipientName;
    @XmlElement(name = "recipient_email", required = true)
    protected String recipientEmail;
    @XmlElement(name = "recipient_store")
    protected String recipientStore;

    /**
     * Gets the value of the recipientName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientName() {
        return recipientName;
    }

    /**
     * Sets the value of the recipientName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientName(String value) {
        this.recipientName = value;
    }

    /**
     * Gets the value of the recipientEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientEmail() {
        return recipientEmail;
    }

    /**
     * Sets the value of the recipientEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientEmail(String value) {
        this.recipientEmail = value;
    }

    /**
     * Gets the value of the recipientStore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientStore() {
        return recipientStore;
    }

    /**
     * Sets the value of the recipientStore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientStore(String value) {
        this.recipientStore = value;
    }

}
