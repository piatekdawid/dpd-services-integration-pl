/**
 * ParcelOpenUMLFeV1.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.dpd.dpdservices;

public class ParcelOpenUMLFeV1  implements java.io.Serializable {
    private java.lang.String reference;

    private java.lang.String weight;

    private java.lang.String sizeX;

    private java.lang.String sizeY;

    private java.lang.String sizeZ;

    private java.lang.String content;

    private java.lang.String customerData1;

    private java.lang.String customerData2;

    private java.lang.String customerData3;

    public ParcelOpenUMLFeV1() {
    }

    public ParcelOpenUMLFeV1(
           java.lang.String reference,
           java.lang.String weight,
           java.lang.String sizeX,
           java.lang.String sizeY,
           java.lang.String sizeZ,
           java.lang.String content,
           java.lang.String customerData1,
           java.lang.String customerData2,
           java.lang.String customerData3) {
           this.reference = reference;
           this.weight = weight;
           this.sizeX = sizeX;
           this.sizeY = sizeY;
           this.sizeZ = sizeZ;
           this.content = content;
           this.customerData1 = customerData1;
           this.customerData2 = customerData2;
           this.customerData3 = customerData3;
    }


    /**
     * Gets the reference value for this ParcelOpenUMLFeV1.
     * 
     * @return reference
     */
    public java.lang.String getReference() {
        return reference;
    }


    /**
     * Sets the reference value for this ParcelOpenUMLFeV1.
     * 
     * @param reference
     */
    public void setReference(java.lang.String reference) {
        this.reference = reference;
    }


    /**
     * Gets the weight value for this ParcelOpenUMLFeV1.
     * 
     * @return weight
     */
    public java.lang.String getWeight() {
        return weight;
    }


    /**
     * Sets the weight value for this ParcelOpenUMLFeV1.
     * 
     * @param weight
     */
    public void setWeight(java.lang.String weight) {
        this.weight = weight;
    }


    /**
     * Gets the sizeX value for this ParcelOpenUMLFeV1.
     * 
     * @return sizeX
     */
    public java.lang.String getSizeX() {
        return sizeX;
    }


    /**
     * Sets the sizeX value for this ParcelOpenUMLFeV1.
     * 
     * @param sizeX
     */
    public void setSizeX(java.lang.String sizeX) {
        this.sizeX = sizeX;
    }


    /**
     * Gets the sizeY value for this ParcelOpenUMLFeV1.
     * 
     * @return sizeY
     */
    public java.lang.String getSizeY() {
        return sizeY;
    }


    /**
     * Sets the sizeY value for this ParcelOpenUMLFeV1.
     * 
     * @param sizeY
     */
    public void setSizeY(java.lang.String sizeY) {
        this.sizeY = sizeY;
    }


    /**
     * Gets the sizeZ value for this ParcelOpenUMLFeV1.
     * 
     * @return sizeZ
     */
    public java.lang.String getSizeZ() {
        return sizeZ;
    }


    /**
     * Sets the sizeZ value for this ParcelOpenUMLFeV1.
     * 
     * @param sizeZ
     */
    public void setSizeZ(java.lang.String sizeZ) {
        this.sizeZ = sizeZ;
    }


    /**
     * Gets the content value for this ParcelOpenUMLFeV1.
     * 
     * @return content
     */
    public java.lang.String getContent() {
        return content;
    }


    /**
     * Sets the content value for this ParcelOpenUMLFeV1.
     * 
     * @param content
     */
    public void setContent(java.lang.String content) {
        this.content = content;
    }


    /**
     * Gets the customerData1 value for this ParcelOpenUMLFeV1.
     * 
     * @return customerData1
     */
    public java.lang.String getCustomerData1() {
        return customerData1;
    }


    /**
     * Sets the customerData1 value for this ParcelOpenUMLFeV1.
     * 
     * @param customerData1
     */
    public void setCustomerData1(java.lang.String customerData1) {
        this.customerData1 = customerData1;
    }


    /**
     * Gets the customerData2 value for this ParcelOpenUMLFeV1.
     * 
     * @return customerData2
     */
    public java.lang.String getCustomerData2() {
        return customerData2;
    }


    /**
     * Sets the customerData2 value for this ParcelOpenUMLFeV1.
     * 
     * @param customerData2
     */
    public void setCustomerData2(java.lang.String customerData2) {
        this.customerData2 = customerData2;
    }


    /**
     * Gets the customerData3 value for this ParcelOpenUMLFeV1.
     * 
     * @return customerData3
     */
    public java.lang.String getCustomerData3() {
        return customerData3;
    }


    /**
     * Sets the customerData3 value for this ParcelOpenUMLFeV1.
     * 
     * @param customerData3
     */
    public void setCustomerData3(java.lang.String customerData3) {
        this.customerData3 = customerData3;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ParcelOpenUMLFeV1)) return false;
        ParcelOpenUMLFeV1 other = (ParcelOpenUMLFeV1) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.reference==null && other.getReference()==null) || 
             (this.reference!=null &&
              this.reference.equals(other.getReference()))) &&
            ((this.weight==null && other.getWeight()==null) || 
             (this.weight!=null &&
              this.weight.equals(other.getWeight()))) &&
            ((this.sizeX==null && other.getSizeX()==null) || 
             (this.sizeX!=null &&
              this.sizeX.equals(other.getSizeX()))) &&
            ((this.sizeY==null && other.getSizeY()==null) || 
             (this.sizeY!=null &&
              this.sizeY.equals(other.getSizeY()))) &&
            ((this.sizeZ==null && other.getSizeZ()==null) || 
             (this.sizeZ!=null &&
              this.sizeZ.equals(other.getSizeZ()))) &&
            ((this.content==null && other.getContent()==null) || 
             (this.content!=null &&
              this.content.equals(other.getContent()))) &&
            ((this.customerData1==null && other.getCustomerData1()==null) || 
             (this.customerData1!=null &&
              this.customerData1.equals(other.getCustomerData1()))) &&
            ((this.customerData2==null && other.getCustomerData2()==null) || 
             (this.customerData2!=null &&
              this.customerData2.equals(other.getCustomerData2()))) &&
            ((this.customerData3==null && other.getCustomerData3()==null) || 
             (this.customerData3!=null &&
              this.customerData3.equals(other.getCustomerData3())));
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
        if (getReference() != null) {
            _hashCode += getReference().hashCode();
        }
        if (getWeight() != null) {
            _hashCode += getWeight().hashCode();
        }
        if (getSizeX() != null) {
            _hashCode += getSizeX().hashCode();
        }
        if (getSizeY() != null) {
            _hashCode += getSizeY().hashCode();
        }
        if (getSizeZ() != null) {
            _hashCode += getSizeZ().hashCode();
        }
        if (getContent() != null) {
            _hashCode += getContent().hashCode();
        }
        if (getCustomerData1() != null) {
            _hashCode += getCustomerData1().hashCode();
        }
        if (getCustomerData2() != null) {
            _hashCode += getCustomerData2().hashCode();
        }
        if (getCustomerData3() != null) {
            _hashCode += getCustomerData3().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ParcelOpenUMLFeV1.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "parcelOpenUMLFeV1"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weight");
        elemField.setXmlName(new javax.xml.namespace.QName("", "weight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sizeX");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sizeX"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sizeY");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sizeY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sizeZ");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sizeZ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("content");
        elemField.setXmlName(new javax.xml.namespace.QName("", "content"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerData1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerData1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerData2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerData2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerData3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerData3"));
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
