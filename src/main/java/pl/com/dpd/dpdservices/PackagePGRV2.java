/**
 * PackagePGRV2.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.dpd.dpdservices;

public class PackagePGRV2 implements java.io.Serializable {
    private java.lang.String status;

    private java.lang.Long packageId;

    private java.lang.String reference;

    private pl.com.dpd.dpdservices.ValidationInfoPGRV2[] validationDetails;

    private pl.com.dpd.dpdservices.ParcelPGRV2[] parcels;

    public PackagePGRV2() {
    }

    public PackagePGRV2(
            java.lang.String status,
            java.lang.Long packageId,
            java.lang.String reference,
            pl.com.dpd.dpdservices.ValidationInfoPGRV2[] validationDetails,
            pl.com.dpd.dpdservices.ParcelPGRV2[] parcels) {
        this.status = status;
        this.packageId = packageId;
        this.reference = reference;
        this.validationDetails = validationDetails;
        this.parcels = parcels;
    }


    /**
     * Gets the status value for this PackagePGRV2.
     *
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this PackagePGRV2.
     *
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the packageId value for this PackagePGRV2.
     *
     * @return packageId
     */
    public java.lang.Long getPackageId() {
        return packageId;
    }


    /**
     * Sets the packageId value for this PackagePGRV2.
     *
     * @param packageId
     */
    public void setPackageId(java.lang.Long packageId) {
        this.packageId = packageId;
    }


    /**
     * Gets the reference value for this PackagePGRV2.
     *
     * @return reference
     */
    public java.lang.String getReference() {
        return reference;
    }


    /**
     * Sets the reference value for this PackagePGRV2.
     *
     * @param reference
     */
    public void setReference(java.lang.String reference) {
        this.reference = reference;
    }


    /**
     * Gets the validationDetails value for this PackagePGRV2.
     *
     * @return validationDetails
     */
    public pl.com.dpd.dpdservices.ValidationInfoPGRV2[] getValidationDetails() {
        return validationDetails;
    }


    /**
     * Sets the validationDetails value for this PackagePGRV2.
     *
     * @param validationDetails
     */
    public void setValidationDetails(pl.com.dpd.dpdservices.ValidationInfoPGRV2[] validationDetails) {
        this.validationDetails = validationDetails;
    }


    /**
     * Gets the parcels value for this PackagePGRV2.
     *
     * @return parcels
     */
    public pl.com.dpd.dpdservices.ParcelPGRV2[] getParcels() {
        return parcels;
    }


    /**
     * Sets the parcels value for this PackagePGRV2.
     *
     * @param parcels
     */
    public void setParcels(pl.com.dpd.dpdservices.ParcelPGRV2[] parcels) {
        this.parcels = parcels;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PackagePGRV2)) return false;
        PackagePGRV2 other = (PackagePGRV2) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.status == null && other.getStatus() == null) ||
                        (this.status != null &&
                                this.status.equals(other.getStatus()))) &&
                ((this.packageId == null && other.getPackageId() == null) ||
                        (this.packageId != null &&
                                this.packageId.equals(other.getPackageId()))) &&
                ((this.reference == null && other.getReference() == null) ||
                        (this.reference != null &&
                                this.reference.equals(other.getReference()))) &&
                ((this.validationDetails == null && other.getValidationDetails() == null) ||
                        (this.validationDetails != null &&
                                java.util.Arrays.equals(this.validationDetails, other.getValidationDetails()))) &&
                ((this.parcels == null && other.getParcels() == null) ||
                        (this.parcels != null &&
                                java.util.Arrays.equals(this.parcels, other.getParcels())));
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
        if (getPackageId() != null) {
            _hashCode += getPackageId().hashCode();
        }
        if (getReference() != null) {
            _hashCode += getReference().hashCode();
        }
        if (getValidationDetails() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getValidationDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getValidationDetails(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getParcels() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getParcels());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParcels(), i);
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
            new org.apache.axis.description.TypeDesc(PackagePGRV2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "packagePGRV2"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PackageId"));
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
        elemField.setFieldName("validationDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ValidationDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "validationInfoPGRV2"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "ValidationInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parcels");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Parcels"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "parcelPGRV2"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "Parcel"));
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
