
package integration.mindbody;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for ArrayOfCustomClientField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCustomClientField">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomClientField" type="{http://clients.mindbodyonline.com/api/0_5}CustomClientField" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCustomClientField", propOrder = {
    "customClientField"
})
@Entity(name = "ArrayOfCustomClientField")
@Table(name = "ARRAYOFCUSTOMCLIENTFIELD")
@Inheritance(strategy = InheritanceType.JOINED)
public class ArrayOfCustomClientField
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "CustomClientField", nillable = true)
    protected List<CustomClientField> customClientField;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
     * Gets the value of the customClientField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customClientField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomClientField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomClientField }
     * 
     * 
     */
    @OneToMany(targetEntity = CustomClientField.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "CUSTOMCLIENTFIELD_ARRAYOFCUS_0")
    public List<CustomClientField> getCustomClientField() {
        if (customClientField == null) {
            customClientField = new ArrayList<CustomClientField>();
        }
        return this.customClientField;
    }

    /**
     * 
     * 
     */
    public void setCustomClientField(List<CustomClientField> customClientField) {
        this.customClientField = customClientField;
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            List<CustomClientField> theCustomClientField;
            theCustomClientField = (((this.customClientField!= null)&&(!this.customClientField.isEmpty()))?this.getCustomClientField():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "customClientField", theCustomClientField), currentHashCode, theCustomClientField);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ArrayOfCustomClientField)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ArrayOfCustomClientField that = ((ArrayOfCustomClientField) object);
        {
            List<CustomClientField> lhsCustomClientField;
            lhsCustomClientField = (((this.customClientField!= null)&&(!this.customClientField.isEmpty()))?this.getCustomClientField():null);
            List<CustomClientField> rhsCustomClientField;
            rhsCustomClientField = (((that.customClientField!= null)&&(!that.customClientField.isEmpty()))?that.getCustomClientField():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "customClientField", lhsCustomClientField), LocatorUtils.property(thatLocator, "customClientField", rhsCustomClientField), lhsCustomClientField, rhsCustomClientField)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            List<CustomClientField> theCustomClientField;
            theCustomClientField = (((this.customClientField!= null)&&(!this.customClientField.isEmpty()))?this.getCustomClientField():null);
            strategy.appendField(locator, this, "customClientField", buffer, theCustomClientField);
        }
        return buffer;
    }

    /**
     * Gets the value of the hjid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Id
    @Column(name = "HJID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getHjid() {
        return hjid;
    }

    /**
     * Sets the value of the hjid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHjid(Long value) {
        this.hjid = value;
    }

}
