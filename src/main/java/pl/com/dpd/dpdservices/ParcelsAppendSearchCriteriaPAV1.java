/**
 * ParcelsAppendSearchCriteriaPAV1.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.dpd.dpdservices;

public class ParcelsAppendSearchCriteriaPAV1 implements java.io.Serializable {
    private long packageId;

    private java.lang.String reference;

    private java.lang.String waybill;

    public ParcelsAppendSearchCriteriaPAV1() {
    }

    public ParcelsAppendSearchCriteriaPAV1(
            long packageId,
            java.lang.String reference,
            java.lang.String waybill) {
        this.packageId = packageId;
        this.reference = reference;
        this.waybill = waybill;
    }


    /**
     * Gets the packageId value for this ParcelsAppendSearchCriteriaPAV1.
     *
     * @return packageId
     */
    public long getPackageId() {
        return packageId;
    }


    /**
     * Sets the packageId value for this ParcelsAppendSearchCriteriaPAV1.
     *
     * @param packageId
     */
    public void setPackageId(long packageId) {
        this.packageId = packageId;
    }


    /**
     * Gets the reference value for this ParcelsAppendSearchCriteriaPAV1.
     *
     * @return reference
     */
    public java.lang.String getReference() {
        return reference;
    }


    /**
     * Sets the reference value for this ParcelsAppendSearchCriteriaPAV1.
     *
     * @param reference
     */
    public void setReference(java.lang.String reference) {
        this.reference = reference;
    }


    /**
     * Gets the waybill value for this ParcelsAppendSearchCriteriaPAV1.
     *
     * @return waybill
     */
    public java.lang.String getWaybill() {
        return waybill;
    }


    /**
     * Sets the waybill value for this ParcelsAppendSearchCriteriaPAV1.
     *
     * @param waybill
     */
    public void setWaybill(java.lang.String waybill) {
        this.waybill = waybill;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ParcelsAppendSearchCriteriaPAV1)) return false;
        ParcelsAppendSearchCriteriaPAV1 other = (ParcelsAppendSearchCriteriaPAV1) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.packageId == other.getPackageId() &&
                ((this.reference == null && other.getReference() == null) ||
                        (this.reference != null &&
                                this.reference.equals(other.getReference()))) &&
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
        _hashCode += new Long(getPackageId()).hashCode();
        if (getReference() != null) {
            _hashCode += getReference().hashCode();
        }
        if (getWaybill() != null) {
            _hashCode += getWaybill().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ParcelsAppendSearchCriteriaPAV1.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "parcelsAppendSearchCriteriaPAV1"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "packageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
