/**
 * PickupAddressDSPV2.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.dpd.dpdservices;

public class PickupAddressDSPV2 implements java.io.Serializable {
    private java.lang.String address;

    private java.lang.String city;

    private java.lang.String company;

    private java.lang.String countryCode;

    private java.lang.String email;

    private java.lang.Integer fid;

    private java.lang.String name;

    private java.lang.String phone;

    private java.lang.String postalCode;

    public PickupAddressDSPV2() {
    }

    public PickupAddressDSPV2(
            java.lang.String address,
            java.lang.String city,
            java.lang.String company,
            java.lang.String countryCode,
            java.lang.String email,
            java.lang.Integer fid,
            java.lang.String name,
            java.lang.String phone,
            java.lang.String postalCode) {
        this.address = address;
        this.city = city;
        this.company = company;
        this.countryCode = countryCode;
        this.email = email;
        this.fid = fid;
        this.name = name;
        this.phone = phone;
        this.postalCode = postalCode;
    }


    /**
     * Gets the address value for this PickupAddressDSPV2.
     *
     * @return address
     */
    public java.lang.String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this PickupAddressDSPV2.
     *
     * @param address
     */
    public void setAddress(java.lang.String address) {
        this.address = address;
    }


    /**
     * Gets the city value for this PickupAddressDSPV2.
     *
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this PickupAddressDSPV2.
     *
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the company value for this PickupAddressDSPV2.
     *
     * @return company
     */
    public java.lang.String getCompany() {
        return company;
    }


    /**
     * Sets the company value for this PickupAddressDSPV2.
     *
     * @param company
     */
    public void setCompany(java.lang.String company) {
        this.company = company;
    }


    /**
     * Gets the countryCode value for this PickupAddressDSPV2.
     *
     * @return countryCode
     */
    public java.lang.String getCountryCode() {
        return countryCode;
    }


    /**
     * Sets the countryCode value for this PickupAddressDSPV2.
     *
     * @param countryCode
     */
    public void setCountryCode(java.lang.String countryCode) {
        this.countryCode = countryCode;
    }


    /**
     * Gets the email value for this PickupAddressDSPV2.
     *
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this PickupAddressDSPV2.
     *
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the fid value for this PickupAddressDSPV2.
     *
     * @return fid
     */
    public java.lang.Integer getFid() {
        return fid;
    }


    /**
     * Sets the fid value for this PickupAddressDSPV2.
     *
     * @param fid
     */
    public void setFid(java.lang.Integer fid) {
        this.fid = fid;
    }


    /**
     * Gets the name value for this PickupAddressDSPV2.
     *
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this PickupAddressDSPV2.
     *
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the phone value for this PickupAddressDSPV2.
     *
     * @return phone
     */
    public java.lang.String getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this PickupAddressDSPV2.
     *
     * @param phone
     */
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }


    /**
     * Gets the postalCode value for this PickupAddressDSPV2.
     *
     * @return postalCode
     */
    public java.lang.String getPostalCode() {
        return postalCode;
    }


    /**
     * Sets the postalCode value for this PickupAddressDSPV2.
     *
     * @param postalCode
     */
    public void setPostalCode(java.lang.String postalCode) {
        this.postalCode = postalCode;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PickupAddressDSPV2)) return false;
        PickupAddressDSPV2 other = (PickupAddressDSPV2) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.address == null && other.getAddress() == null) ||
                        (this.address != null &&
                                this.address.equals(other.getAddress()))) &&
                ((this.city == null && other.getCity() == null) ||
                        (this.city != null &&
                                this.city.equals(other.getCity()))) &&
                ((this.company == null && other.getCompany() == null) ||
                        (this.company != null &&
                                this.company.equals(other.getCompany()))) &&
                ((this.countryCode == null && other.getCountryCode() == null) ||
                        (this.countryCode != null &&
                                this.countryCode.equals(other.getCountryCode()))) &&
                ((this.email == null && other.getEmail() == null) ||
                        (this.email != null &&
                                this.email.equals(other.getEmail()))) &&
                ((this.fid == null && other.getFid() == null) ||
                        (this.fid != null &&
                                this.fid.equals(other.getFid()))) &&
                ((this.name == null && other.getName() == null) ||
                        (this.name != null &&
                                this.name.equals(other.getName()))) &&
                ((this.phone == null && other.getPhone() == null) ||
                        (this.phone != null &&
                                this.phone.equals(other.getPhone()))) &&
                ((this.postalCode == null && other.getPostalCode() == null) ||
                        (this.postalCode != null &&
                                this.postalCode.equals(other.getPostalCode())));
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
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getCompany() != null) {
            _hashCode += getCompany().hashCode();
        }
        if (getCountryCode() != null) {
            _hashCode += getCountryCode().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getFid() != null) {
            _hashCode += getFid().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getPostalCode() != null) {
            _hashCode += getPostalCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(PickupAddressDSPV2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "pickupAddressDSPV2"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("", "City"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Company"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CountryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Fid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PostalCode"));
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
                new org.apache.axis.encoding.ser.BeanSerializer(
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
                new org.apache.axis.encoding.ser.BeanDeserializer(
                        _javaType, _xmlType, typeDesc);
    }

}
