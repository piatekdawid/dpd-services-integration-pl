/**
 * ServiceGuaranteeOpenUMLFeV1.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.dpd.dpdservices;

public class ServiceGuaranteeOpenUMLFeV1 implements java.io.Serializable {
    private pl.com.dpd.dpdservices.ServiceGuaranteeTypeEnumOpenUMLFeV1 type;

    private java.lang.String value;

    public ServiceGuaranteeOpenUMLFeV1() {
    }

    public ServiceGuaranteeOpenUMLFeV1(
            pl.com.dpd.dpdservices.ServiceGuaranteeTypeEnumOpenUMLFeV1 type,
            java.lang.String value) {
        this.type = type;
        this.value = value;
    }


    /**
     * Gets the type value for this ServiceGuaranteeOpenUMLFeV1.
     *
     * @return type
     */
    public pl.com.dpd.dpdservices.ServiceGuaranteeTypeEnumOpenUMLFeV1 getType() {
        return type;
    }


    /**
     * Sets the type value for this ServiceGuaranteeOpenUMLFeV1.
     *
     * @param type
     */
    public void setType(pl.com.dpd.dpdservices.ServiceGuaranteeTypeEnumOpenUMLFeV1 type) {
        this.type = type;
    }


    /**
     * Gets the value value for this ServiceGuaranteeOpenUMLFeV1.
     *
     * @return value
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this ServiceGuaranteeOpenUMLFeV1.
     *
     * @param value
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceGuaranteeOpenUMLFeV1)) return false;
        ServiceGuaranteeOpenUMLFeV1 other = (ServiceGuaranteeOpenUMLFeV1) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.type == null && other.getType() == null) ||
                        (this.type != null &&
                                this.type.equals(other.getType()))) &&
                ((this.value == null && other.getValue() == null) ||
                        (this.value != null &&
                                this.value.equals(other.getValue())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ServiceGuaranteeOpenUMLFeV1.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "serviceGuaranteeOpenUMLFeV1"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "serviceGuaranteeTypeEnumOpenUMLFeV1"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "value"));
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
