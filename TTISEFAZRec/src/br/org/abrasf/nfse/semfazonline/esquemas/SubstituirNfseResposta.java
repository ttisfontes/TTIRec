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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="RetSubstituicao">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="NfseSubstituida">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://www.abrasf.org.br/nfse.xsd}CompNfse"/>
 *                             &lt;element ref="{http://www.abrasf.org.br/nfse.xsd}ListaMensagemAlertaRetorno" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="NfseSubstituidora">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://www.abrasf.org.br/nfse.xsd}CompNfse"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.abrasf.org.br/nfse.xsd}ListaMensagemRetorno"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "retSubstituicao",
    "listaMensagemRetorno"
})
@XmlRootElement(name = "SubstituirNfseResposta")
public class SubstituirNfseResposta {

    @XmlElement(name = "RetSubstituicao")
    protected SubstituirNfseResposta.RetSubstituicao retSubstituicao;
    @XmlElement(name = "ListaMensagemRetorno")
    protected ListaMensagemRetorno listaMensagemRetorno;

    /**
     * Gets the value of the retSubstituicao property.
     * 
     * @return
     *     possible object is
     *     {@link SubstituirNfseResposta.RetSubstituicao }
     *     
     */
    public SubstituirNfseResposta.RetSubstituicao getRetSubstituicao() {
        return retSubstituicao;
    }

    /**
     * Sets the value of the retSubstituicao property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubstituirNfseResposta.RetSubstituicao }
     *     
     */
    public void setRetSubstituicao(SubstituirNfseResposta.RetSubstituicao value) {
        this.retSubstituicao = value;
    }

    /**
     * Gets the value of the listaMensagemRetorno property.
     * 
     * @return
     *     possible object is
     *     {@link ListaMensagemRetorno }
     *     
     */
    public ListaMensagemRetorno getListaMensagemRetorno() {
        return listaMensagemRetorno;
    }

    /**
     * Sets the value of the listaMensagemRetorno property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaMensagemRetorno }
     *     
     */
    public void setListaMensagemRetorno(ListaMensagemRetorno value) {
        this.listaMensagemRetorno = value;
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
     *         &lt;element name="NfseSubstituida">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://www.abrasf.org.br/nfse.xsd}CompNfse"/>
     *                   &lt;element ref="{http://www.abrasf.org.br/nfse.xsd}ListaMensagemAlertaRetorno" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="NfseSubstituidora">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://www.abrasf.org.br/nfse.xsd}CompNfse"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "nfseSubstituida",
        "nfseSubstituidora"
    })
    public static class RetSubstituicao {

        @XmlElement(name = "NfseSubstituida", required = true)
        protected SubstituirNfseResposta.RetSubstituicao.NfseSubstituida nfseSubstituida;
        @XmlElement(name = "NfseSubstituidora", required = true)
        protected SubstituirNfseResposta.RetSubstituicao.NfseSubstituidora nfseSubstituidora;

        /**
         * Gets the value of the nfseSubstituida property.
         * 
         * @return
         *     possible object is
         *     {@link SubstituirNfseResposta.RetSubstituicao.NfseSubstituida }
         *     
         */
        public SubstituirNfseResposta.RetSubstituicao.NfseSubstituida getNfseSubstituida() {
            return nfseSubstituida;
        }

        /**
         * Sets the value of the nfseSubstituida property.
         * 
         * @param value
         *     allowed object is
         *     {@link SubstituirNfseResposta.RetSubstituicao.NfseSubstituida }
         *     
         */
        public void setNfseSubstituida(SubstituirNfseResposta.RetSubstituicao.NfseSubstituida value) {
            this.nfseSubstituida = value;
        }

        /**
         * Gets the value of the nfseSubstituidora property.
         * 
         * @return
         *     possible object is
         *     {@link SubstituirNfseResposta.RetSubstituicao.NfseSubstituidora }
         *     
         */
        public SubstituirNfseResposta.RetSubstituicao.NfseSubstituidora getNfseSubstituidora() {
            return nfseSubstituidora;
        }

        /**
         * Sets the value of the nfseSubstituidora property.
         * 
         * @param value
         *     allowed object is
         *     {@link SubstituirNfseResposta.RetSubstituicao.NfseSubstituidora }
         *     
         */
        public void setNfseSubstituidora(SubstituirNfseResposta.RetSubstituicao.NfseSubstituidora value) {
            this.nfseSubstituidora = value;
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
         *         &lt;element ref="{http://www.abrasf.org.br/nfse.xsd}CompNfse"/>
         *         &lt;element ref="{http://www.abrasf.org.br/nfse.xsd}ListaMensagemAlertaRetorno" minOccurs="0"/>
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
            "compNfse",
            "listaMensagemAlertaRetorno"
        })
        public static class NfseSubstituida {

            @XmlElement(name = "CompNfse", required = true)
            protected TcCompNfse compNfse;
            @XmlElement(name = "ListaMensagemAlertaRetorno")
            protected ListaMensagemAlertaRetorno listaMensagemAlertaRetorno;

            /**
             * Gets the value of the compNfse property.
             * 
             * @return
             *     possible object is
             *     {@link TcCompNfse }
             *     
             */
            public TcCompNfse getCompNfse() {
                return compNfse;
            }

            /**
             * Sets the value of the compNfse property.
             * 
             * @param value
             *     allowed object is
             *     {@link TcCompNfse }
             *     
             */
            public void setCompNfse(TcCompNfse value) {
                this.compNfse = value;
            }

            /**
             * Gets the value of the listaMensagemAlertaRetorno property.
             * 
             * @return
             *     possible object is
             *     {@link ListaMensagemAlertaRetorno }
             *     
             */
            public ListaMensagemAlertaRetorno getListaMensagemAlertaRetorno() {
                return listaMensagemAlertaRetorno;
            }

            /**
             * Sets the value of the listaMensagemAlertaRetorno property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListaMensagemAlertaRetorno }
             *     
             */
            public void setListaMensagemAlertaRetorno(ListaMensagemAlertaRetorno value) {
                this.listaMensagemAlertaRetorno = value;
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
         *         &lt;element ref="{http://www.abrasf.org.br/nfse.xsd}CompNfse"/>
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
            "compNfse"
        })
        public static class NfseSubstituidora {

            @XmlElement(name = "CompNfse", required = true)
            protected TcCompNfse compNfse;

            /**
             * Gets the value of the compNfse property.
             * 
             * @return
             *     possible object is
             *     {@link TcCompNfse }
             *     
             */
            public TcCompNfse getCompNfse() {
                return compNfse;
            }

            /**
             * Sets the value of the compNfse property.
             * 
             * @param value
             *     allowed object is
             *     {@link TcCompNfse }
             *     
             */
            public void setCompNfse(TcCompNfse value) {
                this.compNfse = value;
            }

        }

    }

}
