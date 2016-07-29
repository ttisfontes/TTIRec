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
 * <p>Java class for tcDadosPrestador complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tcDadosPrestador">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdentificacaoPrestador" type="{http://www.abrasf.org.br/nfse.xsd}tcIdentificacaoPrestador"/>
 *         &lt;element name="RazaoSocial" type="{http://www.abrasf.org.br/nfse.xsd}tsRazaoSocial"/>
 *         &lt;element name="NomeFantasia" type="{http://www.abrasf.org.br/nfse.xsd}tsNomeFantasia" minOccurs="0"/>
 *         &lt;element name="Endereco" type="{http://www.abrasf.org.br/nfse.xsd}tcEndereco"/>
 *         &lt;element name="Contato" type="{http://www.abrasf.org.br/nfse.xsd}tcContato" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tcDadosPrestador", propOrder = {
    "identificacaoPrestador",
    "razaoSocial",
    "nomeFantasia",
    "endereco",
    "contato"
})
public class TcDadosPrestador {

    @XmlElement(name = "IdentificacaoPrestador", required = true)
    protected TcIdentificacaoPrestador identificacaoPrestador;
    @XmlElement(name = "RazaoSocial", required = true)
    protected String razaoSocial;
    @XmlElement(name = "NomeFantasia")
    protected String nomeFantasia;
    @XmlElement(name = "Endereco", required = true)
    protected TcEndereco endereco;
    @XmlElement(name = "Contato")
    protected TcContato contato;

    /**
     * Gets the value of the identificacaoPrestador property.
     * 
     * @return
     *     possible object is
     *     {@link TcIdentificacaoPrestador }
     *     
     */
    public TcIdentificacaoPrestador getIdentificacaoPrestador() {
        return identificacaoPrestador;
    }

    /**
     * Sets the value of the identificacaoPrestador property.
     * 
     * @param value
     *     allowed object is
     *     {@link TcIdentificacaoPrestador }
     *     
     */
    public void setIdentificacaoPrestador(TcIdentificacaoPrestador value) {
        this.identificacaoPrestador = value;
    }

    /**
     * Gets the value of the razaoSocial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazaoSocial() {
        return razaoSocial;
    }

    /**
     * Sets the value of the razaoSocial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazaoSocial(String value) {
        this.razaoSocial = value;
    }

    /**
     * Gets the value of the nomeFantasia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeFantasia() {
        return nomeFantasia;
    }

    /**
     * Sets the value of the nomeFantasia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeFantasia(String value) {
        this.nomeFantasia = value;
    }

    /**
     * Gets the value of the endereco property.
     * 
     * @return
     *     possible object is
     *     {@link TcEndereco }
     *     
     */
    public TcEndereco getEndereco() {
        return endereco;
    }

    /**
     * Sets the value of the endereco property.
     * 
     * @param value
     *     allowed object is
     *     {@link TcEndereco }
     *     
     */
    public void setEndereco(TcEndereco value) {
        this.endereco = value;
    }

    /**
     * Gets the value of the contato property.
     * 
     * @return
     *     possible object is
     *     {@link TcContato }
     *     
     */
    public TcContato getContato() {
        return contato;
    }

    /**
     * Sets the value of the contato property.
     * 
     * @param value
     *     allowed object is
     *     {@link TcContato }
     *     
     */
    public void setContato(TcContato value) {
        this.contato = value;
    }

}
