/**
 * VpaidLinearRedirectCreative.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201408;


/**
 * A {@code Creative} that displays an externally hosted Flash-based
 * ad
 *             and is served via VAST 2.0 XML.  It is displayed in a
 * linear fashion
 *             with a video (before, after, interrupting).  This creative
 * is read only.
 */
public class VpaidLinearRedirectCreative  extends com.google.api.ads.dfp.axis.v201408.HasDestinationUrlCreative  implements java.io.Serializable {
    /* The IDs of the companion creatives that are associated with
     * this creative.
     *                     This attribute is optional. */
    private long[] companionCreativeIds;

    /* A map from {@code ConversionEvent} to a list of URLs that will
     * be pinged
     *                     when the event happens. This attribute is optional. */
    private com.google.api.ads.dfp.axis.v201408.ConversionEvent_TrackingUrlsMapEntry[] trackingUrls;

    /* A string that is supplied to the VPAID creative's init function.
     * This is written into the VAST XML in the {@code AdParameters} section.
     * This attribute is optional. */
    private java.lang.String customParameters;

    /* Duration in milliseconds for the vpaid ad given no user interaction.
     * This attribute is optional. */
    private java.lang.Integer duration;

    /* The URL where the Flash asset resides. This attribute is required
     * and has
     *                     a maximum length of 1024 characters. */
    private java.lang.String flashUrl;

    /* The size of the flash asset.  Note that this may differ from
     * {@link #size}
     *                     if the asset is not expected to fill the entire
     * video player.  This attribute
     *                     is optional. */
    private com.google.api.ads.dfp.axis.v201408.Size flashAssetSize;

    /* An ad tag URL that will return a preview of the VAST XML response
     * specific
     *                     to this creative.  This attribute is read-only. */
    private java.lang.String vastPreviewUrl;

    public VpaidLinearRedirectCreative() {
    }

    public VpaidLinearRedirectCreative(
           java.lang.Long advertiserId,
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.dfp.axis.v201408.Size size,
           java.lang.String previewUrl,
           com.google.api.ads.dfp.axis.v201408.AppliedLabel[] appliedLabels,
           com.google.api.ads.dfp.axis.v201408.DateTime lastModifiedDateTime,
           com.google.api.ads.dfp.axis.v201408.BaseCustomFieldValue[] customFieldValues,
           java.lang.String creativeType,
           java.lang.String destinationUrl,
           long[] companionCreativeIds,
           com.google.api.ads.dfp.axis.v201408.ConversionEvent_TrackingUrlsMapEntry[] trackingUrls,
           java.lang.String customParameters,
           java.lang.Integer duration,
           java.lang.String flashUrl,
           com.google.api.ads.dfp.axis.v201408.Size flashAssetSize,
           java.lang.String vastPreviewUrl) {
        super(
            advertiserId,
            id,
            name,
            size,
            previewUrl,
            appliedLabels,
            lastModifiedDateTime,
            customFieldValues,
            creativeType,
            destinationUrl);
        this.companionCreativeIds = companionCreativeIds;
        this.trackingUrls = trackingUrls;
        this.customParameters = customParameters;
        this.duration = duration;
        this.flashUrl = flashUrl;
        this.flashAssetSize = flashAssetSize;
        this.vastPreviewUrl = vastPreviewUrl;
    }


    /**
     * Gets the companionCreativeIds value for this VpaidLinearRedirectCreative.
     * 
     * @return companionCreativeIds   * The IDs of the companion creatives that are associated with
     * this creative.
     *                     This attribute is optional.
     */
    public long[] getCompanionCreativeIds() {
        return companionCreativeIds;
    }


    /**
     * Sets the companionCreativeIds value for this VpaidLinearRedirectCreative.
     * 
     * @param companionCreativeIds   * The IDs of the companion creatives that are associated with
     * this creative.
     *                     This attribute is optional.
     */
    public void setCompanionCreativeIds(long[] companionCreativeIds) {
        this.companionCreativeIds = companionCreativeIds;
    }

