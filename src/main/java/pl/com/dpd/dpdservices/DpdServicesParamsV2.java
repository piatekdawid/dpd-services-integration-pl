/**
 * DpdServicesParamsV2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.dpd.dpdservices;

public class DpdServicesParamsV2  implements java.io.Serializable {
    private pl.com.dpd.dpdservices.PolicyDSPEnumV2 policy;

    private pl.com.dpd.dpdservices.SessionDSPV2 session;

    private pl.com.dpd.dpdservices.PickupAddressDSPV2 pickupAddress;

    private pl.com.dpd.dpdservices.DeliveryDestination[] deliveryDestinations;

    private java.lang.Boolean genProtForNonMatching;

    public DpdServicesParamsV2() {
    }

    public DpdServicesParamsV2(
           pl.com.dpd.dpdservices.PolicyDSPEnumV2 policy,
           pl.com.dpd.dpdservices.SessionDSPV2 session,
           pl.com.dpd.dpdservices.PickupAddressDSPV2 pickupAddress,
           pl.com.dpd.dpdservices.DeliveryDestination[] deliveryDestinations,
           java.lang.Boolean genProtForNonMatching) {
           this.policy = policy;
           this.session = session;
           this.pickupAddress = pickupAddress;
           this.deliveryDestinations = deliveryDestinations;
           this.genProtForNonMatching = genProtForNonMatching;
    }


    /**
     * Gets the policy value for this DpdServicesParamsV2.
     * 
     * @return policy
     */
    public pl.com.dpd.dpdservices.PolicyDSPEnumV2 getPolicy() {
        return policy;
    }


    /**
     * Sets the policy value for this DpdServicesParamsV2.
     * 
     * @param policy
     */
    public void setPolicy(pl.com.dpd.dpdservices.PolicyDSPEnumV2 policy) {
        this.policy = policy;
    }


    /**
     * Gets the session value for this DpdServicesParamsV2.
     * 
     * @return session
     */
    public pl.com.dpd.dpdservices.SessionDSPV2 getSession() {
        return session;
    }


    /**
     * Sets the session value for this DpdServicesParamsV2.
     * 
     * @param session
     */
    public void setSession(pl.com.dpd.dpdservices.SessionDSPV2 session) {
        this.session = session;
    }


    /**
     * Gets the pickupAddress value for this DpdServicesParamsV2.
     * 
     * @return pickupAddress
     */
    public pl.com.dpd.dpdservices.PickupAddressDSPV2 getPickupAddress() {
        return pickupAddress;
    }


    /**
     * Sets the pickupAddress value for this DpdServicesParamsV2.
     * 
     * @param pickupAddress
     */
    public void setPickupAddress(pl.com.dpd.dpdservices.PickupAddressDSPV2 pickupAddress) {
        this.pickupAddress = pickupAddress;
    }


    /**
     * Gets the deliveryDestinations value for this DpdServicesParamsV2.
     * 
     * @return deliveryDestinations
     */
    public pl.com.dpd.dpdservices.DeliveryDestination[] getDeliveryDestinations() {
        return deliveryDestinations;
    }


    /**
     * Sets the deliveryDestinations value for this DpdServicesParamsV2.
     * 
     * @param deliveryDestinations
     */
    public void setDeliveryDestinations(pl.com.dpd.dpdservices.DeliveryDestination[] deliveryDestinations) {
        this.deliveryDestinations = deliveryDestinations;
    }


    /**
     * Gets the genProtForNonMatching value for this DpdServicesParamsV2.
     * 
     * @return genProtForNonMatching
     */
    public java.lang.Boolean getGenProtForNonMatching() {
        return genProtForNonMatching;
    }


    /**
     * Sets the genProtForNonMatching value for this DpdServicesParamsV2.
     * 
     * @param genProtForNonMatching
     */
    public void setGenProtForNonMatching(java.lang.Boolean genProtForNonMatching) {
        this.genProtForNonMatching = genProtForNonMatching;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DpdServicesParamsV2)) return false;
        DpdServicesParamsV2 other = (DpdServicesParamsV2) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.policy==null && other.getPolicy()==null) || 
             (this.policy!=null &&
              this.policy.equals(other.getPolicy()))) &&
            ((this.session==null && other.getSession()==null) || 
             (this.session!=null &&
              this.session.equals(other.getSession()))) &&
            ((this.pickupAddress==null && other.getPickupAddress()==null) || 
             (this.pickupAddress!=null &&
              this.pickupAddress.equals(other.getPickupAddress()))) &&
            ((this.deliveryDestinations==null && other.getDeliveryDestinations()==null) || 
             (this.deliveryDestinations!=null &&
              java.util.Arrays.equals(this.deliveryDestinations, other.getDeliveryDestinations()))) &&
            ((this.genProtForNonMatching==null && other.getGenProtForNonMatching()==null) || 
             (this.genProtForNonMatching!=null &&
              this.genProtForNonMatching.equals(other.getGenProtForNonMatching())));
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
        if (getPolicy() != null) {
            _hashCode += getPolicy().hashCode();
        }
        if (getSession() != null) {
            _hashCode += getSession().hashCode();
        }
        if (getPickupAddress() != null) {
            _hashCode += getPickupAddress().hashCode();
        }
        if (getDeliveryDestinations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeliveryDestinations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeliveryDestinations(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGenProtForNonMatching() != null) {
            _hashCode += getGenProtForNonMatching().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DpdServicesParamsV2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "dpdServicesParamsV2"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Policy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "policyDSPEnumV2"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("session");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Session"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "sessionDSPV2"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickupAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PickupAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "pickupAddressDSPV2"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryDestinations");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DeliveryDestinations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "deliveryDestination"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "DeliveryDestination"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("genProtForNonMatching");
        elemField.setXmlName(new javax.xml.namespace.QName("", "GenProtForNonMatching"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
          new  org.apache.axis.encoding.ser.BeanSerializer(
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
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
