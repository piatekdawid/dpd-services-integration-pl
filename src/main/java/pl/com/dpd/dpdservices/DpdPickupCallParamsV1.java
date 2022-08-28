/**
 * DpdPickupCallParamsV1.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.dpd.dpdservices;

import pl.com.dpd.dpdservices.enums.PolicyDPPEnumV1;

public class DpdPickupCallParamsV1 implements java.io.Serializable {
    private pl.com.dpd.dpdservices.ContactInfoDPPV1 contactInfo;

    private pl.com.dpd.dpdservices.PickupAddressDSPV1 pickupAddress;

    private java.util.Calendar pickupDate;

    private java.lang.String pickupTimeFrom;

    private java.lang.String pickupTimeTo;

    private PolicyDPPEnumV1 policy;

    private pl.com.dpd.dpdservices.ProtocolDPPV1[] protocols;

    public DpdPickupCallParamsV1() {
    }

    public DpdPickupCallParamsV1(
            pl.com.dpd.dpdservices.ContactInfoDPPV1 contactInfo,
            pl.com.dpd.dpdservices.PickupAddressDSPV1 pickupAddress,
            java.util.Calendar pickupDate,
            java.lang.String pickupTimeFrom,
            java.lang.String pickupTimeTo,
            PolicyDPPEnumV1 policy,
            pl.com.dpd.dpdservices.ProtocolDPPV1[] protocols) {
        this.contactInfo = contactInfo;
        this.pickupAddress = pickupAddress;
        this.pickupDate = pickupDate;
        this.pickupTimeFrom = pickupTimeFrom;
        this.pickupTimeTo = pickupTimeTo;
        this.policy = policy;
        this.protocols = protocols;
    }


    /**
     * Gets the contactInfo value for this DpdPickupCallParamsV1.
     *
     * @return contactInfo
     */
    public pl.com.dpd.dpdservices.ContactInfoDPPV1 getContactInfo() {
        return contactInfo;
    }


    /**
     * Sets the contactInfo value for this DpdPickupCallParamsV1.
     *
     * @param contactInfo
     */
    public void setContactInfo(pl.com.dpd.dpdservices.ContactInfoDPPV1 contactInfo) {
        this.contactInfo = contactInfo;
    }


    /**
     * Gets the pickupAddress value for this DpdPickupCallParamsV1.
     *
     * @return pickupAddress
     */
    public pl.com.dpd.dpdservices.PickupAddressDSPV1 getPickupAddress() {
        return pickupAddress;
    }


    /**
     * Sets the pickupAddress value for this DpdPickupCallParamsV1.
     *
     * @param pickupAddress
     */
    public void setPickupAddress(pl.com.dpd.dpdservices.PickupAddressDSPV1 pickupAddress) {
        this.pickupAddress = pickupAddress;
    }


    /**
     * Gets the pickupDate value for this DpdPickupCallParamsV1.
     *
     * @return pickupDate
     */
    public java.util.Calendar getPickupDate() {
        return pickupDate;
    }


    /**
     * Sets the pickupDate value for this DpdPickupCallParamsV1.
     *
     * @param pickupDate
     */
    public void setPickupDate(java.util.Calendar pickupDate) {
        this.pickupDate = pickupDate;
    }


    /**
     * Gets the pickupTimeFrom value for this DpdPickupCallParamsV1.
     *
     * @return pickupTimeFrom
     */
    public java.lang.String getPickupTimeFrom() {
        return pickupTimeFrom;
    }


    /**
     * Sets the pickupTimeFrom value for this DpdPickupCallParamsV1.
     *
     * @param pickupTimeFrom
     */
    public void setPickupTimeFrom(java.lang.String pickupTimeFrom) {
        this.pickupTimeFrom = pickupTimeFrom;
    }


    /**
     * Gets the pickupTimeTo value for this DpdPickupCallParamsV1.
     *
     * @return pickupTimeTo
     */
    public java.lang.String getPickupTimeTo() {
        return pickupTimeTo;
    }


    /**
     * Sets the pickupTimeTo value for this DpdPickupCallParamsV1.
     *
     * @param pickupTimeTo
     */
    public void setPickupTimeTo(java.lang.String pickupTimeTo) {
        this.pickupTimeTo = pickupTimeTo;
    }


    /**
     * Gets the policy value for this DpdPickupCallParamsV1.
     *
     * @return policy
     */
    public PolicyDPPEnumV1 getPolicy() {
        return policy;
    }


    /**
     * Sets the policy value for this DpdPickupCallParamsV1.
     *
     * @param policy
     */
    public void setPolicy(PolicyDPPEnumV1 policy) {
        this.policy = policy;
    }


    /**
     * Gets the protocols value for this DpdPickupCallParamsV1.
     *
     * @return protocols
     */
    public pl.com.dpd.dpdservices.ProtocolDPPV1[] getProtocols() {
        return protocols;
    }


    /**
     * Sets the protocols value for this DpdPickupCallParamsV1.
     *
     * @param protocols
     */
    public void setProtocols(pl.com.dpd.dpdservices.ProtocolDPPV1[] protocols) {
        this.protocols = protocols;
    }

    public pl.com.dpd.dpdservices.ProtocolDPPV1 getProtocols(int i) {
        return this.protocols[i];
    }

    public void setProtocols(int i, pl.com.dpd.dpdservices.ProtocolDPPV1 _value) {
        this.protocols[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DpdPickupCallParamsV1)) return false;
        DpdPickupCallParamsV1 other = (DpdPickupCallParamsV1) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.contactInfo == null && other.getContactInfo() == null) ||
                        (this.contactInfo != null &&
                                this.contactInfo.equals(other.getContactInfo()))) &&
                ((this.pickupAddress == null && other.getPickupAddress() == null) ||
                        (this.pickupAddress != null &&
                                this.pickupAddress.equals(other.getPickupAddress()))) &&
                ((this.pickupDate == null && other.getPickupDate() == null) ||
                        (this.pickupDate != null &&
                                this.pickupDate.equals(other.getPickupDate()))) &&
                ((this.pickupTimeFrom == null && other.getPickupTimeFrom() == null) ||
                        (this.pickupTimeFrom != null &&
                                this.pickupTimeFrom.equals(other.getPickupTimeFrom()))) &&
                ((this.pickupTimeTo == null && other.getPickupTimeTo() == null) ||
                        (this.pickupTimeTo != null &&
                                this.pickupTimeTo.equals(other.getPickupTimeTo()))) &&
                ((this.policy == null && other.getPolicy() == null) ||
                        (this.policy != null &&
                                this.policy.equals(other.getPolicy()))) &&
                ((this.protocols == null && other.getProtocols() == null) ||
                        (this.protocols != null &&
                                java.util.Arrays.equals(this.protocols, other.getProtocols())));
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
        if (getContactInfo() != null) {
            _hashCode += getContactInfo().hashCode();
        }
        if (getPickupAddress() != null) {
            _hashCode += getPickupAddress().hashCode();
        }
        if (getPickupDate() != null) {
            _hashCode += getPickupDate().hashCode();
        }
        if (getPickupTimeFrom() != null) {
            _hashCode += getPickupTimeFrom().hashCode();
        }
        if (getPickupTimeTo() != null) {
            _hashCode += getPickupTimeTo().hashCode();
        }
        if (getPolicy() != null) {
            _hashCode += getPolicy().hashCode();
        }
        if (getProtocols() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getProtocols());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProtocols(), i);
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
            new org.apache.axis.description.TypeDesc(DpdPickupCallParamsV1.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "dpdPickupCallParamsV1"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contactInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "contactInfoDPPV1"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickupAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pickupAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "pickupAddressDSPV1"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickupDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pickupDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickupTimeFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pickupTimeFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickupTimeTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pickupTimeTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "policy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "policyDPPEnumV1"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protocols");
        elemField.setXmlName(new javax.xml.namespace.QName("", "protocols"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "protocolDPPV1"));
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
