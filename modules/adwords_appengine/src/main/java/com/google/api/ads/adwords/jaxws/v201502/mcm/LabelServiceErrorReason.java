
package com.google.api.ads.adwords.jaxws.v201502.mcm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LabelServiceError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LabelServiceError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EMPTY_LABEL_NAME"/>
 *     &lt;enumeration value="LABEL_NAME_TOO_LONG"/>
 *     &lt;enumeration value="DUPLICATE_LABEL_NAME"/>
 *     &lt;enumeration value="RESERVED_LABEL_NAME"/>
 *     &lt;enumeration value="CANNOT_BE_DELETED"/>
 *     &lt;enumeration value="TOO_MANY_LABELS"/>
 *     &lt;enumeration value="INVALID_LABEL_ID"/>
 *     &lt;enumeration value="SERVER_CLIENT_VERSION_MISMATCH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LabelServiceError.Reason")
@XmlEnum
public enum LabelServiceErrorReason {


    /**
     * 
     *                 The label name is empty.
     *               
     * 
     */
    EMPTY_LABEL_NAME,

    /**
     * 
     *                 The label name is longer than max allowed size.
     *               
     * 
     */
    LABEL_NAME_TOO_LONG,

    /**
     * 
     *                 The customer already has an active label with the same name.
     *               
     * 
     */
    DUPLICATE_LABEL_NAME,

    /**
     * 
     *                 The label name is reserved by the system.
     *               
     * 
     */
    RESERVED_LABEL_NAME,

    /**
     * 
     *                 The label cannot be deleted
     *               
     * 
     */
    CANNOT_BE_DELETED,

    /**
     * 
     *                 A customer cannot own more than 200 labels.
     *               
     * 
     */
    TOO_MANY_LABELS,

    /**
     * 
     *                 Label id was not found.
     *               
     * 
     */
    INVALID_LABEL_ID,

    /**
     * 
     *                 An unknown enum value has been given for this error reason.
     *               
     * 
     */
    SERVER_CLIENT_VERSION_MISMATCH;

    public String value() {
        return name();
    }

    public static LabelServiceErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
