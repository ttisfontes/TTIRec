//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.28 at 11:09:48 AM BRST 
//


package br.com.tti.sefaz.nfes.schemas.ginfes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Informa��es do Bairro com o seu Tipo.
 * 
 * <p>Java class for tpBairroCompleto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tpBairroCompleto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TipoBairro" type="{http://localhost:8080/WsNFe2/tp}tpTipoBairro"/>
 *         &lt;element name="NomeBairro" type="{http://localhost:8080/WsNFe2/tp}tpBairro"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tpBairroCompleto", propOrder = {
    "tipoBairro",
    "nomeBairro"
})
public class TpBairroCompleto {

    @XmlElement(name = "TipoBairro", required = true)
    protected String tipoBairro;
    @XmlElement(name = "NomeBairro", required = true)
    protected String nomeBairro;

    /**
     * Gets the value of the tipoBairro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoBairro() {
        return tipoBairro;
    }

    /**
     * Sets the value of the tipoBairro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoBairro(String value) {
        this.tipoBairro = value;
    }

    /**
     * Gets the value of the nomeBairro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeBairro() {
        return nomeBairro;
    }

    /**
     * Sets the value of the nomeBairro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeBairro(String value) {
        this.nomeBairro = value;
    }

}