//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.28 at 09:44:11 AM BRST 
//


package br.org.abrasf.nfse.semfazonline.esquemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tcIdentificacaoOrgaoGerador complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tcIdentificacaoOrgaoGerador">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodigoMunicipio" type="{http://www.abrasf.org.br/nfse.xsd}tsCodigoMunicipioIbge"/>
 *         &lt;element name="Uf" type="{http://www.abrasf.org.br/nfse.xsd}tsUf"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tcIdentificacaoOrgaoGerador", propOrder = {
    "codigoMunicipio",
    "uf"
})
public class TcIdentificacaoOrgaoGerador {

    @XmlElement(name = "CodigoMunicipio")
    protected int codigoMunicipio;
    @XmlElement(name = "Uf", required = true)
    protected String uf;

    /**
     * Gets the value of the codigoMunicipio property.
     * 
     */
    public int getCodigoMunicipio() {
        return codigoMunicipio;
    }

    /**
     * Sets the value of the codigoMunicipio property.
     * 
     */
    public void setCodigoMunicipio(int value) {
        this.codigoMunicipio = value;
    }

    /**
     * Gets the value of the uf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUf() {
        return uf;
    }

    /**
     * Sets the value of the uf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUf(String value) {
        this.uf = value;
    }

}
