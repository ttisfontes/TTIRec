//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.28 at 11:09:48 AM BRST 
//


package br.com.tti.sefaz.nfes.schemas.ginfes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Tipo Detalhes da Nota da Consulta de NFSe.
 * 
 * <p>Java class for tpNotaConsultaNFSe complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tpNotaConsultaNFSe">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InscricaoMunicipalPrestador" type="{http://localhost:8080/WsNFe2/tp}tpInscricaoMunicipal"/>
 *         &lt;element name="NumeroNota" type="{http://localhost:8080/WsNFe2/tp}tpNumero"/>
 *         &lt;element name="CodigoVerificacao" type="{http://localhost:8080/WsNFe2/tp}tpCodigoVerificacao"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tpNotaConsultaNFSe", propOrder = {
    "inscricaoMunicipalPrestador",
    "numeroNota",
    "codigoVerificacao"
})
public class TpNotaConsultaNFSe {

    @XmlElement(name = "InscricaoMunicipalPrestador")
    protected long inscricaoMunicipalPrestador;
    @XmlElement(name = "NumeroNota")
    protected int numeroNota;
    @XmlElement(name = "CodigoVerificacao", required = true)
    protected String codigoVerificacao;
    @XmlAttribute(name = "Id")
    protected String id;

    /**
     * Gets the value of the inscricaoMunicipalPrestador property.
     * 
     */
    public long getInscricaoMunicipalPrestador() {
        return inscricaoMunicipalPrestador;
    }

    /**
     * Sets the value of the inscricaoMunicipalPrestador property.
     * 
     */
    public void setInscricaoMunicipalPrestador(long value) {
        this.inscricaoMunicipalPrestador = value;
    }

    /**
     * Gets the value of the numeroNota property.
     * 
     */
    public int getNumeroNota() {
        return numeroNota;
    }

    /**
     * Sets the value of the numeroNota property.
     * 
     */
    public void setNumeroNota(int value) {
        this.numeroNota = value;
    }

    /**
     * Gets the value of the codigoVerificacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoVerificacao() {
        return codigoVerificacao;
    }

    /**
     * Sets the value of the codigoVerificacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoVerificacao(String value) {
        this.codigoVerificacao = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
