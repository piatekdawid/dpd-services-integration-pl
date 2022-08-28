/**
 * ImportDeliveryBusinessEventResponseV1.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.dpd.dpdservices.response;

import pl.com.dpd.dpdservices.enums.ImportDeliveryBusinessEventStatusEnumV1;

public class ImportDeliveryBusinessEventResponseV1 implements java.io.Serializable {
    private java.lang.String description;

    private ImportDeliveryBusinessEventStatusEnumV1 status;

    public ImportDeliveryBusinessEventResponseV1() {
    }

    public ImportDeliveryBusinessEventResponseV1(
            java.lang.String description,
            ImportDeliveryBusinessEventStatusEnumV1 status) {
        this.description = description;
        this.status = status;
    }


    /**
     * Gets the description value for this ImportDeliveryBusinessEventResponseV1.
     *
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ImportDeliveryBusinessEventResponseV1.
     *
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the status value for this ImportDeliveryBusinessEventResponseV1.
     *
     * @return status
     */
    public ImportDeliveryBusinessEventStatusEnumV1 getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ImportDeliveryBusinessEventResponseV1.
     *
     * @param status
     */
    public void setStatus(ImportDeliveryBusinessEventStatusEnumV1 status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ImportDeliveryBusinessEventResponseV1)) return false;
        ImportDeliveryBusinessEventResponseV1 other = (ImportDeliveryBusinessEventResponseV1) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.description == null && other.getDescription() == null) ||
                        (this.description != null &&
                                this.description.equals(other.getDescription()))) &&
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ImportDeliveryBusinessEventResponseV1.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "importDeliveryBusinessEventResponseV1"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "importDeliveryBusinessEventStatusEnumV1"));
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
