/**
 * ValidationInfoPGRV2.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.dpd.dpdservices;

public class ValidationInfoPGRV2 implements java.io.Serializable {
    private java.lang.Integer errorId;

    private java.lang.String errorCode;

    private java.lang.String fieldNames;

    private java.lang.String info;

    public ValidationInfoPGRV2() {
    }

    public ValidationInfoPGRV2(
            java.lang.Integer errorId,
            java.lang.String errorCode,
            java.lang.String fieldNames,
            java.lang.String info) {
        this.errorId = errorId;
        this.errorCode = errorCode;
        this.fieldNames = fieldNames;
        this.info = info;
    }


    /**
     * Gets the errorId value for this ValidationInfoPGRV2.
     *
     * @return errorId
     */
    public java.lang.Integer getErrorId() {
        return errorId;
    }


    /**
     * Sets the errorId value for this ValidationInfoPGRV2.
     *
     * @param errorId
     */
    public void setErrorId(java.lang.Integer errorId) {
        this.errorId = errorId;
    }


    /**
     * Gets the errorCode value for this ValidationInfoPGRV2.
     *
     * @return errorCode
     */
    public java.lang.String getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this ValidationInfoPGRV2.
     *
     * @param errorCode
     */
    public void setErrorCode(java.lang.String errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * Gets the fieldNames value for this ValidationInfoPGRV2.
     *
     * @return fieldNames
     */
    public java.lang.String getFieldNames() {
        return fieldNames;
    }


    /**
     * Sets the fieldNames value for this ValidationInfoPGRV2.
     *
     * @param fieldNames
     */
    public void setFieldNames(java.lang.String fieldNames) {
        this.fieldNames = fieldNames;
    }


    /**
     * Gets the info value for this ValidationInfoPGRV2.
     *
     * @return info
     */
    public java.lang.String getInfo() {
        return info;
    }


    /**
     * Sets the info value for this ValidationInfoPGRV2.
     *
     * @param info
     */
    public void setInfo(java.lang.String info) {
        this.info = info;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ValidationInfoPGRV2)) return false;
        ValidationInfoPGRV2 other = (ValidationInfoPGRV2) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.errorId == null && other.getErrorId() == null) ||
                        (this.errorId != null &&
                                this.errorId.equals(other.getErrorId()))) &&
                ((this.errorCode == null && other.getErrorCode() == null) ||
                        (this.errorCode != null &&
                                this.errorCode.equals(other.getErrorCode()))) &&
                ((this.fieldNames == null && other.getFieldNames() == null) ||
                        (this.fieldNames != null &&
                                this.fieldNames.equals(other.getFieldNames()))) &&
                ((this.info == null && other.getInfo() == null) ||
                        (this.info != null &&
                                this.info.equals(other.getInfo())));
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
        if (getErrorId() != null) {
            _hashCode += getErrorId().hashCode();
        }
        if (getErrorCode() != null) {
            _hashCode += getErrorCode().hashCode();
        }
        if (getFieldNames() != null) {
            _hashCode += getFieldNames().hashCode();
        }
        if (getInfo() != null) {
            _hashCode += getInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ValidationInfoPGRV2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "validationInfoPGRV2"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ErrorId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ErrorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldNames");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FieldNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("info");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Info"));
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
