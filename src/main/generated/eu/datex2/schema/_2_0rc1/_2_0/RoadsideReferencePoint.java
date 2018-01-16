
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour RoadsideReferencePoint complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="RoadsideReferencePoint">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="roadsideReferencePointIdentifier" type="{http://datex2.eu/schema/2_0RC1/2_0}String"/>
 *         &lt;element name="administrativeArea" type="{http://datex2.eu/schema/2_0RC1/2_0}MultilingualString" minOccurs="0"/>
 *         &lt;element name="roadName" type="{http://datex2.eu/schema/2_0RC1/2_0}MultilingualString" minOccurs="0"/>
 *         &lt;element name="roadNumber" type="{http://datex2.eu/schema/2_0RC1/2_0}String" minOccurs="0"/>
 *         &lt;element name="directionBound" type="{http://datex2.eu/schema/2_0RC1/2_0}DirectionEnum" minOccurs="0"/>
 *         &lt;element name="directionRelative" type="{http://datex2.eu/schema/2_0RC1/2_0}ReferencePointDirectionEnum" minOccurs="0"/>
 *         &lt;element name="distanceFromPrevious" type="{http://datex2.eu/schema/2_0RC1/2_0}MetresAsFloat" minOccurs="0"/>
 *         &lt;element name="distanceToNext" type="{http://datex2.eu/schema/2_0RC1/2_0}MetresAsFloat" minOccurs="0"/>
 *         &lt;element name="elevatedRoadSection" type="{http://datex2.eu/schema/2_0RC1/2_0}Boolean" minOccurs="0"/>
 *         &lt;element name="roadsideReferencePointDescription" type="{http://datex2.eu/schema/2_0RC1/2_0}MultilingualString" minOccurs="0"/>
 *         &lt;element name="roadsideReferencePointDistance" type="{http://datex2.eu/schema/2_0RC1/2_0}MetresAsFloat" minOccurs="0"/>
 *         &lt;element name="roadsideReferencePointExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoadsideReferencePoint", propOrder = {
    "roadsideReferencePointIdentifier",
    "administrativeArea",
    "roadName",
    "roadNumber",
    "directionBound",
    "directionRelative",
    "distanceFromPrevious",
    "distanceToNext",
    "elevatedRoadSection",
    "roadsideReferencePointDescription",
    "roadsideReferencePointDistance",
    "roadsideReferencePointExtension"
})
public class RoadsideReferencePoint
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String roadsideReferencePointIdentifier;
    protected MultilingualString administrativeArea;
    protected MultilingualString roadName;
    protected String roadNumber;
    protected DirectionEnum directionBound;
    protected ReferencePointDirectionEnum directionRelative;
    protected Float distanceFromPrevious;
    protected Float distanceToNext;
    protected Boolean elevatedRoadSection;
    protected MultilingualString roadsideReferencePointDescription;
    protected Float roadsideReferencePointDistance;
    protected ExtensionType roadsideReferencePointExtension;

    /**
     * Obtient la valeur de la propriété roadsideReferencePointIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoadsideReferencePointIdentifier() {
        return roadsideReferencePointIdentifier;
    }

    /**
     * Définit la valeur de la propriété roadsideReferencePointIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoadsideReferencePointIdentifier(String value) {
        this.roadsideReferencePointIdentifier = value;
    }

    public boolean isSetRoadsideReferencePointIdentifier() {
        return (this.roadsideReferencePointIdentifier!= null);
    }

    /**
     * Obtient la valeur de la propriété administrativeArea.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getAdministrativeArea() {
        return administrativeArea;
    }

    /**
     * Définit la valeur de la propriété administrativeArea.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setAdministrativeArea(MultilingualString value) {
        this.administrativeArea = value;
    }

    public boolean isSetAdministrativeArea() {
        return (this.administrativeArea!= null);
    }

    /**
     * Obtient la valeur de la propriété roadName.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getRoadName() {
        return roadName;
    }

    /**
     * Définit la valeur de la propriété roadName.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setRoadName(MultilingualString value) {
        this.roadName = value;
    }

    public boolean isSetRoadName() {
        return (this.roadName!= null);
    }

    /**
     * Obtient la valeur de la propriété roadNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoadNumber() {
        return roadNumber;
    }

    /**
     * Définit la valeur de la propriété roadNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoadNumber(String value) {
        this.roadNumber = value;
    }

    public boolean isSetRoadNumber() {
        return (this.roadNumber!= null);
    }

    /**
     * Obtient la valeur de la propriété directionBound.
     * 
     * @return
     *     possible object is
     *     {@link DirectionEnum }
     *     
     */
    public DirectionEnum getDirectionBound() {
        return directionBound;
    }

    /**
     * Définit la valeur de la propriété directionBound.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionEnum }
     *     
     */
    public void setDirectionBound(DirectionEnum value) {
        this.directionBound = value;
    }

    public boolean isSetDirectionBound() {
        return (this.directionBound!= null);
    }

    /**
     * Obtient la valeur de la propriété directionRelative.
     * 
     * @return
     *     possible object is
     *     {@link ReferencePointDirectionEnum }
     *     
     */
    public ReferencePointDirectionEnum getDirectionRelative() {
        return directionRelative;
    }

    /**
     * Définit la valeur de la propriété directionRelative.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferencePointDirectionEnum }
     *     
     */
    public void setDirectionRelative(ReferencePointDirectionEnum value) {
        this.directionRelative = value;
    }

    public boolean isSetDirectionRelative() {
        return (this.directionRelative!= null);
    }

    /**
     * Obtient la valeur de la propriété distanceFromPrevious.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDistanceFromPrevious() {
        return distanceFromPrevious;
    }

    /**
     * Définit la valeur de la propriété distanceFromPrevious.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDistanceFromPrevious(Float value) {
        this.distanceFromPrevious = value;
    }

    public boolean isSetDistanceFromPrevious() {
        return (this.distanceFromPrevious!= null);
    }

    /**
     * Obtient la valeur de la propriété distanceToNext.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDistanceToNext() {
        return distanceToNext;
    }

    /**
     * Définit la valeur de la propriété distanceToNext.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDistanceToNext(Float value) {
        this.distanceToNext = value;
    }

    public boolean isSetDistanceToNext() {
        return (this.distanceToNext!= null);
    }

    /**
     * Obtient la valeur de la propriété elevatedRoadSection.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isElevatedRoadSection() {
        return elevatedRoadSection;
    }

    /**
     * Définit la valeur de la propriété elevatedRoadSection.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setElevatedRoadSection(Boolean value) {
        this.elevatedRoadSection = value;
    }

    public boolean isSetElevatedRoadSection() {
        return (this.elevatedRoadSection!= null);
    }

    /**
     * Obtient la valeur de la propriété roadsideReferencePointDescription.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getRoadsideReferencePointDescription() {
        return roadsideReferencePointDescription;
    }

    /**
     * Définit la valeur de la propriété roadsideReferencePointDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setRoadsideReferencePointDescription(MultilingualString value) {
        this.roadsideReferencePointDescription = value;
    }

    public boolean isSetRoadsideReferencePointDescription() {
        return (this.roadsideReferencePointDescription!= null);
    }

    /**
     * Obtient la valeur de la propriété roadsideReferencePointDistance.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRoadsideReferencePointDistance() {
        return roadsideReferencePointDistance;
    }

    /**
     * Définit la valeur de la propriété roadsideReferencePointDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRoadsideReferencePointDistance(Float value) {
        this.roadsideReferencePointDistance = value;
    }

    public boolean isSetRoadsideReferencePointDistance() {
        return (this.roadsideReferencePointDistance!= null);
    }

    /**
     * Obtient la valeur de la propriété roadsideReferencePointExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getRoadsideReferencePointExtension() {
        return roadsideReferencePointExtension;
    }

    /**
     * Définit la valeur de la propriété roadsideReferencePointExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setRoadsideReferencePointExtension(ExtensionType value) {
        this.roadsideReferencePointExtension = value;
    }

    public boolean isSetRoadsideReferencePointExtension() {
        return (this.roadsideReferencePointExtension!= null);
    }

}
