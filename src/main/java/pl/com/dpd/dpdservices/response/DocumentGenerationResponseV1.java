/**
 * DocumentGenerationResponseV1.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.dpd.dpdservices.response;

public class DocumentGenerationResponseV1 implements java.io.Serializable {
    private byte[] documentData;

    private java.lang.String documentId;

    private pl.com.dpd.dpdservices.SessionDGRV1 session;

    public DocumentGenerationResponseV1() {
    }

    public DocumentGenerationResponseV1(
            byte[] documentData,
            java.lang.String documentId,
            pl.com.dpd.dpdservices.SessionDGRV1 session) {
        this.documentData = documentData;
        this.documentId = documentId;
        this.session = session;
    }


    /**
     * Gets the documentData value for this DocumentGenerationResponseV1.
     *
     * @return documentData
     */
    public byte[] getDocumentData() {
        return documentData;
    }


    /**
     * Sets the documentData value for this DocumentGenerationResponseV1.
     *
     * @param documentData
     */
    public void setDocumentData(byte[] documentData) {
        this.documentData = documentData;
    }


    /**
     * Gets the documentId value for this DocumentGenerationResponseV1.
     *
     * @return documentId
     */
    public java.lang.String getDocumentId() {
        return documentId;
    }


    /**
     * Sets the documentId value for this DocumentGenerationResponseV1.
     *
     * @param documentId
     */
    public void setDocumentId(java.lang.String documentId) {
        this.documentId = documentId;
    }


    /**
     * Gets the session value for this DocumentGenerationResponseV1.
     *
     * @return session
     */
    public pl.com.dpd.dpdservices.SessionDGRV1 getSession() {
        return session;
    }


    /**
     * Sets the session value for this DocumentGenerationResponseV1.
     *
     * @param session
     */
    public void setSession(pl.com.dpd.dpdservices.SessionDGRV1 session) {
        this.session = session;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DocumentGenerationResponseV1)) return false;
        DocumentGenerationResponseV1 other = (DocumentGenerationResponseV1) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.documentData == null && other.getDocumentData() == null) ||
                        (this.documentData != null &&
                                java.util.Arrays.equals(this.documentData, other.getDocumentData()))) &&
                ((this.documentId == null && other.getDocumentId() == null) ||
                        (this.documentId != null &&
                                this.documentId.equals(other.getDocumentId()))) &&
                ((this.session == null && other.getSession() == null) ||
                        (this.session != null &&
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
        if (getDocumentData() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getDocumentData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDocumentData(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDocumentId() != null) {
            _hashCode += getDocumentId().hashCode();
        }
        if (getSession() != null) {
            _hashCode += getSession().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(DocumentGenerationResponseV1.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "documentGenerationResponseV1"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("session");
        elemField.setXmlName(new javax.xml.namespace.QName("", "session"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "sessionDGRV1"));
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
