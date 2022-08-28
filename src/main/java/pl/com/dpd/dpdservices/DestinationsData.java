/**
 * DestinationsData.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.dpd.dpdservices;

public class DestinationsData implements java.io.Serializable {
    private java.lang.String destinationName;

    private java.lang.String documentId;

    private java.lang.Boolean domestic;

    public DestinationsData() {
    }

    public DestinationsData(
            java.lang.String destinationName,
            java.lang.String documentId,
            java.lang.Boolean domestic) {
        this.destinationName = destinationName;
        this.documentId = documentId;
        this.domestic = domestic;
    }


    /**
     * Gets the destinationName value for this DestinationsData.
     *
     * @return destinationName
     */
    public java.lang.String getDestinationName() {
        return destinationName;
    }


    /**
     * Sets the destinationName value for this DestinationsData.
     *
     * @param destinationName
     */
    public void setDestinationName(java.lang.String destinationName) {
        this.destinationName = destinationName;
    }


    /**
     * Gets the documentId value for this DestinationsData.
     *
     * @return documentId
     */
    public java.lang.String getDocumentId() {
        return documentId;
    }


    /**
     * Sets the documentId value for this DestinationsData.
     *
     * @param documentId
     */
    public void setDocumentId(java.lang.String documentId) {
        this.documentId = documentId;
    }


    /**
     * Gets the domestic value for this DestinationsData.
     *
     * @return domestic
     */
    public java.lang.Boolean getDomestic() {
        return domestic;
    }


    /**
     * Sets the domestic value for this DestinationsData.
     *
     * @param domestic
     */
    public void setDomestic(java.lang.Boolean domestic) {
        this.domestic = domestic;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DestinationsData)) return false;
        DestinationsData other = (DestinationsData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.destinationName == null && other.getDestinationName() == null) ||
                        (this.destinationName != null &&
                                this.destinationName.equals(other.getDestinationName()))) &&
                ((this.documentId == null && other.getDocumentId() == null) ||
                        (this.documentId != null &&
                                this.documentId.equals(other.getDocumentId()))) &&
                ((this.domestic == null && other.getDomestic() == null) ||
                        (this.domestic != null &&
                                this.domestic.equals(other.getDomestic())));
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
        if (getDestinationName() != null) {
            _hashCode += getDestinationName().hashCode();
        }
        if (getDocumentId() != null) {
            _hashCode += getDocumentId().hashCode();
        }
        if (getDomestic() != null) {
            _hashCode += getDomestic().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(DestinationsData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "destinationsData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DestinationName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DocumentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domestic");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Domestic"));
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
