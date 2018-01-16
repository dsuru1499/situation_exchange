
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Name spaces.
 * 
 * <p>Classe Java pour DataNameSpacesStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="DataNameSpacesStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StopPointNameSpace" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="LineNameSpace" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="ProductCategoryNameSpace" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="ServiceFeatureNameSpace" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="VehicleFeatureNameSpace" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataNameSpacesStructure", propOrder = {
    "stopPointNameSpace",
    "lineNameSpace",
    "productCategoryNameSpace",
    "serviceFeatureNameSpace",
    "vehicleFeatureNameSpace"
})
public class DataNameSpacesStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "StopPointNameSpace")
    @XmlSchemaType(name = "anyURI")
    protected String stopPointNameSpace;
    @XmlElement(name = "LineNameSpace")
    @XmlSchemaType(name = "anyURI")
    protected String lineNameSpace;
    @XmlElement(name = "ProductCategoryNameSpace")
    @XmlSchemaType(name = "anyURI")
    protected String productCategoryNameSpace;
    @XmlElement(name = "ServiceFeatureNameSpace")
    @XmlSchemaType(name = "anyURI")
    protected String serviceFeatureNameSpace;
    @XmlElement(name = "VehicleFeatureNameSpace")
    @XmlSchemaType(name = "anyURI")
    protected String vehicleFeatureNameSpace;

    /**
     * Obtient la valeur de la propriété stopPointNameSpace.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStopPointNameSpace() {
        return stopPointNameSpace;
    }

    /**
     * Définit la valeur de la propriété stopPointNameSpace.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStopPointNameSpace(String value) {
        this.stopPointNameSpace = value;
    }

    public boolean isSetStopPointNameSpace() {
        return (this.stopPointNameSpace!= null);
    }

    /**
     * Obtient la valeur de la propriété lineNameSpace.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineNameSpace() {
        return lineNameSpace;
    }

    /**
     * Définit la valeur de la propriété lineNameSpace.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineNameSpace(String value) {
        this.lineNameSpace = value;
    }

    public boolean isSetLineNameSpace() {
        return (this.lineNameSpace!= null);
    }

    /**
     * Obtient la valeur de la propriété productCategoryNameSpace.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCategoryNameSpace() {
        return productCategoryNameSpace;
    }

    /**
     * Définit la valeur de la propriété productCategoryNameSpace.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCategoryNameSpace(String value) {
        this.productCategoryNameSpace = value;
    }

    public boolean isSetProductCategoryNameSpace() {
        return (this.productCategoryNameSpace!= null);
    }

    /**
     * Obtient la valeur de la propriété serviceFeatureNameSpace.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceFeatureNameSpace() {
        return serviceFeatureNameSpace;
    }

    /**
     * Définit la valeur de la propriété serviceFeatureNameSpace.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceFeatureNameSpace(String value) {
        this.serviceFeatureNameSpace = value;
    }

    public boolean isSetServiceFeatureNameSpace() {
        return (this.serviceFeatureNameSpace!= null);
    }

    /**
     * Obtient la valeur de la propriété vehicleFeatureNameSpace.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleFeatureNameSpace() {
        return vehicleFeatureNameSpace;
    }

    /**
     * Définit la valeur de la propriété vehicleFeatureNameSpace.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleFeatureNameSpace(String value) {
        this.vehicleFeatureNameSpace = value;
    }

    public boolean isSetVehicleFeatureNameSpace() {
        return (this.vehicleFeatureNameSpace!= null);
    }

}
