//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.28 at 11:09:48 AM BRST 
//


package br.com.tti.sefaz.nfes.schemas.ginfes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Lista de Detalhes da Consulta de NFSe.
 * 
 * <p>Java class for tpRPSsConsultaNFSe complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tpRPSsConsultaNFSe">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RPS" type="{http://localhost:8080/WsNFe2/tp}tpRPSConsultaNFSe" maxOccurs="50"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tpRPSsConsultaNFSe", propOrder = {
    "rps"
})
public class TpRPSsConsultaNFSe {

    @XmlElement(name = "RPS", required = true)
    protected List<TpRPSConsultaNFSe> rps;

    /**
     * Gets the value of the rps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRPS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TpRPSConsultaNFSe }
     * 
     * 
     */
    public List<TpRPSConsultaNFSe> getRPS() {
        if (rps == null) {
            rps = new ArrayList<TpRPSConsultaNFSe>();
        }
        return this.rps;
    }

}
