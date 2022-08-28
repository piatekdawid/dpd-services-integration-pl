/**
 * PickupCustomerDPPV1.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.dpd.dpdservices;

public class PickupCustomerDPPV1 implements java.io.Serializable {
    private java.lang.String customerFullName;

    private java.lang.String customerName;

    private java.lang.String customerPhone;

    public PickupCustomerDPPV1() {
    }

    public PickupCustomerDPPV1(
            java.lang.String customerFullName,
            java.lang.String customerName,
            java.lang.String customerPhone) {
        this.customerFullName = customerFullName;
        this.customerName = customerName;
        this.customerPhone = customerPhone;
    }


    /**
     * Gets the customerFullName value for this PickupCustomerDPPV1.
     *
     * @return customerFullName
     */
    public java.lang.String getCustomerFullName() {
        return customerFullName;
    }


    /**
     * Sets the customerFullName value for this PickupCustomerDPPV1.
     *
     * @param customerFullName
     */
    public void setCustomerFullName(java.lang.String customerFullName) {
        this.customerFullName = customerFullName;
    }


    /**
     * Gets the customerName value for this PickupCustomerDPPV1.
     *
     * @return customerName
     */
    public java.lang.String getCustomerName() {
        return customerName;
    }


    /**
     * Sets the customerName value for this PickupCustomerDPPV1.
     *
     * @param customerName
     */
    public void setCustomerName(java.lang.String customerName) {
        this.customerName = customerName;
    }


    /**
     * Gets the customerPhone value for this PickupCustomerDPPV1.
     *
     * @return customerPhone
     */
    public java.lang.String getCustomerPhone() {
        return customerPhone;
    }


    /**
     * Sets the customerPhone value for this PickupCustomerDPPV1.
     *
     * @param customerPhone
     */
    public void setCustomerPhone(java.lang.String customerPhone) {
        this.customerPhone = customerPhone;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PickupCustomerDPPV1)) return false;
        PickupCustomerDPPV1 other = (PickupCustomerDPPV1) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.customerFullName == null && other.getCustomerFullName() == null) ||
                        (this.customerFullName != null &&
                                this.customerFullName.equals(other.getCustomerFullName()))) &&
                ((this.customerName == null && other.getCustomerName() == null) ||
                        (this.customerName != null &&
                                this.customerName.equals(other.getCustomerName()))) &&
                ((this.customerPhone == null && other.getCustomerPhone() == null) ||
                        (this.customerPhone != null &&
                                this.customerPhone.equals(other.getCustomerPhone())));
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
        if (getCustomerFullName() != null) {
            _hashCode += getCustomerFullName().hashCode();
        }
        if (getCustomerName() != null) {
            _hashCode += getCustomerName().hashCode();
        }
        if (getCustomerPhone() != null) {
            _hashCode += getCustomerPhone().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(PickupCustomerDPPV1.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "pickupCustomerDPPV1"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerFullName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerFullName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerPhone"));
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
