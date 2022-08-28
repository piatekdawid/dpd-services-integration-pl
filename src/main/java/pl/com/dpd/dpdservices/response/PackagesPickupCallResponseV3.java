/**
 * PackagesPickupCallResponseV3.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.dpd.dpdservices.response;

public class PackagesPickupCallResponseV3 implements java.io.Serializable {
    private java.lang.Integer checkSum;

    private java.lang.String orderNumber;

    private pl.com.dpd.dpdservices.StatusInfoPCRV2 statusInfo;

    public PackagesPickupCallResponseV3() {
    }

    public PackagesPickupCallResponseV3(
            java.lang.Integer checkSum,
            java.lang.String orderNumber,
            pl.com.dpd.dpdservices.StatusInfoPCRV2 statusInfo) {
        this.checkSum = checkSum;
        this.orderNumber = orderNumber;
        this.statusInfo = statusInfo;
    }


    /**
     * Gets the checkSum value for this PackagesPickupCallResponseV3.
     *
     * @return checkSum
     */
    public java.lang.Integer getCheckSum() {
        return checkSum;
    }


    /**
     * Sets the checkSum value for this PackagesPickupCallResponseV3.
     *
     * @param checkSum
     */
    public void setCheckSum(java.lang.Integer checkSum) {
        this.checkSum = checkSum;
    }


    /**
     * Gets the orderNumber value for this PackagesPickupCallResponseV3.
     *
     * @return orderNumber
     */
    public java.lang.String getOrderNumber() {
        return orderNumber;
    }


    /**
     * Sets the orderNumber value for this PackagesPickupCallResponseV3.
     *
     * @param orderNumber
     */
    public void setOrderNumber(java.lang.String orderNumber) {
        this.orderNumber = orderNumber;
    }


    /**
     * Gets the statusInfo value for this PackagesPickupCallResponseV3.
     *
     * @return statusInfo
     */
    public pl.com.dpd.dpdservices.StatusInfoPCRV2 getStatusInfo() {
        return statusInfo;
    }


    /**
     * Sets the statusInfo value for this PackagesPickupCallResponseV3.
     *
     * @param statusInfo
     */
    public void setStatusInfo(pl.com.dpd.dpdservices.StatusInfoPCRV2 statusInfo) {
        this.statusInfo = statusInfo;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PackagesPickupCallResponseV3)) return false;
        PackagesPickupCallResponseV3 other = (PackagesPickupCallResponseV3) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.checkSum == null && other.getCheckSum() == null) ||
                        (this.checkSum != null &&
                                this.checkSum.equals(other.getCheckSum()))) &&
                ((this.orderNumber == null && other.getOrderNumber() == null) ||
                        (this.orderNumber != null &&
                                this.orderNumber.equals(other.getOrderNumber()))) &&
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
        if (getCheckSum() != null) {
            _hashCode += getCheckSum().hashCode();
        }
        if (getOrderNumber() != null) {
            _hashCode += getOrderNumber().hashCode();
        }
        if (getStatusInfo() != null) {
            _hashCode += getStatusInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(PackagesPickupCallResponseV3.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "packagesPickupCallResponseV3"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkSum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "checkSum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statusInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "statusInfoPCRV2"));
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
