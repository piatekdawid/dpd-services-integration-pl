/**
 * ServiceCODDedicatedAccountOpenUMLFeV1.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.dpd.dpdservices;

import pl.com.dpd.dpdservices.enums.ServiceCurrencyEnum;

public class ServiceCODDedicatedAccountOpenUMLFeV1 implements java.io.Serializable {
    private java.lang.String accountNumber;

    private java.lang.String amount;

    private ServiceCurrencyEnum currency;

    public ServiceCODDedicatedAccountOpenUMLFeV1() {
    }

    public ServiceCODDedicatedAccountOpenUMLFeV1(
            java.lang.String accountNumber,
            java.lang.String amount,
            ServiceCurrencyEnum currency) {
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.currency = currency;
    }


    /**
     * Gets the accountNumber value for this ServiceCODDedicatedAccountOpenUMLFeV1.
     *
     * @return accountNumber
     */
    public java.lang.String getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this ServiceCODDedicatedAccountOpenUMLFeV1.
     *
     * @param accountNumber
     */
    public void setAccountNumber(java.lang.String accountNumber) {
        this.accountNumber = accountNumber;
    }


    /**
     * Gets the amount value for this ServiceCODDedicatedAccountOpenUMLFeV1.
     *
     * @return amount
     */
    public java.lang.String getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this ServiceCODDedicatedAccountOpenUMLFeV1.
     *
     * @param amount
     */
    public void setAmount(java.lang.String amount) {
        this.amount = amount;
    }


    /**
     * Gets the currency value for this ServiceCODDedicatedAccountOpenUMLFeV1.
     *
     * @return currency
     */
    public ServiceCurrencyEnum getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this ServiceCODDedicatedAccountOpenUMLFeV1.
     *
     * @param currency
     */
    public void setCurrency(ServiceCurrencyEnum currency) {
        this.currency = currency;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceCODDedicatedAccountOpenUMLFeV1)) return false;
        ServiceCODDedicatedAccountOpenUMLFeV1 other = (ServiceCODDedicatedAccountOpenUMLFeV1) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.accountNumber == null && other.getAccountNumber() == null) ||
                        (this.accountNumber != null &&
                                this.accountNumber.equals(other.getAccountNumber()))) &&
                ((this.amount == null && other.getAmount() == null) ||
                        (this.amount != null &&
                                this.amount.equals(other.getAmount()))) &&
                ((this.currency == null && other.getCurrency() == null) ||
                        (this.currency != null &&
                                this.currency.equals(other.getCurrency())));
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
        if (getAccountNumber() != null) {
            _hashCode += getAccountNumber().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ServiceCODDedicatedAccountOpenUMLFeV1.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "serviceCODDedicatedAccountOpenUMLFeV1"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "serviceCurrencyEnum"));
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
