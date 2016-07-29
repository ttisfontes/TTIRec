//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.23 at 10:32:33 AM BRST 
//


package br.com.tti.sefaz.nfes.schemas.saopaulo;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Tipo que representa um RPS.
 * 
 * <p>Java class for tpRPS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tpRPS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Assinatura" type="{http://www.prefeitura.sp.gov.br/nfe/tipos}tpAssinatura"/>
 *         &lt;element name="ChaveRPS" type="{http://www.prefeitura.sp.gov.br/nfe/tipos}tpChaveRPS"/>
 *         &lt;element name="TipoRPS" type="{http://www.prefeitura.sp.gov.br/nfe/tipos}tpTipoRPS"/>
 *         &lt;element name="DataEmissao" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="StatusRPS" type="{http://www.prefeitura.sp.gov.br/nfe/tipos}tpStatusNFe"/>
 *         &lt;element name="TributacaoRPS" type="{http://www.prefeitura.sp.gov.br/nfe/tipos}tpTributacaoNFe"/>
 *         &lt;element name="ValorServicos" type="{http://www.prefeitura.sp.gov.br/nfe/tipos}tpValor"/>
 *         &lt;element name="ValorDeducoes" type="{http://www.prefeitura.sp.gov.br/nfe/tipos}tpValor"/>
 *         &lt;element name="ValorPIS" type="{http://www.prefeitura.sp.gov.br/nfe/tipos}tpValor" minOccurs="0"/>
 *         &lt;element name="ValorCOFINS" type="{http://www.prefeitura.sp.gov.br/nfe/tipos}tpValor" minOccurs="0"/>
 *         &lt;element name="ValorINSS" type="{http://www.prefeitura.sp.gov.br/nfe/tipos}tpValor" minOccurs="0"/>
 *         &lt;element name="ValorIR" type="{http://www.prefeitura.sp.gov.br/nfe/tipos}tpValor" minOccurs="0"/>
 *         &lt;element name="ValorCSLL" type="{http://www.prefeitura.sp.gov.br/nfe/tipos}tpValor" minOccurs="0"/>
 *         &lt;element name="CodigoServico" type="{http://www.prefeitura.sp.gov.br/nfe/tipos}tpCodigoServico"/>
 *         &lt;element name="AliquotaServicos" type="{http://www.prefeitura.sp.gov.br/nfe/tipos}tpAliquota"/>
 *         &lt;element name="ISSRetido" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CPFCNPJTomador" type="{http://www.prefeitura.sp.gov.br/nfe/tipos}tpCPFCNPJ" minOccurs="0"/>
 *         &lt;element name="InscricaoMunicipalTomador" type="{http://www.prefeitura.sp.gov.br/nfe/tipos}tpInscricaoMunicipal" minOccurs="0"/>
 *         &lt;element name="InscricaoEstadualTomador" type="{http://www.prefeitura.sp.gov.br/nfe/tipos}tpInscricaoEstadual" minOccurs="0"/>
 *         &lt;element name="RazaoSocialTomador" type="{http://www.prefeitura.sp.gov.br/nfe/tipos}tpRazaoSocial" minOccurs="0"/>
 *         &lt;element name="EnderecoTomador" type="{http://www.prefeitura.sp.gov.br/nfe/tipos}tpEndereco" minOccurs="0"/>
 *         &lt;element name="EmailTomador" type="{http://www.prefeitura.sp.gov.br/nfe/tipos}tpEmail" minOccurs="0"/>
 *         &lt;element name="Discriminacao" type="{http://www.prefeitura.sp.gov.br/nfe/tipos}tpDiscriminacao"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tpRPS", propOrder = {
    "assinatura",
    "chaveRPS",
    "tipoRPS",
    "dataEmissao",
    "statusRPS",
    "tributacaoRPS",
    "valorServicos",
    "valorDeducoes",
    "valorPIS",
    "valorCOFINS",
    "valorINSS",
    "valorIR",
    "valorCSLL",
    "codigoServico",
    "aliquotaServicos",
    "issRetido",
    "cpfcnpjTomador",
    "inscricaoMunicipalTomador",
    "inscricaoEstadualTomador",
    "razaoSocialTomador",
    "enderecoTomador",
    "emailTomador",
    "discriminacao"
})
public class TpRPS {

