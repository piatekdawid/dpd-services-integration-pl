/**
 * SessionTypeDSPEnumV1.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.dpd.dpdservices;

public class SessionTypeDSPEnumV1 implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SessionTypeDSPEnumV1(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _DOMESTIC = "DOMESTIC";
    public static final java.lang.String _INTERNATIONAL = "INTERNATIONAL";
    public static final java.lang.String _INTERNATIONAL_RETURN_PUDO = "INTERNATIONAL_RETURN_PUDO";
    public static final SessionTypeDSPEnumV1 DOMESTIC = new SessionTypeDSPEnumV1(_DOMESTIC);
    public static final SessionTypeDSPEnumV1 INTERNATIONAL = new SessionTypeDSPEnumV1(_INTERNATIONAL);
    public static final SessionTypeDSPEnumV1 INTERNATIONAL_RETURN_PUDO = new SessionTypeDSPEnumV1(_INTERNATIONAL_RETURN_PUDO);
    public java.lang.String getValue() { return _value_;}
    public static SessionTypeDSPEnumV1 fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SessionTypeDSPEnumV1 enumeration = (SessionTypeDSPEnumV1)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SessionTypeDSPEnumV1 fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SessionTypeDSPEnumV1.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "sessionTypeDSPEnumV1"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
