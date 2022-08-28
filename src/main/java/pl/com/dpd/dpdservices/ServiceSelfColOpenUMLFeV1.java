/**
 * ServiceSelfColOpenUMLFeV1.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.dpd.dpdservices;

public class ServiceSelfColOpenUMLFeV1 implements java.io.Serializable {
    private pl.com.dpd.dpdservices.ServiceSelfColReceiverTypeEnumOpenUMLFeV1 receiver;

    public ServiceSelfColOpenUMLFeV1() {
    }

    public ServiceSelfColOpenUMLFeV1(
            pl.com.dpd.dpdservices.ServiceSelfColReceiverTypeEnumOpenUMLFeV1 receiver) {
        this.receiver = receiver;
    }


    /**
     * Gets the receiver value for this ServiceSelfColOpenUMLFeV1.
     *
     * @return receiver
     */
    public pl.com.dpd.dpdservices.ServiceSelfColReceiverTypeEnumOpenUMLFeV1 getReceiver() {
        return receiver;
    }


    /**
     * Sets the receiver value for this ServiceSelfColOpenUMLFeV1.
     *
     * @param receiver
     */
    public void setReceiver(pl.com.dpd.dpdservices.ServiceSelfColReceiverTypeEnumOpenUMLFeV1 receiver) {
        this.receiver = receiver;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceSelfColOpenUMLFeV1)) return false;
        ServiceSelfColOpenUMLFeV1 other = (ServiceSelfColOpenUMLFeV1) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.receiver == null && other.getReceiver() == null) ||
                        (this.receiver != null &&
                                this.receiver.equals(other.getReceiver())));
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
        if (getReceiver() != null) {
            _hashCode += getReceiver().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ServiceSelfColOpenUMLFeV1.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "serviceSelfColOpenUMLFeV1"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiver");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receiver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "serviceSelfColReceiverTypeEnumOpenUMLFeV1"));
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
