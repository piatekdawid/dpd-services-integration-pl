/**
 * OutputDocFormatDSPEnumV1.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.dpd.dpdservices.enums;

public class OutputDocFormatDSPEnumV1 implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected OutputDocFormatDSPEnumV1(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_, this);
    }

    public static final java.lang.String _PDF = "PDF";
    public static final java.lang.String _TIFF = "TIFF";
    public static final java.lang.String _PS = "PS";
    public static final java.lang.String _EPL = "EPL";
    public static final java.lang.String _ZPL = "ZPL";
    public static final java.lang.String _XML = "XML";
    public static final OutputDocFormatDSPEnumV1 PDF = new OutputDocFormatDSPEnumV1(_PDF);
    public static final OutputDocFormatDSPEnumV1 TIFF = new OutputDocFormatDSPEnumV1(_TIFF);
    public static final OutputDocFormatDSPEnumV1 PS = new OutputDocFormatDSPEnumV1(_PS);
    public static final OutputDocFormatDSPEnumV1 EPL = new OutputDocFormatDSPEnumV1(_EPL);
    public static final OutputDocFormatDSPEnumV1 ZPL = new OutputDocFormatDSPEnumV1(_ZPL);
    public static final OutputDocFormatDSPEnumV1 XML = new OutputDocFormatDSPEnumV1(_XML);

    public java.lang.String getValue() {
        return _value_;
    }

    public static OutputDocFormatDSPEnumV1 fromValue(java.lang.String value)
            throws java.lang.IllegalArgumentException {
        OutputDocFormatDSPEnumV1 enumeration = (OutputDocFormatDSPEnumV1)
                _table_.get(value);
        if (enumeration == null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }

    public static OutputDocFormatDSPEnumV1 fromString(java.lang.String value)
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
            new org.apache.axis.description.TypeDesc(OutputDocFormatDSPEnumV1.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "outputDocFormatDSPEnumV1"));
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
