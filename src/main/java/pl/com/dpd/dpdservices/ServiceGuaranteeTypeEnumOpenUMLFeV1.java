/**
 * ServiceGuaranteeTypeEnumOpenUMLFeV1.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.dpd.dpdservices;

public class ServiceGuaranteeTypeEnumOpenUMLFeV1 implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ServiceGuaranteeTypeEnumOpenUMLFeV1(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_, this);
    }

    public static final java.lang.String _TIME0930 = "TIME0930";
    public static final java.lang.String _TIME1200 = "TIME1200";
    public static final java.lang.String _B2C = "B2C";
    public static final java.lang.String _TIMEFIXED = "TIMEFIXED";
    public static final java.lang.String _SATURDAY = "SATURDAY";
    public static final java.lang.String _INTER = "INTER";
    public static final java.lang.String _DPDNEXTDAY = "DPDNEXTDAY";
    public static final java.lang.String _DPDTODAY = "DPDTODAY";
    public static final ServiceGuaranteeTypeEnumOpenUMLFeV1 TIME0930 = new ServiceGuaranteeTypeEnumOpenUMLFeV1(_TIME0930);
    public static final ServiceGuaranteeTypeEnumOpenUMLFeV1 TIME1200 = new ServiceGuaranteeTypeEnumOpenUMLFeV1(_TIME1200);
    public static final ServiceGuaranteeTypeEnumOpenUMLFeV1 B2C = new ServiceGuaranteeTypeEnumOpenUMLFeV1(_B2C);
    public static final ServiceGuaranteeTypeEnumOpenUMLFeV1 TIMEFIXED = new ServiceGuaranteeTypeEnumOpenUMLFeV1(_TIMEFIXED);
    public static final ServiceGuaranteeTypeEnumOpenUMLFeV1 SATURDAY = new ServiceGuaranteeTypeEnumOpenUMLFeV1(_SATURDAY);
    public static final ServiceGuaranteeTypeEnumOpenUMLFeV1 INTER = new ServiceGuaranteeTypeEnumOpenUMLFeV1(_INTER);
    public static final ServiceGuaranteeTypeEnumOpenUMLFeV1 DPDNEXTDAY = new ServiceGuaranteeTypeEnumOpenUMLFeV1(_DPDNEXTDAY);
    public static final ServiceGuaranteeTypeEnumOpenUMLFeV1 DPDTODAY = new ServiceGuaranteeTypeEnumOpenUMLFeV1(_DPDTODAY);

    public java.lang.String getValue() {
        return _value_;
    }

    public static ServiceGuaranteeTypeEnumOpenUMLFeV1 fromValue(java.lang.String value)
            throws java.lang.IllegalArgumentException {
        ServiceGuaranteeTypeEnumOpenUMLFeV1 enumeration = (ServiceGuaranteeTypeEnumOpenUMLFeV1)
                _table_.get(value);
        if (enumeration == null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }

    public static ServiceGuaranteeTypeEnumOpenUMLFeV1 fromString(java.lang.String value)
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
            new org.apache.axis.description.TypeDesc(ServiceGuaranteeTypeEnumOpenUMLFeV1.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "serviceGuaranteeTypeEnumOpenUMLFeV1"));
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
