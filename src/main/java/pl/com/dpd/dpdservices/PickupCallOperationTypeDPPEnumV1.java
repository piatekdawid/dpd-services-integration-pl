/**
 * PickupCallOperationTypeDPPEnumV1.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.dpd.dpdservices;

public class PickupCallOperationTypeDPPEnumV1 implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PickupCallOperationTypeDPPEnumV1(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _INSERT = "INSERT";
    public static final java.lang.String _UPDATE = "UPDATE";
    public static final java.lang.String _CANCEL = "CANCEL";
    public static final PickupCallOperationTypeDPPEnumV1 INSERT = new PickupCallOperationTypeDPPEnumV1(_INSERT);
    public static final PickupCallOperationTypeDPPEnumV1 UPDATE = new PickupCallOperationTypeDPPEnumV1(_UPDATE);
    public static final PickupCallOperationTypeDPPEnumV1 CANCEL = new PickupCallOperationTypeDPPEnumV1(_CANCEL);
    public java.lang.String getValue() { return _value_;}
    public static PickupCallOperationTypeDPPEnumV1 fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        PickupCallOperationTypeDPPEnumV1 enumeration = (PickupCallOperationTypeDPPEnumV1)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PickupCallOperationTypeDPPEnumV1 fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(PickupCallOperationTypeDPPEnumV1.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "pickupCallOperationTypeDPPEnumV1"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
