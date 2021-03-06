//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.12 at 03:50:08 PM BRT 
//


package br.com.tti.sefaz.nfes.schemas.saopaulo.retornoconsulta;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Informações do lote processado.
 * 
 * <p>Java class for tpInformacoesLote complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tpInformacoesLote">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumeroLote" type="{http://www.prefeitura.sp.gov.br/nfe/tipos}tpNumero" minOccurs="0"/>
 *         &lt;element name="InscricaoPrestador" type="{http://www.prefeitura.sp.gov.br/nfe/tipos}tpInscricaoMunicipal"/>
 *         &lt;element name="CPFCNPJRemetente" type="{http://www.prefeitura.sp.gov.br/nfe/tipos}tpCPFCNPJ"/>
 *         &lt;element name="DataEnvioLote" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="QtdNotasProcessadas" type="{http://www.prefeitura.sp.gov.br/nfe/tipos}tpQuantidade"/>
 *         &lt;element name="TempoProcessamento" type="{http://www.prefeitura.sp.gov.br/nfe/tipos}tpTempoProcessamento"/>
 *         &lt;element name="ValorTotalServicos" type="{http://www.prefeitura.sp.gov.br/nfe/tipos}tpValor"/>
 *         &lt;element name="ValorTotalDeducoes" type="{http://www.prefeitura.sp.gov.br/nfe/tipos}tpValor" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tpInformacoesLote", propOrder = {
    "numeroLote",
    "inscricaoPrestador",
    "cpfcnpjRemetente",
    "dataEnvioLote",
    "qtdNotasProcessadas",
    "tempoProcessamento",
    "valorTotalServicos",
    "valorTotalDeducoes"
})
public class TpInformacoesLote {

    @XmlElement(name = "NumeroLote")
    protected Long numeroLote;
    @XmlElement(name = "InscricaoPrestador")
    protected long inscricaoPrestador;
    @XmlElement(name = "CPFCNPJRemetente", required = true)
    protected TpCPFCNPJ cpfcnpjRemetente;
    @XmlElement(name = "DataEnvioLote", required = true)
    protected XMLGregorianCalendar dataEnvioLote;
    @XmlElement(name = "QtdNotasProcessadas")
    protected long qtdNotasProcessadas;
    @XmlElement(name = "TempoProcessamento")
    protected long tempoProcessamento;
    @XmlElement(name = "ValorTotalServicos", required = true)
    protected BigDecimal valorTotalServicos;
    @XmlElement(name = "ValorTotalDeducoes")
    protected BigDecimal valorTotalDeducoes;

    /**
     * Gets the value of the numeroLote property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumeroLote() {
        return numeroLote;
    }

    /**
     * Sets the value of the numeroLote property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumeroLote(Long value) {
        this.numeroLote = value;
    }

    /**
     * Gets the value of the inscricaoPrestador property.
     * 
     */
    public long getInscricaoPrestador() {
        return inscricaoPrestador;
    }

    /**
     * Sets the value of the inscricaoPrestador property.
     * 
     */
    public void setInscricaoPrestador(long value) {
        this.inscricaoPrestador = value;
    }

    /**
     * Gets the value of the cpfcnpjRemetente property.
     * 
     * @return
     *     possible object is
     *     {@link TpCPFCNPJ }
     *     
     */
    public TpCPFCNPJ getCPFCNPJRemetente() {
        return cpfcnpjRemetente;
    }

    /**
     * Sets the value of the cpfcnpjRemetente property.
     * 
     * @param value
     *     allowed object is
     *     {@link TpCPFCNPJ }
     *     
     */
    public void setCPFCNPJRemetente(TpCPFCNPJ value) {
        this.cpfcnpjRemetente = value;
    }

    /**
     * Gets the value of the dataEnvioLote property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataEnvioLote() {
        return dataEnvioLote;
    }

    /**
     * Sets the value of the dataEnvioLote property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataEnvioLote(XMLGregorianCalendar value) {
        this.dataEnvioLote = value;
    }

    /**
     * Gets the value of the qtdNotasProcessadas property.
     * 
     */
    public long getQtdNotasProcessadas() {
        return qtdNotasProcessadas;
    }

    /**
     * Sets the value of the qtdNotasProcessadas property.
     * 
     */
    public void setQtdNotasProcessadas(long value) {
        this.qtdNotasProcessadas = value;
    }

    /**
     * Gets the value of the tempoProcessamento property.
     * 
     */
    public long getTempoProcessamento() {
        return tempoProcessamento;
    }

    /**
     * Sets the value of the tempoProcessamento property.
     * 
     */
    public void setTempoProcessamento(long value) {
        this.tempoProcessamento = value;
    }

    /**
     * Gets the value of the valorTotalServicos property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorTotalServicos() {
        return valorTotalServicos;
    }

    /**
     * Sets the value of the valorTotalServicos property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorTotalServicos(BigDecimal value) {
        this.valorTotalServicos = value;
    }

    /**
     * Gets the value of the valorTotalDeducoes property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorTotalDeducoes() {
        return valorTotalDeducoes;
    }

    /**
     * Sets the value of the valorTotalDeducoes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorTotalDeducoes(BigDecimal value) {
        this.valorTotalDeducoes = value;
    }

}
