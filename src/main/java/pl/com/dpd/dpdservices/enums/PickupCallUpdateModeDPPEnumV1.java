/**
 * PickupCallUpdateModeDPPEnumV1.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.dpd.dpdservices.enums;

public class PickupCallUpdateModeDPPEnumV1 implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PickupCallUpdateModeDPPEnumV1(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_, this);
    }

    public static final java.lang.String _DONT_CREATE_NEW_IF_CLOSED = "DONT_CREATE_NEW_IF_CLOSED";
    public static final java.lang.String _CREATE_NEW_IF_CLOSED = "CREATE_NEW_IF_CLOSED";
    public static final PickupCallUpdateModeDPPEnumV1 DONT_CREATE_NEW_IF_CLOSED = new PickupCallUpdateModeDPPEnumV1(_DONT_CREATE_NEW_IF_CLOSED);
    public static final PickupCallUpdateModeDPPEnumV1 CREATE_NEW_IF_CLOSED = new PickupCallUpdateModeDPPEnumV1(_CREATE_NEW_IF_CLOSED);

    public java.lang.String getValue() {
        return _value_;
    }

    public static PickupCallUpdateModeDPPEnumV1 fromValue(java.lang.String value)
            throws java.lang.IllegalArgumentException {
        PickupCallUpdateModeDPPEnumV1 enumeration = (PickupCallUpdateModeDPPEnumV1)
                _table_.get(value);
        if (enumeration == null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }

    public static PickupCallUpdateModeDPPEnumV1 fromString(java.lang.String value)
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
            new org.apache.axis.description.TypeDesc(PickupCallUpdateModeDPPEnumV1.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "pickupCallUpdateModeDPPEnumV1"));
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
