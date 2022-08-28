/**
 * PickupPayerDPPV1.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.dpd.dpdservices;

public class PickupPayerDPPV1  implements java.io.Serializable {
    private java.lang.String payerCostCenter;

    private java.lang.String payerName;

    private java.lang.Integer payerNumber;

    public PickupPayerDPPV1() {
    }

    public PickupPayerDPPV1(
           java.lang.String payerCostCenter,
           java.lang.String payerName,
           java.lang.Integer payerNumber) {
           this.payerCostCenter = payerCostCenter;
           this.payerName = payerName;
           this.payerNumber = payerNumber;
    }


    /**
     * Gets the payerCostCenter value for this PickupPayerDPPV1.
     * 
     * @return payerCostCenter
     */
    public java.lang.String getPayerCostCenter() {
        return payerCostCenter;
    }


    /**
     * Sets the payerCostCenter value for this PickupPayerDPPV1.
     * 
     * @param payerCostCenter
     */
    public void setPayerCostCenter(java.lang.String payerCostCenter) {
        this.payerCostCenter = payerCostCenter;
    }


    /**
     * Gets the payerName value for this PickupPayerDPPV1.
     * 
     * @return payerName
     */
    public java.lang.String getPayerName() {
        return payerName;
    }


    /**
     * Sets the payerName value for this PickupPayerDPPV1.
     * 
     * @param payerName
     */
    public void setPayerName(java.lang.String payerName) {
        this.payerName = payerName;
    }


    /**
     * Gets the payerNumber value for this PickupPayerDPPV1.
     * 
     * @return payerNumber
     */
    public java.lang.Integer getPayerNumber() {
        return payerNumber;
    }


    /**
     * Sets the payerNumber value for this PickupPayerDPPV1.
     * 
     * @param payerNumber
     */
    public void setPayerNumber(java.lang.Integer payerNumber) {
        this.payerNumber = payerNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PickupPayerDPPV1)) return false;
        PickupPayerDPPV1 other = (PickupPayerDPPV1) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.payerCostCenter==null && other.getPayerCostCenter()==null) || 
             (this.payerCostCenter!=null &&
              this.payerCostCenter.equals(other.getPayerCostCenter()))) &&
            ((this.payerName==null && other.getPayerName()==null) || 
             (this.payerName!=null &&
              this.payerName.equals(other.getPayerName()))) &&
            ((this.payerNumber==null && other.getPayerNumber()==null) || 
             (this.payerNumber!=null &&
              this.payerNumber.equals(other.getPayerNumber())));
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
        if (getPayerCostCenter() != null) {
            _hashCode += getPayerCostCenter().hashCode();
        }
        if (getPayerName() != null) {
            _hashCode += getPayerName().hashCode();
        }
        if (getPayerNumber() != null) {
            _hashCode += getPayerNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PickupPayerDPPV1.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "pickupPayerDPPV1"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payerCostCenter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payerCostCenter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payerName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payerNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payerNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
