/**
 * ParcelsAppendV1.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.dpd.dpdservices;

public class ParcelsAppendV1  implements java.io.Serializable {
    private pl.com.dpd.dpdservices.ParcelsAppendSearchCriteriaPAV1 packagesearchCriteria;

    private pl.com.dpd.dpdservices.ParcelAppendPAV1[] parcels;

    public ParcelsAppendV1() {
    }

    public ParcelsAppendV1(
           pl.com.dpd.dpdservices.ParcelsAppendSearchCriteriaPAV1 packagesearchCriteria,
           pl.com.dpd.dpdservices.ParcelAppendPAV1[] parcels) {
           this.packagesearchCriteria = packagesearchCriteria;
           this.parcels = parcels;
    }


    /**
     * Gets the packagesearchCriteria value for this ParcelsAppendV1.
     * 
     * @return packagesearchCriteria
     */
    public pl.com.dpd.dpdservices.ParcelsAppendSearchCriteriaPAV1 getPackagesearchCriteria() {
        return packagesearchCriteria;
    }


    /**
     * Sets the packagesearchCriteria value for this ParcelsAppendV1.
     * 
     * @param packagesearchCriteria
     */
    public void setPackagesearchCriteria(pl.com.dpd.dpdservices.ParcelsAppendSearchCriteriaPAV1 packagesearchCriteria) {
        this.packagesearchCriteria = packagesearchCriteria;
    }


    /**
     * Gets the parcels value for this ParcelsAppendV1.
     * 
     * @return parcels
     */
    public pl.com.dpd.dpdservices.ParcelAppendPAV1[] getParcels() {
        return parcels;
    }


    /**
     * Sets the parcels value for this ParcelsAppendV1.
     * 
     * @param parcels
     */
    public void setParcels(pl.com.dpd.dpdservices.ParcelAppendPAV1[] parcels) {
        this.parcels = parcels;
    }

    public pl.com.dpd.dpdservices.ParcelAppendPAV1 getParcels(int i) {
        return this.parcels[i];
    }

    public void setParcels(int i, pl.com.dpd.dpdservices.ParcelAppendPAV1 _value) {
        this.parcels[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ParcelsAppendV1)) return false;
        ParcelsAppendV1 other = (ParcelsAppendV1) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.packagesearchCriteria==null && other.getPackagesearchCriteria()==null) || 
             (this.packagesearchCriteria!=null &&
              this.packagesearchCriteria.equals(other.getPackagesearchCriteria()))) &&
            ((this.parcels==null && other.getParcels()==null) || 
             (this.parcels!=null &&
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
        if (getPackagesearchCriteria() != null) {
            _hashCode += getPackagesearchCriteria().hashCode();
        }
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ParcelsAppendV1.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "parcelsAppendV1"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packagesearchCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("", "packagesearchCriteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "parcelsAppendSearchCriteriaPAV1"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parcels");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parcels"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "parcelAppendPAV1"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
