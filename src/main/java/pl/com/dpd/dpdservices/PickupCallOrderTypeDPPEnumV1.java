/**
 * PickupCallOrderTypeDPPEnumV1.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.dpd.dpdservices;

public class PickupCallOrderTypeDPPEnumV1 implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PickupCallOrderTypeDPPEnumV1(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _DOMESTIC = "DOMESTIC";
    public static final java.lang.String _INTERNATIONAL = "INTERNATIONAL";
    public static final java.lang.String _EXPRESS = "EXPRESS";
    public static final PickupCallOrderTypeDPPEnumV1 DOMESTIC = new PickupCallOrderTypeDPPEnumV1(_DOMESTIC);
    public static final PickupCallOrderTypeDPPEnumV1 INTERNATIONAL = new PickupCallOrderTypeDPPEnumV1(_INTERNATIONAL);
    public static final PickupCallOrderTypeDPPEnumV1 EXPRESS = new PickupCallOrderTypeDPPEnumV1(_EXPRESS);
    public java.lang.String getValue() { return _value_;}
    public static PickupCallOrderTypeDPPEnumV1 fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        PickupCallOrderTypeDPPEnumV1 enumeration = (PickupCallOrderTypeDPPEnumV1)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PickupCallOrderTypeDPPEnumV1 fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(PickupCallOrderTypeDPPEnumV1.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "pickupCallOrderTypeDPPEnumV1"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
