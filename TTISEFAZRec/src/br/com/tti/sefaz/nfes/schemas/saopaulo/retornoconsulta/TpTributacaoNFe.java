//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.12 at 03:50:08 PM BRT 
//

package br.com.tti.sefaz.nfes.schemas.saopaulo.retornoconsulta;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for tpTributacaoNFe.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="tpTributacaoNFe">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="T"/>
 *     &lt;enumeration value="F"/>
 *     &lt;enumeration value="I"/>
 *     &lt;enumeration value="J"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tpTributacaoNFe")
@XmlEnum
public enum TpTributacaoNFe implements Serializable {

	T, F, I, J;

	public String value() {
		return name();
	}

	public static TpTributacaoNFe fromValue(String v) {
		return valueOf(v);
	}

}
