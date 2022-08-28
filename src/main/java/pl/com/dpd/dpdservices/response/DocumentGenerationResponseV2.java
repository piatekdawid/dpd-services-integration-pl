/**
 * DocumentGenerationResponseV2.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.dpd.dpdservices.response;

public class DocumentGenerationResponseV2 implements java.io.Serializable {
    private pl.com.dpd.dpdservices.DestinationsData[] destinationDataList;

    private byte[] documentData;

    private pl.com.dpd.dpdservices.NonMatchingData[] nonMatchingDataList;

    private pl.com.dpd.dpdservices.SessionDGRV2 session;

    public DocumentGenerationResponseV2() {
    }

    public DocumentGenerationResponseV2(
            pl.com.dpd.dpdservices.DestinationsData[] destinationDataList,
            byte[] documentData,
            pl.com.dpd.dpdservices.NonMatchingData[] nonMatchingDataList,
            pl.com.dpd.dpdservices.SessionDGRV2 session) {
        this.destinationDataList = destinationDataList;
        this.documentData = documentData;
        this.nonMatchingDataList = nonMatchingDataList;
        this.session = session;
    }


    /**
     * Gets the destinationDataList value for this DocumentGenerationResponseV2.
     *
     * @return destinationDataList
     */
    public pl.com.dpd.dpdservices.DestinationsData[] getDestinationDataList() {
        return destinationDataList;
    }


    /**
     * Sets the destinationDataList value for this DocumentGenerationResponseV2.
     *
     * @param destinationDataList
     */
    public void setDestinationDataList(pl.com.dpd.dpdservices.DestinationsData[] destinationDataList) {
        this.destinationDataList = destinationDataList;
    }


    /**
     * Gets the documentData value for this DocumentGenerationResponseV2.
     *
     * @return documentData
     */
    public byte[] getDocumentData() {
        return documentData;
    }


    /**
     * Sets the documentData value for this DocumentGenerationResponseV2.
     *
     * @param documentData
     */
    public void setDocumentData(byte[] documentData) {
        this.documentData = documentData;
    }


    /**
     * Gets the nonMatchingDataList value for this DocumentGenerationResponseV2.
     *
     * @return nonMatchingDataList
     */
    public pl.com.dpd.dpdservices.NonMatchingData[] getNonMatchingDataList() {
        return nonMatchingDataList;
    }


    /**
     * Sets the nonMatchingDataList value for this DocumentGenerationResponseV2.
     *
     * @param nonMatchingDataList
     */
    public void setNonMatchingDataList(pl.com.dpd.dpdservices.NonMatchingData[] nonMatchingDataList) {
        this.nonMatchingDataList = nonMatchingDataList;
    }

    public pl.com.dpd.dpdservices.NonMatchingData getNonMatchingDataList(int i) {
        return this.nonMatchingDataList[i];
    }

    public void setNonMatchingDataList(int i, pl.com.dpd.dpdservices.NonMatchingData _value) {
        this.nonMatchingDataList[i] = _value;
    }


    /**
     * Gets the session value for this DocumentGenerationResponseV2.
     *
     * @return session
     */
    public pl.com.dpd.dpdservices.SessionDGRV2 getSession() {
        return session;
    }


    /**
     * Sets the session value for this DocumentGenerationResponseV2.
     *
     * @param session
     */
    public void setSession(pl.com.dpd.dpdservices.SessionDGRV2 session) {
        this.session = session;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DocumentGenerationResponseV2)) return false;
        DocumentGenerationResponseV2 other = (DocumentGenerationResponseV2) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.destinationDataList == null && other.getDestinationDataList() == null) ||
                        (this.destinationDataList != null &&
                                java.util.Arrays.equals(this.destinationDataList, other.getDestinationDataList()))) &&
                ((this.documentData == null && other.getDocumentData() == null) ||
                        (this.documentData != null &&
                                java.util.Arrays.equals(this.documentData, other.getDocumentData()))) &&
                ((this.nonMatchingDataList == null && other.getNonMatchingDataList() == null) ||
                        (this.nonMatchingDataList != null &&
                                java.util.Arrays.equals(this.nonMatchingDataList, other.getNonMatchingDataList()))) &&
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
        if (getDestinationDataList() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getDestinationDataList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDestinationDataList(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
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
        if (getNonMatchingDataList() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getNonMatchingDataList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNonMatchingDataList(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSession() != null) {
            _hashCode += getSession().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(DocumentGenerationResponseV2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "documentGenerationResponseV2"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationDataList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DestinationDataList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "destinationsData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "DestinationsData"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DocumentData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nonMatchingDataList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nonMatchingDataList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "nonMatchingData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("session");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Session"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "sessionDGRV2"));
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
