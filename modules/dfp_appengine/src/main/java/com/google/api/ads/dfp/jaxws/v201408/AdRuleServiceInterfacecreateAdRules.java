
package com.google.api.ads.dfp.jaxws.v201408;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Creates new {@link AdRule} objects.
 *             
 *             @param adRules the ad rules to create
 *             @return the created ad rules with their IDs filled in
 *           
 * 
 * <p>Java class for createAdRules element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="createAdRules">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="adRules" type="{https://www.google.com/apis/ads/publisher/v201408}AdRule" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "adRules"
})
@XmlRootElement(name = "createAdRules")
public class AdRuleServiceInterfacecreateAdRules {

    protected List<AdRule> adRules;

    /**
     * Gets the value of the adRules property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adRules property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdRules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdRule }
     * 
     * 
     */
    public List<AdRule> getAdRules() {
        if (adRules == null) {
            adRules = new ArrayList<AdRule>();
        }
        return this.adRules;
    }

}
