/**
 * ServiceDpdPickupOpenUMLFeV1.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.dpd.dpdservices;

public class ServiceDpdPickupOpenUMLFeV1 implements java.io.Serializable {
    private java.lang.String pudo;

    public ServiceDpdPickupOpenUMLFeV1() {
    }

    public ServiceDpdPickupOpenUMLFeV1(
            java.lang.String pudo) {
        this.pudo = pudo;
    }


    /**
     * Gets the pudo value for this ServiceDpdPickupOpenUMLFeV1.
     *
     * @return pudo
     */
    public java.lang.String getPudo() {
        return pudo;
    }


    /**
     * Sets the pudo value for this ServiceDpdPickupOpenUMLFeV1.
     *
     * @param pudo
     */
    public void setPudo(java.lang.String pudo) {
        this.pudo = pudo;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceDpdPickupOpenUMLFeV1)) return false;
        ServiceDpdPickupOpenUMLFeV1 other = (ServiceDpdPickupOpenUMLFeV1) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.pudo == null && other.getPudo() == null) ||
                        (this.pudo != null &&
                                this.pudo.equals(other.getPudo())));
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
        if (getPudo() != null) {
            _hashCode += getPudo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ServiceDpdPickupOpenUMLFeV1.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "serviceDpdPickupOpenUMLFeV1"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pudo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pudo"));
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
