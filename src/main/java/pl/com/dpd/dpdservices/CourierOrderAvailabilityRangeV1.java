/**
 * CourierOrderAvailabilityRangeV1.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.dpd.dpdservices;

public class CourierOrderAvailabilityRangeV1 implements java.io.Serializable {
    private java.lang.Integer offset;

    private java.lang.String range;

    public CourierOrderAvailabilityRangeV1() {
    }

    public CourierOrderAvailabilityRangeV1(
            java.lang.Integer offset,
            java.lang.String range) {
        this.offset = offset;
        this.range = range;
    }


    /**
     * Gets the offset value for this CourierOrderAvailabilityRangeV1.
     *
     * @return offset
     */
    public java.lang.Integer getOffset() {
        return offset;
    }


    /**
     * Sets the offset value for this CourierOrderAvailabilityRangeV1.
     *
     * @param offset
     */
    public void setOffset(java.lang.Integer offset) {
        this.offset = offset;
    }


    /**
     * Gets the range value for this CourierOrderAvailabilityRangeV1.
     *
     * @return range
     */
    public java.lang.String getRange() {
        return range;
    }


    /**
     * Sets the range value for this CourierOrderAvailabilityRangeV1.
     *
     * @param range
     */
    public void setRange(java.lang.String range) {
        this.range = range;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CourierOrderAvailabilityRangeV1)) return false;
        CourierOrderAvailabilityRangeV1 other = (CourierOrderAvailabilityRangeV1) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.offset == null && other.getOffset() == null) ||
                        (this.offset != null &&
                                this.offset.equals(other.getOffset()))) &&
                ((this.range == null && other.getRange() == null) ||
                        (this.range != null &&
                                this.range.equals(other.getRange())));
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
        if (getOffset() != null) {
            _hashCode += getOffset().hashCode();
        }
        if (getRange() != null) {
            _hashCode += getRange().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(CourierOrderAvailabilityRangeV1.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "courierOrderAvailabilityRangeV1"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offset");
        elemField.setXmlName(new javax.xml.namespace.QName("", "offset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("range");
        elemField.setXmlName(new javax.xml.namespace.QName("", "range"));
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
