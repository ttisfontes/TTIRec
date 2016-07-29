//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.07.03 at 02:45:07 PM BRT 
//


package br.com.tti.sefaz.systemconfig.schema;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for arquivoConfiguracao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="arquivoConfiguracao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="configuracaoSistema" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="conf" type="{}configuracaoSistema" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="versoes_esquemas" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="versao" type="{}listaVersoes" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="cnpjs_cadastrados" type="{}cnpjsCadastrados" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arquivoConfiguracao", propOrder = {
    "configuracaoSistema",
    "versoesEsquemas",
    "cnpjsCadastrados"
})
public class ArquivoConfiguracao {

    protected ArquivoConfiguracao.ConfiguracaoSistema configuracaoSistema;
    @XmlElement(name = "versoes_esquemas")
    protected ArquivoConfiguracao.VersoesEsquemas versoesEsquemas;
    @XmlElement(name = "cnpjs_cadastrados")
    protected CnpjsCadastrados cnpjsCadastrados;

    /**
     * Gets the value of the configuracaoSistema property.
     * 
     * @return
     *     possible object is
     *     {@link ArquivoConfiguracao.ConfiguracaoSistema }
     *     
     */
    public ArquivoConfiguracao.ConfiguracaoSistema getConfiguracaoSistema() {
        return configuracaoSistema;
    }

    /**
     * Sets the value of the configuracaoSistema property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArquivoConfiguracao.ConfiguracaoSistema }
     *     
     */
    public void setConfiguracaoSistema(ArquivoConfiguracao.ConfiguracaoSistema value) {
        this.configuracaoSistema = value;
    }

    /**
     * Gets the value of the versoesEsquemas property.
     * 
     * @return
     *     possible object is
     *     {@link ArquivoConfiguracao.VersoesEsquemas }
     *     
     */
    public ArquivoConfiguracao.VersoesEsquemas getVersoesEsquemas() {
        return versoesEsquemas;
    }

    /**
     * Sets the value of the versoesEsquemas property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArquivoConfiguracao.VersoesEsquemas }
     *     
     */
    public void setVersoesEsquemas(ArquivoConfiguracao.VersoesEsquemas value) {
        this.versoesEsquemas = value;
    }

    /**
     * Gets the value of the cnpjsCadastrados property.
     * 
     * @return
     *     possible object is
     *     {@link CnpjsCadastrados }
     *     
     */
    public CnpjsCadastrados getCnpjsCadastrados() {
        return cnpjsCadastrados;
    }

    /**
     * Sets the value of the cnpjsCadastrados property.
     * 
     * @param value
     *     allowed object is
     *     {@link CnpjsCadastrados }
     *     
     */
    public void setCnpjsCadastrados(CnpjsCadastrados value) {
        this.cnpjsCadastrados = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="conf" type="{}configuracaoSistema" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "conf"
    })
    public static class ConfiguracaoSistema {

        protected br.com.tti.sefaz.systemconfig.schema.ConfiguracaoSistema conf;

        /**
         * Gets the value of the conf property.
         * 
         * @return
         *     possible object is
         *     {@link br.com.taragona.nfe.util.xml.sender.config.ConfiguracaoSistema }
         *     
         */
        public br.com.tti.sefaz.systemconfig.schema.ConfiguracaoSistema getConf() {
            return conf;
        }

        /**
         * Sets the value of the conf property.
         * 
         * @param value
         *     allowed object is
         *     {@link br.com.taragona.nfe.util.xml.sender.config.ConfiguracaoSistema }
         *     
         */
        public void setConf(br.com.tti.sefaz.systemconfig.schema.ConfiguracaoSistema value) {
            this.conf = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="versao" type="{}listaVersoes" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "versao"
    })
    public static class VersoesEsquemas {

        protected List<ListaVersoes> versao;

        /**
         * Gets the value of the versao property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the versao property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVersao().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ListaVersoes }
         * 
         * 
         */
        public List<ListaVersoes> getVersao() {
            if (versao == null) {
                versao = new ArrayList<ListaVersoes>();
            }
            return this.versao;
        }

    }

}
