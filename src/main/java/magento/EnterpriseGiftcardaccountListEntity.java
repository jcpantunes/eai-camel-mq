
package magento;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for enterpriseGiftcardaccountListEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="enterpriseGiftcardaccountListEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="giftcardaccount_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="used_amount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="base_amount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enterpriseGiftcardaccountListEntity", propOrder = {
    "giftcardaccountId",
    "code",
    "usedAmount",
    "baseAmount"
})
public class EnterpriseGiftcardaccountListEntity {

    @XmlElement(name = "giftcardaccount_id", required = true)
    protected String giftcardaccountId;
    protected String code;
    @XmlElement(name = "used_amount", required = true)
    protected String usedAmount;
    @XmlElement(name = "base_amount", required = true)
    protected String baseAmount;

    /**
     * Gets the value of the giftcardaccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftcardaccountId() {
        return giftcardaccountId;
    }

    /**
     * Sets the value of the giftcardaccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftcardaccountId(String value) {
        this.giftcardaccountId = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the usedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsedAmount() {
        return usedAmount;
    }

    /**
     * Sets the value of the usedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsedAmount(String value) {
        this.usedAmount = value;
    }

    /**
     * Gets the value of the baseAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseAmount() {
        return baseAmount;
    }

    /**
     * Sets the value of the baseAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseAmount(String value) {
        this.baseAmount = value;
    }

}
