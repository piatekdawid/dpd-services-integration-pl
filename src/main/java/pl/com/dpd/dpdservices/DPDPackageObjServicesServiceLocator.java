/**
 * DPDPackageObjServicesServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.dpd.dpdservices;

public class DPDPackageObjServicesServiceLocator extends org.apache.axis.client.Service implements pl.com.dpd.dpdservices.DPDPackageObjServicesService {

    public DPDPackageObjServicesServiceLocator() {
    }


    public DPDPackageObjServicesServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public DPDPackageObjServicesServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for DPDPackageObjServicesPort
    private java.lang.String DPDPackageObjServicesPort_address = "https://dpdservices.dpd.com.pl/DPDPackageObjServicesService/DPDPackageObjServices";

    public java.lang.String getDPDPackageObjServicesPortAddress() {
        return DPDPackageObjServicesPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String DPDPackageObjServicesPortWSDDServiceName = "DPDPackageObjServicesPort";

    public java.lang.String getDPDPackageObjServicesPortWSDDServiceName() {
        return DPDPackageObjServicesPortWSDDServiceName;
    }

    public void setDPDPackageObjServicesPortWSDDServiceName(java.lang.String name) {
        DPDPackageObjServicesPortWSDDServiceName = name;
    }

    public pl.com.dpd.dpdservices.DPDPackageObjServices getDPDPackageObjServicesPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(DPDPackageObjServicesPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getDPDPackageObjServicesPort(endpoint);
    }

    public pl.com.dpd.dpdservices.DPDPackageObjServices getDPDPackageObjServicesPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            pl.com.dpd.dpdservices.DPDPackageObjServicesServiceSoapBindingStub _stub = new pl.com.dpd.dpdservices.DPDPackageObjServicesServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getDPDPackageObjServicesPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setDPDPackageObjServicesPortEndpointAddress(java.lang.String address) {
        DPDPackageObjServicesPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (pl.com.dpd.dpdservices.DPDPackageObjServices.class.isAssignableFrom(serviceEndpointInterface)) {
                pl.com.dpd.dpdservices.DPDPackageObjServicesServiceSoapBindingStub _stub = new pl.com.dpd.dpdservices.DPDPackageObjServicesServiceSoapBindingStub(new java.net.URL(DPDPackageObjServicesPort_address), this);
                _stub.setPortName(getDPDPackageObjServicesPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("DPDPackageObjServicesPort".equals(inputPortName)) {
            return getDPDPackageObjServicesPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "DPDPackageObjServicesService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "DPDPackageObjServicesPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("DPDPackageObjServicesPort".equals(portName)) {
            setDPDPackageObjServicesPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
