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
 * <p>Java class for tcIdentificacaoConsulente complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tcIdentificacaoConsulente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CpfCnpj" type="{http://www.abrasf.org.br/nfse.xsd}tcCpfCnpj"/>
 *         &lt;element name="InscricaoMunicipal" type="{http://www.abrasf.org.br/nfse.xsd}tsInscricaoMunicipal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tcIdentificacaoConsulente", propOrder = {
    "cpfCnpj",
    "inscricaoMunicipal"
})
public class TcIdentificacaoConsulente {

    @XmlElement(name = "CpfCnpj", required = true)
    protected TcCpfCnpj cpfCnpj;
    @XmlElement(name = "InscricaoMunicipal")
    protected String inscricaoMunicipal;

    /**
     * Gets the value of the cpfCnpj property.
     * 
     * @return
     *     possible object is
     *     {@link TcCpfCnpj }
     *     
     */
    public TcCpfCnpj getCpfCnpj() {
        return cpfCnpj;
    }

    /**
     * Sets the value of the cpfCnpj property.
     * 
     * @param value
     *     allowed object is
     *     {@link TcCpfCnpj }
     *     
     */
    public void setCpfCnpj(TcCpfCnpj value) {
        this.cpfCnpj = value;
    }

    /**
     * Gets the value of the inscricaoMunicipal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInscricaoMunicipal() {
        return inscricaoMunicipal;
    }

    /**
     * Sets the value of the inscricaoMunicipal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInscricaoMunicipal(String value) {
        this.inscricaoMunicipal = value;
    }

}
