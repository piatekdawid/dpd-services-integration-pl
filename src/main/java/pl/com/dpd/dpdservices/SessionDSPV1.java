/**
 * SessionDSPV1.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.dpd.dpdservices;

public class SessionDSPV1  implements java.io.Serializable {
    private pl.com.dpd.dpdservices.PackageDSPV1[] packages;

    private java.lang.Long sessionId;

    private pl.com.dpd.dpdservices.SessionTypeDSPEnumV1 sessionType;

    public SessionDSPV1() {
    }

    public SessionDSPV1(
           pl.com.dpd.dpdservices.PackageDSPV1[] packages,
           java.lang.Long sessionId,
           pl.com.dpd.dpdservices.SessionTypeDSPEnumV1 sessionType) {
           this.packages = packages;
           this.sessionId = sessionId;
           this.sessionType = sessionType;
    }


    /**
     * Gets the packages value for this SessionDSPV1.
     * 
     * @return packages
     */
    public pl.com.dpd.dpdservices.PackageDSPV1[] getPackages() {
        return packages;
    }


    /**
     * Sets the packages value for this SessionDSPV1.
     * 
     * @param packages
     */
    public void setPackages(pl.com.dpd.dpdservices.PackageDSPV1[] packages) {
        this.packages = packages;
    }

    public pl.com.dpd.dpdservices.PackageDSPV1 getPackages(int i) {
        return this.packages[i];
    }

    public void setPackages(int i, pl.com.dpd.dpdservices.PackageDSPV1 _value) {
        this.packages[i] = _value;
    }


    /**
     * Gets the sessionId value for this SessionDSPV1.
     * 
     * @return sessionId
     */
    public java.lang.Long getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this SessionDSPV1.
     * 
     * @param sessionId
     */
    public void setSessionId(java.lang.Long sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * Gets the sessionType value for this SessionDSPV1.
     * 
     * @return sessionType
     */
    public pl.com.dpd.dpdservices.SessionTypeDSPEnumV1 getSessionType() {
        return sessionType;
    }


    /**
     * Sets the sessionType value for this SessionDSPV1.
     * 
     * @param sessionType
     */
    public void setSessionType(pl.com.dpd.dpdservices.SessionTypeDSPEnumV1 sessionType) {
        this.sessionType = sessionType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SessionDSPV1)) return false;
        SessionDSPV1 other = (SessionDSPV1) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.packages==null && other.getPackages()==null) || 
             (this.packages!=null &&
              java.util.Arrays.equals(this.packages, other.getPackages()))) &&
            ((this.sessionId==null && other.getSessionId()==null) || 
             (this.sessionId!=null &&
              this.sessionId.equals(other.getSessionId()))) &&
            ((this.sessionType==null && other.getSessionType()==null) || 
             (this.sessionType!=null &&
              this.sessionType.equals(other.getSessionType())));
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
        if (getPackages() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPackages());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPackages(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSessionId() != null) {
            _hashCode += getSessionId().hashCode();
        }
        if (getSessionType() != null) {
            _hashCode += getSessionType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SessionDSPV1.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "sessionDSPV1"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packages");
        elemField.setXmlName(new javax.xml.namespace.QName("", "packages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "packageDSPV1"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sessionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "sessionTypeDSPEnumV1"));
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
