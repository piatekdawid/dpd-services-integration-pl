/**
 * ProtocolPCRV1.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.dpd.dpdservices;

public class ProtocolPCRV1 implements java.io.Serializable {
    private java.lang.String documentId;

    private pl.com.dpd.dpdservices.StatusInfoPCRV1 statusInfo;

    public ProtocolPCRV1() {
    }

    public ProtocolPCRV1(
            java.lang.String documentId,
            pl.com.dpd.dpdservices.StatusInfoPCRV1 statusInfo) {
        this.documentId = documentId;
        this.statusInfo = statusInfo;
    }


    /**
     * Gets the documentId value for this ProtocolPCRV1.
     *
     * @return documentId
     */
    public java.lang.String getDocumentId() {
        return documentId;
    }


    /**
     * Sets the documentId value for this ProtocolPCRV1.
     *
     * @param documentId
     */
    public void setDocumentId(java.lang.String documentId) {
        this.documentId = documentId;
    }


    /**
     * Gets the statusInfo value for this ProtocolPCRV1.
     *
     * @return statusInfo
     */
    public pl.com.dpd.dpdservices.StatusInfoPCRV1 getStatusInfo() {
        return statusInfo;
    }


    /**
     * Sets the statusInfo value for this ProtocolPCRV1.
     *
     * @param statusInfo
     */
    public void setStatusInfo(pl.com.dpd.dpdservices.StatusInfoPCRV1 statusInfo) {
        this.statusInfo = statusInfo;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProtocolPCRV1)) return false;
        ProtocolPCRV1 other = (ProtocolPCRV1) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.documentId == null && other.getDocumentId() == null) ||
                        (this.documentId != null &&
                                this.documentId.equals(other.getDocumentId()))) &&
                ((this.statusInfo == null && other.getStatusInfo() == null) ||
                        (this.statusInfo != null &&
                                this.statusInfo.equals(other.getStatusInfo())));
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
        if (getStatusInfo() != null) {
            _hashCode += getStatusInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ProtocolPCRV1.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "protocolPCRV1"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statusInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "statusInfoPCRV1"));
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
