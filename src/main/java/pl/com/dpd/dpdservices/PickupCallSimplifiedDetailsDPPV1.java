/**
 * PickupCallSimplifiedDetailsDPPV1.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.dpd.dpdservices;

public class PickupCallSimplifiedDetailsDPPV1 implements java.io.Serializable {
    private pl.com.dpd.dpdservices.PickupPackagesParamsDPPV1 packagesParams;

    private pl.com.dpd.dpdservices.PickupCustomerDPPV1 pickupCustomer;

    private pl.com.dpd.dpdservices.PickupPayerDPPV1 pickupPayer;

    private pl.com.dpd.dpdservices.PickupSenderDPPV1 pickupSender;

    public PickupCallSimplifiedDetailsDPPV1() {
    }

    public PickupCallSimplifiedDetailsDPPV1(
            pl.com.dpd.dpdservices.PickupPackagesParamsDPPV1 packagesParams,
            pl.com.dpd.dpdservices.PickupCustomerDPPV1 pickupCustomer,
            pl.com.dpd.dpdservices.PickupPayerDPPV1 pickupPayer,
            pl.com.dpd.dpdservices.PickupSenderDPPV1 pickupSender) {
        this.packagesParams = packagesParams;
        this.pickupCustomer = pickupCustomer;
        this.pickupPayer = pickupPayer;
        this.pickupSender = pickupSender;
    }


    /**
     * Gets the packagesParams value for this PickupCallSimplifiedDetailsDPPV1.
     *
     * @return packagesParams
     */
    public pl.com.dpd.dpdservices.PickupPackagesParamsDPPV1 getPackagesParams() {
        return packagesParams;
    }


    /**
     * Sets the packagesParams value for this PickupCallSimplifiedDetailsDPPV1.
     *
     * @param packagesParams
     */
    public void setPackagesParams(pl.com.dpd.dpdservices.PickupPackagesParamsDPPV1 packagesParams) {
        this.packagesParams = packagesParams;
    }


    /**
     * Gets the pickupCustomer value for this PickupCallSimplifiedDetailsDPPV1.
     *
     * @return pickupCustomer
     */
    public pl.com.dpd.dpdservices.PickupCustomerDPPV1 getPickupCustomer() {
        return pickupCustomer;
    }


    /**
     * Sets the pickupCustomer value for this PickupCallSimplifiedDetailsDPPV1.
     *
     * @param pickupCustomer
     */
    public void setPickupCustomer(pl.com.dpd.dpdservices.PickupCustomerDPPV1 pickupCustomer) {
        this.pickupCustomer = pickupCustomer;
    }


    /**
     * Gets the pickupPayer value for this PickupCallSimplifiedDetailsDPPV1.
     *
     * @return pickupPayer
     */
    public pl.com.dpd.dpdservices.PickupPayerDPPV1 getPickupPayer() {
        return pickupPayer;
    }


    /**
     * Sets the pickupPayer value for this PickupCallSimplifiedDetailsDPPV1.
     *
     * @param pickupPayer
     */
    public void setPickupPayer(pl.com.dpd.dpdservices.PickupPayerDPPV1 pickupPayer) {
        this.pickupPayer = pickupPayer;
    }


    /**
     * Gets the pickupSender value for this PickupCallSimplifiedDetailsDPPV1.
     *
     * @return pickupSender
     */
    public pl.com.dpd.dpdservices.PickupSenderDPPV1 getPickupSender() {
        return pickupSender;
    }


    /**
     * Sets the pickupSender value for this PickupCallSimplifiedDetailsDPPV1.
     *
     * @param pickupSender
     */
    public void setPickupSender(pl.com.dpd.dpdservices.PickupSenderDPPV1 pickupSender) {
        this.pickupSender = pickupSender;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PickupCallSimplifiedDetailsDPPV1)) return false;
        PickupCallSimplifiedDetailsDPPV1 other = (PickupCallSimplifiedDetailsDPPV1) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.packagesParams == null && other.getPackagesParams() == null) ||
                        (this.packagesParams != null &&
                                this.packagesParams.equals(other.getPackagesParams()))) &&
                ((this.pickupCustomer == null && other.getPickupCustomer() == null) ||
                        (this.pickupCustomer != null &&
                                this.pickupCustomer.equals(other.getPickupCustomer()))) &&
                ((this.pickupPayer == null && other.getPickupPayer() == null) ||
                        (this.pickupPayer != null &&
                                this.pickupPayer.equals(other.getPickupPayer()))) &&
                ((this.pickupSender == null && other.getPickupSender() == null) ||
                        (this.pickupSender != null &&
                                this.pickupSender.equals(other.getPickupSender())));
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
        if (getPackagesParams() != null) {
            _hashCode += getPackagesParams().hashCode();
        }
        if (getPickupCustomer() != null) {
            _hashCode += getPickupCustomer().hashCode();
        }
        if (getPickupPayer() != null) {
            _hashCode += getPickupPayer().hashCode();
        }
        if (getPickupSender() != null) {
            _hashCode += getPickupSender().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(PickupCallSimplifiedDetailsDPPV1.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "pickupCallSimplifiedDetailsDPPV1"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packagesParams");
        elemField.setXmlName(new javax.xml.namespace.QName("", "packagesParams"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "pickupPackagesParamsDPPV1"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickupCustomer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pickupCustomer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "pickupCustomerDPPV1"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickupPayer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pickupPayer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "pickupPayerDPPV1"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickupSender");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pickupSender"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "pickupSenderDPPV1"));
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
