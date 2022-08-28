/**
 * DPDPackageObjServicesServiceSoapBindingStub.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.dpd.dpdservices;

import pl.com.dpd.dpdservices.enums.*;
import pl.com.dpd.dpdservices.exception.DPDServiceException;
import pl.com.dpd.dpdservices.exception.DeniedAccessWSException;
import pl.com.dpd.dpdservices.exception.Exception;
import pl.com.dpd.dpdservices.exception.SchemaValidationException;
import pl.com.dpd.dpdservices.response.*;

public class DPDPackageObjServicesServiceSoapBindingStub extends org.apache.axis.client.Stub implements pl.com.dpd.dpdservices.DPDPackageObjServices {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc[] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[23];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
    }

    private static void _initOperationDesc1() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("generateProtocolV1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dpdServicesParamsV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "dpdServicesParamsV1"), pl.com.dpd.dpdservices.DpdServicesParamsV1.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "outputDocFormatV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "outputDocFormatDSPEnumV1"), OutputDocFormatDSPEnumV1.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "outputDocPageFormatV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "outputDocPageFormatDSPEnumV1"), OutputDocPageFormatDSPEnumV1.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authDataV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "authDataV1"), pl.com.dpd.dpdservices.AuthDataV1.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "documentGenerationResponseV1"));
        oper.setReturnClass(DocumentGenerationResponseV1.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "DPDServiceException"),
                "pl.com.dpd.dpdservices.exception.DPDServiceException",
                new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "DPDServiceException"),
                true
        ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("generateProtocolV2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dpdServicesParamsV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "dpdServicesParamsV1"), pl.com.dpd.dpdservices.DpdServicesParamsV1.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "outputDocFormatV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "outputDocFormatDSPEnumV1"), OutputDocFormatDSPEnumV1.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "outputDocPageFormatV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "outputDocPageFormatDSPEnumV1"), OutputDocPageFormatDSPEnumV1.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authDataV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "authDataV1"), pl.com.dpd.dpdservices.AuthDataV1.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "documentGenerationResponseV1"));
        oper.setReturnClass(DocumentGenerationResponseV1.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "DPDServiceException"),
                "pl.com.dpd.dpdservices.exception.DPDServiceException",
                new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "DPDServiceException"),
                true
        ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("packagesPickupCallV3");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dpdPickupParamsV3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "dpdPickupCallParamsV3"), pl.com.dpd.dpdservices.DpdPickupCallParamsV3.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authDataV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "authDataV1"), pl.com.dpd.dpdservices.AuthDataV1.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "packagesPickupCallResponseV3"));
        oper.setReturnClass(PackagesPickupCallResponseV3.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "DPDServiceException"),
                "pl.com.dpd.dpdservices.exception.DPDServiceException",
                new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "DPDServiceException"),
                true
        ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("packagesPickupCallV4");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dpdPickupParamsV3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "dpdPickupCallParamsV3"), pl.com.dpd.dpdservices.DpdPickupCallParamsV3.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authDataV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "authDataV1"), pl.com.dpd.dpdservices.AuthDataV1.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "packagesPickupCallResponseV3"));
        oper.setReturnClass(PackagesPickupCallResponseV3.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "DPDServiceException"),
                "pl.com.dpd.dpdservices.exception.DPDServiceException",
                new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "DPDServiceException"),
                true
        ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("packagesPickupCallV1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dpdPickupParamsV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "dpdPickupCallParamsV1"), pl.com.dpd.dpdservices.DpdPickupCallParamsV1.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authDataV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "authDataV1"), pl.com.dpd.dpdservices.AuthDataV1.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "packagesPickupCallResponseV1"));
        oper.setReturnClass(PackagesPickupCallResponseV1.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "DPDServiceException"),
                "pl.com.dpd.dpdservices.exception.DPDServiceException",
                new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "DPDServiceException"),
                true
        ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("packagesPickupCallV2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dpdPickupParamsV2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "dpdPickupCallParamsV2"), pl.com.dpd.dpdservices.DpdPickupCallParamsV2.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authDataV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "authDataV1"), pl.com.dpd.dpdservices.AuthDataV1.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "packagesPickupCallResponseV2"));
        oper.setReturnClass(PackagesPickupCallResponseV2.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "DPDServiceException"),
                "pl.com.dpd.dpdservices.exception.DPDServiceException",
                new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "DPDServiceException"),
                true
        ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("appendParcelsToPackageV1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parcelsAppend"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "parcelsAppendV1"), pl.com.dpd.dpdservices.ParcelsAppendV1.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authDataV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "authDataV1"), pl.com.dpd.dpdservices.AuthDataV1.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "parcelsAppendResponseV1"));
        oper.setReturnClass(pl.com.dpd.dpdservices.ParcelsAppendResponseV1.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "DPDServiceException"),
                "pl.com.dpd.dpdservices.exception.DPDServiceException",
                new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "DPDServiceException"),
                true
        ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("generateReturnLabelV1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "returnedWaybillsV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "returnedWaybillsV1"), java.lang.String[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "waybill"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "pudoReturnReceiver"), pl.com.dpd.dpdservices.PudoReturnReceiver.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "outputDocFormatV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "outputDocFormatDSPEnumV1"), OutputDocFormatDSPEnumV1.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "outputDocPageFormatV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "outputDocPageFormatDSPEnumV1"), OutputDocPageFormatDSPEnumV1.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "outputLabelType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "outputLabelTypeEnumV2"), OutputLabelTypeEnumV2.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "labelVariant"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authDataV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "authDataV1"), pl.com.dpd.dpdservices.AuthDataV1.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "documentGenerationResponseV1"));
        oper.setReturnClass(DocumentGenerationResponseV1.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "DPDServiceException"),
                "pl.com.dpd.dpdservices.exception.DPDServiceException",
                new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "DPDServiceException"),
                true
        ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCourierOrderAvailabilityV1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "senderPlaceV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "senderPlaceV1"), pl.com.dpd.dpdservices.SenderPlaceV1.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authDataV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "authDataV1"), pl.com.dpd.dpdservices.AuthDataV1.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "getCourierOrderAvailabilityResponseV1"));
        oper.setReturnClass(GetCourierOrderAvailabilityResponseV1.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "Exception"),
                "pl.com.dpd.dpdservices.exception.Exception",
                new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "Exception"),
                true
        ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("generateProtocolsWithDestinationsV1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dpdServicesParamsV2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "dpdServicesParamsV2"), pl.com.dpd.dpdservices.DpdServicesParamsV2.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authDataV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "authDataV1"), pl.com.dpd.dpdservices.AuthDataV1.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "documentGenerationResponseV2"));
        oper.setReturnClass(DocumentGenerationResponseV2.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "DPDServiceException"),
                "pl.com.dpd.dpdservices.exception.DPDServiceException",
                new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "DPDServiceException"),
                true
        ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("generateSpedLabelsV1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dpdServicesParamsV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "dpdServicesParamsV1"), pl.com.dpd.dpdservices.DpdServicesParamsV1.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "outputDocFormatV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "outputDocFormatDSPEnumV1"), OutputDocFormatDSPEnumV1.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "outputDocPageFormatV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "outputDocPageFormatDSPEnumV1"), OutputDocPageFormatDSPEnumV1.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authDataV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "authDataV1"), pl.com.dpd.dpdservices.AuthDataV1.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "documentGenerationResponseV1"));
        oper.setReturnClass(DocumentGenerationResponseV1.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "DPDServiceException"),
                "pl.com.dpd.dpdservices.exception.DPDServiceException",
                new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "DPDServiceException"),
                true
        ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("generateProtocolsWithDestinationsV2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dpdServicesParamsV2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "dpdServicesParamsV2"), pl.com.dpd.dpdservices.DpdServicesParamsV2.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authDataV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "authDataV1"), pl.com.dpd.dpdservices.AuthDataV1.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "documentGenerationResponseV2"));
        oper.setReturnClass(DocumentGenerationResponseV2.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "DPDServiceException"),
                "pl.com.dpd.dpdservices.exception.DPDServiceException",
                new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "DPDServiceException"),
                true
        ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("generateSpedLabelsV4");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dpdServicesParamsV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "dpdServicesParamsV1"), pl.com.dpd.dpdservices.DpdServicesParamsV1.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "outputDocFormatV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "outputDocFormatDSPEnumV1"), OutputDocFormatDSPEnumV1.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "outputDocPageFormatV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "outputDocPageFormatDSPEnumV1"), OutputDocPageFormatDSPEnumV1.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "outputLabelType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "outputLabelTypeEnumV1"), OutputLabelTypeEnumV1.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "labelVariant"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authDataV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "authDataV1"), pl.com.dpd.dpdservices.AuthDataV1.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "documentGenerationResponseV1"));
        oper.setReturnClass(DocumentGenerationResponseV1.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "DPDServiceException"),
                "pl.com.dpd.dpdservices.exception.DPDServiceException",
                new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "DPDServiceException"),
                true
        ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("generateSpedLabelsV3");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dpdServicesParamsV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "dpdServicesParamsV1"), pl.com.dpd.dpdservices.DpdServicesParamsV1.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "outputDocFormatV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "outputDocFormatDSPEnumV1"), OutputDocFormatDSPEnumV1.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "outputDocPageFormatV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "outputDocPageFormatDSPEnumV1"), OutputDocPageFormatDSPEnumV1.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "outputLabelType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "outputLabelTypeEnumV1"), OutputLabelTypeEnumV1.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "labelVariant"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authDataV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "authDataV1"), pl.com.dpd.dpdservices.AuthDataV1.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "documentGenerationResponseV1"));
        oper.setReturnClass(DocumentGenerationResponseV1.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "DPDServiceException"),
                "pl.com.dpd.dpdservices.exception.DPDServiceException",
                new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "DPDServiceException"),
                true
        ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("generateSpedLabelsV2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dpdServicesParamsV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "dpdServicesParamsV1"), pl.com.dpd.dpdservices.DpdServicesParamsV1.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "outputDocFormatV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "outputDocFormatDSPEnumV1"), OutputDocFormatDSPEnumV1.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "outputDocPageFormatV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "outputDocPageFormatDSPEnumV1"), OutputDocPageFormatDSPEnumV1.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "outputLabelTypeV2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authDataV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "authDataV1"), pl.com.dpd.dpdservices.AuthDataV1.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "documentGenerationResponseV1"));
        oper.setReturnClass(DocumentGenerationResponseV1.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "DPDServiceException"),
                "pl.com.dpd.dpdservices.exception.DPDServiceException",
                new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "DPDServiceException"),
                true
        ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("generatePackagesNumbersV6");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "openUMLFeV5"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "openUMLFeV5"), pl.com.dpd.dpdservices.PackageOpenUMLFeV5[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "packages"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pkgNumsGenerationPolicyV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "pkgNumsGenerationPolicyV1"), pl.com.dpd.dpdservices.PkgNumsGenerationPolicyV1.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "langCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authDataV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "authDataV1"), pl.com.dpd.dpdservices.AuthDataV1.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "packagesGenerationResponseV2"));
        oper.setReturnClass(PackagesGenerationResponseV2.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "DPDServiceException"),
                "pl.com.dpd.dpdservices.exception.DPDServiceException",
                new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "DPDServiceException"),
                true
        ));
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("importDeliveryBusinessEventV1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dpdParcelBusinessEventV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "dpdParcelBusinessEventV1"), pl.com.dpd.dpdservices.DpdParcelBusinessEventV1.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authDataV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "authDataV1"), pl.com.dpd.dpdservices.AuthDataV1.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "importDeliveryBusinessEventResponseV1"));
        oper.setReturnClass(ImportDeliveryBusinessEventResponseV1.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "SchemaValidationException"),
                "pl.com.dpd.dpdservices.exception.SchemaValidationException",
                new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "SchemaValidationException"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "DeniedAccessWSException"),
                "pl.com.dpd.dpdservices.exception.DeniedAccessWSException",
                new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "DeniedAccessWSException"),
                true
        ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "DPDServiceException"),
                "pl.com.dpd.dpdservices.exception.DPDServiceException",
                new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "DPDServiceException"),
                true
        ));
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findPostalCodeV1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "postalCodeV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "postalCodeV1"), pl.com.dpd.dpdservices.PostalCodeV1.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authDataV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "authDataV1"), pl.com.dpd.dpdservices.AuthDataV1.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "findPostalCodeResponseV1"));
        oper.setReturnClass(pl.com.dpd.dpdservices.FindPostalCodeResponseV1.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "DPDServiceException"),
                "pl.com.dpd.dpdservices.exception.DPDServiceException",
                new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "DPDServiceException"),
                true
        ));
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("generatePackagesNumbersV1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "openUMLV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "openUMLFeV1"), pl.com.dpd.dpdservices.PackageOpenUMLFeV1[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "packages"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pkgNumsGenerationPolicyV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "pkgNumsGenerationPolicyV1"), pl.com.dpd.dpdservices.PkgNumsGenerationPolicyV1.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authDataV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "authDataV1"), pl.com.dpd.dpdservices.AuthDataV1.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "packagesGenerationResponseV1"));
        oper.setReturnClass(PackagesGenerationResponseV1.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "DPDServiceException"),
                "pl.com.dpd.dpdservices.exception.DPDServiceException",
                new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "DPDServiceException"),
                true
        ));
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("generatePackagesNumbersV2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "openUMLV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "openUMLFeV1"), pl.com.dpd.dpdservices.PackageOpenUMLFeV1[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "packages"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pkgNumsGenerationPolicyV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "pkgNumsGenerationPolicyV1"), pl.com.dpd.dpdservices.PkgNumsGenerationPolicyV1.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "langCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authDataV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "authDataV1"), pl.com.dpd.dpdservices.AuthDataV1.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "packagesGenerationResponseV2"));
        oper.setReturnClass(PackagesGenerationResponseV2.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "DPDServiceException"),
                "pl.com.dpd.dpdservices.exception.DPDServiceException",
                new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "DPDServiceException"),
                true
        ));
        _operations[19] = oper;

    }

    private static void _initOperationDesc3() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("generatePackagesNumbersV3");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "openUMLFeV2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "openUMLFeV2"), pl.com.dpd.dpdservices.PackageOpenUMLFeV2[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "packages"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pkgNumsGenerationPolicyV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "pkgNumsGenerationPolicyV1"), pl.com.dpd.dpdservices.PkgNumsGenerationPolicyV1.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "langCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authDataV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "authDataV1"), pl.com.dpd.dpdservices.AuthDataV1.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "packagesGenerationResponseV2"));
        oper.setReturnClass(PackagesGenerationResponseV2.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "DPDServiceException"),
                "pl.com.dpd.dpdservices.exception.DPDServiceException",
                new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "DPDServiceException"),
                true
        ));
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("generatePackagesNumbersV4");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "openUMLFeV3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "openUMLFeV3"), pl.com.dpd.dpdservices.PackageOpenUMLFeV3[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "packages"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pkgNumsGenerationPolicyV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "pkgNumsGenerationPolicyV1"), pl.com.dpd.dpdservices.PkgNumsGenerationPolicyV1.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "langCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authDataV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "authDataV1"), pl.com.dpd.dpdservices.AuthDataV1.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "packagesGenerationResponseV2"));
        oper.setReturnClass(PackagesGenerationResponseV2.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "DPDServiceException"),
                "pl.com.dpd.dpdservices.exception.DPDServiceException",
                new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "DPDServiceException"),
                true
        ));
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("generatePackagesNumbersV5");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "openUMLFeV4"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "openUMLFeV4"), pl.com.dpd.dpdservices.PackageOpenUMLFeV4[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "packages"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pkgNumsGenerationPolicyV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "pkgNumsGenerationPolicyV1"), pl.com.dpd.dpdservices.PkgNumsGenerationPolicyV1.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "langCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authDataV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "authDataV1"), pl.com.dpd.dpdservices.AuthDataV1.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "packagesGenerationResponseV2"));
        oper.setReturnClass(PackagesGenerationResponseV2.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "DPDServiceException"),
                "pl.com.dpd.dpdservices.exception.DPDServiceException",
                new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "DPDServiceException"),
                true
        ));
        _operations[22] = oper;

    }

    public DPDPackageObjServicesServiceSoapBindingStub() throws org.apache.axis.AxisFault {
        this(null);
    }

    public DPDPackageObjServicesServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        this(service);
        super.cachedEndpoint = endpointURL;
    }

    public DPDPackageObjServicesServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service) super.service).setTypeMappingVersion("1.2");
        java.lang.Class cls;
        javax.xml.namespace.QName qName;
        javax.xml.namespace.QName qName2;
        java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
        java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
        java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
        java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
        java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
        java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
        java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
        java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
        java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
        java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
    }

    private void addBindings0() {
        java.lang.Class cls;
        javax.xml.namespace.QName qName;
        javax.xml.namespace.QName qName2;
        java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
        java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
        java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
        java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
        java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
        java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
        java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
        java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
        java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
        java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", ">deliveryDestination>DepotList");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.ProtocolDepot[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "protocolDepot");
        qName2 = new javax.xml.namespace.QName("", "ProtocolDepot");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", ">documentGenerationResponseV2>DestinationDataList");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.DestinationsData[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "destinationsData");
        qName2 = new javax.xml.namespace.QName("", "DestinationsData");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", ">dpdServicesParamsV2>DeliveryDestinations");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.DeliveryDestination[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "deliveryDestination");
        qName2 = new javax.xml.namespace.QName("", "DeliveryDestination");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", ">packageDSPV2>Parcels");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.ParcelDSPV2[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "parcelDSPV2");
        qName2 = new javax.xml.namespace.QName("", "Parcel");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", ">packagePGRV2>Parcels");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.ParcelPGRV2[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "parcelPGRV2");
        qName2 = new javax.xml.namespace.QName("", "Parcel");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", ">packagePGRV2>ValidationDetails");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.ValidationInfoPGRV2[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "validationInfoPGRV2");
        qName2 = new javax.xml.namespace.QName("", "ValidationInfo");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", ">parcelPGRV2>ValidationDetails");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.ValidationInfoPGRV2[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "validationInfoPGRV2");
        qName2 = new javax.xml.namespace.QName("", "ValidationInfo");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", ">sessionDGRV2>Packages");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.PackageDGRV2[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "packageDGRV2");
        qName2 = new javax.xml.namespace.QName("", "Package");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", ">sessionDSPV2>Packages");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.PackageDSPV2[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "packageDSPV2");
        qName2 = new javax.xml.namespace.QName("", "Package");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", ">sessionPGRV2>Packages");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.PackagePGRV2[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "packagePGRV2");
        qName2 = new javax.xml.namespace.QName("", "Package");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "authDataV1");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.AuthDataV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "contactInfoDPPV1");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.ContactInfoDPPV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "courierOrderAvailabilityRangeV1");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.CourierOrderAvailabilityRangeV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "deliveryDestination");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.DeliveryDestination.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "DeniedAccessWSException");
        cachedSerQNames.add(qName);
        cls = DeniedAccessWSException.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "destinationsData");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.DestinationsData.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "documentGenerationResponseV1");
        cachedSerQNames.add(qName);
        cls = DocumentGenerationResponseV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "documentGenerationResponseV2");
        cachedSerQNames.add(qName);
        cls = DocumentGenerationResponseV2.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "dpdParcelBusinessEventDataV1");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.DpdParcelBusinessEventDataV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "dpdParcelBusinessEventV1");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.DpdParcelBusinessEventV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "dpdPickupCallParamsV1");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.DpdPickupCallParamsV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "dpdPickupCallParamsV2");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.DpdPickupCallParamsV2.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "dpdPickupCallParamsV3");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.DpdPickupCallParamsV3.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "DPDServiceException");
        cachedSerQNames.add(qName);
        cls = DPDServiceException.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "dpdServicesParamsV1");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.DpdServicesParamsV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "dpdServicesParamsV2");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.DpdServicesParamsV2.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "errorDetailsPCRV2");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.ErrorDetailsPCRV2.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "Exception");
        cachedSerQNames.add(qName);
        cls = Exception.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "fieldValidationStatusPGREnumV1");
        cachedSerQNames.add(qName);
        cls = FieldValidationStatusPGREnumV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "findPostalCodeResponseV1");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.FindPostalCodeResponseV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "getCourierOrderAvailabilityResponseV1");
        cachedSerQNames.add(qName);
        cls = GetCourierOrderAvailabilityResponseV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "importDeliveryBusinessEventResponseV1");
        cachedSerQNames.add(qName);
        cls = ImportDeliveryBusinessEventResponseV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "importDeliveryBusinessEventStatusEnumV1");
        cachedSerQNames.add(qName);
        cls = ImportDeliveryBusinessEventStatusEnumV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "invalidFieldPAV1");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.InvalidFieldPAV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "invalidFieldPGRV1");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.InvalidFieldPGRV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "nonMatchingData");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.NonMatchingData.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "openUMLFeV1");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.PackageOpenUMLFeV1[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "packageOpenUMLFeV1");
        qName2 = new javax.xml.namespace.QName("", "packages");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "openUMLFeV2");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.PackageOpenUMLFeV2[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "packageOpenUMLFeV2");
        qName2 = new javax.xml.namespace.QName("", "packages");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "openUMLFeV3");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.PackageOpenUMLFeV3[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "packageOpenUMLFeV3");
        qName2 = new javax.xml.namespace.QName("", "packages");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "openUMLFeV4");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.PackageOpenUMLFeV4[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "packageOpenUMLFeV4");
        qName2 = new javax.xml.namespace.QName("", "packages");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "openUMLFeV5");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.PackageOpenUMLFeV5[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "packageOpenUMLFeV5");
        qName2 = new javax.xml.namespace.QName("", "packages");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "outputDocFormatDSPEnumV1");
        cachedSerQNames.add(qName);
        cls = OutputDocFormatDSPEnumV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "outputDocPageFormatDSPEnumV1");
        cachedSerQNames.add(qName);
        cls = OutputDocPageFormatDSPEnumV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "outputLabelTypeEnumV1");
        cachedSerQNames.add(qName);
        cls = OutputLabelTypeEnumV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "outputLabelTypeEnumV2");
        cachedSerQNames.add(qName);
        cls = OutputLabelTypeEnumV2.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "packageAddressOpenUMLFeV1");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.PackageAddressOpenUMLFeV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "packageDGRV1");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.PackageDGRV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "packageDGRV2");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.PackageDGRV2.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "packageDSPV1");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.PackageDSPV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "packageDSPV2");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.PackageDSPV2.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "packageOpenUMLFeV1");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.PackageOpenUMLFeV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "packageOpenUMLFeV2");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.PackageOpenUMLFeV2.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "packageOpenUMLFeV3");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.PackageOpenUMLFeV3.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "packageOpenUMLFeV4");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.PackageOpenUMLFeV4.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "packageOpenUMLFeV5");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.PackageOpenUMLFeV5.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "packagePGRV1");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.PackagePGRV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "packagePGRV2");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.PackagePGRV2.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "packagesGenerationResponseV1");
        cachedSerQNames.add(qName);
        cls = PackagesGenerationResponseV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "packagesGenerationResponseV2");
        cachedSerQNames.add(qName);
        cls = PackagesGenerationResponseV2.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "packagesPickupCallResponseV1");
        cachedSerQNames.add(qName);
        cls = PackagesPickupCallResponseV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "packagesPickupCallResponseV2");
        cachedSerQNames.add(qName);
        cls = PackagesPickupCallResponseV2.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "packagesPickupCallResponseV3");
        cachedSerQNames.add(qName);
        cls = PackagesPickupCallResponseV3.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "parcelAppendPAV1");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.ParcelAppendPAV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "parcelDGRV1");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.ParcelDGRV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "parcelDGRV2");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.ParcelDGRV2.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "parcelDSPV1");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.ParcelDSPV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "parcelDSPV2");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.ParcelDSPV2.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "parcelOpenUMLFeV1");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.ParcelOpenUMLFeV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "parcelPGRV1");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.ParcelPGRV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "parcelPGRV2");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.ParcelPGRV2.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "parcelsAppendParcelPAV1");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.ParcelsAppendParcelPAV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "parcelsAppendResponseV1");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.ParcelsAppendResponseV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "parcelsAppendSearchCriteriaPAV1");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.ParcelsAppendSearchCriteriaPAV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "parcelsAppendV1");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.ParcelsAppendV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "payerTypeEnumOpenUMLFeV1");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.PayerTypeEnumOpenUMLFeV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "pickupAddressDSPV1");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.PickupAddressDSPV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "pickupAddressDSPV2");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.PickupAddressDSPV2.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "pickupCallOperationTypeDPPEnumV1");
        cachedSerQNames.add(qName);
        cls = PickupCallOperationTypeDPPEnumV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "pickupCallOrderTypeDPPEnumV1");
        cachedSerQNames.add(qName);
        cls = PickupCallOrderTypeDPPEnumV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "pickupCallSimplifiedDetailsDPPV1");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.PickupCallSimplifiedDetailsDPPV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "pickupCallUpdateModeDPPEnumV1");
        cachedSerQNames.add(qName);
        cls = PickupCallUpdateModeDPPEnumV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "pickupCustomerDPPV1");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.PickupCustomerDPPV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "pickupPackagesParamsDPPV1");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.PickupPackagesParamsDPPV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "pickupPayerDPPV1");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.PickupPayerDPPV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "pickupSenderDPPV1");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.PickupSenderDPPV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "pkgNumsGenerationPolicyV1");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.PkgNumsGenerationPolicyV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "policyDPPEnumV1");
        cachedSerQNames.add(qName);
        cls = PolicyDPPEnumV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "policyDSPEnumV1");
        cachedSerQNames.add(qName);
        cls = PolicyDSPEnumV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "policyDSPEnumV2");
        cachedSerQNames.add(qName);
        cls = PolicyDSPEnumV2.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "postalCodeV1");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.PostalCodeV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "protocolDepot");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.ProtocolDepot.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "protocolDPPV1");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.ProtocolDPPV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "protocolPCRV1");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.ProtocolPCRV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "pudoReturnReceiver");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.PudoReturnReceiver.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "returnedWaybillsV1");
        cachedSerQNames.add(qName);
        cls = java.lang.String[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
        qName2 = new javax.xml.namespace.QName("", "waybill");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "SchemaValidationException");
        cachedSerQNames.add(qName);
        cls = SchemaValidationException.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "senderPlaceV1");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.SenderPlaceV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "serviceCarryInOpenUMLFeV1");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.ServiceCarryInOpenUMLFeV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "serviceCODDedicatedAccountOpenUMLFeV1");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.ServiceCODDedicatedAccountOpenUMLFeV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "serviceCODOpenUMLFeV1");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.ServiceCODOpenUMLFeV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

    }

    private void addBindings1() {
        java.lang.Class cls;
        javax.xml.namespace.QName qName;
        javax.xml.namespace.QName qName2;
        java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
        java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
        java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
        java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
        java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
        java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
        java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
        java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
        java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
        java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "serviceCUDOpenUMLeFV1");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.ServiceCUDOpenUMLeFV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "serviceCurrencyEnum");
        cachedSerQNames.add(qName);
        cls = ServiceCurrencyEnum.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "serviceDeclaredValueOpenUMLFeV1");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.ServiceDeclaredValueOpenUMLFeV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "serviceDedicatedDeliveryOpenUMLFeV1");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.ServiceDedicatedDeliveryOpenUMLFeV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "serviceDPDFoodOpenUMLFeV1");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.ServiceDPDFoodOpenUMLFeV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "serviceDpdPickupOpenUMLFeV1");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.ServiceDpdPickupOpenUMLFeV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "serviceDutyOpenUMLeFV1");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.ServiceDutyOpenUMLeFV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "serviceDutyOpenUMLeFV2");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.ServiceDutyOpenUMLeFV2.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "serviceFlagOpenUMLF");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.ServiceFlagOpenUMLF.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "serviceGuaranteeOpenUMLFeV1");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.ServiceGuaranteeOpenUMLFeV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "serviceGuaranteeTypeEnumOpenUMLFeV1");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.ServiceGuaranteeTypeEnumOpenUMLFeV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "serviceInPersOpenUMLFeV1");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.ServiceInPersOpenUMLFeV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "servicePalletOpenUMLFeV1");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.ServicePalletOpenUMLFeV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "servicePrivPersOpenUMLFeV1");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.ServicePrivPersOpenUMLFeV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "serviceRODOpenUMLFeV1");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.ServiceRODOpenUMLFeV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "serviceSelfColOpenUMLFeV1");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.ServiceSelfColOpenUMLFeV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "serviceSelfColReceiverTypeEnumOpenUMLFeV1");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.ServiceSelfColReceiverTypeEnumOpenUMLFeV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "servicesOpenUMLFeV2");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.ServicesOpenUMLFeV2.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "servicesOpenUMLFeV3");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.ServicesOpenUMLFeV3.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "servicesOpenUMLFeV4");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.ServicesOpenUMLFeV4.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "servicesOpenUMLFeV5");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.ServicesOpenUMLFeV5.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "servicesOpenUMLFeV6");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.ServicesOpenUMLFeV6.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "serviceTiresExportOpenUMLFeV1");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.ServiceTiresExportOpenUMLFeV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "serviceTiresOpenUMLFeV1");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.ServiceTiresOpenUMLFeV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "sessionDGRV1");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.SessionDGRV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "sessionDGRV2");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.SessionDGRV2.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "sessionDSPV1");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.SessionDSPV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "sessionDSPV2");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.SessionDSPV2.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "sessionPGRV1");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.SessionPGRV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "sessionPGRV2");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.SessionPGRV2.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "sessionTypeDSPEnumV1");
        cachedSerQNames.add(qName);
        cls = SessionTypeDSPEnumV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "statusDGREnumV1");
        cachedSerQNames.add(qName);
        cls = StatusDGREnumV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "statusInfoDGRV1");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.StatusInfoDGRV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "statusInfoDGRV2");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.StatusInfoDGRV2.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "statusInfoPCRV1");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.StatusInfoPCRV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "statusInfoPCRV2");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.StatusInfoPCRV2.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "statusPCREnumV1");
        cachedSerQNames.add(qName);
        cls = StatusPCREnumV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "validationInfoPGRV2");
        cachedSerQNames.add(qName);
        cls = pl.com.dpd.dpdservices.ValidationInfoPGRV2.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "validationStatusPGREnumV1");
        cachedSerQNames.add(qName);
        cls = ValidationStatusPGREnumV1.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                    cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                    cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        } else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                    cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                    cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        } catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public DocumentGenerationResponseV1 generateProtocolV1(pl.com.dpd.dpdservices.DpdServicesParamsV1 dpdServicesParamsV1, OutputDocFormatDSPEnumV1 outputDocFormatV1, OutputDocPageFormatDSPEnumV1 outputDocPageFormatV1, pl.com.dpd.dpdservices.AuthDataV1 authDataV1) throws java.rmi.RemoteException, DPDServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "generateProtocolV1"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{dpdServicesParamsV1, outputDocFormatV1, outputDocPageFormatV1, authDataV1});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (DocumentGenerationResponseV1) _resp;
                } catch (java.lang.Exception _exception) {
                    return (DocumentGenerationResponseV1) org.apache.axis.utils.JavaUtils.convert(_resp, DocumentGenerationResponseV1.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof DPDServiceException) {
                    throw (DPDServiceException) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public DocumentGenerationResponseV1 generateProtocolV2(pl.com.dpd.dpdservices.DpdServicesParamsV1 dpdServicesParamsV1, OutputDocFormatDSPEnumV1 outputDocFormatV1, OutputDocPageFormatDSPEnumV1 outputDocPageFormatV1, pl.com.dpd.dpdservices.AuthDataV1 authDataV1) throws java.rmi.RemoteException, DPDServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "generateProtocolV2"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{dpdServicesParamsV1, outputDocFormatV1, outputDocPageFormatV1, authDataV1});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (DocumentGenerationResponseV1) _resp;
                } catch (java.lang.Exception _exception) {
                    return (DocumentGenerationResponseV1) org.apache.axis.utils.JavaUtils.convert(_resp, DocumentGenerationResponseV1.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof DPDServiceException) {
                    throw (DPDServiceException) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public PackagesPickupCallResponseV3 packagesPickupCallV3(pl.com.dpd.dpdservices.DpdPickupCallParamsV3 dpdPickupParamsV3, pl.com.dpd.dpdservices.AuthDataV1 authDataV1) throws java.rmi.RemoteException, DPDServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "packagesPickupCallV3"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{dpdPickupParamsV3, authDataV1});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (PackagesPickupCallResponseV3) _resp;
                } catch (java.lang.Exception _exception) {
                    return (PackagesPickupCallResponseV3) org.apache.axis.utils.JavaUtils.convert(_resp, PackagesPickupCallResponseV3.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof DPDServiceException) {
                    throw (DPDServiceException) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public PackagesPickupCallResponseV3 packagesPickupCallV4(pl.com.dpd.dpdservices.DpdPickupCallParamsV3 dpdPickupParamsV3, pl.com.dpd.dpdservices.AuthDataV1 authDataV1) throws java.rmi.RemoteException, DPDServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "packagesPickupCallV4"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{dpdPickupParamsV3, authDataV1});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (PackagesPickupCallResponseV3) _resp;
                } catch (java.lang.Exception _exception) {
                    return (PackagesPickupCallResponseV3) org.apache.axis.utils.JavaUtils.convert(_resp, PackagesPickupCallResponseV3.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof DPDServiceException) {
                    throw (DPDServiceException) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public PackagesPickupCallResponseV1 packagesPickupCallV1(pl.com.dpd.dpdservices.DpdPickupCallParamsV1 dpdPickupParamsV1, pl.com.dpd.dpdservices.AuthDataV1 authDataV1) throws java.rmi.RemoteException, DPDServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "packagesPickupCallV1"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{dpdPickupParamsV1, authDataV1});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (PackagesPickupCallResponseV1) _resp;
                } catch (java.lang.Exception _exception) {
                    return (PackagesPickupCallResponseV1) org.apache.axis.utils.JavaUtils.convert(_resp, PackagesPickupCallResponseV1.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof DPDServiceException) {
                    throw (DPDServiceException) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public PackagesPickupCallResponseV2 packagesPickupCallV2(pl.com.dpd.dpdservices.DpdPickupCallParamsV2 dpdPickupParamsV2, pl.com.dpd.dpdservices.AuthDataV1 authDataV1) throws java.rmi.RemoteException, DPDServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "packagesPickupCallV2"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{dpdPickupParamsV2, authDataV1});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (PackagesPickupCallResponseV2) _resp;
                } catch (java.lang.Exception _exception) {
                    return (PackagesPickupCallResponseV2) org.apache.axis.utils.JavaUtils.convert(_resp, PackagesPickupCallResponseV2.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof DPDServiceException) {
                    throw (DPDServiceException) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public pl.com.dpd.dpdservices.ParcelsAppendResponseV1 appendParcelsToPackageV1(pl.com.dpd.dpdservices.ParcelsAppendV1 parcelsAppend, pl.com.dpd.dpdservices.AuthDataV1 authDataV1) throws java.rmi.RemoteException, DPDServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "appendParcelsToPackageV1"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parcelsAppend, authDataV1});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (pl.com.dpd.dpdservices.ParcelsAppendResponseV1) _resp;
                } catch (java.lang.Exception _exception) {
                    return (pl.com.dpd.dpdservices.ParcelsAppendResponseV1) org.apache.axis.utils.JavaUtils.convert(_resp, pl.com.dpd.dpdservices.ParcelsAppendResponseV1.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof DPDServiceException) {
                    throw (DPDServiceException) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public DocumentGenerationResponseV1 generateReturnLabelV1(java.lang.String[] returnedWaybillsV1, pl.com.dpd.dpdservices.PudoReturnReceiver receiver, OutputDocFormatDSPEnumV1 outputDocFormatV1, OutputDocPageFormatDSPEnumV1 outputDocPageFormatV1, OutputLabelTypeEnumV2 outputLabelType, java.lang.String labelVariant, pl.com.dpd.dpdservices.AuthDataV1 authDataV1) throws java.rmi.RemoteException, DPDServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "generateReturnLabelV1"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{returnedWaybillsV1, receiver, outputDocFormatV1, outputDocPageFormatV1, outputLabelType, labelVariant, authDataV1});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (DocumentGenerationResponseV1) _resp;
                } catch (java.lang.Exception _exception) {
                    return (DocumentGenerationResponseV1) org.apache.axis.utils.JavaUtils.convert(_resp, DocumentGenerationResponseV1.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof DPDServiceException) {
                    throw (DPDServiceException) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public GetCourierOrderAvailabilityResponseV1 getCourierOrderAvailabilityV1(pl.com.dpd.dpdservices.SenderPlaceV1 senderPlaceV1, pl.com.dpd.dpdservices.AuthDataV1 authDataV1) throws java.rmi.RemoteException, Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "getCourierOrderAvailabilityV1"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{senderPlaceV1, authDataV1});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (GetCourierOrderAvailabilityResponseV1) _resp;
                } catch (java.lang.Exception _exception) {
                    return (GetCourierOrderAvailabilityResponseV1) org.apache.axis.utils.JavaUtils.convert(_resp, GetCourierOrderAvailabilityResponseV1.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof Exception) {
                    throw (Exception) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public DocumentGenerationResponseV2 generateProtocolsWithDestinationsV1(pl.com.dpd.dpdservices.DpdServicesParamsV2 dpdServicesParamsV2, pl.com.dpd.dpdservices.AuthDataV1 authDataV1) throws java.rmi.RemoteException, DPDServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "generateProtocolsWithDestinationsV1"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{dpdServicesParamsV2, authDataV1});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (DocumentGenerationResponseV2) _resp;
                } catch (java.lang.Exception _exception) {
                    return (DocumentGenerationResponseV2) org.apache.axis.utils.JavaUtils.convert(_resp, DocumentGenerationResponseV2.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof DPDServiceException) {
                    throw (DPDServiceException) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public DocumentGenerationResponseV1 generateSpedLabelsV1(pl.com.dpd.dpdservices.DpdServicesParamsV1 dpdServicesParamsV1, OutputDocFormatDSPEnumV1 outputDocFormatV1, OutputDocPageFormatDSPEnumV1 outputDocPageFormatV1, pl.com.dpd.dpdservices.AuthDataV1 authDataV1) throws java.rmi.RemoteException, DPDServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "generateSpedLabelsV1"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{dpdServicesParamsV1, outputDocFormatV1, outputDocPageFormatV1, authDataV1});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (DocumentGenerationResponseV1) _resp;
                } catch (java.lang.Exception _exception) {
                    return (DocumentGenerationResponseV1) org.apache.axis.utils.JavaUtils.convert(_resp, DocumentGenerationResponseV1.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof DPDServiceException) {
                    throw (DPDServiceException) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public DocumentGenerationResponseV2 generateProtocolsWithDestinationsV2(pl.com.dpd.dpdservices.DpdServicesParamsV2 dpdServicesParamsV2, pl.com.dpd.dpdservices.AuthDataV1 authDataV1) throws java.rmi.RemoteException, DPDServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "generateProtocolsWithDestinationsV2"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{dpdServicesParamsV2, authDataV1});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (DocumentGenerationResponseV2) _resp;
                } catch (java.lang.Exception _exception) {
                    return (DocumentGenerationResponseV2) org.apache.axis.utils.JavaUtils.convert(_resp, DocumentGenerationResponseV2.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof DPDServiceException) {
                    throw (DPDServiceException) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public DocumentGenerationResponseV1 generateSpedLabelsV4(pl.com.dpd.dpdservices.DpdServicesParamsV1 dpdServicesParamsV1, OutputDocFormatDSPEnumV1 outputDocFormatV1, OutputDocPageFormatDSPEnumV1 outputDocPageFormatV1, OutputLabelTypeEnumV1 outputLabelType, java.lang.String labelVariant, pl.com.dpd.dpdservices.AuthDataV1 authDataV1) throws java.rmi.RemoteException, DPDServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "generateSpedLabelsV4"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{dpdServicesParamsV1, outputDocFormatV1, outputDocPageFormatV1, outputLabelType, labelVariant, authDataV1});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (DocumentGenerationResponseV1) _resp;
                } catch (java.lang.Exception _exception) {
                    return (DocumentGenerationResponseV1) org.apache.axis.utils.JavaUtils.convert(_resp, DocumentGenerationResponseV1.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof DPDServiceException) {
                    throw (DPDServiceException) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public DocumentGenerationResponseV1 generateSpedLabelsV3(pl.com.dpd.dpdservices.DpdServicesParamsV1 dpdServicesParamsV1, OutputDocFormatDSPEnumV1 outputDocFormatV1, OutputDocPageFormatDSPEnumV1 outputDocPageFormatV1, OutputLabelTypeEnumV1 outputLabelType, java.lang.String labelVariant, pl.com.dpd.dpdservices.AuthDataV1 authDataV1) throws java.rmi.RemoteException, DPDServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "generateSpedLabelsV3"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{dpdServicesParamsV1, outputDocFormatV1, outputDocPageFormatV1, outputLabelType, labelVariant, authDataV1});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (DocumentGenerationResponseV1) _resp;
                } catch (java.lang.Exception _exception) {
                    return (DocumentGenerationResponseV1) org.apache.axis.utils.JavaUtils.convert(_resp, DocumentGenerationResponseV1.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof DPDServiceException) {
                    throw (DPDServiceException) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public DocumentGenerationResponseV1 generateSpedLabelsV2(pl.com.dpd.dpdservices.DpdServicesParamsV1 dpdServicesParamsV1, OutputDocFormatDSPEnumV1 outputDocFormatV1, OutputDocPageFormatDSPEnumV1 outputDocPageFormatV1, java.lang.String outputLabelTypeV2, pl.com.dpd.dpdservices.AuthDataV1 authDataV1) throws java.rmi.RemoteException, DPDServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "generateSpedLabelsV2"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{dpdServicesParamsV1, outputDocFormatV1, outputDocPageFormatV1, outputLabelTypeV2, authDataV1});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (DocumentGenerationResponseV1) _resp;
                } catch (java.lang.Exception _exception) {
                    return (DocumentGenerationResponseV1) org.apache.axis.utils.JavaUtils.convert(_resp, DocumentGenerationResponseV1.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof DPDServiceException) {
                    throw (DPDServiceException) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public PackagesGenerationResponseV2 generatePackagesNumbersV6(pl.com.dpd.dpdservices.PackageOpenUMLFeV5[] openUMLFeV5, pl.com.dpd.dpdservices.PkgNumsGenerationPolicyV1 pkgNumsGenerationPolicyV1, java.lang.String langCode, pl.com.dpd.dpdservices.AuthDataV1 authDataV1) throws java.rmi.RemoteException, DPDServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "generatePackagesNumbersV6"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{openUMLFeV5, pkgNumsGenerationPolicyV1, langCode, authDataV1});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (PackagesGenerationResponseV2) _resp;
                } catch (java.lang.Exception _exception) {
                    return (PackagesGenerationResponseV2) org.apache.axis.utils.JavaUtils.convert(_resp, PackagesGenerationResponseV2.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof DPDServiceException) {
                    throw (DPDServiceException) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public ImportDeliveryBusinessEventResponseV1 importDeliveryBusinessEventV1(pl.com.dpd.dpdservices.DpdParcelBusinessEventV1 dpdParcelBusinessEventV1, pl.com.dpd.dpdservices.AuthDataV1 authDataV1) throws java.rmi.RemoteException, SchemaValidationException, DeniedAccessWSException, DPDServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "importDeliveryBusinessEventV1"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{dpdParcelBusinessEventV1, authDataV1});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (ImportDeliveryBusinessEventResponseV1) _resp;
                } catch (java.lang.Exception _exception) {
                    return (ImportDeliveryBusinessEventResponseV1) org.apache.axis.utils.JavaUtils.convert(_resp, ImportDeliveryBusinessEventResponseV1.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof SchemaValidationException) {
                    throw (SchemaValidationException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof DeniedAccessWSException) {
                    throw (DeniedAccessWSException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof DPDServiceException) {
                    throw (DPDServiceException) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public pl.com.dpd.dpdservices.FindPostalCodeResponseV1 findPostalCodeV1(pl.com.dpd.dpdservices.PostalCodeV1 postalCodeV1, pl.com.dpd.dpdservices.AuthDataV1 authDataV1) throws java.rmi.RemoteException, DPDServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "findPostalCodeV1"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{postalCodeV1, authDataV1});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (pl.com.dpd.dpdservices.FindPostalCodeResponseV1) _resp;
                } catch (java.lang.Exception _exception) {
                    return (pl.com.dpd.dpdservices.FindPostalCodeResponseV1) org.apache.axis.utils.JavaUtils.convert(_resp, pl.com.dpd.dpdservices.FindPostalCodeResponseV1.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof DPDServiceException) {
                    throw (DPDServiceException) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public PackagesGenerationResponseV1 generatePackagesNumbersV1(pl.com.dpd.dpdservices.PackageOpenUMLFeV1[] openUMLV1, pl.com.dpd.dpdservices.PkgNumsGenerationPolicyV1 pkgNumsGenerationPolicyV1, pl.com.dpd.dpdservices.AuthDataV1 authDataV1) throws java.rmi.RemoteException, DPDServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "generatePackagesNumbersV1"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{openUMLV1, pkgNumsGenerationPolicyV1, authDataV1});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (PackagesGenerationResponseV1) _resp;
                } catch (java.lang.Exception _exception) {
                    return (PackagesGenerationResponseV1) org.apache.axis.utils.JavaUtils.convert(_resp, PackagesGenerationResponseV1.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof DPDServiceException) {
                    throw (DPDServiceException) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public PackagesGenerationResponseV2 generatePackagesNumbersV2(pl.com.dpd.dpdservices.PackageOpenUMLFeV1[] openUMLV1, pl.com.dpd.dpdservices.PkgNumsGenerationPolicyV1 pkgNumsGenerationPolicyV1, java.lang.String langCode, pl.com.dpd.dpdservices.AuthDataV1 authDataV1) throws java.rmi.RemoteException, DPDServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "generatePackagesNumbersV2"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{openUMLV1, pkgNumsGenerationPolicyV1, langCode, authDataV1});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (PackagesGenerationResponseV2) _resp;
                } catch (java.lang.Exception _exception) {
                    return (PackagesGenerationResponseV2) org.apache.axis.utils.JavaUtils.convert(_resp, PackagesGenerationResponseV2.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof DPDServiceException) {
                    throw (DPDServiceException) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public PackagesGenerationResponseV2 generatePackagesNumbersV3(pl.com.dpd.dpdservices.PackageOpenUMLFeV2[] openUMLFeV2, pl.com.dpd.dpdservices.PkgNumsGenerationPolicyV1 pkgNumsGenerationPolicyV1, java.lang.String langCode, pl.com.dpd.dpdservices.AuthDataV1 authDataV1) throws java.rmi.RemoteException, DPDServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "generatePackagesNumbersV3"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{openUMLFeV2, pkgNumsGenerationPolicyV1, langCode, authDataV1});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (PackagesGenerationResponseV2) _resp;
                } catch (java.lang.Exception _exception) {
                    return (PackagesGenerationResponseV2) org.apache.axis.utils.JavaUtils.convert(_resp, PackagesGenerationResponseV2.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof DPDServiceException) {
                    throw (DPDServiceException) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public PackagesGenerationResponseV2 generatePackagesNumbersV4(pl.com.dpd.dpdservices.PackageOpenUMLFeV3[] openUMLFeV3, pl.com.dpd.dpdservices.PkgNumsGenerationPolicyV1 pkgNumsGenerationPolicyV1, java.lang.String langCode, pl.com.dpd.dpdservices.AuthDataV1 authDataV1) throws java.rmi.RemoteException, DPDServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "generatePackagesNumbersV4"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{openUMLFeV3, pkgNumsGenerationPolicyV1, langCode, authDataV1});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (PackagesGenerationResponseV2) _resp;
                } catch (java.lang.Exception _exception) {
                    return (PackagesGenerationResponseV2) org.apache.axis.utils.JavaUtils.convert(_resp, PackagesGenerationResponseV2.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof DPDServiceException) {
                    throw (DPDServiceException) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

    public PackagesGenerationResponseV2 generatePackagesNumbersV5(pl.com.dpd.dpdservices.PackageOpenUMLFeV4[] openUMLFeV4, pl.com.dpd.dpdservices.PkgNumsGenerationPolicyV1 pkgNumsGenerationPolicyV1, java.lang.String langCode, pl.com.dpd.dpdservices.AuthDataV1 authDataV1) throws java.rmi.RemoteException, DPDServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://dpdservices.dpd.com.pl/", "generatePackagesNumbersV5"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{openUMLFeV4, pkgNumsGenerationPolicyV1, langCode, authDataV1});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (PackagesGenerationResponseV2) _resp;
                } catch (java.lang.Exception _exception) {
                    return (PackagesGenerationResponseV2) org.apache.axis.utils.JavaUtils.convert(_resp, PackagesGenerationResponseV2.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            if (axisFaultException.detail != null) {
                if (axisFaultException.detail instanceof java.rmi.RemoteException) {
                    throw (java.rmi.RemoteException) axisFaultException.detail;
                }
                if (axisFaultException.detail instanceof DPDServiceException) {
                    throw (DPDServiceException) axisFaultException.detail;
                }
            }
            throw axisFaultException;
        }
    }

}
