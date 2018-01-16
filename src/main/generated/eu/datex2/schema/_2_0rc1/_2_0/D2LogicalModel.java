
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour D2LogicalModel complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="D2LogicalModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="exchange" type="{http://datex2.eu/schema/2_0RC1/2_0}Exchange"/>
 *         &lt;element name="payloadPublication" type="{http://datex2.eu/schema/2_0RC1/2_0}PayloadPublication" minOccurs="0"/>
 *         &lt;element name="d2LogicalModelExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="modelBaseVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" fixed="2.0RC1" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "D2LogicalModel", propOrder = {
    "exchange",
    "payloadPublication",
    "d2LogicalModelExtension"
})
public class D2LogicalModel
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected Exchange exchange;
    protected PayloadPublication payloadPublication;
    protected ExtensionType d2LogicalModelExtension;
    @XmlAttribute(name = "modelBaseVersion", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String modelBaseVersion;

    /**
     * Obtient la valeur de la propriété exchange.
     * 
     * @return
     *     possible object is
     *     {@link Exchange }
     *     
     */
    public Exchange getExchange() {
        return exchange;
    }

    /**
     * Définit la valeur de la propriété exchange.
     * 
     * @param value
     *     allowed object is
     *     {@link Exchange }
     *     
     */
    public void setExchange(Exchange value) {
        this.exchange = value;
    }

    public boolean isSetExchange() {
        return (this.exchange!= null);
    }

    /**
     * Obtient la valeur de la propriété payloadPublication.
     * 
     * @return
     *     possible object is
     *     {@link PayloadPublication }
     *     
     */
    public PayloadPublication getPayloadPublication() {
        return payloadPublication;
    }

    /**
     * Définit la valeur de la propriété payloadPublication.
     * 
     * @param value
     *     allowed object is
     *     {@link PayloadPublication }
     *     
     */
    public void setPayloadPublication(PayloadPublication value) {
        this.payloadPublication = value;
    }

    public boolean isSetPayloadPublication() {
        return (this.payloadPublication!= null);
    }

    /**
     * Obtient la valeur de la propriété d2LogicalModelExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getD2LogicalModelExtension() {
        return d2LogicalModelExtension;
    }

    /**
     * Définit la valeur de la propriété d2LogicalModelExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setD2LogicalModelExtension(ExtensionType value) {
        this.d2LogicalModelExtension = value;
    }

    public boolean isSetD2LogicalModelExtension() {
        return (this.d2LogicalModelExtension!= null);
    }

    /**
     * Obtient la valeur de la propriété modelBaseVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelBaseVersion() {
        if (modelBaseVersion == null) {
            return "2.0RC1";
        } else {
            return modelBaseVersion;
        }
    }

    /**
     * Définit la valeur de la propriété modelBaseVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelBaseVersion(String value) {
        this.modelBaseVersion = value;
    }

    public boolean isSetModelBaseVersion() {
        return (this.modelBaseVersion!= null);
    }

}
