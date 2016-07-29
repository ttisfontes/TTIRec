//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.12.01 at 10:12:03 AM BRST 
//

package br.com.tti.nfev200;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Tipo Retorno de Pedido de Consulta da Situa��o Atual da Nota Fiscal
 * Eletr�nica
 * 
 * <p>
 * Java class for TRetConsSitNFe complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="TRetConsSitNFe">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpAmb" type="{http://www.portalfiscal.inf.br/nfe}TAmb"/>
 *         &lt;element name="verAplic" type="{http://www.portalfiscal.inf.br/nfe}TVerAplic"/>
 *         &lt;element name="cStat" type="{http://www.portalfiscal.inf.br/nfe}TStat"/>
 *         &lt;element name="xMotivo" type="{http://www.portalfiscal.inf.br/nfe}TMotivo"/>
 *         &lt;element name="cUF" type="{http://www.portalfiscal.inf.br/nfe}TCodUfIBGE"/>
 *         &lt;element name="chNFe" type="{http://www.portalfiscal.inf.br/nfe}TChNFe"/>
 *         &lt;element name="protNFe" type="{http://www.portalfiscal.inf.br/nfe}TProtNFe" minOccurs="0"/>
 *         &lt;element name="retCancNFe" type="{http://www.portalfiscal.inf.br/nfe}TRetCancNFe" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="versao" use="required" type="{http://www.portalfiscal.inf.br/nfe}TVerConsSitNFe" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TRetConsSitNFe", propOrder = { "tpAmb", "verAplic", "cStat",
		"xMotivo", "cuf", "chNFe", "protNFe", "retCancNFe" })
@XmlRootElement(name = "retConsSitNFe")
public class TRetConsSitNFe {

	@XmlElement(required = true)
	protected String tpAmb;
	@XmlElement(required = true)
	protected String verAplic;
	@XmlElement(required = true)
	protected String cStat;
	@XmlElement(required = true)
	protected String xMotivo;
	@XmlElement(name = "cUF", required = true)
	protected String cuf;
	@XmlElement(required = true)
	protected String chNFe;
	protected TProtNFe protNFe;
	protected TRetCancNFe retCancNFe;
	@XmlAttribute(required = true)
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	protected String versao;

	/**
	 * Gets the value of the tpAmb property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTpAmb() {
		return tpAmb;
	}

	/**
	 * Sets the value of the tpAmb property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTpAmb(String value) {
		this.tpAmb = value;
	}

	/**
	 * Gets the value of the verAplic property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVerAplic() {
		return verAplic;
	}

	/**
	 * Sets the value of the verAplic property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVerAplic(String value) {
		this.verAplic = value;
	}

	/**
	 * Gets the value of the cStat property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCStat() {
		return cStat;
	}

	/**
	 * Sets the value of the cStat property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCStat(String value) {
		this.cStat = value;
	}

	/**
	 * Gets the value of the xMotivo property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getXMotivo() {
		return xMotivo;
	}

	/**
	 * Sets the value of the xMotivo property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setXMotivo(String value) {
		this.xMotivo = value;
	}

	/**
	 * Gets the value of the cuf property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCUF() {
		return cuf;
	}

	/**
	 * Sets the value of the cuf property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCUF(String value) {
		this.cuf = value;
	}

	/**
	 * Gets the value of the chNFe property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getChNFe() {
		return chNFe;
	}

	/**
	 * Sets the value of the chNFe property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setChNFe(String value) {
		this.chNFe = value;
	}

	/**
	 * Gets the value of the protNFe property.
	 * 
	 * @return possible object is {@link TProtNFe }
	 * 
	 */
	public TProtNFe getProtNFe() {
		return protNFe;
	}

	/**
	 * Sets the value of the protNFe property.
	 * 
	 * @param value
	 *            allowed object is {@link TProtNFe }
	 * 
	 */
	public void setProtNFe(TProtNFe value) {
		this.protNFe = value;
	}

	/**
	 * Gets the value of the retCancNFe property.
	 * 
	 * @return possible object is {@link TRetCancNFe }
	 * 
	 */
	public TRetCancNFe getRetCancNFe() {
		return retCancNFe;
	}

	/**
	 * Sets the value of the retCancNFe property.
	 * 
	 * @param value
	 *            allowed object is {@link TRetCancNFe }
	 * 
	 */
	public void setRetCancNFe(TRetCancNFe value) {
		this.retCancNFe = value;
	}

	/**
	 * Gets the value of the versao property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVersao() {
		return versao;
	}

	/**
	 * Sets the value of the versao property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVersao(String value) {
		this.versao = value;
	}

}