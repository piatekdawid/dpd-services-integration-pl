/**
 * OutputDocPageFormatDSPEnumV1.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.dpd.dpdservices;

public class OutputDocPageFormatDSPEnumV1 implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected OutputDocPageFormatDSPEnumV1(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _A4 = "A4";
    public static final java.lang.String _LBL_PRINTER = "LBL_PRINTER";
    public static final OutputDocPageFormatDSPEnumV1 A4 = new OutputDocPageFormatDSPEnumV1(_A4);
    public static final OutputDocPageFormatDSPEnumV1 LBL_PRINTER = new OutputDocPageFormatDSPEnumV1(_LBL_PRINTER);
    public java.lang.String getValue() { return _value_;}
    public static OutputDocPageFormatDSPEnumV1 fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        OutputDocPageFormatDSPEnumV1 enumeration = (OutputDocPageFormatDSPEnumV1)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static OutputDocPageFormatDSPEnumV1 fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(OutputDocPageFormatDSPEnumV1.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "outputDocPageFormatDSPEnumV1"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
