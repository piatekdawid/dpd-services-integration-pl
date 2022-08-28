/**
 * StatusPCREnumV1.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.dpd.dpdservices.enums;

public class StatusPCREnumV1 implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected StatusPCREnumV1(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_, this);
    }

    public static final java.lang.String _OK = "OK";
    public static final java.lang.String _NOT_FOUND = "NOT_FOUND";
    public static final java.lang.String _NOT_PROCESSED = "NOT_PROCESSED";
    public static final java.lang.String _INCORRECT_PICKUP_ADDRESS_FID = "INCORRECT_PICKUP_ADDRESS_FID";
    public static final java.lang.String _INCORRECT_PICKUP_ADDRESS_NAME = "INCORRECT_PICKUP_ADDRESS_NAME";
    public static final java.lang.String _INCORRECT_PICKUP_ADDRESS_COMPANY = "INCORRECT_PICKUP_ADDRESS_COMPANY";
    public static final java.lang.String _INCORRECT_PICKUP_ADDRESS_ADDRESS = "INCORRECT_PICKUP_ADDRESS_ADDRESS";
    public static final java.lang.String _INCORRECT_PICKUP_ADDRESS_CITY = "INCORRECT_PICKUP_ADDRESS_CITY";
    public static final java.lang.String _INCORRECT_PICKUP_ADDRESS_COUNTRY = "INCORRECT_PICKUP_ADDRESS_COUNTRY";
    public static final java.lang.String _INCORRECT_PICKUP_ADDRESS_POSTAL_CODE = "INCORRECT_PICKUP_ADDRESS_POSTAL_CODE";
    public static final java.lang.String _INCORRECT_PICKUP_ADDRESS_EMAIL = "INCORRECT_PICKUP_ADDRESS_EMAIL";
    public static final java.lang.String _INCORRECT_PICKUP_ADDRESS_PHONE = "INCORRECT_PICKUP_ADDRESS_PHONE";
    public static final java.lang.String _ACCESS_DENIED_FOR_FID = "ACCESS_DENIED_FOR_FID";
    public static final java.lang.String _UNKNOWN_ERROR = "UNKNOWN_ERROR";
    public static final java.lang.String _DB_ERROR = "DB_ERROR";
    public static final java.lang.String _RANGE_NOT_AVAILABLE_TEMPORARILY = "RANGE_NOT_AVAILABLE_TEMPORARILY";
    public static final StatusPCREnumV1 OK = new StatusPCREnumV1(_OK);
    public static final StatusPCREnumV1 NOT_FOUND = new StatusPCREnumV1(_NOT_FOUND);
    public static final StatusPCREnumV1 NOT_PROCESSED = new StatusPCREnumV1(_NOT_PROCESSED);
    public static final StatusPCREnumV1 INCORRECT_PICKUP_ADDRESS_FID = new StatusPCREnumV1(_INCORRECT_PICKUP_ADDRESS_FID);
    public static final StatusPCREnumV1 INCORRECT_PICKUP_ADDRESS_NAME = new StatusPCREnumV1(_INCORRECT_PICKUP_ADDRESS_NAME);
    public static final StatusPCREnumV1 INCORRECT_PICKUP_ADDRESS_COMPANY = new StatusPCREnumV1(_INCORRECT_PICKUP_ADDRESS_COMPANY);
    public static final StatusPCREnumV1 INCORRECT_PICKUP_ADDRESS_ADDRESS = new StatusPCREnumV1(_INCORRECT_PICKUP_ADDRESS_ADDRESS);
    public static final StatusPCREnumV1 INCORRECT_PICKUP_ADDRESS_CITY = new StatusPCREnumV1(_INCORRECT_PICKUP_ADDRESS_CITY);
    public static final StatusPCREnumV1 INCORRECT_PICKUP_ADDRESS_COUNTRY = new StatusPCREnumV1(_INCORRECT_PICKUP_ADDRESS_COUNTRY);
    public static final StatusPCREnumV1 INCORRECT_PICKUP_ADDRESS_POSTAL_CODE = new StatusPCREnumV1(_INCORRECT_PICKUP_ADDRESS_POSTAL_CODE);
    public static final StatusPCREnumV1 INCORRECT_PICKUP_ADDRESS_EMAIL = new StatusPCREnumV1(_INCORRECT_PICKUP_ADDRESS_EMAIL);
    public static final StatusPCREnumV1 INCORRECT_PICKUP_ADDRESS_PHONE = new StatusPCREnumV1(_INCORRECT_PICKUP_ADDRESS_PHONE);
    public static final StatusPCREnumV1 ACCESS_DENIED_FOR_FID = new StatusPCREnumV1(_ACCESS_DENIED_FOR_FID);
    public static final StatusPCREnumV1 UNKNOWN_ERROR = new StatusPCREnumV1(_UNKNOWN_ERROR);
    public static final StatusPCREnumV1 DB_ERROR = new StatusPCREnumV1(_DB_ERROR);
    public static final StatusPCREnumV1 RANGE_NOT_AVAILABLE_TEMPORARILY = new StatusPCREnumV1(_RANGE_NOT_AVAILABLE_TEMPORARILY);

    public java.lang.String getValue() {
        return _value_;
    }

    public static StatusPCREnumV1 fromValue(java.lang.String value)
            throws java.lang.IllegalArgumentException {
        StatusPCREnumV1 enumeration = (StatusPCREnumV1)
                _table_.get(value);
        if (enumeration == null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }

    public static StatusPCREnumV1 fromString(java.lang.String value)
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
            new org.apache.axis.description.TypeDesc(StatusPCREnumV1.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "statusPCREnumV1"));
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
