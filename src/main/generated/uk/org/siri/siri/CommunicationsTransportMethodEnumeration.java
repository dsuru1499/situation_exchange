
package uk.org.siri.siri;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour CommunicationsTransportMethodEnumeration.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="CommunicationsTransportMethodEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="httpPost"/>
 *     &lt;enumeration value="other"/>
 *     &lt;enumeration value="wsdlSoap"/>
 *     &lt;enumeration value="wsdlSoapDocumentLiteral"/>
 *     &lt;enumeration value="httpUrlJSON"/>
 *     &lt;enumeration value="httpUrlProtoBuffers"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CommunicationsTransportMethodEnumeration")
@XmlEnum
public enum CommunicationsTransportMethodEnumeration {

    @XmlEnumValue("httpPost")
    HTTP_POST("httpPost"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("wsdlSoap")
    WSDL_SOAP("wsdlSoap"),
    @XmlEnumValue("wsdlSoapDocumentLiteral")
    WSDL_SOAP_DOCUMENT_LITERAL("wsdlSoapDocumentLiteral"),
    @XmlEnumValue("httpUrlJSON")
    HTTP_URL_JSON("httpUrlJSON"),
    @XmlEnumValue("httpUrlProtoBuffers")
    HTTP_URL_PROTO_BUFFERS("httpUrlProtoBuffers");
    private final String value;

    CommunicationsTransportMethodEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CommunicationsTransportMethodEnumeration fromValue(String v) {
        for (CommunicationsTransportMethodEnumeration c: CommunicationsTransportMethodEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
