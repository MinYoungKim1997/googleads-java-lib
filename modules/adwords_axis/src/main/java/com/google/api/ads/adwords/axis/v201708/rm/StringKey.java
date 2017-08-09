// Copyright 2017 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/**
 * StringKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201708.rm;


/**
 * Custom parameter of type string. For websites, there are two built-in
 * parameters
 *             URL (name = 'url__') and referrer URL (name = 'ref_url__').
 */
public class StringKey  implements java.io.Serializable {
    /* <span class="constraint MatchesRegex">A name must begin with
     * US-ascii letters or underscore or UTF8 code that is greater than 127
     * and consist of US-ascii letters or digits or underscore or UTF8 code
     * that is greater than 127. This is checked by the regular expression
     * '^[a-zA-Z_?-?][a-zA-Z0-9_?-?]*$'.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     *                 <span class="constraint StringLength">This string
     * must not be empty, (trimmed).</span> */
    private java.lang.String name;

    public StringKey() {
    }

    public StringKey(
           java.lang.String name) {
           this.name = name;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("name", getName())
            .toString();
    }

    /**
     * Gets the name value for this StringKey.
     * 
     * @return name   * <span class="constraint MatchesRegex">A name must begin with
     * US-ascii letters or underscore or UTF8 code that is greater than 127
     * and consist of US-ascii letters or digits or underscore or UTF8 code
     * that is greater than 127. This is checked by the regular expression
     * '^[a-zA-Z_?-?][a-zA-Z0-9_?-?]*$'.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     *                 <span class="constraint StringLength">This string
     * must not be empty, (trimmed).</span>
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this StringKey.
     * 
     * @param name   * <span class="constraint MatchesRegex">A name must begin with
     * US-ascii letters or underscore or UTF8 code that is greater than 127
     * and consist of US-ascii letters or digits or underscore or UTF8 code
     * that is greater than 127. This is checked by the regular expression
     * '^[a-zA-Z_?-?][a-zA-Z0-9_?-?]*$'.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     *                 <span class="constraint StringLength">This string
     * must not be empty, (trimmed).</span>
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StringKey)) return false;
        StringKey other = (StringKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StringKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201708", "StringKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201708", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
