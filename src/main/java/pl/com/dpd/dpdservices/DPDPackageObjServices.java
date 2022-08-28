/**
 * DPDPackageObjServices.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.dpd.dpdservices;

public interface DPDPackageObjServices extends java.rmi.Remote {
    public pl.com.dpd.dpdservices.DocumentGenerationResponseV1 generateProtocolV1(pl.com.dpd.dpdservices.DpdServicesParamsV1 dpdServicesParamsV1, pl.com.dpd.dpdservices.OutputDocFormatDSPEnumV1 outputDocFormatV1, pl.com.dpd.dpdservices.OutputDocPageFormatDSPEnumV1 outputDocPageFormatV1, pl.com.dpd.dpdservices.AuthDataV1 authDataV1) throws java.rmi.RemoteException, pl.com.dpd.dpdservices.DPDServiceException;
    public pl.com.dpd.dpdservices.DocumentGenerationResponseV1 generateProtocolV2(pl.com.dpd.dpdservices.DpdServicesParamsV1 dpdServicesParamsV1, pl.com.dpd.dpdservices.OutputDocFormatDSPEnumV1 outputDocFormatV1, pl.com.dpd.dpdservices.OutputDocPageFormatDSPEnumV1 outputDocPageFormatV1, pl.com.dpd.dpdservices.AuthDataV1 authDataV1) throws java.rmi.RemoteException, pl.com.dpd.dpdservices.DPDServiceException;
    public pl.com.dpd.dpdservices.PackagesPickupCallResponseV3 packagesPickupCallV3(pl.com.dpd.dpdservices.DpdPickupCallParamsV3 dpdPickupParamsV3, pl.com.dpd.dpdservices.AuthDataV1 authDataV1) throws java.rmi.RemoteException, pl.com.dpd.dpdservices.DPDServiceException;
    public pl.com.dpd.dpdservices.PackagesPickupCallResponseV3 packagesPickupCallV4(pl.com.dpd.dpdservices.DpdPickupCallParamsV3 dpdPickupParamsV3, pl.com.dpd.dpdservices.AuthDataV1 authDataV1) throws java.rmi.RemoteException, pl.com.dpd.dpdservices.DPDServiceException;
    public pl.com.dpd.dpdservices.PackagesPickupCallResponseV1 packagesPickupCallV1(pl.com.dpd.dpdservices.DpdPickupCallParamsV1 dpdPickupParamsV1, pl.com.dpd.dpdservices.AuthDataV1 authDataV1) throws java.rmi.RemoteException, pl.com.dpd.dpdservices.DPDServiceException;
    public pl.com.dpd.dpdservices.PackagesPickupCallResponseV2 packagesPickupCallV2(pl.com.dpd.dpdservices.DpdPickupCallParamsV2 dpdPickupParamsV2, pl.com.dpd.dpdservices.AuthDataV1 authDataV1) throws java.rmi.RemoteException, pl.com.dpd.dpdservices.DPDServiceException;
    public pl.com.dpd.dpdservices.ParcelsAppendResponseV1 appendParcelsToPackageV1(pl.com.dpd.dpdservices.ParcelsAppendV1 parcelsAppend, pl.com.dpd.dpdservices.AuthDataV1 authDataV1) throws java.rmi.RemoteException, pl.com.dpd.dpdservices.DPDServiceException;
    public pl.com.dpd.dpdservices.DocumentGenerationResponseV1 generateReturnLabelV1(java.lang.String[] returnedWaybillsV1, pl.com.dpd.dpdservices.PudoReturnReceiver receiver, pl.com.dpd.dpdservices.OutputDocFormatDSPEnumV1 outputDocFormatV1, pl.com.dpd.dpdservices.OutputDocPageFormatDSPEnumV1 outputDocPageFormatV1, pl.com.dpd.dpdservices.OutputLabelTypeEnumV2 outputLabelType, java.lang.String labelVariant, pl.com.dpd.dpdservices.AuthDataV1 authDataV1) throws java.rmi.RemoteException, pl.com.dpd.dpdservices.DPDServiceException;
    public pl.com.dpd.dpdservices.GetCourierOrderAvailabilityResponseV1 getCourierOrderAvailabilityV1(pl.com.dpd.dpdservices.SenderPlaceV1 senderPlaceV1, pl.com.dpd.dpdservices.AuthDataV1 authDataV1) throws java.rmi.RemoteException, pl.com.dpd.dpdservices.Exception;
    public pl.com.dpd.dpdservices.DocumentGenerationResponseV2 generateProtocolsWithDestinationsV1(pl.com.dpd.dpdservices.DpdServicesParamsV2 dpdServicesParamsV2, pl.com.dpd.dpdservices.AuthDataV1 authDataV1) throws java.rmi.RemoteException, pl.com.dpd.dpdservices.DPDServiceException;
    public pl.com.dpd.dpdservices.DocumentGenerationResponseV1 generateSpedLabelsV1(pl.com.dpd.dpdservices.DpdServicesParamsV1 dpdServicesParamsV1, pl.com.dpd.dpdservices.OutputDocFormatDSPEnumV1 outputDocFormatV1, pl.com.dpd.dpdservices.OutputDocPageFormatDSPEnumV1 outputDocPageFormatV1, pl.com.dpd.dpdservices.AuthDataV1 authDataV1) throws java.rmi.RemoteException, pl.com.dpd.dpdservices.DPDServiceException;
    public pl.com.dpd.dpdservices.DocumentGenerationResponseV2 generateProtocolsWithDestinationsV2(pl.com.dpd.dpdservices.DpdServicesParamsV2 dpdServicesParamsV2, pl.com.dpd.dpdservices.AuthDataV1 authDataV1) throws java.rmi.RemoteException, pl.com.dpd.dpdservices.DPDServiceException;
    public pl.com.dpd.dpdservices.DocumentGenerationResponseV1 generateSpedLabelsV4(pl.com.dpd.dpdservices.DpdServicesParamsV1 dpdServicesParamsV1, pl.com.dpd.dpdservices.OutputDocFormatDSPEnumV1 outputDocFormatV1, pl.com.dpd.dpdservices.OutputDocPageFormatDSPEnumV1 outputDocPageFormatV1, pl.com.dpd.dpdservices.OutputLabelTypeEnumV1 outputLabelType, java.lang.String labelVariant, pl.com.dpd.dpdservices.AuthDataV1 authDataV1) throws java.rmi.RemoteException, pl.com.dpd.dpdservices.DPDServiceException;
    public pl.com.dpd.dpdservices.DocumentGenerationResponseV1 generateSpedLabelsV3(pl.com.dpd.dpdservices.DpdServicesParamsV1 dpdServicesParamsV1, pl.com.dpd.dpdservices.OutputDocFormatDSPEnumV1 outputDocFormatV1, pl.com.dpd.dpdservices.OutputDocPageFormatDSPEnumV1 outputDocPageFormatV1, pl.com.dpd.dpdservices.OutputLabelTypeEnumV1 outputLabelType, java.lang.String labelVariant, pl.com.dpd.dpdservices.AuthDataV1 authDataV1) throws java.rmi.RemoteException, pl.com.dpd.dpdservices.DPDServiceException;
    public pl.com.dpd.dpdservices.DocumentGenerationResponseV1 generateSpedLabelsV2(pl.com.dpd.dpdservices.DpdServicesParamsV1 dpdServicesParamsV1, pl.com.dpd.dpdservices.OutputDocFormatDSPEnumV1 outputDocFormatV1, pl.com.dpd.dpdservices.OutputDocPageFormatDSPEnumV1 outputDocPageFormatV1, java.lang.String outputLabelTypeV2, pl.com.dpd.dpdservices.AuthDataV1 authDataV1) throws java.rmi.RemoteException, pl.com.dpd.dpdservices.DPDServiceException;
    public pl.com.dpd.dpdservices.PackagesGenerationResponseV2 generatePackagesNumbersV6(pl.com.dpd.dpdservices.PackageOpenUMLFeV5[] openUMLFeV5, pl.com.dpd.dpdservices.PkgNumsGenerationPolicyV1 pkgNumsGenerationPolicyV1, java.lang.String langCode, pl.com.dpd.dpdservices.AuthDataV1 authDataV1) throws java.rmi.RemoteException, pl.com.dpd.dpdservices.DPDServiceException;
    public pl.com.dpd.dpdservices.ImportDeliveryBusinessEventResponseV1 importDeliveryBusinessEventV1(pl.com.dpd.dpdservices.DpdParcelBusinessEventV1 dpdParcelBusinessEventV1, pl.com.dpd.dpdservices.AuthDataV1 authDataV1) throws java.rmi.RemoteException, pl.com.dpd.dpdservices.SchemaValidationException, pl.com.dpd.dpdservices.DeniedAccessWSException, pl.com.dpd.dpdservices.DPDServiceException;
    public pl.com.dpd.dpdservices.FindPostalCodeResponseV1 findPostalCodeV1(pl.com.dpd.dpdservices.PostalCodeV1 postalCodeV1, pl.com.dpd.dpdservices.AuthDataV1 authDataV1) throws java.rmi.RemoteException, pl.com.dpd.dpdservices.DPDServiceException;
    public pl.com.dpd.dpdservices.PackagesGenerationResponseV1 generatePackagesNumbersV1(pl.com.dpd.dpdservices.PackageOpenUMLFeV1[] openUMLV1, pl.com.dpd.dpdservices.PkgNumsGenerationPolicyV1 pkgNumsGenerationPolicyV1, pl.com.dpd.dpdservices.AuthDataV1 authDataV1) throws java.rmi.RemoteException, pl.com.dpd.dpdservices.DPDServiceException;
    public pl.com.dpd.dpdservices.PackagesGenerationResponseV2 generatePackagesNumbersV2(pl.com.dpd.dpdservices.PackageOpenUMLFeV1[] openUMLV1, pl.com.dpd.dpdservices.PkgNumsGenerationPolicyV1 pkgNumsGenerationPolicyV1, java.lang.String langCode, pl.com.dpd.dpdservices.AuthDataV1 authDataV1) throws java.rmi.RemoteException, pl.com.dpd.dpdservices.DPDServiceException;
    public pl.com.dpd.dpdservices.PackagesGenerationResponseV2 generatePackagesNumbersV3(pl.com.dpd.dpdservices.PackageOpenUMLFeV2[] openUMLFeV2, pl.com.dpd.dpdservices.PkgNumsGenerationPolicyV1 pkgNumsGenerationPolicyV1, java.lang.String langCode, pl.com.dpd.dpdservices.AuthDataV1 authDataV1) throws java.rmi.RemoteException, pl.com.dpd.dpdservices.DPDServiceException;
    public pl.com.dpd.dpdservices.PackagesGenerationResponseV2 generatePackagesNumbersV4(pl.com.dpd.dpdservices.PackageOpenUMLFeV3[] openUMLFeV3, pl.com.dpd.dpdservices.PkgNumsGenerationPolicyV1 pkgNumsGenerationPolicyV1, java.lang.String langCode, pl.com.dpd.dpdservices.AuthDataV1 authDataV1) throws java.rmi.RemoteException, pl.com.dpd.dpdservices.DPDServiceException;
    public pl.com.dpd.dpdservices.PackagesGenerationResponseV2 generatePackagesNumbersV5(pl.com.dpd.dpdservices.PackageOpenUMLFeV4[] openUMLFeV4, pl.com.dpd.dpdservices.PkgNumsGenerationPolicyV1 pkgNumsGenerationPolicyV1, java.lang.String langCode, pl.com.dpd.dpdservices.AuthDataV1 authDataV1) throws java.rmi.RemoteException, pl.com.dpd.dpdservices.DPDServiceException;
}