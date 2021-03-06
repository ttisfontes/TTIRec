//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.28 at 11:09:48 AM BRST 
//


package br.com.tti.sefaz.nfes.schemas.ginfes;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Tipo Itens de Nota Fiscal.
 * 
 * <p>Java class for tpItens complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tpItens">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DiscriminacaoServico" type="{http://localhost:8080/WsNFe2/tp}tpDiscriminacao"/>
 *         &lt;element name="Quantidade" type="{http://localhost:8080/WsNFe2/tp}tpQuantidade"/>
 *         &lt;element name="ValorUnitario" type="{http://localhost:8080/WsNFe2/tp}tpValor4d"/>
 *         &lt;element name="ValorTotal" type="{http://localhost:8080/WsNFe2/tp}tpValor"/>
 *         &lt;element name="Tributavel" type="{http://localhost:8080/WsNFe2/tp}tpItemTributavel" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tpItens", propOrder = {
    "discriminacaoServico",
    "quantidade",
    "valorUnitario",
    "valorTotal",
    "tributavel"
})
public class TpItens {

    @XmlElement(name = "DiscriminacaoServico", required = true)
    protected String discriminacaoServico;
    @XmlElement(name = "Quantidade", required = true)
    protected BigDecimal quantidade;
    @XmlElement(name = "ValorUnitario", required = true)
    protected BigDecimal valorUnitario;
    @XmlElement(name = "ValorTotal", required = true)
    protected BigDecimal valorTotal;
    @XmlElement(name = "Tributavel")
    protected TpItemTributavel tributavel;

    /**
     * Gets the value of the discriminacaoServico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscriminacaoServico() {
        return discriminacaoServico;
    }

    /**
     * Sets the value of the discriminacaoServico property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscriminacaoServico(String value) {
        this.discriminacaoServico = value;
    }

    /**
     * Gets the value of the quantidade property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantidade() {
        return quantidade;
    }

    /**
     * Sets the value of the quantidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantidade(BigDecimal value) {
        this.quantidade = value;
    }

    /**
     * Gets the value of the valorUnitario property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    /**
     * Sets the value of the valorUnitario property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorUnitario(BigDecimal value) {
        this.valorUnitario = value;
    }

    /**
     * Gets the value of the valorTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    /**
     * Sets the value of the valorTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorTotal(BigDecimal value) {
        this.valorTotal = value;
    }

    /**
     * Gets the value of the tributavel property.
     * 
     * @return
     *     possible object is
     *     {@link TpItemTributavel }
     *     
     */
    public TpItemTributavel getTributavel() {
        return tributavel;
    }

    /**
     * Sets the value of the tributavel property.
     * 
     * @param value
     *     allowed object is
     *     {@link TpItemTributavel }
     *     
     */
    public void setTributavel(TpItemTributavel value) {
        this.tributavel = value;
    }

}
