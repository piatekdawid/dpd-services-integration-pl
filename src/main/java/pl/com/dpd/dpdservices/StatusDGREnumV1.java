/**
 * StatusDGREnumV1.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.dpd.dpdservices;

public class StatusDGREnumV1 implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected StatusDGREnumV1(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _OK = "OK";
    public static final java.lang.String _NOT_FOUND = "NOT_FOUND";
    public static final java.lang.String _NOT_PROCESSED = "NOT_PROCESSED";
    public static final java.lang.String _INCORRECT_PKGS_FOR_SESSION_TYPE = "INCORRECT_PKGS_FOR_SESSION_TYPE";
    public static final java.lang.String _INCORRECT_PICKUP_ADDRESS_FID = "INCORRECT_PICKUP_ADDRESS_FID";
    public static final java.lang.String _INCORRECT_PICKUP_ADDRESS_NAME = "INCORRECT_PICKUP_ADDRESS_NAME";
    public static final java.lang.String _INCORRECT_PICKUP_ADDRESS_COMPANY = "INCORRECT_PICKUP_ADDRESS_COMPANY";
    public static final java.lang.String _INCORRECT_PICKUP_ADDRESS_ADDRESS = "INCORRECT_PICKUP_ADDRESS_ADDRESS";
    public static final java.lang.String _INCORRECT_PICKUP_ADDRESS_CITY = "INCORRECT_PICKUP_ADDRESS_CITY";
    public static final java.lang.String _INCORRECT_PICKUP_ADDRESS_COUNTRY = "INCORRECT_PICKUP_ADDRESS_COUNTRY";
    public static final java.lang.String _INCORRECT_PICKUP_ADDRESS_POSTAL_CODE = "INCORRECT_PICKUP_ADDRESS_POSTAL_CODE";
    public static final java.lang.String _INCORRECT_PICKUP_ADDRESS_EMAIL = "INCORRECT_PICKUP_ADDRESS_EMAIL";
    public static final java.lang.String _INCORRECT_PICKUP_ADDRESS_PHONE = "INCORRECT_PICKUP_ADDRESS_PHONE";
    public static final java.lang.String _PARCEL_LIMIT_EXCEEDED = "PARCEL_LIMIT_EXCEEDED";
    public static final java.lang.String _ACCESS_DENIED_FOR_FID = "ACCESS_DENIED_FOR_FID";
    public static final java.lang.String _UNKNOWN_ERROR = "UNKNOWN_ERROR";
    public static final java.lang.String _ALREADY_ADVICED = "ALREADY_ADVICED";
    public static final java.lang.String _ADVICE_ERROR = "ADVICE_ERROR";
    public static final java.lang.String _DB_ERROR = "DB_ERROR";
    public static final StatusDGREnumV1 OK = new StatusDGREnumV1(_OK);
    public static final StatusDGREnumV1 NOT_FOUND = new StatusDGREnumV1(_NOT_FOUND);
    public static final StatusDGREnumV1 NOT_PROCESSED = new StatusDGREnumV1(_NOT_PROCESSED);
    public static final StatusDGREnumV1 INCORRECT_PKGS_FOR_SESSION_TYPE = new StatusDGREnumV1(_INCORRECT_PKGS_FOR_SESSION_TYPE);
    public static final StatusDGREnumV1 INCORRECT_PICKUP_ADDRESS_FID = new StatusDGREnumV1(_INCORRECT_PICKUP_ADDRESS_FID);
    public static final StatusDGREnumV1 INCORRECT_PICKUP_ADDRESS_NAME = new StatusDGREnumV1(_INCORRECT_PICKUP_ADDRESS_NAME);
    public static final StatusDGREnumV1 INCORRECT_PICKUP_ADDRESS_COMPANY = new StatusDGREnumV1(_INCORRECT_PICKUP_ADDRESS_COMPANY);
    public static final StatusDGREnumV1 INCORRECT_PICKUP_ADDRESS_ADDRESS = new StatusDGREnumV1(_INCORRECT_PICKUP_ADDRESS_ADDRESS);
    public static final StatusDGREnumV1 INCORRECT_PICKUP_ADDRESS_CITY = new StatusDGREnumV1(_INCORRECT_PICKUP_ADDRESS_CITY);
    public static final StatusDGREnumV1 INCORRECT_PICKUP_ADDRESS_COUNTRY = new StatusDGREnumV1(_INCORRECT_PICKUP_ADDRESS_COUNTRY);
    public static final StatusDGREnumV1 INCORRECT_PICKUP_ADDRESS_POSTAL_CODE = new StatusDGREnumV1(_INCORRECT_PICKUP_ADDRESS_POSTAL_CODE);
    public static final StatusDGREnumV1 INCORRECT_PICKUP_ADDRESS_EMAIL = new StatusDGREnumV1(_INCORRECT_PICKUP_ADDRESS_EMAIL);
    public static final StatusDGREnumV1 INCORRECT_PICKUP_ADDRESS_PHONE = new StatusDGREnumV1(_INCORRECT_PICKUP_ADDRESS_PHONE);
    public static final StatusDGREnumV1 PARCEL_LIMIT_EXCEEDED = new StatusDGREnumV1(_PARCEL_LIMIT_EXCEEDED);
    public static final StatusDGREnumV1 ACCESS_DENIED_FOR_FID = new StatusDGREnumV1(_ACCESS_DENIED_FOR_FID);
    public static final StatusDGREnumV1 UNKNOWN_ERROR = new StatusDGREnumV1(_UNKNOWN_ERROR);
    public static final StatusDGREnumV1 ALREADY_ADVICED = new StatusDGREnumV1(_ALREADY_ADVICED);
    public static final StatusDGREnumV1 ADVICE_ERROR = new StatusDGREnumV1(_ADVICE_ERROR);
    public static final StatusDGREnumV1 DB_ERROR = new StatusDGREnumV1(_DB_ERROR);
    public java.lang.String getValue() { return _value_;}
    public static StatusDGREnumV1 fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        StatusDGREnumV1 enumeration = (StatusDGREnumV1)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static StatusDGREnumV1 fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(StatusDGREnumV1.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "statusDGREnumV1"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
