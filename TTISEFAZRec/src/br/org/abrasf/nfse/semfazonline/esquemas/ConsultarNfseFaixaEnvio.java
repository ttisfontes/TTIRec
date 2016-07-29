//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.28 at 09:44:11 AM BRST 
//


package br.org.abrasf.nfse.semfazonline.esquemas;

import java.math.BigInteger;
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
 *       &lt;sequence>
 *         &lt;element name="Prestador" type="{http://www.abrasf.org.br/nfse.xsd}tcIdentificacaoPrestador"/>
 *         &lt;element name="Faixa">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="NumeroNfseInicial" type="{http://www.abrasf.org.br/nfse.xsd}tsNumeroNfse"/>
 *                   &lt;element name="NumeroNfseFinal" type="{http://www.abrasf.org.br/nfse.xsd}tsNumeroNfse" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Pagina" type="{http://www.abrasf.org.br/nfse.xsd}tsPagina"/>
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
    "prestador",
    "faixa",
    "pagina"
})
@XmlRootElement(name = "ConsultarNfseFaixaEnvio")
public class ConsultarNfseFaixaEnvio {

    @XmlElement(name = "Prestador", required = true)
    protected TcIdentificacaoPrestador prestador;
    @XmlElement(name = "Faixa", required = true)
    protected ConsultarNfseFaixaEnvio.Faixa faixa;
    @XmlElement(name = "Pagina")
    protected int pagina;

    /**
     * Gets the value of the prestador property.
     * 
     * @return
     *     possible object is
     *     {@link TcIdentificacaoPrestador }
     *     
     */
    public TcIdentificacaoPrestador getPrestador() {
        return prestador;
    }

    /**
     * Sets the value of the prestador property.
     * 
     * @param value
     *     allowed object is
     *     {@link TcIdentificacaoPrestador }
     *     
     */
    public void setPrestador(TcIdentificacaoPrestador value) {
        this.prestador = value;
    }

    /**
     * Gets the value of the faixa property.
     * 
     * @return
     *     possible object is
     *     {@link ConsultarNfseFaixaEnvio.Faixa }
     *     
     */
    public ConsultarNfseFaixaEnvio.Faixa getFaixa() {
        return faixa;
    }

    /**
     * Sets the value of the faixa property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultarNfseFaixaEnvio.Faixa }
     *     
     */
    public void setFaixa(ConsultarNfseFaixaEnvio.Faixa value) {
        this.faixa = value;
    }

    /**
     * Gets the value of the pagina property.
     * 
     */
    public int getPagina() {
        return pagina;
    }

    /**
     * Sets the value of the pagina property.
     * 
     */
    public void setPagina(int value) {
        this.pagina = value;
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
     *         &lt;element name="NumeroNfseInicial" type="{http://www.abrasf.org.br/nfse.xsd}tsNumeroNfse"/>
     *         &lt;element name="NumeroNfseFinal" type="{http://www.abrasf.org.br/nfse.xsd}tsNumeroNfse" minOccurs="0"/>
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
        "numeroNfseInicial",
        "numeroNfseFinal"
    })
    public static class Faixa {

        @XmlElement(name = "NumeroNfseInicial", required = true)
        protected BigInteger numeroNfseInicial;
        @XmlElement(name = "NumeroNfseFinal")
        protected BigInteger numeroNfseFinal;

        /**
         * Gets the value of the numeroNfseInicial property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNumeroNfseInicial() {
            return numeroNfseInicial;
        }

        /**
         * Sets the value of the numeroNfseInicial property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNumeroNfseInicial(BigInteger value) {
            this.numeroNfseInicial = value;
        }

        /**
         * Gets the value of the numeroNfseFinal property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNumeroNfseFinal() {
            return numeroNfseFinal;
        }

        /**
         * Sets the value of the numeroNfseFinal property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNumeroNfseFinal(BigInteger value) {
            this.numeroNfseFinal = value;
        }

    }

}
