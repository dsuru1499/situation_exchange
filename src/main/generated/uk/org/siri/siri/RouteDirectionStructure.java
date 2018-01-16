
package uk.org.siri.siri;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Summary information about a  Direction of a Line
 * 
 * <p>Classe Java pour RouteDirectionStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="RouteDirectionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}DirectionStructure">
 *       &lt;sequence>
 *         &lt;element name="JourneyPatterns" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="JourneyPattern" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://www.siri.org.uk/siri}JourneyPatternRef" minOccurs="0"/>
 *                             &lt;element name="Name" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="StopsInPattern" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="StopPointInPattern" type="{http://www.siri.org.uk/siri}StopPointInPatternStructure" maxOccurs="unbounded" minOccurs="2"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteDirectionStructure", propOrder = {
    "journeyPatterns",
    "extensions"
})
public class RouteDirectionStructure
    extends DirectionStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "JourneyPatterns")
    protected RouteDirectionStructure.JourneyPatterns journeyPatterns;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Obtient la valeur de la propriété journeyPatterns.
     * 
     * @return
     *     possible object is
     *     {@link RouteDirectionStructure.JourneyPatterns }
     *     
     */
    public RouteDirectionStructure.JourneyPatterns getJourneyPatterns() {
        return journeyPatterns;
    }

    /**
     * Définit la valeur de la propriété journeyPatterns.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteDirectionStructure.JourneyPatterns }
     *     
     */
    public void setJourneyPatterns(RouteDirectionStructure.JourneyPatterns value) {
        this.journeyPatterns = value;
    }

    public boolean isSetJourneyPatterns() {
        return (this.journeyPatterns!= null);
    }

    /**
     * Obtient la valeur de la propriété extensions.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsStructure }
     *     
     */
    public ExtensionsStructure getExtensions() {
        return extensions;
    }

    /**
     * Définit la valeur de la propriété extensions.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsStructure }
     *     
     */
    public void setExtensions(ExtensionsStructure value) {
        this.extensions = value;
    }

    public boolean isSetExtensions() {
        return (this.extensions!= null);
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="JourneyPattern" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://www.siri.org.uk/siri}JourneyPatternRef" minOccurs="0"/>
     *                   &lt;element name="Name" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="StopsInPattern" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="StopPointInPattern" type="{http://www.siri.org.uk/siri}StopPointInPatternStructure" maxOccurs="unbounded" minOccurs="2"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "journeyPattern"
    })
    public static class JourneyPatterns
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "JourneyPattern", required = true)
        protected List<RouteDirectionStructure.JourneyPatterns.JourneyPattern> journeyPattern;

        /**
         * Gets the value of the journeyPattern property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the journeyPattern property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getJourneyPattern().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RouteDirectionStructure.JourneyPatterns.JourneyPattern }
         * 
         * 
         */
        public List<RouteDirectionStructure.JourneyPatterns.JourneyPattern> getJourneyPattern() {
            if (journeyPattern == null) {
                journeyPattern = new ArrayList<RouteDirectionStructure.JourneyPatterns.JourneyPattern>();
            }
            return this.journeyPattern;
        }

        public boolean isSetJourneyPattern() {
            return ((this.journeyPattern!= null)&&(!this.journeyPattern.isEmpty()));
        }

        public void unsetJourneyPattern() {
            this.journeyPattern = null;
        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element ref="{http://www.siri.org.uk/siri}JourneyPatternRef" minOccurs="0"/>
         *         &lt;element name="Name" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="StopsInPattern" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="StopPointInPattern" type="{http://www.siri.org.uk/siri}StopPointInPatternStructure" maxOccurs="unbounded" minOccurs="2"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "journeyPatternRef",
            "name",
            "stopsInPattern"
        })
        public static class JourneyPattern
            implements Serializable
        {

            private final static long serialVersionUID = 1L;
            @XmlElement(name = "JourneyPatternRef")
            protected JourneyPatternRefStructure journeyPatternRef;
            @XmlElement(name = "Name")
            protected List<NaturalLanguageStringStructure> name;
            @XmlElement(name = "StopsInPattern")
            protected RouteDirectionStructure.JourneyPatterns.JourneyPattern.StopsInPattern stopsInPattern;

            /**
             * Obtient la valeur de la propriété journeyPatternRef.
             * 
             * @return
             *     possible object is
             *     {@link JourneyPatternRefStructure }
             *     
             */
            public JourneyPatternRefStructure getJourneyPatternRef() {
                return journeyPatternRef;
            }

            /**
             * Définit la valeur de la propriété journeyPatternRef.
             * 
             * @param value
             *     allowed object is
             *     {@link JourneyPatternRefStructure }
             *     
             */
            public void setJourneyPatternRef(JourneyPatternRefStructure value) {
                this.journeyPatternRef = value;
            }

            public boolean isSetJourneyPatternRef() {
                return (this.journeyPatternRef!= null);
            }

            /**
             * Gets the value of the name property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the name property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getName().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link NaturalLanguageStringStructure }
             * 
             * 
             */
            public List<NaturalLanguageStringStructure> getName() {
                if (name == null) {
                    name = new ArrayList<NaturalLanguageStringStructure>();
                }
                return this.name;
            }

            public boolean isSetName() {
                return ((this.name!= null)&&(!this.name.isEmpty()));
            }

            public void unsetName() {
                this.name = null;
            }

            /**
             * Obtient la valeur de la propriété stopsInPattern.
             * 
             * @return
             *     possible object is
             *     {@link RouteDirectionStructure.JourneyPatterns.JourneyPattern.StopsInPattern }
             *     
             */
            public RouteDirectionStructure.JourneyPatterns.JourneyPattern.StopsInPattern getStopsInPattern() {
                return stopsInPattern;
            }

            /**
             * Définit la valeur de la propriété stopsInPattern.
             * 
             * @param value
             *     allowed object is
             *     {@link RouteDirectionStructure.JourneyPatterns.JourneyPattern.StopsInPattern }
             *     
             */
            public void setStopsInPattern(RouteDirectionStructure.JourneyPatterns.JourneyPattern.StopsInPattern value) {
                this.stopsInPattern = value;
            }

            public boolean isSetStopsInPattern() {
                return (this.stopsInPattern!= null);
            }


            /**
             * <p>Classe Java pour anonymous complex type.
             * 
             * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="StopPointInPattern" type="{http://www.siri.org.uk/siri}StopPointInPatternStructure" maxOccurs="unbounded" minOccurs="2"/>
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
                "stopPointInPattern"
            })
            public static class StopsInPattern
                implements Serializable
            {

                private final static long serialVersionUID = 1L;
                @XmlElement(name = "StopPointInPattern", required = true)
                protected List<StopPointInPatternStructure> stopPointInPattern;

                /**
                 * Gets the value of the stopPointInPattern property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the stopPointInPattern property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getStopPointInPattern().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link StopPointInPatternStructure }
                 * 
                 * 
                 */
                public List<StopPointInPatternStructure> getStopPointInPattern() {
                    if (stopPointInPattern == null) {
                        stopPointInPattern = new ArrayList<StopPointInPatternStructure>();
                    }
                    return this.stopPointInPattern;
                }

                public boolean isSetStopPointInPattern() {
                    return ((this.stopPointInPattern!= null)&&(!this.stopPointInPattern.isEmpty()));
                }

                public void unsetStopPointInPattern() {
                    this.stopPointInPattern = null;
                }

            }

        }

    }

}
