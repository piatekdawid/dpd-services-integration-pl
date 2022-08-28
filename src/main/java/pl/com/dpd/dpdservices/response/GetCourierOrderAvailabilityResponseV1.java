/**
 * GetCourierOrderAvailabilityResponseV1.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.dpd.dpdservices.response;

public class GetCourierOrderAvailabilityResponseV1 implements java.io.Serializable {
    private pl.com.dpd.dpdservices.CourierOrderAvailabilityRangeV1[] ranges;

    private java.lang.String status;

    public GetCourierOrderAvailabilityResponseV1() {
    }

    public GetCourierOrderAvailabilityResponseV1(
            pl.com.dpd.dpdservices.CourierOrderAvailabilityRangeV1[] ranges,
            java.lang.String status) {
        this.ranges = ranges;
        this.status = status;
    }


    /**
     * Gets the ranges value for this GetCourierOrderAvailabilityResponseV1.
     *
     * @return ranges
     */
    public pl.com.dpd.dpdservices.CourierOrderAvailabilityRangeV1[] getRanges() {
        return ranges;
    }


    /**
     * Sets the ranges value for this GetCourierOrderAvailabilityResponseV1.
     *
     * @param ranges
     */
    public void setRanges(pl.com.dpd.dpdservices.CourierOrderAvailabilityRangeV1[] ranges) {
        this.ranges = ranges;
    }

    public pl.com.dpd.dpdservices.CourierOrderAvailabilityRangeV1 getRanges(int i) {
        return this.ranges[i];
    }

    public void setRanges(int i, pl.com.dpd.dpdservices.CourierOrderAvailabilityRangeV1 _value) {
        this.ranges[i] = _value;
    }


    /**
     * Gets the status value for this GetCourierOrderAvailabilityResponseV1.
     *
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this GetCourierOrderAvailabilityResponseV1.
     *
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCourierOrderAvailabilityResponseV1)) return false;
        GetCourierOrderAvailabilityResponseV1 other = (GetCourierOrderAvailabilityResponseV1) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.ranges == null && other.getRanges() == null) ||
                        (this.ranges != null &&
                                java.util.Arrays.equals(this.ranges, other.getRanges()))) &&
                ((this.status == null && other.getStatus() == null) ||
                        (this.status != null &&
                                this.status.equals(other.getStatus())));
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
        if (getRanges() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getRanges());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRanges(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(GetCourierOrderAvailabilityResponseV1.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "getCourierOrderAvailabilityResponseV1"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ranges");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ranges"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "courierOrderAvailabilityRangeV1"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
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
