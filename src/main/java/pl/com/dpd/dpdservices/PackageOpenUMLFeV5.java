/**
 * PackageOpenUMLFeV5.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.dpd.dpdservices;

public class PackageOpenUMLFeV5  implements java.io.Serializable {
    private pl.com.dpd.dpdservices.ParcelOpenUMLFeV1[] parcels;

    private pl.com.dpd.dpdservices.PayerTypeEnumOpenUMLFeV1 payerType;

    private pl.com.dpd.dpdservices.PackageAddressOpenUMLFeV1 receiver;

    private java.lang.String ref1;

    private java.lang.String ref2;

    private java.lang.String ref3;

    private java.lang.String reference;

    private pl.com.dpd.dpdservices.PackageAddressOpenUMLFeV1 sender;

    private pl.com.dpd.dpdservices.ServicesOpenUMLFeV6 services;

    private java.lang.Integer thirdPartyFID;

    public PackageOpenUMLFeV5() {
    }

    public PackageOpenUMLFeV5(
           pl.com.dpd.dpdservices.ParcelOpenUMLFeV1[] parcels,
           pl.com.dpd.dpdservices.PayerTypeEnumOpenUMLFeV1 payerType,
           pl.com.dpd.dpdservices.PackageAddressOpenUMLFeV1 receiver,
           java.lang.String ref1,
           java.lang.String ref2,
           java.lang.String ref3,
           java.lang.String reference,
           pl.com.dpd.dpdservices.PackageAddressOpenUMLFeV1 sender,
           pl.com.dpd.dpdservices.ServicesOpenUMLFeV6 services,
           java.lang.Integer thirdPartyFID) {
           this.parcels = parcels;
           this.payerType = payerType;
           this.receiver = receiver;
           this.ref1 = ref1;
           this.ref2 = ref2;
           this.ref3 = ref3;
           this.reference = reference;
           this.sender = sender;
           this.services = services;
           this.thirdPartyFID = thirdPartyFID;
    }


    /**
     * Gets the parcels value for this PackageOpenUMLFeV5.
     * 
     * @return parcels
     */
    public pl.com.dpd.dpdservices.ParcelOpenUMLFeV1[] getParcels() {
        return parcels;
    }


    /**
     * Sets the parcels value for this PackageOpenUMLFeV5.
     * 
     * @param parcels
     */
    public void setParcels(pl.com.dpd.dpdservices.ParcelOpenUMLFeV1[] parcels) {
        this.parcels = parcels;
    }

    public pl.com.dpd.dpdservices.ParcelOpenUMLFeV1 getParcels(int i) {
        return this.parcels[i];
    }

    public void setParcels(int i, pl.com.dpd.dpdservices.ParcelOpenUMLFeV1 _value) {
        this.parcels[i] = _value;
    }


    /**
     * Gets the payerType value for this PackageOpenUMLFeV5.
     * 
     * @return payerType
     */
    public pl.com.dpd.dpdservices.PayerTypeEnumOpenUMLFeV1 getPayerType() {
        return payerType;
    }


    /**
     * Sets the payerType value for this PackageOpenUMLFeV5.
     * 
     * @param payerType
     */
    public void setPayerType(pl.com.dpd.dpdservices.PayerTypeEnumOpenUMLFeV1 payerType) {
        this.payerType = payerType;
    }


    /**
     * Gets the receiver value for this PackageOpenUMLFeV5.
     * 
     * @return receiver
     */
    public pl.com.dpd.dpdservices.PackageAddressOpenUMLFeV1 getReceiver() {
        return receiver;
    }


    /**
     * Sets the receiver value for this PackageOpenUMLFeV5.
     * 
     * @param receiver
     */
    public void setReceiver(pl.com.dpd.dpdservices.PackageAddressOpenUMLFeV1 receiver) {
        this.receiver = receiver;
    }


    /**
     * Gets the ref1 value for this PackageOpenUMLFeV5.
     * 
     * @return ref1
     */
    public java.lang.String getRef1() {
        return ref1;
    }


    /**
     * Sets the ref1 value for this PackageOpenUMLFeV5.
     * 
     * @param ref1
     */
    public void setRef1(java.lang.String ref1) {
        this.ref1 = ref1;
    }


    /**
     * Gets the ref2 value for this PackageOpenUMLFeV5.
     * 
     * @return ref2
     */
    public java.lang.String getRef2() {
        return ref2;
    }


    /**
     * Sets the ref2 value for this PackageOpenUMLFeV5.
     * 
     * @param ref2
     */
    public void setRef2(java.lang.String ref2) {
        this.ref2 = ref2;
    }


    /**
     * Gets the ref3 value for this PackageOpenUMLFeV5.
     * 
     * @return ref3
     */
    public java.lang.String getRef3() {
        return ref3;
    }


    /**
     * Sets the ref3 value for this PackageOpenUMLFeV5.
     * 
     * @param ref3
     */
    public void setRef3(java.lang.String ref3) {
        this.ref3 = ref3;
    }


    /**
     * Gets the reference value for this PackageOpenUMLFeV5.
     * 
     * @return reference
     */
    public java.lang.String getReference() {
        return reference;
    }


    /**
     * Sets the reference value for this PackageOpenUMLFeV5.
     * 
     * @param reference
     */
    public void setReference(java.lang.String reference) {
        this.reference = reference;
    }


    /**
     * Gets the sender value for this PackageOpenUMLFeV5.
     * 
     * @return sender
     */
    public pl.com.dpd.dpdservices.PackageAddressOpenUMLFeV1 getSender() {
        return sender;
    }


    /**
     * Sets the sender value for this PackageOpenUMLFeV5.
     * 
     * @param sender
     */
    public void setSender(pl.com.dpd.dpdservices.PackageAddressOpenUMLFeV1 sender) {
        this.sender = sender;
    }


    /**
     * Gets the services value for this PackageOpenUMLFeV5.
     * 
     * @return services
     */
    public pl.com.dpd.dpdservices.ServicesOpenUMLFeV6 getServices() {
        return services;
    }


    /**
     * Sets the services value for this PackageOpenUMLFeV5.
     * 
     * @param services
     */
    public void setServices(pl.com.dpd.dpdservices.ServicesOpenUMLFeV6 services) {
        this.services = services;
    }


    /**
     * Gets the thirdPartyFID value for this PackageOpenUMLFeV5.
     * 
     * @return thirdPartyFID
     */
    public java.lang.Integer getThirdPartyFID() {
        return thirdPartyFID;
    }


    /**
     * Sets the thirdPartyFID value for this PackageOpenUMLFeV5.
     * 
     * @param thirdPartyFID
     */
    public void setThirdPartyFID(java.lang.Integer thirdPartyFID) {
        this.thirdPartyFID = thirdPartyFID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PackageOpenUMLFeV5)) return false;
        PackageOpenUMLFeV5 other = (PackageOpenUMLFeV5) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.parcels==null && other.getParcels()==null) || 
             (this.parcels!=null &&
              java.util.Arrays.equals(this.parcels, other.getParcels()))) &&
            ((this.payerType==null && other.getPayerType()==null) || 
             (this.payerType!=null &&
              this.payerType.equals(other.getPayerType()))) &&
            ((this.receiver==null && other.getReceiver()==null) || 
             (this.receiver!=null &&
              this.receiver.equals(other.getReceiver()))) &&
            ((this.ref1==null && other.getRef1()==null) || 
             (this.ref1!=null &&
              this.ref1.equals(other.getRef1()))) &&
            ((this.ref2==null && other.getRef2()==null) || 
             (this.ref2!=null &&
              this.ref2.equals(other.getRef2()))) &&
            ((this.ref3==null && other.getRef3()==null) || 
             (this.ref3!=null &&
              this.ref3.equals(other.getRef3()))) &&
            ((this.reference==null && other.getReference()==null) || 
             (this.reference!=null &&
              this.reference.equals(other.getReference()))) &&
            ((this.sender==null && other.getSender()==null) || 
             (this.sender!=null &&
              this.sender.equals(other.getSender()))) &&
            ((this.services==null && other.getServices()==null) || 
             (this.services!=null &&
              this.services.equals(other.getServices()))) &&
            ((this.thirdPartyFID==null && other.getThirdPartyFID()==null) || 
             (this.thirdPartyFID!=null &&
              this.thirdPartyFID.equals(other.getThirdPartyFID())));
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
        if (getParcels() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParcels());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParcels(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPayerType() != null) {
            _hashCode += getPayerType().hashCode();
        }
        if (getReceiver() != null) {
            _hashCode += getReceiver().hashCode();
        }
        if (getRef1() != null) {
            _hashCode += getRef1().hashCode();
        }
        if (getRef2() != null) {
            _hashCode += getRef2().hashCode();
        }
        if (getRef3() != null) {
            _hashCode += getRef3().hashCode();
        }
        if (getReference() != null) {
            _hashCode += getReference().hashCode();
        }
        if (getSender() != null) {
            _hashCode += getSender().hashCode();
        }
        if (getServices() != null) {
            _hashCode += getServices().hashCode();
        }
        if (getThirdPartyFID() != null) {
            _hashCode += getThirdPartyFID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PackageOpenUMLFeV5.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "packageOpenUMLFeV5"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parcels");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parcels"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "parcelOpenUMLFeV1"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payerType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payerType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "payerTypeEnumOpenUMLFeV1"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiver");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receiver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "packageAddressOpenUMLFeV1"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ref1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ref1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ref2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ref2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ref3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ref3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sender");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sender"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "packageAddressOpenUMLFeV1"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("services");
        elemField.setXmlName(new javax.xml.namespace.QName("", "services"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "servicesOpenUMLFeV6"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyFID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "thirdPartyFID"));
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
