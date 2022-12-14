/**
 * ParcelsAppendResponseV1.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.dpd.dpdservices;

public class ParcelsAppendResponseV1 implements java.io.Serializable {
    private pl.com.dpd.dpdservices.InvalidFieldPAV1[] invalidFields;

    private pl.com.dpd.dpdservices.ParcelsAppendParcelPAV1[] parcels;

    private java.lang.String status;

    public ParcelsAppendResponseV1() {
    }

    public ParcelsAppendResponseV1(
            pl.com.dpd.dpdservices.InvalidFieldPAV1[] invalidFields,
            pl.com.dpd.dpdservices.ParcelsAppendParcelPAV1[] parcels,
            java.lang.String status) {
        this.invalidFields = invalidFields;
        this.parcels = parcels;
        this.status = status;
    }


    /**
     * Gets the invalidFields value for this ParcelsAppendResponseV1.
     *
     * @return invalidFields
     */
    public pl.com.dpd.dpdservices.InvalidFieldPAV1[] getInvalidFields() {
        return invalidFields;
    }


    /**
     * Sets the invalidFields value for this ParcelsAppendResponseV1.
     *
     * @param invalidFields
     */
    public void setInvalidFields(pl.com.dpd.dpdservices.InvalidFieldPAV1[] invalidFields) {
        this.invalidFields = invalidFields;
    }

    public pl.com.dpd.dpdservices.InvalidFieldPAV1 getInvalidFields(int i) {
        return this.invalidFields[i];
    }

    public void setInvalidFields(int i, pl.com.dpd.dpdservices.InvalidFieldPAV1 _value) {
        this.invalidFields[i] = _value;
    }


    /**
     * Gets the parcels value for this ParcelsAppendResponseV1.
     *
     * @return parcels
     */
    public pl.com.dpd.dpdservices.ParcelsAppendParcelPAV1[] getParcels() {
        return parcels;
    }


    /**
     * Sets the parcels value for this ParcelsAppendResponseV1.
     *
     * @param parcels
     */
    public void setParcels(pl.com.dpd.dpdservices.ParcelsAppendParcelPAV1[] parcels) {
        this.parcels = parcels;
    }

    public pl.com.dpd.dpdservices.ParcelsAppendParcelPAV1 getParcels(int i) {
        return this.parcels[i];
    }

    public void setParcels(int i, pl.com.dpd.dpdservices.ParcelsAppendParcelPAV1 _value) {
        this.parcels[i] = _value;
    }


    /**
     * Gets the status value for this ParcelsAppendResponseV1.
     *
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ParcelsAppendResponseV1.
     *
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ParcelsAppendResponseV1)) return false;
        ParcelsAppendResponseV1 other = (ParcelsAppendResponseV1) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.invalidFields == null && other.getInvalidFields() == null) ||
                        (this.invalidFields != null &&
                                java.util.Arrays.equals(this.invalidFields, other.getInvalidFields()))) &&
                ((this.parcels == null && other.getParcels() == null) ||
                        (this.parcels != null &&
                                java.util.Arrays.equals(this.parcels, other.getParcels()))) &&
                ((this.status == null && other.getStatus() == null) ||
                        (this.status != null &&
                                this.status.equals(other.getStatus())));
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
        if (getInvalidFields() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getInvalidFields());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInvalidFields(), i);
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ParcelsAppendResponseV1.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "parcelsAppendResponseV1"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invalidFields");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invalidFields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "invalidFieldPAV1"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parcels");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parcels"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "parcelsAppendParcelPAV1"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
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
