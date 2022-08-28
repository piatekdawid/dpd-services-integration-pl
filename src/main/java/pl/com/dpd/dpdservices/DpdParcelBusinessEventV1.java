/**
 * DpdParcelBusinessEventV1.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.dpd.dpdservices;

public class DpdParcelBusinessEventV1  implements java.io.Serializable {
    private java.lang.String countryCode;

    private java.lang.String eventCode;

    private pl.com.dpd.dpdservices.DpdParcelBusinessEventDataV1[] eventDataList;

    private java.util.Calendar eventTime;

    private java.lang.String postalCode;

    private java.lang.String waybill;

    public DpdParcelBusinessEventV1() {
    }

    public DpdParcelBusinessEventV1(
           java.lang.String countryCode,
           java.lang.String eventCode,
           pl.com.dpd.dpdservices.DpdParcelBusinessEventDataV1[] eventDataList,
           java.util.Calendar eventTime,
           java.lang.String postalCode,
           java.lang.String waybill) {
           this.countryCode = countryCode;
           this.eventCode = eventCode;
           this.eventDataList = eventDataList;
           this.eventTime = eventTime;
           this.postalCode = postalCode;
           this.waybill = waybill;
    }


    /**
     * Gets the countryCode value for this DpdParcelBusinessEventV1.
     * 
     * @return countryCode
     */
    public java.lang.String getCountryCode() {
        return countryCode;
    }


    /**
     * Sets the countryCode value for this DpdParcelBusinessEventV1.
     * 
     * @param countryCode
     */
    public void setCountryCode(java.lang.String countryCode) {
        this.countryCode = countryCode;
    }


    /**
     * Gets the eventCode value for this DpdParcelBusinessEventV1.
     * 
     * @return eventCode
     */
    public java.lang.String getEventCode() {
        return eventCode;
    }


    /**
     * Sets the eventCode value for this DpdParcelBusinessEventV1.
     * 
     * @param eventCode
     */
    public void setEventCode(java.lang.String eventCode) {
        this.eventCode = eventCode;
    }


    /**
     * Gets the eventDataList value for this DpdParcelBusinessEventV1.
     * 
     * @return eventDataList
     */
    public pl.com.dpd.dpdservices.DpdParcelBusinessEventDataV1[] getEventDataList() {
        return eventDataList;
    }


    /**
     * Sets the eventDataList value for this DpdParcelBusinessEventV1.
     * 
     * @param eventDataList
     */
    public void setEventDataList(pl.com.dpd.dpdservices.DpdParcelBusinessEventDataV1[] eventDataList) {
        this.eventDataList = eventDataList;
    }

    public pl.com.dpd.dpdservices.DpdParcelBusinessEventDataV1 getEventDataList(int i) {
        return this.eventDataList[i];
    }

    public void setEventDataList(int i, pl.com.dpd.dpdservices.DpdParcelBusinessEventDataV1 _value) {
        this.eventDataList[i] = _value;
    }


    /**
     * Gets the eventTime value for this DpdParcelBusinessEventV1.
     * 
     * @return eventTime
     */
    public java.util.Calendar getEventTime() {
        return eventTime;
    }


    /**
     * Sets the eventTime value for this DpdParcelBusinessEventV1.
     * 
     * @param eventTime
     */
    public void setEventTime(java.util.Calendar eventTime) {
        this.eventTime = eventTime;
    }


    /**
     * Gets the postalCode value for this DpdParcelBusinessEventV1.
     * 
     * @return postalCode
     */
    public java.lang.String getPostalCode() {
        return postalCode;
    }


    /**
     * Sets the postalCode value for this DpdParcelBusinessEventV1.
     * 
     * @param postalCode
     */
    public void setPostalCode(java.lang.String postalCode) {
        this.postalCode = postalCode;
    }


    /**
     * Gets the waybill value for this DpdParcelBusinessEventV1.
     * 
     * @return waybill
     */
    public java.lang.String getWaybill() {
        return waybill;
    }


    /**
     * Sets the waybill value for this DpdParcelBusinessEventV1.
     * 
     * @param waybill
     */
    public void setWaybill(java.lang.String waybill) {
        this.waybill = waybill;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DpdParcelBusinessEventV1)) return false;
        DpdParcelBusinessEventV1 other = (DpdParcelBusinessEventV1) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.countryCode==null && other.getCountryCode()==null) || 
             (this.countryCode!=null &&
              this.countryCode.equals(other.getCountryCode()))) &&
            ((this.eventCode==null && other.getEventCode()==null) || 
             (this.eventCode!=null &&
              this.eventCode.equals(other.getEventCode()))) &&
            ((this.eventDataList==null && other.getEventDataList()==null) || 
             (this.eventDataList!=null &&
              java.util.Arrays.equals(this.eventDataList, other.getEventDataList()))) &&
            ((this.eventTime==null && other.getEventTime()==null) || 
             (this.eventTime!=null &&
              this.eventTime.equals(other.getEventTime()))) &&
            ((this.postalCode==null && other.getPostalCode()==null) || 
             (this.postalCode!=null &&
              this.postalCode.equals(other.getPostalCode()))) &&
            ((this.waybill==null && other.getWaybill()==null) || 
             (this.waybill!=null &&
              this.waybill.equals(other.getWaybill())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCountryCode() != null) {
            _hashCode += getCountryCode().hashCode();
        }
        if (getEventCode() != null) {
            _hashCode += getEventCode().hashCode();
        }
        if (getEventDataList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEventDataList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEventDataList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEventTime() != null) {
            _hashCode += getEventTime().hashCode();
        }
        if (getPostalCode() != null) {
            _hashCode += getPostalCode().hashCode();
        }
        if (getWaybill() != null) {
            _hashCode += getWaybill().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DpdParcelBusinessEventV1.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "dpdParcelBusinessEventV1"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "countryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventDataList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventDataList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "dpdParcelBusinessEventDataV1"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "postalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("waybill");
        elemField.setXmlName(new javax.xml.namespace.QName("", "waybill"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
