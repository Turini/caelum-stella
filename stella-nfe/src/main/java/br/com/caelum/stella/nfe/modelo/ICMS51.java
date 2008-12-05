/**
 * 
 */
package br.com.caelum.stella.nfe.modelo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ICMS51 ", propOrder = { "orig", "cst", "modBC", "pRedBC", "vbc", "picms", "vicms" })
public class ICMS51 {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String orig;
    @XmlElement(name = "CST", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String cst;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String modBC;
    protected String pRedBC;
    @XmlElement(name = "vBC")
    protected String vbc;
    @XmlElement(name = "pICMS")
    protected String picms;
    @XmlElement(name = "vICMS")
    protected String vicms;

    public String getOrig() {
        return orig;
    }

    public void setOrig(String value) {
        this.orig = value;
    }

    public String getCST() {
        return cst;
    }

    public void setCST(String value) {
        this.cst = value;
    }

    public String getModBC() {
        return modBC;
    }

    public void setModBC(String value) {
        this.modBC = value;
    }

    public String getPRedBC() {
        return pRedBC;
    }

    public void setPRedBC(String value) {
        this.pRedBC = value;
    }

    public String getVBC() {
        return vbc;
    }

    public void setVBC(String value) {
        this.vbc = value;
    }

    public String getPICMS() {
        return picms;
    }

    public void setPICMS(String value) {
        this.picms = value;
    }

    public String getVICMS() {
        return vicms;
    }

    public void setVICMS(String value) {
        this.vicms = value;
    }

}