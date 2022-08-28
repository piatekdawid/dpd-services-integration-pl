/**
 * FieldValidationStatusPGREnumV1.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.dpd.dpdservices.enums;

public class FieldValidationStatusPGREnumV1 implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected FieldValidationStatusPGREnumV1(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_, this);
    }

    public static final java.lang.String _OK = "OK";
    public static final java.lang.String _UNKNOWN_ERROR = "UNKNOWN_ERROR";
    public static final java.lang.String _DB_ERROR = "DB_ERROR";
    public static final java.lang.String _DONT_MATCH_DICTIONARY = "DONT_MATCH_DICTIONARY";
    public static final java.lang.String _DONT_MATCH_PATTERN = "DONT_MATCH_PATTERN";
    public static final java.lang.String _VALUE_EMPTY = "VALUE_EMPTY";
    public static final java.lang.String _VALUE_ZERO = "VALUE_ZERO";
    public static final java.lang.String _VALUE_OUT_OF_RANGE = "VALUE_OUT_OF_RANGE";
    public static final java.lang.String _VALUE_INCORRECT = "VALUE_INCORRECT";
    public static final java.lang.String _UNKNOWN_RDB_ERROR = "UNKNOWN_RDB_ERROR";
    public static final java.lang.String _DUPLICATED_KEY = "DUPLICATED_KEY";
    public static final FieldValidationStatusPGREnumV1 OK = new FieldValidationStatusPGREnumV1(_OK);
    public static final FieldValidationStatusPGREnumV1 UNKNOWN_ERROR = new FieldValidationStatusPGREnumV1(_UNKNOWN_ERROR);
    public static final FieldValidationStatusPGREnumV1 DB_ERROR = new FieldValidationStatusPGREnumV1(_DB_ERROR);
    public static final FieldValidationStatusPGREnumV1 DONT_MATCH_DICTIONARY = new FieldValidationStatusPGREnumV1(_DONT_MATCH_DICTIONARY);
    public static final FieldValidationStatusPGREnumV1 DONT_MATCH_PATTERN = new FieldValidationStatusPGREnumV1(_DONT_MATCH_PATTERN);
    public static final FieldValidationStatusPGREnumV1 VALUE_EMPTY = new FieldValidationStatusPGREnumV1(_VALUE_EMPTY);
    public static final FieldValidationStatusPGREnumV1 VALUE_ZERO = new FieldValidationStatusPGREnumV1(_VALUE_ZERO);
    public static final FieldValidationStatusPGREnumV1 VALUE_OUT_OF_RANGE = new FieldValidationStatusPGREnumV1(_VALUE_OUT_OF_RANGE);
    public static final FieldValidationStatusPGREnumV1 VALUE_INCORRECT = new FieldValidationStatusPGREnumV1(_VALUE_INCORRECT);
    public static final FieldValidationStatusPGREnumV1 UNKNOWN_RDB_ERROR = new FieldValidationStatusPGREnumV1(_UNKNOWN_RDB_ERROR);
    public static final FieldValidationStatusPGREnumV1 DUPLICATED_KEY = new FieldValidationStatusPGREnumV1(_DUPLICATED_KEY);

    public java.lang.String getValue() {
        return _value_;
    }

    public static FieldValidationStatusPGREnumV1 fromValue(java.lang.String value)
            throws java.lang.IllegalArgumentException {
        FieldValidationStatusPGREnumV1 enumeration = (FieldValidationStatusPGREnumV1)
                _table_.get(value);
        if (enumeration == null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }

    public static FieldValidationStatusPGREnumV1 fromString(java.lang.String value)
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
            new org.apache.axis.description.TypeDesc(FieldValidationStatusPGREnumV1.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "fieldValidationStatusPGREnumV1"));
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