    @XmlElement(name = "Assinatura", required = true)
    protected byte[] assinatura;
    @XmlElement(name = "ChaveRPS", required = true)
    protected TpChaveRPS chaveRPS;
    @XmlElement(name = "TipoRPS", required = true)
    protected TpTipoRPS tipoRPS;
    @XmlElement(name = "DataEmissao", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataEmissao;
    @XmlElement(name = "StatusRPS", required = true)
    protected TpStatusNFe statusRPS;
    @XmlElement(name = "TributacaoRPS", required = true)
    protected TpTributacaoNFe tributacaoRPS;
    @XmlElement(name = "ValorServicos", required = true)
    protected BigDecimal valorServicos;
    @XmlElement(name = "ValorDeducoes", required = true)
    protected BigDecimal valorDeducoes;
    @XmlElement(name = "ValorPIS")
    protected BigDecimal valorPIS;
    @XmlElement(name = "ValorCOFINS")
    protected BigDecimal valorCOFINS;
    @XmlElement(name = "ValorINSS")
    protected BigDecimal valorINSS;
    @XmlElement(name = "ValorIR")
    protected BigDecimal valorIR;
    @XmlElement(name = "ValorCSLL")
    protected BigDecimal valorCSLL;
    @XmlElement(name = "CodigoServico")
    protected int codigoServico;
    @XmlElement(name = "AliquotaServicos", required = true)
    protected BigDecimal aliquotaServicos;
    @XmlElement(name = "ISSRetido")
    protected boolean issRetido;
    @XmlElement(name = "CPFCNPJTomador")
    protected TpCPFCNPJ cpfcnpjTomador;
    @XmlElement(name = "InscricaoMunicipalTomador")
    protected Long inscricaoMunicipalTomador;
    @XmlElement(name = "InscricaoEstadualTomador")
    protected Long inscricaoEstadualTomador;
    @XmlElement(name = "RazaoSocialTomador")
    protected String razaoSocialTomador;
    @XmlElement(name = "EnderecoTomador")
    protected TpEndereco enderecoTomador;
    @XmlElement(name = "EmailTomador")
    protected String emailTomador;
    @XmlElement(name = "Discriminacao", required = true)
    protected String discriminacao;

    /**
     * Gets the value of the assinatura property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getAssinatura() {
        return assinatura;
    }

    /**
     * Sets the value of the assinatura property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setAssinatura(byte[] value) {
        this.assinatura = ((byte[]) value);
    }

    /**
     * Gets the value of the chaveRPS property.
     * 
     * @return
     *     possible object is
     *     {@link TpChaveRPS }
     *     
     */
    public TpChaveRPS getChaveRPS() {
        return chaveRPS;
    }

    /**
     * Sets the value of the chaveRPS property.
     * 
     * @param value
     *     allowed object is
     *     {@link TpChaveRPS }
     *     
     */
    public void setChaveRPS(TpChaveRPS value) {
        this.chaveRPS = value;
    }

    /**
     * Gets the value of the tipoRPS property.
     * 
     * @return
     *     possible object is
     *     {@link TpTipoRPS }
     *     
     */
    public TpTipoRPS getTipoRPS() {
        return tipoRPS;
    }

    /**
     * Sets the value of the tipoRPS property.
     * 
     * @param value
     *     allowed object is
     *     {@link TpTipoRPS }
     *     
     */
    public void setTipoRPS(TpTipoRPS value) {
        this.tipoRPS = value;
    }

    /**
     * Gets the value of the dataEmissao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataEmissao() {
        return dataEmissao;
    }

    /**
     * Sets the value of the dataEmissao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataEmissao(XMLGregorianCalendar value) {
        this.dataEmissao = value;
    }

    /**
     * Gets the value of the statusRPS property.
     * 
     * @return
     *     possible object is
     *     {@link TpStatusNFe }
     *     
     */
    public TpStatusNFe getStatusRPS() {
        return statusRPS;
    }

    /**
     * Sets the value of the statusRPS property.
     * 
     * @param value
     *     allowed object is
     *     {@link TpStatusNFe }
     *     
     */
    public void setStatusRPS(TpStatusNFe value) {
        this.statusRPS = value;
    }

    /**
     * Gets the value of the tributacaoRPS property.
     * 
     * @return
     *     possible object is
     *     {@link TpTributacaoNFe }
     *     
     */
    public TpTributacaoNFe getTributacaoRPS() {
        return tributacaoRPS;
    }

    /**
     * Sets the value of the tributacaoRPS property.
     * 
     * @param value
     *     allowed object is
     *     {@link TpTributacaoNFe }
     *     
     */
    public void setTributacaoRPS(TpTributacaoNFe value) {
        this.tributacaoRPS = value;
    }

    /**
     * Gets the value of the valorServicos property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorServicos() {
        return valorServicos;
    }

    /**
     * Sets the value of the valorServicos property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorServicos(BigDecimal value) {
        this.valorServicos = value;
    }

    /**
     * Gets the value of the valorDeducoes property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorDeducoes() {
        return valorDeducoes;
    }

    /**
     * Sets the value of the valorDeducoes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorDeducoes(BigDecimal value) {
        this.valorDeducoes = value;
    }

    /**
     * Gets the value of the valorPIS property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorPIS() {
        return valorPIS;
    }

    /**
     * Sets the value of the valorPIS property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorPIS(BigDecimal value) {
        this.valorPIS = value;
    }

    /**
     * Gets the value of the valorCOFINS property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorCOFINS() {
        return valorCOFINS;
    }

    /**
     * Sets the value of the valorCOFINS property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorCOFINS(BigDecimal value) {
        this.valorCOFINS = value;
    }

    /**
     * Gets the value of the valorINSS property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorINSS() {
        return valorINSS;
    }

    /**
     * Sets the value of the valorINSS property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorINSS(BigDecimal value) {
        this.valorINSS = value;
    }

    /**
     * Gets the value of the valorIR property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorIR() {
        return valorIR;
    }

    /**
     * Sets the value of the valorIR property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorIR(BigDecimal value) {
        this.valorIR = value;
    }

    /**
     * Gets the value of the valorCSLL property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorCSLL() {
        return valorCSLL;
    }

    /**
     * Sets the value of the valorCSLL property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorCSLL(BigDecimal value) {
        this.valorCSLL = value;
    }

    /**
     * Gets the value of the codigoServico property.
     * 
     */
    public int getCodigoServico() {
        return codigoServico;
    }

    /**
     * Sets the value of the codigoServico property.
     * 
     */
    public void setCodigoServico(int value) {
        this.codigoServico = value;
    }

    /**
     * Gets the value of the aliquotaServicos property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAliquotaServicos() {
        return aliquotaServicos;
    }

    /**
     * Sets the value of the aliquotaServicos property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAliquotaServicos(BigDecimal value) {
        this.aliquotaServicos = value;
    }

    /**
     * Gets the value of the issRetido property.
     * 
     */
    public boolean isISSRetido() {
        return issRetido;
    }

    /**
     * Sets the value of the issRetido property.
     * 
     */
    public void setISSRetido(boolean value) {
        this.issRetido = value;
    }

    /**
     * Gets the value of the cpfcnpjTomador property.
     * 
     * @return
     *     possible object is
     *     {@link TpCPFCNPJ }
     *     
     */
    public TpCPFCNPJ getCPFCNPJTomador() {
        return cpfcnpjTomador;
    }

    /**
     * Sets the value of the cpfcnpjTomador property.
     * 
     * @param value
     *     allowed object is
     *     {@link TpCPFCNPJ }
     *     
     */
    public void setCPFCNPJTomador(TpCPFCNPJ value) {
        this.cpfcnpjTomador = value;
    }

    /**
     * Gets the value of the inscricaoMunicipalTomador property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInscricaoMunicipalTomador() {
        return inscricaoMunicipalTomador;
    }

    /**
     * Sets the value of the inscricaoMunicipalTomador property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInscricaoMunicipalTomador(Long value) {
        this.inscricaoMunicipalTomador = value;
    }

    /**
     * Gets the value of the inscricaoEstadualTomador property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInscricaoEstadualTomador() {
        return inscricaoEstadualTomador;
    }

    /**
     * Sets the value of the inscricaoEstadualTomador property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInscricaoEstadualTomador(Long value) {
        this.inscricaoEstadualTomador = value;
    }

    /**
     * Gets the value of the razaoSocialTomador property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazaoSocialTomador() {
        return razaoSocialTomador;
    }

    /**
     * Sets the value of the razaoSocialTomador property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazaoSocialTomador(String value) {
        this.razaoSocialTomador = value;
    }

    /**
     * Gets the value of the enderecoTomador property.
     * 
     * @return
     *     possible object is
     *     {@link TpEndereco }
     *     
     */
    public TpEndereco getEnderecoTomador() {
        return enderecoTomador;
    }

    /**
     * Sets the value of the enderecoTomador property.
     * 
     * @param value
     *     allowed object is
     *     {@link TpEndereco }
     *     
     */
    public void setEnderecoTomador(TpEndereco value) {
        this.enderecoTomador = value;
    }

    /**
     * Gets the value of the emailTomador property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailTomador() {
        return emailTomador;
    }

    /**
     * Sets the value of the emailTomador property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailTomador(String value) {
        this.emailTomador = value;
    }

    /**
     * Gets the value of the discriminacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscriminacao() {
        return discriminacao;
    }

    /**
     * Sets the value of the discriminacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscriminacao(String value) {
        this.discriminacao = value;
    }

}