
package br.com.tti.sefaz.ttirec.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for obterEventos complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="obterEventos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chaveNFe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="params" type="{http://wsendpoint.sefaz.tti.com.br/}hashtable" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obterEventos", namespace = "http://wsendpoint.sefaz.tti.com.br/", propOrder = {
    "chaveNFe",
    "params"
})
public class ObterEventos {

    @XmlElement(namespace = "")
    protected String chaveNFe;
    @XmlElement(namespace = "")
    protected Hashtable params;

    /**
     * Gets the value of the chaveNFe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChaveNFe() {
        return chaveNFe;
    }

    /**
     * Sets the value of the chaveNFe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChaveNFe(String value) {
        this.chaveNFe = value;
    }

    /**
     * Gets the value of the params property.
     * 
     * @return
     *     possible object is
     *     {@link Hashtable }
     *     
     */
    public Hashtable getParams() {
        return params;
    }

    /**
     * Sets the value of the params property.
     * 
     * @param value
     *     allowed object is
     *     {@link Hashtable }
     *     
     */
    public void setParams(Hashtable value) {
        this.params = value;
    }

}
