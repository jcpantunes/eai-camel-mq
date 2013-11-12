
package magento;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="giftcardAccountData" type="{urn:Magento}giftcardAccountCreateGiftcardAccountData"/>
 *         &lt;element name="notificationData" type="{urn:Magento}giftcardAccountCreateNotificationData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sessionId",
    "giftcardAccountData",
    "notificationData"
})
@XmlRootElement(name = "giftcardAccountCreateRequestParam")
public class GiftcardAccountCreateRequestParam {

    @XmlElement(required = true)
    protected String sessionId;
    @XmlElement(required = true)
    protected GiftcardAccountCreateGiftcardAccountData giftcardAccountData;
    protected GiftcardAccountCreateNotificationData notificationData;

    /**
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * Gets the value of the giftcardAccountData property.
     * 
     * @return
     *     possible object is
     *     {@link GiftcardAccountCreateGiftcardAccountData }
     *     
     */
    public GiftcardAccountCreateGiftcardAccountData getGiftcardAccountData() {
        return giftcardAccountData;
    }

    /**
     * Sets the value of the giftcardAccountData property.
     * 
     * @param value
     *     allowed object is
     *     {@link GiftcardAccountCreateGiftcardAccountData }
     *     
     */
    public void setGiftcardAccountData(GiftcardAccountCreateGiftcardAccountData value) {
        this.giftcardAccountData = value;
    }

    /**
     * Gets the value of the notificationData property.
     * 
     * @return
     *     possible object is
     *     {@link GiftcardAccountCreateNotificationData }
     *     
     */
    public GiftcardAccountCreateNotificationData getNotificationData() {
        return notificationData;
    }

    /**
     * Sets the value of the notificationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link GiftcardAccountCreateNotificationData }
     *     
     */
    public void setNotificationData(GiftcardAccountCreateNotificationData value) {
        this.notificationData = value;
    }

}
