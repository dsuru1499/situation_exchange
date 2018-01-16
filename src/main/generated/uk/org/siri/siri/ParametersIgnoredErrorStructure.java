
package uk.org.siri.siri;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Parameters Ignored Error:. +SIRI v2.0.
 * 
 * <p>Classe Java pour ParametersIgnoredErrorStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ParametersIgnoredErrorStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}ErrorCodeStructure">
 *       &lt;sequence>
 *         &lt;element name="ParameterName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParametersIgnoredErrorStructure", propOrder = {
    "parameterName"
})
public class ParametersIgnoredErrorStructure
    extends ErrorCodeStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ParameterName")
    protected List<String> parameterName;

    /**
     * Gets the value of the parameterName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameterName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameterName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getParameterName() {
        if (parameterName == null) {
            parameterName = new ArrayList<String>();
        }
        return this.parameterName;
    }

    public boolean isSetParameterName() {
        return ((this.parameterName!= null)&&(!this.parameterName.isEmpty()));
    }

    public void unsetParameterName() {
        this.parameterName = null;
    }

}
