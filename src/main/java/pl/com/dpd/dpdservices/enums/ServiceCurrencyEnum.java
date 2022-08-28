/**
 * ServiceCurrencyEnum.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.dpd.dpdservices.enums;

public class ServiceCurrencyEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ServiceCurrencyEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_, this);
    }

    public static final java.lang.String _PLN = "PLN";
    public static final java.lang.String _EUR = "EUR";
    public static final java.lang.String _USD = "USD";
    public static final java.lang.String _CHF = "CHF";
    public static final java.lang.String _SEK = "SEK";
    public static final java.lang.String _NOK = "NOK";
    public static final java.lang.String _CZK = "CZK";
    public static final java.lang.String _RON = "RON";
    public static final java.lang.String _HUF = "HUF";
    public static final java.lang.String _HRK = "HRK";
    public static final java.lang.String _BGN = "BGN";
    public static final java.lang.String _DKK = "DKK";
    public static final java.lang.String _GBP = "GBP";
    public static final java.lang.String _RSD = "RSD";
    public static final java.lang.String _RUB = "RUB";
    public static final java.lang.String _TRY = "TRY";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final ServiceCurrencyEnum PLN = new ServiceCurrencyEnum(_PLN);
    public static final ServiceCurrencyEnum EUR = new ServiceCurrencyEnum(_EUR);
    public static final ServiceCurrencyEnum USD = new ServiceCurrencyEnum(_USD);
    public static final ServiceCurrencyEnum CHF = new ServiceCurrencyEnum(_CHF);
    public static final ServiceCurrencyEnum SEK = new ServiceCurrencyEnum(_SEK);
    public static final ServiceCurrencyEnum NOK = new ServiceCurrencyEnum(_NOK);
    public static final ServiceCurrencyEnum CZK = new ServiceCurrencyEnum(_CZK);
    public static final ServiceCurrencyEnum RON = new ServiceCurrencyEnum(_RON);
    public static final ServiceCurrencyEnum HUF = new ServiceCurrencyEnum(_HUF);
    public static final ServiceCurrencyEnum HRK = new ServiceCurrencyEnum(_HRK);
    public static final ServiceCurrencyEnum BGN = new ServiceCurrencyEnum(_BGN);
    public static final ServiceCurrencyEnum DKK = new ServiceCurrencyEnum(_DKK);
    public static final ServiceCurrencyEnum GBP = new ServiceCurrencyEnum(_GBP);
    public static final ServiceCurrencyEnum RSD = new ServiceCurrencyEnum(_RSD);
    public static final ServiceCurrencyEnum RUB = new ServiceCurrencyEnum(_RUB);
    public static final ServiceCurrencyEnum TRY = new ServiceCurrencyEnum(_TRY);
    public static final ServiceCurrencyEnum UNKNOWN = new ServiceCurrencyEnum(_UNKNOWN);

    public java.lang.String getValue() {
        return _value_;
    }

    public static ServiceCurrencyEnum fromValue(java.lang.String value)
            throws java.lang.IllegalArgumentException {
        ServiceCurrencyEnum enumeration = (ServiceCurrencyEnum)
                _table_.get(value);
        if (enumeration == null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }

    public static ServiceCurrencyEnum fromString(java.lang.String value)
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
            new org.apache.axis.description.TypeDesc(ServiceCurrencyEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "serviceCurrencyEnum"));
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
