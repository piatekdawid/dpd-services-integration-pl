/**
 * ValidationStatusPGREnumV1.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.dpd.dpdservices.enums;

public class ValidationStatusPGREnumV1 implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ValidationStatusPGREnumV1(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_, this);
    }

    public static final java.lang.String _OK = "OK";
    public static final java.lang.String _UNKNOWN_ERROR = "UNKNOWN_ERROR";
    public static final java.lang.String _DB_ERROR = "DB_ERROR";
    public static final java.lang.String _INCORRECT_DATA = "INCORRECT_DATA";
    public static final java.lang.String _NOT_PROCESSED = "NOT_PROCESSED";
    public static final java.lang.String _DUPLICATED_PACKAGE_SEARCH_KEY = "DUPLICATED_PACKAGE_SEARCH_KEY";
    public static final java.lang.String _DUPLICATED_PARCEL_SEARCH_KEY = "DUPLICATED_PARCEL_SEARCH_KEY";
    public static final java.lang.String _DISALLOWED_FID = "DISALLOWED_FID";
    public static final java.lang.String _DUPLICATED_WAYBILL = "DUPLICATED_WAYBILL";
    public static final java.lang.String _UNSUPPORTED_LANG_CODE = "UNSUPPORTED_LANG_CODE";
    public static final ValidationStatusPGREnumV1 OK = new ValidationStatusPGREnumV1(_OK);
    public static final ValidationStatusPGREnumV1 UNKNOWN_ERROR = new ValidationStatusPGREnumV1(_UNKNOWN_ERROR);
    public static final ValidationStatusPGREnumV1 DB_ERROR = new ValidationStatusPGREnumV1(_DB_ERROR);
    public static final ValidationStatusPGREnumV1 INCORRECT_DATA = new ValidationStatusPGREnumV1(_INCORRECT_DATA);
    public static final ValidationStatusPGREnumV1 NOT_PROCESSED = new ValidationStatusPGREnumV1(_NOT_PROCESSED);
    public static final ValidationStatusPGREnumV1 DUPLICATED_PACKAGE_SEARCH_KEY = new ValidationStatusPGREnumV1(_DUPLICATED_PACKAGE_SEARCH_KEY);
    public static final ValidationStatusPGREnumV1 DUPLICATED_PARCEL_SEARCH_KEY = new ValidationStatusPGREnumV1(_DUPLICATED_PARCEL_SEARCH_KEY);
    public static final ValidationStatusPGREnumV1 DISALLOWED_FID = new ValidationStatusPGREnumV1(_DISALLOWED_FID);
    public static final ValidationStatusPGREnumV1 DUPLICATED_WAYBILL = new ValidationStatusPGREnumV1(_DUPLICATED_WAYBILL);
    public static final ValidationStatusPGREnumV1 UNSUPPORTED_LANG_CODE = new ValidationStatusPGREnumV1(_UNSUPPORTED_LANG_CODE);

    public java.lang.String getValue() {
        return _value_;
    }

    public static ValidationStatusPGREnumV1 fromValue(java.lang.String value)
            throws java.lang.IllegalArgumentException {
        ValidationStatusPGREnumV1 enumeration = (ValidationStatusPGREnumV1)
                _table_.get(value);
        if (enumeration == null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }

    public static ValidationStatusPGREnumV1 fromString(java.lang.String value)
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
            new org.apache.axis.description.TypeDesc(ValidationStatusPGREnumV1.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "validationStatusPGREnumV1"));
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
