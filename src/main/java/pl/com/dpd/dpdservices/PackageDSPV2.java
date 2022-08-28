/**
 * PackageDSPV2.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.dpd.dpdservices;

public class PackageDSPV2 implements java.io.Serializable {
    private java.lang.Long packageId;

    private pl.com.dpd.dpdservices.ParcelDSPV2[] parcels;

    private java.lang.String reference;

    public PackageDSPV2() {
    }

    public PackageDSPV2(
            java.lang.Long packageId,
            pl.com.dpd.dpdservices.ParcelDSPV2[] parcels,
            java.lang.String reference) {
        this.packageId = packageId;
        this.parcels = parcels;
        this.reference = reference;
    }


    /**
     * Gets the packageId value for this PackageDSPV2.
     *
     * @return packageId
     */
    public java.lang.Long getPackageId() {
        return packageId;
    }


    /**
     * Sets the packageId value for this PackageDSPV2.
     *
     * @param packageId
     */
    public void setPackageId(java.lang.Long packageId) {
        this.packageId = packageId;
    }


    /**
     * Gets the parcels value for this PackageDSPV2.
     *
     * @return parcels
     */
    public pl.com.dpd.dpdservices.ParcelDSPV2[] getParcels() {
        return parcels;
    }


    /**
     * Sets the parcels value for this PackageDSPV2.
     *
     * @param parcels
     */
    public void setParcels(pl.com.dpd.dpdservices.ParcelDSPV2[] parcels) {
        this.parcels = parcels;
    }


    /**
     * Gets the reference value for this PackageDSPV2.
     *
     * @return reference
     */
    public java.lang.String getReference() {
        return reference;
    }


    /**
     * Sets the reference value for this PackageDSPV2.
     *
     * @param reference
     */
    public void setReference(java.lang.String reference) {
        this.reference = reference;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PackageDSPV2)) return false;
        PackageDSPV2 other = (PackageDSPV2) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.packageId == null && other.getPackageId() == null) ||
                        (this.packageId != null &&
                                this.packageId.equals(other.getPackageId()))) &&
                ((this.parcels == null && other.getParcels() == null) ||
                        (this.parcels != null &&
                                java.util.Arrays.equals(this.parcels, other.getParcels()))) &&
                ((this.reference == null && other.getReference() == null) ||
                        (this.reference != null &&
                                this.reference.equals(other.getReference())));
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
        if (getPackageId() != null) {
            _hashCode += getPackageId().hashCode();
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
        if (getReference() != null) {
            _hashCode += getReference().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(PackageDSPV2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "packageDSPV2"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PackageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parcels");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Parcels"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "parcelDSPV2"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "Parcel"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Reference"));
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
