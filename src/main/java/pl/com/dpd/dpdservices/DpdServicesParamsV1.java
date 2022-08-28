/**
 * DpdServicesParamsV1.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.dpd.dpdservices;

public class DpdServicesParamsV1  implements java.io.Serializable {
    private java.lang.String documentId;

    private pl.com.dpd.dpdservices.PickupAddressDSPV1 pickupAddress;

    private pl.com.dpd.dpdservices.PolicyDSPEnumV1 policy;

    private pl.com.dpd.dpdservices.SessionDSPV1 session;

    public DpdServicesParamsV1() {
    }

    public DpdServicesParamsV1(
           java.lang.String documentId,
           pl.com.dpd.dpdservices.PickupAddressDSPV1 pickupAddress,
           pl.com.dpd.dpdservices.PolicyDSPEnumV1 policy,
           pl.com.dpd.dpdservices.SessionDSPV1 session) {
           this.documentId = documentId;
           this.pickupAddress = pickupAddress;
           this.policy = policy;
           this.session = session;
    }


    /**
     * Gets the documentId value for this DpdServicesParamsV1.
     * 
     * @return documentId
     */
    public java.lang.String getDocumentId() {
        return documentId;
    }


    /**
     * Sets the documentId value for this DpdServicesParamsV1.
     * 
     * @param documentId
     */
    public void setDocumentId(java.lang.String documentId) {
        this.documentId = documentId;
    }


    /**
     * Gets the pickupAddress value for this DpdServicesParamsV1.
     * 
     * @return pickupAddress
     */
    public pl.com.dpd.dpdservices.PickupAddressDSPV1 getPickupAddress() {
        return pickupAddress;
    }


    /**
     * Sets the pickupAddress value for this DpdServicesParamsV1.
     * 
     * @param pickupAddress
     */
    public void setPickupAddress(pl.com.dpd.dpdservices.PickupAddressDSPV1 pickupAddress) {
        this.pickupAddress = pickupAddress;
    }


    /**
     * Gets the policy value for this DpdServicesParamsV1.
     * 
     * @return policy
     */
    public pl.com.dpd.dpdservices.PolicyDSPEnumV1 getPolicy() {
        return policy;
    }


    /**
     * Sets the policy value for this DpdServicesParamsV1.
     * 
     * @param policy
     */
    public void setPolicy(pl.com.dpd.dpdservices.PolicyDSPEnumV1 policy) {
        this.policy = policy;
    }


    /**
     * Gets the session value for this DpdServicesParamsV1.
     * 
     * @return session
     */
    public pl.com.dpd.dpdservices.SessionDSPV1 getSession() {
        return session;
    }


    /**
     * Sets the session value for this DpdServicesParamsV1.
     * 
     * @param session
     */
    public void setSession(pl.com.dpd.dpdservices.SessionDSPV1 session) {
        this.session = session;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DpdServicesParamsV1)) return false;
        DpdServicesParamsV1 other = (DpdServicesParamsV1) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.documentId==null && other.getDocumentId()==null) || 
             (this.documentId!=null &&
              this.documentId.equals(other.getDocumentId()))) &&
            ((this.pickupAddress==null && other.getPickupAddress()==null) || 
             (this.pickupAddress!=null &&
              this.pickupAddress.equals(other.getPickupAddress()))) &&
            ((this.policy==null && other.getPolicy()==null) || 
             (this.policy!=null &&
              this.policy.equals(other.getPolicy()))) &&
            ((this.session==null && other.getSession()==null) || 
             (this.session!=null &&
              this.session.equals(other.getSession())));
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
        if (getDocumentId() != null) {
            _hashCode += getDocumentId().hashCode();
        }
        if (getPickupAddress() != null) {
            _hashCode += getPickupAddress().hashCode();
        }
        if (getPolicy() != null) {
            _hashCode += getPolicy().hashCode();
        }
        if (getSession() != null) {
            _hashCode += getSession().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DpdServicesParamsV1.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "dpdServicesParamsV1"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("policy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "policy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "policyDSPEnumV1"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("session");
        elemField.setXmlName(new javax.xml.namespace.QName("", "session"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "sessionDSPV1"));
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
