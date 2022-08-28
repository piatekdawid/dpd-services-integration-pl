/**
 * DpdPickupCallParamsV3.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.dpd.dpdservices;

public class DpdPickupCallParamsV3  implements java.io.Serializable {
    private java.lang.Integer checkSum;

    private pl.com.dpd.dpdservices.PickupCallOperationTypeDPPEnumV1 operationType;

    private java.lang.String orderNumber;

    private pl.com.dpd.dpdservices.PickupCallOrderTypeDPPEnumV1 orderType;

    private pl.com.dpd.dpdservices.PickupCallSimplifiedDetailsDPPV1 pickupCallSimplifiedDetails;

    private java.lang.String pickupDate;

    private java.lang.String pickupTimeFrom;

    private java.lang.String pickupTimeTo;

    private pl.com.dpd.dpdservices.PickupCallUpdateModeDPPEnumV1 updateMode;

    private java.lang.Boolean waybillsReady;

    public DpdPickupCallParamsV3() {
    }

    public DpdPickupCallParamsV3(
           java.lang.Integer checkSum,
           pl.com.dpd.dpdservices.PickupCallOperationTypeDPPEnumV1 operationType,
           java.lang.String orderNumber,
           pl.com.dpd.dpdservices.PickupCallOrderTypeDPPEnumV1 orderType,
           pl.com.dpd.dpdservices.PickupCallSimplifiedDetailsDPPV1 pickupCallSimplifiedDetails,
           java.lang.String pickupDate,
           java.lang.String pickupTimeFrom,
           java.lang.String pickupTimeTo,
           pl.com.dpd.dpdservices.PickupCallUpdateModeDPPEnumV1 updateMode,
           java.lang.Boolean waybillsReady) {
           this.checkSum = checkSum;
           this.operationType = operationType;
           this.orderNumber = orderNumber;
           this.orderType = orderType;
           this.pickupCallSimplifiedDetails = pickupCallSimplifiedDetails;
           this.pickupDate = pickupDate;
           this.pickupTimeFrom = pickupTimeFrom;
           this.pickupTimeTo = pickupTimeTo;
           this.updateMode = updateMode;
           this.waybillsReady = waybillsReady;
    }


    /**
     * Gets the checkSum value for this DpdPickupCallParamsV3.
     * 
     * @return checkSum
     */
    public java.lang.Integer getCheckSum() {
        return checkSum;
    }


    /**
     * Sets the checkSum value for this DpdPickupCallParamsV3.
     * 
     * @param checkSum
     */
    public void setCheckSum(java.lang.Integer checkSum) {
        this.checkSum = checkSum;
    }


    /**
     * Gets the operationType value for this DpdPickupCallParamsV3.
     * 
     * @return operationType
     */
    public pl.com.dpd.dpdservices.PickupCallOperationTypeDPPEnumV1 getOperationType() {
        return operationType;
    }


    /**
     * Sets the operationType value for this DpdPickupCallParamsV3.
     * 
     * @param operationType
     */
    public void setOperationType(pl.com.dpd.dpdservices.PickupCallOperationTypeDPPEnumV1 operationType) {
        this.operationType = operationType;
    }


    /**
     * Gets the orderNumber value for this DpdPickupCallParamsV3.
     * 
     * @return orderNumber
     */
    public java.lang.String getOrderNumber() {
        return orderNumber;
    }


    /**
     * Sets the orderNumber value for this DpdPickupCallParamsV3.
     * 
     * @param orderNumber
     */
    public void setOrderNumber(java.lang.String orderNumber) {
        this.orderNumber = orderNumber;
    }


    /**
     * Gets the orderType value for this DpdPickupCallParamsV3.
     * 
     * @return orderType
     */
    public pl.com.dpd.dpdservices.PickupCallOrderTypeDPPEnumV1 getOrderType() {
        return orderType;
    }


    /**
     * Sets the orderType value for this DpdPickupCallParamsV3.
     * 
     * @param orderType
     */
    public void setOrderType(pl.com.dpd.dpdservices.PickupCallOrderTypeDPPEnumV1 orderType) {
        this.orderType = orderType;
    }


    /**
     * Gets the pickupCallSimplifiedDetails value for this DpdPickupCallParamsV3.
     * 
     * @return pickupCallSimplifiedDetails
     */
    public pl.com.dpd.dpdservices.PickupCallSimplifiedDetailsDPPV1 getPickupCallSimplifiedDetails() {
        return pickupCallSimplifiedDetails;
    }


    /**
     * Sets the pickupCallSimplifiedDetails value for this DpdPickupCallParamsV3.
     * 
     * @param pickupCallSimplifiedDetails
     */
    public void setPickupCallSimplifiedDetails(pl.com.dpd.dpdservices.PickupCallSimplifiedDetailsDPPV1 pickupCallSimplifiedDetails) {
        this.pickupCallSimplifiedDetails = pickupCallSimplifiedDetails;
    }


    /**
     * Gets the pickupDate value for this DpdPickupCallParamsV3.
     * 
     * @return pickupDate
     */
    public java.lang.String getPickupDate() {
        return pickupDate;
    }


    /**
     * Sets the pickupDate value for this DpdPickupCallParamsV3.
     * 
     * @param pickupDate
     */
    public void setPickupDate(java.lang.String pickupDate) {
        this.pickupDate = pickupDate;
    }


    /**
     * Gets the pickupTimeFrom value for this DpdPickupCallParamsV3.
     * 
     * @return pickupTimeFrom
     */
    public java.lang.String getPickupTimeFrom() {
        return pickupTimeFrom;
    }


    /**
     * Sets the pickupTimeFrom value for this DpdPickupCallParamsV3.
     * 
     * @param pickupTimeFrom
     */
    public void setPickupTimeFrom(java.lang.String pickupTimeFrom) {
        this.pickupTimeFrom = pickupTimeFrom;
    }


    /**
     * Gets the pickupTimeTo value for this DpdPickupCallParamsV3.
     * 
     * @return pickupTimeTo
     */
    public java.lang.String getPickupTimeTo() {
        return pickupTimeTo;
    }


    /**
     * Sets the pickupTimeTo value for this DpdPickupCallParamsV3.
     * 
     * @param pickupTimeTo
     */
    public void setPickupTimeTo(java.lang.String pickupTimeTo) {
        this.pickupTimeTo = pickupTimeTo;
    }


    /**
     * Gets the updateMode value for this DpdPickupCallParamsV3.
     * 
     * @return updateMode
     */
    public pl.com.dpd.dpdservices.PickupCallUpdateModeDPPEnumV1 getUpdateMode() {
        return updateMode;
    }


    /**
     * Sets the updateMode value for this DpdPickupCallParamsV3.
     * 
     * @param updateMode
     */
    public void setUpdateMode(pl.com.dpd.dpdservices.PickupCallUpdateModeDPPEnumV1 updateMode) {
        this.updateMode = updateMode;
    }


    /**
     * Gets the waybillsReady value for this DpdPickupCallParamsV3.
     * 
     * @return waybillsReady
     */
    public java.lang.Boolean getWaybillsReady() {
        return waybillsReady;
    }


    /**
     * Sets the waybillsReady value for this DpdPickupCallParamsV3.
     * 
     * @param waybillsReady
     */
    public void setWaybillsReady(java.lang.Boolean waybillsReady) {
        this.waybillsReady = waybillsReady;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DpdPickupCallParamsV3)) return false;
        DpdPickupCallParamsV3 other = (DpdPickupCallParamsV3) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.checkSum==null && other.getCheckSum()==null) || 
             (this.checkSum!=null &&
              this.checkSum.equals(other.getCheckSum()))) &&
            ((this.operationType==null && other.getOperationType()==null) || 
             (this.operationType!=null &&
              this.operationType.equals(other.getOperationType()))) &&
            ((this.orderNumber==null && other.getOrderNumber()==null) || 
             (this.orderNumber!=null &&
              this.orderNumber.equals(other.getOrderNumber()))) &&
            ((this.orderType==null && other.getOrderType()==null) || 
             (this.orderType!=null &&
              this.orderType.equals(other.getOrderType()))) &&
            ((this.pickupCallSimplifiedDetails==null && other.getPickupCallSimplifiedDetails()==null) || 
             (this.pickupCallSimplifiedDetails!=null &&
              this.pickupCallSimplifiedDetails.equals(other.getPickupCallSimplifiedDetails()))) &&
            ((this.pickupDate==null && other.getPickupDate()==null) || 
             (this.pickupDate!=null &&
              this.pickupDate.equals(other.getPickupDate()))) &&
            ((this.pickupTimeFrom==null && other.getPickupTimeFrom()==null) || 
             (this.pickupTimeFrom!=null &&
              this.pickupTimeFrom.equals(other.getPickupTimeFrom()))) &&
            ((this.pickupTimeTo==null && other.getPickupTimeTo()==null) || 
             (this.pickupTimeTo!=null &&
              this.pickupTimeTo.equals(other.getPickupTimeTo()))) &&
            ((this.updateMode==null && other.getUpdateMode()==null) || 
             (this.updateMode!=null &&
              this.updateMode.equals(other.getUpdateMode()))) &&
            ((this.waybillsReady==null && other.getWaybillsReady()==null) || 
             (this.waybillsReady!=null &&
              this.waybillsReady.equals(other.getWaybillsReady())));
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
        if (getCheckSum() != null) {
            _hashCode += getCheckSum().hashCode();
        }
        if (getOperationType() != null) {
            _hashCode += getOperationType().hashCode();
        }
        if (getOrderNumber() != null) {
            _hashCode += getOrderNumber().hashCode();
        }
        if (getOrderType() != null) {
            _hashCode += getOrderType().hashCode();
        }
        if (getPickupCallSimplifiedDetails() != null) {
            _hashCode += getPickupCallSimplifiedDetails().hashCode();
        }
        if (getPickupDate() != null) {
            _hashCode += getPickupDate().hashCode();
        }
        if (getPickupTimeFrom() != null) {
            _hashCode += getPickupTimeFrom().hashCode();
        }
        if (getPickupTimeTo() != null) {
            _hashCode += getPickupTimeTo().hashCode();
        }
        if (getUpdateMode() != null) {
            _hashCode += getUpdateMode().hashCode();
        }
        if (getWaybillsReady() != null) {
            _hashCode += getWaybillsReady().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DpdPickupCallParamsV3.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "dpdPickupCallParamsV3"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkSum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "checkSum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "pickupCallOperationTypeDPPEnumV1"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "pickupCallOrderTypeDPPEnumV1"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickupCallSimplifiedDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pickupCallSimplifiedDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "pickupCallSimplifiedDetailsDPPV1"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickupDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pickupDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickupTimeFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pickupTimeFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickupTimeTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pickupTimeTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateMode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "updateMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "pickupCallUpdateModeDPPEnumV1"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("waybillsReady");
        elemField.setXmlName(new javax.xml.namespace.QName("", "waybillsReady"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