    public long getCompanionCreativeIds(int i) {
        return this.companionCreativeIds[i];
    }

    public void setCompanionCreativeIds(int i, long _value) {
        this.companionCreativeIds[i] = _value;
    }


    /**
     * Gets the trackingUrls value for this VpaidLinearRedirectCreative.
     * 
     * @return trackingUrls   * A map from {@code ConversionEvent} to a list of URLs that will
     * be pinged
     *                     when the event happens. This attribute is optional.
     */
    public com.google.api.ads.dfp.axis.v201408.ConversionEvent_TrackingUrlsMapEntry[] getTrackingUrls() {
        return trackingUrls;
    }


    /**
     * Sets the trackingUrls value for this VpaidLinearRedirectCreative.
     * 
     * @param trackingUrls   * A map from {@code ConversionEvent} to a list of URLs that will
     * be pinged
     *                     when the event happens. This attribute is optional.
     */
    public void setTrackingUrls(com.google.api.ads.dfp.axis.v201408.ConversionEvent_TrackingUrlsMapEntry[] trackingUrls) {
        this.trackingUrls = trackingUrls;
    }

    public com.google.api.ads.dfp.axis.v201408.ConversionEvent_TrackingUrlsMapEntry getTrackingUrls(int i) {
        return this.trackingUrls[i];
    }

    public void setTrackingUrls(int i, com.google.api.ads.dfp.axis.v201408.ConversionEvent_TrackingUrlsMapEntry _value) {
        this.trackingUrls[i] = _value;
    }


    /**
     * Gets the customParameters value for this VpaidLinearRedirectCreative.
     * 
     * @return customParameters   * A string that is supplied to the VPAID creative's init function.
     * This is written into the VAST XML in the {@code AdParameters} section.
     * This attribute is optional.
     */
    public java.lang.String getCustomParameters() {
        return customParameters;
    }


    /**
     * Sets the customParameters value for this VpaidLinearRedirectCreative.
     * 
     * @param customParameters   * A string that is supplied to the VPAID creative's init function.
     * This is written into the VAST XML in the {@code AdParameters} section.
     * This attribute is optional.
     */
    public void setCustomParameters(java.lang.String customParameters) {
        this.customParameters = customParameters;
    }


    /**
     * Gets the duration value for this VpaidLinearRedirectCreative.
     * 
     * @return duration   * Duration in milliseconds for the vpaid ad given no user interaction.
     * This attribute is optional.
     */
    public java.lang.Integer getDuration() {
        return duration;
    }


    /**
     * Sets the duration value for this VpaidLinearRedirectCreative.
     * 
     * @param duration   * Duration in milliseconds for the vpaid ad given no user interaction.
     * This attribute is optional.
     */
    public void setDuration(java.lang.Integer duration) {
        this.duration = duration;
    }


    /**
     * Gets the flashUrl value for this VpaidLinearRedirectCreative.
     * 
     * @return flashUrl   * The URL where the Flash asset resides. This attribute is required
     * and has
     *                     a maximum length of 1024 characters.
     */
    public java.lang.String getFlashUrl() {
        return flashUrl;
    }


    /**
     * Sets the flashUrl value for this VpaidLinearRedirectCreative.
     * 
     * @param flashUrl   * The URL where the Flash asset resides. This attribute is required
     * and has
     *                     a maximum length of 1024 characters.
     */
    public void setFlashUrl(java.lang.String flashUrl) {
        this.flashUrl = flashUrl;
    }


    /**
     * Gets the flashAssetSize value for this VpaidLinearRedirectCreative.
     * 
     * @return flashAssetSize   * The size of the flash asset.  Note that this may differ from
     * {@link #size}
     *                     if the asset is not expected to fill the entire
     * video player.  This attribute
     *                     is optional.
     */
    public com.google.api.ads.dfp.axis.v201408.Size getFlashAssetSize() {
        return flashAssetSize;
    }


