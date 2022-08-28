/**
 * PickupSenderDPPV1.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.dpd.dpdservices;

public class PickupSenderDPPV1 implements java.io.Serializable {
    private java.lang.String senderAddress;

    private java.lang.String senderCity;

    private java.lang.String senderFullName;

    private java.lang.String senderName;

    private java.lang.String senderPhone;

    private java.lang.String senderPostalCode;

    public PickupSenderDPPV1() {
    }

    public PickupSenderDPPV1(
            java.lang.String senderAddress,
            java.lang.String senderCity,
            java.lang.String senderFullName,
            java.lang.String senderName,
            java.lang.String senderPhone,
            java.lang.String senderPostalCode) {
        this.senderAddress = senderAddress;
        this.senderCity = senderCity;
        this.senderFullName = senderFullName;
        this.senderName = senderName;
        this.senderPhone = senderPhone;
        this.senderPostalCode = senderPostalCode;
    }


    /**
     * Gets the senderAddress value for this PickupSenderDPPV1.
     *
     * @return senderAddress
     */
    public java.lang.String getSenderAddress() {
        return senderAddress;
    }


    /**
     * Sets the senderAddress value for this PickupSenderDPPV1.
     *
     * @param senderAddress
     */
    public void setSenderAddress(java.lang.String senderAddress) {
        this.senderAddress = senderAddress;
    }


    /**
     * Gets the senderCity value for this PickupSenderDPPV1.
     *
     * @return senderCity
     */
    public java.lang.String getSenderCity() {
        return senderCity;
    }


    /**
     * Sets the senderCity value for this PickupSenderDPPV1.
     *
     * @param senderCity
     */
    public void setSenderCity(java.lang.String senderCity) {
        this.senderCity = senderCity;
    }


    /**
     * Gets the senderFullName value for this PickupSenderDPPV1.
     *
     * @return senderFullName
     */
    public java.lang.String getSenderFullName() {
        return senderFullName;
    }


    /**
     * Sets the senderFullName value for this PickupSenderDPPV1.
     *
     * @param senderFullName
     */
    public void setSenderFullName(java.lang.String senderFullName) {
        this.senderFullName = senderFullName;
    }


    /**
     * Gets the senderName value for this PickupSenderDPPV1.
     *
     * @return senderName
     */
    public java.lang.String getSenderName() {
        return senderName;
    }


    /**
     * Sets the senderName value for this PickupSenderDPPV1.
     *
     * @param senderName
     */
    public void setSenderName(java.lang.String senderName) {
        this.senderName = senderName;
    }


    /**
     * Gets the senderPhone value for this PickupSenderDPPV1.
     *
     * @return senderPhone
     */
    public java.lang.String getSenderPhone() {
        return senderPhone;
    }


    /**
     * Sets the senderPhone value for this PickupSenderDPPV1.
     *
     * @param senderPhone
     */
    public void setSenderPhone(java.lang.String senderPhone) {
        this.senderPhone = senderPhone;
    }


    /**
     * Gets the senderPostalCode value for this PickupSenderDPPV1.
     *
     * @return senderPostalCode
     */
    public java.lang.String getSenderPostalCode() {
        return senderPostalCode;
    }


    /**
     * Sets the senderPostalCode value for this PickupSenderDPPV1.
     *
     * @param senderPostalCode
     */
    public void setSenderPostalCode(java.lang.String senderPostalCode) {
        this.senderPostalCode = senderPostalCode;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PickupSenderDPPV1)) return false;
        PickupSenderDPPV1 other = (PickupSenderDPPV1) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.senderAddress == null && other.getSenderAddress() == null) ||
                        (this.senderAddress != null &&
                                this.senderAddress.equals(other.getSenderAddress()))) &&
                ((this.senderCity == null && other.getSenderCity() == null) ||
                        (this.senderCity != null &&
                                this.senderCity.equals(other.getSenderCity()))) &&
                ((this.senderFullName == null && other.getSenderFullName() == null) ||
                        (this.senderFullName != null &&
                                this.senderFullName.equals(other.getSenderFullName()))) &&
                ((this.senderName == null && other.getSenderName() == null) ||
                        (this.senderName != null &&
                                this.senderName.equals(other.getSenderName()))) &&
                ((this.senderPhone == null && other.getSenderPhone() == null) ||
                        (this.senderPhone != null &&
                                this.senderPhone.equals(other.getSenderPhone()))) &&
                ((this.senderPostalCode == null && other.getSenderPostalCode() == null) ||
                        (this.senderPostalCode != null &&
                                this.senderPostalCode.equals(other.getSenderPostalCode())));
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
        if (getSenderAddress() != null) {
            _hashCode += getSenderAddress().hashCode();
        }
        if (getSenderCity() != null) {
            _hashCode += getSenderCity().hashCode();
        }
        if (getSenderFullName() != null) {
            _hashCode += getSenderFullName().hashCode();
        }
        if (getSenderName() != null) {
            _hashCode += getSenderName().hashCode();
        }
        if (getSenderPhone() != null) {
            _hashCode += getSenderPhone().hashCode();
        }
        if (getSenderPostalCode() != null) {
            _hashCode += getSenderPostalCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(PickupSenderDPPV1.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "pickupSenderDPPV1"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "senderAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderCity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "senderCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderFullName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "senderFullName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "senderName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "senderPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderPostalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "senderPostalCode"));
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
