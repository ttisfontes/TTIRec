//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.23 at 10:32:33 AM BRST 
//


package br.com.tti.sefaz.nfes.schemas.saopaulo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Tipo Endere�o.
 * 
 * <p>Java class for tpEndereco complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tpEndereco">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TipoLogradouro" type="{http://www.prefeitura.sp.gov.br/nfe/tipos}tpTipoLogradouro" minOccurs="0"/>
 *         &lt;element name="Logradouro" type="{http://www.prefeitura.sp.gov.br/nfe/tipos}tpLogradouro" minOccurs="0"/>
 *         &lt;element name="NumeroEndereco" type="{http://www.prefeitura.sp.gov.br/nfe/tipos}tpNumeroEndereco" minOccurs="0"/>
 *         &lt;element name="ComplementoEndereco" type="{http://www.prefeitura.sp.gov.br/nfe/tipos}tpComplementoEndereco" minOccurs="0"/>
 *         &lt;element name="Bairro" type="{http://www.prefeitura.sp.gov.br/nfe/tipos}tpBairro" minOccurs="0"/>
 *         &lt;element name="Cidade" type="{http://www.prefeitura.sp.gov.br/nfe/tipos}tpCidade" minOccurs="0"/>
 *         &lt;element name="UF" type="{http://www.prefeitura.sp.gov.br/nfe/tipos}tpUF" minOccurs="0"/>
 *         &lt;element name="CEP" type="{http://www.prefeitura.sp.gov.br/nfe/tipos}tpCEP" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tpEndereco", propOrder = {
    "tipoLogradouro",
    "logradouro",
    "numeroEndereco",
    "complementoEndereco",
    "bairro",
    "cidade",
    "uf",
    "cep"
})
public class TpEndereco {

    @XmlElement(name = "TipoLogradouro")
    protected String tipoLogradouro;
    @XmlElement(name = "Logradouro")
    protected String logradouro;
    @XmlElement(name = "NumeroEndereco")
    protected String numeroEndereco;
    @XmlElement(name = "ComplementoEndereco")
    protected String complementoEndereco;
    @XmlElement(name = "Bairro")
    protected String bairro;
    @XmlElement(name = "Cidade")
    protected Integer cidade;
    @XmlElement(name = "UF")
    protected String uf;
    @XmlElement(name = "CEP")
    protected Integer cep;

    /**
     * Gets the value of the tipoLogradouro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoLogradouro() {
        return tipoLogradouro;
    }

    /**
     * Sets the value of the tipoLogradouro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoLogradouro(String value) {
        this.tipoLogradouro = value;
    }

    /**
     * Gets the value of the logradouro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogradouro() {
        return logradouro;
    }

    /**
     * Sets the value of the logradouro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogradouro(String value) {
        this.logradouro = value;
    }

    /**
     * Gets the value of the numeroEndereco property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroEndereco() {
        return numeroEndereco;
    }

    /**
     * Sets the value of the numeroEndereco property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroEndereco(String value) {
        this.numeroEndereco = value;
    }

    /**
     * Gets the value of the complementoEndereco property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplementoEndereco() {
        return complementoEndereco;
    }

    /**
     * Sets the value of the complementoEndereco property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplementoEndereco(String value) {
        this.complementoEndereco = value;
    }

    /**
     * Gets the value of the bairro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * Sets the value of the bairro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBairro(String value) {
        this.bairro = value;
    }

    /**
     * Gets the value of the cidade property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCidade() {
        return cidade;
    }

    /**
     * Sets the value of the cidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCidade(Integer value) {
        this.cidade = value;
    }

    /**
     * Gets the value of the uf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUF() {
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
    public void setUF(String value) {
        this.uf = value;
    }

    /**
     * Gets the value of the cep property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCEP() {
        return cep;
    }

    /**
     * Sets the value of the cep property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCEP(Integer value) {
        this.cep = value;
    }

}
