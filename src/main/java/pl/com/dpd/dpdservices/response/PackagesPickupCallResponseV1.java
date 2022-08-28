/**
 * PackagesPickupCallResponseV1.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.dpd.dpdservices.response;

public class PackagesPickupCallResponseV1 implements java.io.Serializable {
    private java.lang.String orderNumber;

    private pl.com.dpd.dpdservices.ProtocolPCRV1[] prototocols;

    public PackagesPickupCallResponseV1() {
    }

    public PackagesPickupCallResponseV1(
            java.lang.String orderNumber,
            pl.com.dpd.dpdservices.ProtocolPCRV1[] prototocols) {
        this.orderNumber = orderNumber;
        this.prototocols = prototocols;
    }


    /**
     * Gets the orderNumber value for this PackagesPickupCallResponseV1.
     *
     * @return orderNumber
     */
    public java.lang.String getOrderNumber() {
        return orderNumber;
    }


    /**
     * Sets the orderNumber value for this PackagesPickupCallResponseV1.
     *
     * @param orderNumber
     */
    public void setOrderNumber(java.lang.String orderNumber) {
        this.orderNumber = orderNumber;
    }


    /**
     * Gets the prototocols value for this PackagesPickupCallResponseV1.
     *
     * @return prototocols
     */
    public pl.com.dpd.dpdservices.ProtocolPCRV1[] getPrototocols() {
        return prototocols;
    }


    /**
     * Sets the prototocols value for this PackagesPickupCallResponseV1.
     *
     * @param prototocols
     */
    public void setPrototocols(pl.com.dpd.dpdservices.ProtocolPCRV1[] prototocols) {
        this.prototocols = prototocols;
    }

    public pl.com.dpd.dpdservices.ProtocolPCRV1 getPrototocols(int i) {
        return this.prototocols[i];
    }

    public void setPrototocols(int i, pl.com.dpd.dpdservices.ProtocolPCRV1 _value) {
        this.prototocols[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PackagesPickupCallResponseV1)) return false;
        PackagesPickupCallResponseV1 other = (PackagesPickupCallResponseV1) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.orderNumber == null && other.getOrderNumber() == null) ||
                        (this.orderNumber != null &&
                                this.orderNumber.equals(other.getOrderNumber()))) &&
                ((this.prototocols == null && other.getPrototocols() == null) ||
                        (this.prototocols != null &&
                                java.util.Arrays.equals(this.prototocols, other.getPrototocols())));
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
        if (getOrderNumber() != null) {
            _hashCode += getOrderNumber().hashCode();
        }
        if (getPrototocols() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getPrototocols());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPrototocols(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(PackagesPickupCallResponseV1.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "packagesPickupCallResponseV1"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prototocols");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prototocols"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "protocolPCRV1"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
