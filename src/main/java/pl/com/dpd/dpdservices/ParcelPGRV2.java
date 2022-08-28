/**
 * ParcelPGRV2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.dpd.dpdservices;

public class ParcelPGRV2  implements java.io.Serializable {
    private java.lang.String status;

    private java.lang.Long parcelId;

    private java.lang.String reference;

    private java.lang.String waybill;

    private pl.com.dpd.dpdservices.ValidationInfoPGRV2[] validationDetails;

    public ParcelPGRV2() {
    }

    public ParcelPGRV2(
           java.lang.String status,
           java.lang.Long parcelId,
           java.lang.String reference,
           java.lang.String waybill,
           pl.com.dpd.dpdservices.ValidationInfoPGRV2[] validationDetails) {
           this.status = status;
           this.parcelId = parcelId;
           this.reference = reference;
           this.waybill = waybill;
           this.validationDetails = validationDetails;
    }


    /**
     * Gets the status value for this ParcelPGRV2.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ParcelPGRV2.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the parcelId value for this ParcelPGRV2.
     * 
     * @return parcelId
     */
    public java.lang.Long getParcelId() {
        return parcelId;
    }


    /**
     * Sets the parcelId value for this ParcelPGRV2.
     * 
     * @param parcelId
     */
    public void setParcelId(java.lang.Long parcelId) {
        this.parcelId = parcelId;
    }


    /**
     * Gets the reference value for this ParcelPGRV2.
     * 
     * @return reference
     */
    public java.lang.String getReference() {
        return reference;
    }


    /**
     * Sets the reference value for this ParcelPGRV2.
     * 
     * @param reference
     */
    public void setReference(java.lang.String reference) {
        this.reference = reference;
    }


    /**
     * Gets the waybill value for this ParcelPGRV2.
     * 
     * @return waybill
     */
    public java.lang.String getWaybill() {
        return waybill;
    }


    /**
     * Sets the waybill value for this ParcelPGRV2.
     * 
     * @param waybill
     */
    public void setWaybill(java.lang.String waybill) {
        this.waybill = waybill;
    }


    /**
     * Gets the validationDetails value for this ParcelPGRV2.
     * 
     * @return validationDetails
     */
    public pl.com.dpd.dpdservices.ValidationInfoPGRV2[] getValidationDetails() {
        return validationDetails;
    }


    /**
     * Sets the validationDetails value for this ParcelPGRV2.
     * 
     * @param validationDetails
     */
    public void setValidationDetails(pl.com.dpd.dpdservices.ValidationInfoPGRV2[] validationDetails) {
        this.validationDetails = validationDetails;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ParcelPGRV2)) return false;
        ParcelPGRV2 other = (ParcelPGRV2) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.parcelId==null && other.getParcelId()==null) || 
             (this.parcelId!=null &&
              this.parcelId.equals(other.getParcelId()))) &&
            ((this.reference==null && other.getReference()==null) || 
             (this.reference!=null &&
              this.reference.equals(other.getReference()))) &&
            ((this.waybill==null && other.getWaybill()==null) || 
             (this.waybill!=null &&
              this.waybill.equals(other.getWaybill()))) &&
            ((this.validationDetails==null && other.getValidationDetails()==null) || 
             (this.validationDetails!=null &&
              java.util.Arrays.equals(this.validationDetails, other.getValidationDetails())));
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getParcelId() != null) {
            _hashCode += getParcelId().hashCode();
        }
        if (getReference() != null) {
            _hashCode += getReference().hashCode();
        }
        if (getWaybill() != null) {
            _hashCode += getWaybill().hashCode();
        }
        if (getValidationDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getValidationDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getValidationDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ParcelPGRV2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "parcelPGRV2"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parcelId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ParcelId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Reference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("waybill");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Waybill"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validationDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ValidationDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "validationInfoPGRV2"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "ValidationInfo"));
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
