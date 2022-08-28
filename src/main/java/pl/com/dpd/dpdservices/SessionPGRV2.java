/**
 * SessionPGRV2.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.dpd.dpdservices;

public class SessionPGRV2 implements java.io.Serializable {
    private java.lang.String status;

    private java.lang.Long sessionId;

    private java.util.Calendar beginTime;

    private java.util.Calendar endTime;

    private pl.com.dpd.dpdservices.PackagePGRV2[] packages;

    public SessionPGRV2() {
    }

    public SessionPGRV2(
            java.lang.String status,
            java.lang.Long sessionId,
            java.util.Calendar beginTime,
            java.util.Calendar endTime,
            pl.com.dpd.dpdservices.PackagePGRV2[] packages) {
        this.status = status;
        this.sessionId = sessionId;
        this.beginTime = beginTime;
        this.endTime = endTime;
        this.packages = packages;
    }


    /**
     * Gets the status value for this SessionPGRV2.
     *
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this SessionPGRV2.
     *
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the sessionId value for this SessionPGRV2.
     *
     * @return sessionId
     */
    public java.lang.Long getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this SessionPGRV2.
     *
     * @param sessionId
     */
    public void setSessionId(java.lang.Long sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * Gets the beginTime value for this SessionPGRV2.
     *
     * @return beginTime
     */
    public java.util.Calendar getBeginTime() {
        return beginTime;
    }


    /**
     * Sets the beginTime value for this SessionPGRV2.
     *
     * @param beginTime
     */
    public void setBeginTime(java.util.Calendar beginTime) {
        this.beginTime = beginTime;
    }


    /**
     * Gets the endTime value for this SessionPGRV2.
     *
     * @return endTime
     */
    public java.util.Calendar getEndTime() {
        return endTime;
    }


    /**
     * Sets the endTime value for this SessionPGRV2.
     *
     * @param endTime
     */
    public void setEndTime(java.util.Calendar endTime) {
        this.endTime = endTime;
    }


    /**
     * Gets the packages value for this SessionPGRV2.
     *
     * @return packages
     */
    public pl.com.dpd.dpdservices.PackagePGRV2[] getPackages() {
        return packages;
    }


    /**
     * Sets the packages value for this SessionPGRV2.
     *
     * @param packages
     */
    public void setPackages(pl.com.dpd.dpdservices.PackagePGRV2[] packages) {
        this.packages = packages;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SessionPGRV2)) return false;
        SessionPGRV2 other = (SessionPGRV2) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.status == null && other.getStatus() == null) ||
                        (this.status != null &&
                                this.status.equals(other.getStatus()))) &&
                ((this.sessionId == null && other.getSessionId() == null) ||
                        (this.sessionId != null &&
                                this.sessionId.equals(other.getSessionId()))) &&
                ((this.beginTime == null && other.getBeginTime() == null) ||
                        (this.beginTime != null &&
                                this.beginTime.equals(other.getBeginTime()))) &&
                ((this.endTime == null && other.getEndTime() == null) ||
                        (this.endTime != null &&
                                this.endTime.equals(other.getEndTime()))) &&
                ((this.packages == null && other.getPackages() == null) ||
                        (this.packages != null &&
                                java.util.Arrays.equals(this.packages, other.getPackages())));
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getSessionId() != null) {
            _hashCode += getSessionId().hashCode();
        }
        if (getBeginTime() != null) {
            _hashCode += getBeginTime().hashCode();
        }
        if (getEndTime() != null) {
            _hashCode += getEndTime().hashCode();
        }
        if (getPackages() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getPackages());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPackages(), i);
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
            new org.apache.axis.description.TypeDesc(SessionPGRV2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "sessionPGRV2"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beginTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BeginTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packages");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Packages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "packagePGRV2"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "Package"));
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
