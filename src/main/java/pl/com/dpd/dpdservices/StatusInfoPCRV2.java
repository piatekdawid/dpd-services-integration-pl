/**
 * StatusInfoPCRV2.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.dpd.dpdservices;

public class StatusInfoPCRV2 implements java.io.Serializable {
    private pl.com.dpd.dpdservices.ErrorDetailsPCRV2[] errorDetails;

    private java.lang.String status;

    public StatusInfoPCRV2() {
    }

    public StatusInfoPCRV2(
            pl.com.dpd.dpdservices.ErrorDetailsPCRV2[] errorDetails,
            java.lang.String status) {
        this.errorDetails = errorDetails;
        this.status = status;
    }


    /**
     * Gets the errorDetails value for this StatusInfoPCRV2.
     *
     * @return errorDetails
     */
    public pl.com.dpd.dpdservices.ErrorDetailsPCRV2[] getErrorDetails() {
        return errorDetails;
    }


    /**
     * Sets the errorDetails value for this StatusInfoPCRV2.
     *
     * @param errorDetails
     */
    public void setErrorDetails(pl.com.dpd.dpdservices.ErrorDetailsPCRV2[] errorDetails) {
        this.errorDetails = errorDetails;
    }

    public pl.com.dpd.dpdservices.ErrorDetailsPCRV2 getErrorDetails(int i) {
        return this.errorDetails[i];
    }

    public void setErrorDetails(int i, pl.com.dpd.dpdservices.ErrorDetailsPCRV2 _value) {
        this.errorDetails[i] = _value;
    }


    /**
     * Gets the status value for this StatusInfoPCRV2.
     *
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this StatusInfoPCRV2.
     *
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StatusInfoPCRV2)) return false;
        StatusInfoPCRV2 other = (StatusInfoPCRV2) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.errorDetails == null && other.getErrorDetails() == null) ||
                        (this.errorDetails != null &&
                                java.util.Arrays.equals(this.errorDetails, other.getErrorDetails()))) &&
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
        if (getErrorDetails() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getErrorDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getErrorDetails(), i);
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
            new org.apache.axis.description.TypeDesc(StatusInfoPCRV2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "statusInfoPCRV2"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "errorDetailsPCRV2"));
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