    /**
     * Sets the flashAssetSize value for this VpaidLinearRedirectCreative.
     * 
     * @param flashAssetSize   * The size of the flash asset.  Note that this may differ from
     * {@link #size}
     *                     if the asset is not expected to fill the entire
     * video player.  This attribute
     *                     is optional.
     */
    public void setFlashAssetSize(com.google.api.ads.dfp.axis.v201408.Size flashAssetSize) {
        this.flashAssetSize = flashAssetSize;
    }


    /**
     * Gets the vastPreviewUrl value for this VpaidLinearRedirectCreative.
     * 
     * @return vastPreviewUrl   * An ad tag URL that will return a preview of the VAST XML response
     * specific
     *                     to this creative.  This attribute is read-only.
     */
    public java.lang.String getVastPreviewUrl() {
        return vastPreviewUrl;
    }


    /**
     * Sets the vastPreviewUrl value for this VpaidLinearRedirectCreative.
     * 
     * @param vastPreviewUrl   * An ad tag URL that will return a preview of the VAST XML response
     * specific
     *                     to this creative.  This attribute is read-only.
     */
    public void setVastPreviewUrl(java.lang.String vastPreviewUrl) {
        this.vastPreviewUrl = vastPreviewUrl;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VpaidLinearRedirectCreative)) return false;
        VpaidLinearRedirectCreative other = (VpaidLinearRedirectCreative) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.companionCreativeIds==null && other.getCompanionCreativeIds()==null) || 
             (this.companionCreativeIds!=null &&
              java.util.Arrays.equals(this.companionCreativeIds, other.getCompanionCreativeIds()))) &&
            ((this.trackingUrls==null && other.getTrackingUrls()==null) || 
             (this.trackingUrls!=null &&
              java.util.Arrays.equals(this.trackingUrls, other.getTrackingUrls()))) &&
            ((this.customParameters==null && other.getCustomParameters()==null) || 
             (this.customParameters!=null &&
              this.customParameters.equals(other.getCustomParameters()))) &&
            ((this.duration==null && other.getDuration()==null) || 
             (this.duration!=null &&
              this.duration.equals(other.getDuration()))) &&
            ((this.flashUrl==null && other.getFlashUrl()==null) || 
             (this.flashUrl!=null &&
              this.flashUrl.equals(other.getFlashUrl()))) &&
            ((this.flashAssetSize==null && other.getFlashAssetSize()==null) || 
             (this.flashAssetSize!=null &&
              this.flashAssetSize.equals(other.getFlashAssetSize()))) &&
            ((this.vastPreviewUrl==null && other.getVastPreviewUrl()==null) || 
             (this.vastPreviewUrl!=null &&
              this.vastPreviewUrl.equals(other.getVastPreviewUrl())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getCompanionCreativeIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCompanionCreativeIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCompanionCreativeIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTrackingUrls() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTrackingUrls());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTrackingUrls(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustomParameters() != null) {
            _hashCode += getCustomParameters().hashCode();
        }
        if (getDuration() != null) {
            _hashCode += getDuration().hashCode();
        }
        if (getFlashUrl() != null) {
            _hashCode += getFlashUrl().hashCode();
        }
        if (getFlashAssetSize() != null) {
            _hashCode += getFlashAssetSize().hashCode();
        }
        if (getVastPreviewUrl() != null) {
            _hashCode += getVastPreviewUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VpaidLinearRedirectCreative.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201408", "VpaidLinearRedirectCreative"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companionCreativeIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201408", "companionCreativeIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackingUrls");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201408", "trackingUrls"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201408", "ConversionEvent_TrackingUrlsMapEntry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201408", "customParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duration");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201408", "duration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flashUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201408", "flashUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flashAssetSize");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201408", "flashAssetSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201408", "Size"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vastPreviewUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201408", "vastPreviewUrl"));
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
