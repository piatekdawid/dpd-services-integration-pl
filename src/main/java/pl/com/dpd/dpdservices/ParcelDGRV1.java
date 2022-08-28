/**
 * ParcelDGRV1.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.dpd.dpdservices;

public class ParcelDGRV1 implements java.io.Serializable {
    private java.lang.Long parcelId;

    private java.lang.String reference;

    private pl.com.dpd.dpdservices.StatusInfoDGRV1 statusInfo;

    private java.lang.String waybill;

    public ParcelDGRV1() {
    }

    public ParcelDGRV1(
            java.lang.Long parcelId,
            java.lang.String reference,
            pl.com.dpd.dpdservices.StatusInfoDGRV1 statusInfo,
            java.lang.String waybill) {
        this.parcelId = parcelId;
        this.reference = reference;
        this.statusInfo = statusInfo;
        this.waybill = waybill;
    }


    /**
     * Gets the parcelId value for this ParcelDGRV1.
     *
     * @return parcelId
     */
    public java.lang.Long getParcelId() {
        return parcelId;
    }


    /**
     * Sets the parcelId value for this ParcelDGRV1.
     *
     * @param parcelId
     */
    public void setParcelId(java.lang.Long parcelId) {
        this.parcelId = parcelId;
    }


    /**
     * Gets the reference value for this ParcelDGRV1.
     *
     * @return reference
     */
    public java.lang.String getReference() {
        return reference;
    }


    /**
     * Sets the reference value for this ParcelDGRV1.
     *
     * @param reference
     */
    public void setReference(java.lang.String reference) {
        this.reference = reference;
    }


    /**
     * Gets the statusInfo value for this ParcelDGRV1.
     *
     * @return statusInfo
     */
    public pl.com.dpd.dpdservices.StatusInfoDGRV1 getStatusInfo() {
        return statusInfo;
    }


    /**
     * Sets the statusInfo value for this ParcelDGRV1.
     *
     * @param statusInfo
     */
    public void setStatusInfo(pl.com.dpd.dpdservices.StatusInfoDGRV1 statusInfo) {
        this.statusInfo = statusInfo;
    }


    /**
     * Gets the waybill value for this ParcelDGRV1.
     *
     * @return waybill
     */
    public java.lang.String getWaybill() {
        return waybill;
    }


    /**
     * Sets the waybill value for this ParcelDGRV1.
     *
     * @param waybill
     */
    public void setWaybill(java.lang.String waybill) {
        this.waybill = waybill;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ParcelDGRV1)) return false;
        ParcelDGRV1 other = (ParcelDGRV1) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.parcelId == null && other.getParcelId() == null) ||
                        (this.parcelId != null &&
                                this.parcelId.equals(other.getParcelId()))) &&
                ((this.reference == null && other.getReference() == null) ||
                        (this.reference != null &&
                                this.reference.equals(other.getReference()))) &&
                ((this.statusInfo == null && other.getStatusInfo() == null) ||
                        (this.statusInfo != null &&
                                this.statusInfo.equals(other.getStatusInfo()))) &&
                ((this.waybill == null && other.getWaybill() == null) ||
                        (this.waybill != null &&
                                this.waybill.equals(other.getWaybill())));
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
        if (getParcelId() != null) {
            _hashCode += getParcelId().hashCode();
        }
        if (getReference() != null) {
            _hashCode += getReference().hashCode();
        }
        if (getStatusInfo() != null) {
            _hashCode += getStatusInfo().hashCode();
        }
        if (getWaybill() != null) {
            _hashCode += getWaybill().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ParcelDGRV1.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "parcelDGRV1"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parcelId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parcelId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statusInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "statusInfoDGRV1"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("waybill");
        elemField.setXmlName(new javax.xml.namespace.QName("", "waybill"));
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
                new org.apache.axis.encoding.ser.BeanSerializer(
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
                new org.apache.axis.encoding.ser.BeanDeserializer(
                        _javaType, _xmlType, typeDesc);
    }

}
