/**
 * PayerTypeEnumOpenUMLFeV1.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.dpd.dpdservices;

public class PayerTypeEnumOpenUMLFeV1 implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PayerTypeEnumOpenUMLFeV1(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _RECEIVER = "RECEIVER";
    public static final java.lang.String _SENDER = "SENDER";
    public static final java.lang.String _THIRD_PARTY = "THIRD_PARTY";
    public static final PayerTypeEnumOpenUMLFeV1 RECEIVER = new PayerTypeEnumOpenUMLFeV1(_RECEIVER);
    public static final PayerTypeEnumOpenUMLFeV1 SENDER = new PayerTypeEnumOpenUMLFeV1(_SENDER);
    public static final PayerTypeEnumOpenUMLFeV1 THIRD_PARTY = new PayerTypeEnumOpenUMLFeV1(_THIRD_PARTY);
    public java.lang.String getValue() { return _value_;}
    public static PayerTypeEnumOpenUMLFeV1 fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        PayerTypeEnumOpenUMLFeV1 enumeration = (PayerTypeEnumOpenUMLFeV1)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PayerTypeEnumOpenUMLFeV1 fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
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
        new org.apache.axis.description.TypeDesc(PayerTypeEnumOpenUMLFeV1.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "payerTypeEnumOpenUMLFeV1"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
