/**
 * ImportDeliveryBusinessEventStatusEnumV1.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.dpd.dpdservices.enums;

public class ImportDeliveryBusinessEventStatusEnumV1 implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ImportDeliveryBusinessEventStatusEnumV1(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_, this);
    }

    public static final java.lang.String _OK = "OK";
    public static final java.lang.String _UNKNOWN_ERROR = "UNKNOWN_ERROR";
    public static final java.lang.String _PARCEL_NOT_FOUND = "PARCEL_NOT_FOUND";
    public static final java.lang.String _PARCEL_PERMISSION_DENIED = "PARCEL_PERMISSION_DENIED";
    public static final java.lang.String _EVENT_PERMISSION_DENIED = "EVENT_PERMISSION_DENIED";
    public static final java.lang.String _INCORRECT_DATA = "INCORRECT_DATA";
    public static final ImportDeliveryBusinessEventStatusEnumV1 OK = new ImportDeliveryBusinessEventStatusEnumV1(_OK);
    public static final ImportDeliveryBusinessEventStatusEnumV1 UNKNOWN_ERROR = new ImportDeliveryBusinessEventStatusEnumV1(_UNKNOWN_ERROR);
    public static final ImportDeliveryBusinessEventStatusEnumV1 PARCEL_NOT_FOUND = new ImportDeliveryBusinessEventStatusEnumV1(_PARCEL_NOT_FOUND);
    public static final ImportDeliveryBusinessEventStatusEnumV1 PARCEL_PERMISSION_DENIED = new ImportDeliveryBusinessEventStatusEnumV1(_PARCEL_PERMISSION_DENIED);
    public static final ImportDeliveryBusinessEventStatusEnumV1 EVENT_PERMISSION_DENIED = new ImportDeliveryBusinessEventStatusEnumV1(_EVENT_PERMISSION_DENIED);
    public static final ImportDeliveryBusinessEventStatusEnumV1 INCORRECT_DATA = new ImportDeliveryBusinessEventStatusEnumV1(_INCORRECT_DATA);

    public java.lang.String getValue() {
        return _value_;
    }

    public static ImportDeliveryBusinessEventStatusEnumV1 fromValue(java.lang.String value)
            throws java.lang.IllegalArgumentException {
        ImportDeliveryBusinessEventStatusEnumV1 enumeration = (ImportDeliveryBusinessEventStatusEnumV1)
                _table_.get(value);
        if (enumeration == null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }

    public static ImportDeliveryBusinessEventStatusEnumV1 fromString(java.lang.String value)
            throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }

    public boolean equals(java.lang.Object obj) {
        return (obj == this);
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public java.lang.String toString() {
        return _value_;
    }

    public java.lang.Object readResolve() throws java.io.ObjectStreamException {
        return fromValue(_value_);
    }

    public static org.apache.axis.encoding.Serializer getSerializer(
            java.lang.String mechType,
            java.lang.Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return
                new org.apache.axis.encoding.ser.EnumSerializer(
                        _javaType, _xmlType);
    }

    public static org.apache.axis.encoding.Deserializer getDeserializer(
            java.lang.String mechType,
            java.lang.Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return
                new org.apache.axis.encoding.ser.EnumDeserializer(
                        _javaType, _xmlType);
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ImportDeliveryBusinessEventStatusEnumV1.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "importDeliveryBusinessEventStatusEnumV1"));
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
