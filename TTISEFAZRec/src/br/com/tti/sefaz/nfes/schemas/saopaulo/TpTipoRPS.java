//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.23 at 10:32:33 AM BRST 
//


package br.com.tti.sefaz.nfes.schemas.saopaulo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tpTipoRPS.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tpTipoRPS">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RPS"/>
 *     &lt;enumeration value="RPS-M"/>
 *     &lt;enumeration value="RPS-C"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tpTipoRPS")
@XmlEnum
public enum TpTipoRPS {

    RPS("RPS"),
    @XmlEnumValue("RPS-M")
    RPS_M("RPS-M"),
    @XmlEnumValue("RPS-C")
    RPS_C("RPS-C");
    private final String value;

    TpTipoRPS(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TpTipoRPS fromValue(String v) {
        for (TpTipoRPS c: TpTipoRPS.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}