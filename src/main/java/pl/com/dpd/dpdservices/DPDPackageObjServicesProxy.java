package pl.com.dpd.dpdservices;

public class DPDPackageObjServicesProxy implements pl.com.dpd.dpdservices.DPDPackageObjServices {
  private String _endpoint = null;
  private pl.com.dpd.dpdservices.DPDPackageObjServices dPDPackageObjServices = null;
  
  public DPDPackageObjServicesProxy() {
    _initDPDPackageObjServicesProxy();
  }
  
  public DPDPackageObjServicesProxy(String endpoint) {
    _endpoint = endpoint;
    _initDPDPackageObjServicesProxy();
  }
  
  private void _initDPDPackageObjServicesProxy() {
    try {
      dPDPackageObjServices = (new pl.com.dpd.dpdservices.DPDPackageObjServicesServiceLocator()).getDPDPackageObjServicesPort();
      if (dPDPackageObjServices != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)dPDPackageObjServices)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)dPDPackageObjServices)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (dPDPackageObjServices != null)
      ((javax.xml.rpc.Stub)dPDPackageObjServices)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public pl.com.dpd.dpdservices.DPDPackageObjServices getDPDPackageObjServices() {
    if (dPDPackageObjServices == null)
      _initDPDPackageObjServicesProxy();
    return dPDPackageObjServices;
  }
  
  public pl.com.dpd.dpdservices.DocumentGenerationResponseV1 generateProtocolV1(pl.com.dpd.dpdservices.DpdServicesParamsV1 dpdServicesParamsV1, pl.com.dpd.dpdservices.OutputDocFormatDSPEnumV1 outputDocFormatV1, pl.com.dpd.dpdservices.OutputDocPageFormatDSPEnumV1 outputDocPageFormatV1, pl.com.dpd.dpdservices.AuthDataV1 authDataV1) throws java.rmi.RemoteException, pl.com.dpd.dpdservices.DPDServiceException{
    if (dPDPackageObjServices == null)
      _initDPDPackageObjServicesProxy();
    return dPDPackageObjServices.generateProtocolV1(dpdServicesParamsV1, outputDocFormatV1, outputDocPageFormatV1, authDataV1);
  }
  
  public pl.com.dpd.dpdservices.DocumentGenerationResponseV1 generateProtocolV2(pl.com.dpd.dpdservices.DpdServicesParamsV1 dpdServicesParamsV1, pl.com.dpd.dpdservices.OutputDocFormatDSPEnumV1 outputDocFormatV1, pl.com.dpd.dpdservices.OutputDocPageFormatDSPEnumV1 outputDocPageFormatV1, pl.com.dpd.dpdservices.AuthDataV1 authDataV1) throws java.rmi.RemoteException, pl.com.dpd.dpdservices.DPDServiceException{
    if (dPDPackageObjServices == null)
      _initDPDPackageObjServicesProxy();
    return dPDPackageObjServices.generateProtocolV2(dpdServicesParamsV1, outputDocFormatV1, outputDocPageFormatV1, authDataV1);
  }
  
  public pl.com.dpd.dpdservices.PackagesPickupCallResponseV3 packagesPickupCallV3(pl.com.dpd.dpdservices.DpdPickupCallParamsV3 dpdPickupParamsV3, pl.com.dpd.dpdservices.AuthDataV1 authDataV1) throws java.rmi.RemoteException, pl.com.dpd.dpdservices.DPDServiceException{
    if (dPDPackageObjServices == null)
      _initDPDPackageObjServicesProxy();
    return dPDPackageObjServices.packagesPickupCallV3(dpdPickupParamsV3, authDataV1);
  }
  
  public pl.com.dpd.dpdservices.PackagesPickupCallResponseV3 packagesPickupCallV4(pl.com.dpd.dpdservices.DpdPickupCallParamsV3 dpdPickupParamsV3, pl.com.dpd.dpdservices.AuthDataV1 authDataV1) throws java.rmi.RemoteException, pl.com.dpd.dpdservices.DPDServiceException{
    if (dPDPackageObjServices == null)
      _initDPDPackageObjServicesProxy();
    return dPDPackageObjServices.packagesPickupCallV4(dpdPickupParamsV3, authDataV1);
  }
  
  public pl.com.dpd.dpdservices.PackagesPickupCallResponseV1 packagesPickupCallV1(pl.com.dpd.dpdservices.DpdPickupCallParamsV1 dpdPickupParamsV1, pl.com.dpd.dpdservices.AuthDataV1 authDataV1) throws java.rmi.RemoteException, pl.com.dpd.dpdservices.DPDServiceException{
    if (dPDPackageObjServices == null)
      _initDPDPackageObjServicesProxy();
    return dPDPackageObjServices.packagesPickupCallV1(dpdPickupParamsV1, authDataV1);
  }
  
  public pl.com.dpd.dpdservices.PackagesPickupCallResponseV2 packagesPickupCallV2(pl.com.dpd.dpdservices.DpdPickupCallParamsV2 dpdPickupParamsV2, pl.com.dpd.dpdservices.AuthDataV1 authDataV1) throws java.rmi.RemoteException, pl.com.dpd.dpdservices.DPDServiceException{
    if (dPDPackageObjServices == null)
      _initDPDPackageObjServicesProxy();
    return dPDPackageObjServices.packagesPickupCallV2(dpdPickupParamsV2, authDataV1);
  }
  
  public pl.com.dpd.dpdservices.ParcelsAppendResponseV1 appendParcelsToPackageV1(pl.com.dpd.dpdservices.ParcelsAppendV1 parcelsAppend, pl.com.dpd.dpdservices.AuthDataV1 authDataV1) throws java.rmi.RemoteException, pl.com.dpd.dpdservices.DPDServiceException{
    if (dPDPackageObjServices == null)
      _initDPDPackageObjServicesProxy();
    return dPDPackageObjServices.appendParcelsToPackageV1(parcelsAppend, authDataV1);
  }
  
  public pl.com.dpd.dpdservices.DocumentGenerationResponseV1 generateReturnLabelV1(java.lang.String[] returnedWaybillsV1, pl.com.dpd.dpdservices.PudoReturnReceiver receiver, pl.com.dpd.dpdservices.OutputDocFormatDSPEnumV1 outputDocFormatV1, pl.com.dpd.dpdservices.OutputDocPageFormatDSPEnumV1 outputDocPageFormatV1, pl.com.dpd.dpdservices.OutputLabelTypeEnumV2 outputLabelType, java.lang.String labelVariant, pl.com.dpd.dpdservices.AuthDataV1 authDataV1) throws java.rmi.RemoteException, pl.com.dpd.dpdservices.DPDServiceException{
    if (dPDPackageObjServices == null)
      _initDPDPackageObjServicesProxy();
    return dPDPackageObjServices.generateReturnLabelV1(returnedWaybillsV1, receiver, outputDocFormatV1, outputDocPageFormatV1, outputLabelType, labelVariant, authDataV1);
  }
  
  public pl.com.dpd.dpdservices.GetCourierOrderAvailabilityResponseV1 getCourierOrderAvailabilityV1(pl.com.dpd.dpdservices.SenderPlaceV1 senderPlaceV1, pl.com.dpd.dpdservices.AuthDataV1 authDataV1) throws java.rmi.RemoteException, pl.com.dpd.dpdservices.Exception{
    if (dPDPackageObjServices == null)
      _initDPDPackageObjServicesProxy();
    return dPDPackageObjServices.getCourierOrderAvailabilityV1(senderPlaceV1, authDataV1);
  }
  
  public pl.com.dpd.dpdservices.DocumentGenerationResponseV2 generateProtocolsWithDestinationsV1(pl.com.dpd.dpdservices.DpdServicesParamsV2 dpdServicesParamsV2, pl.com.dpd.dpdservices.AuthDataV1 authDataV1) throws java.rmi.RemoteException, pl.com.dpd.dpdservices.DPDServiceException{
    if (dPDPackageObjServices == null)
      _initDPDPackageObjServicesProxy();
    return dPDPackageObjServices.generateProtocolsWithDestinationsV1(dpdServicesParamsV2, authDataV1);
  }
  
  public pl.com.dpd.dpdservices.DocumentGenerationResponseV1 generateSpedLabelsV1(pl.com.dpd.dpdservices.DpdServicesParamsV1 dpdServicesParamsV1, pl.com.dpd.dpdservices.OutputDocFormatDSPEnumV1 outputDocFormatV1, pl.com.dpd.dpdservices.OutputDocPageFormatDSPEnumV1 outputDocPageFormatV1, pl.com.dpd.dpdservices.AuthDataV1 authDataV1) throws java.rmi.RemoteException, pl.com.dpd.dpdservices.DPDServiceException{
    if (dPDPackageObjServices == null)
      _initDPDPackageObjServicesProxy();
    return dPDPackageObjServices.generateSpedLabelsV1(dpdServicesParamsV1, outputDocFormatV1, outputDocPageFormatV1, authDataV1);
  }
  
  public pl.com.dpd.dpdservices.DocumentGenerationResponseV2 generateProtocolsWithDestinationsV2(pl.com.dpd.dpdservices.DpdServicesParamsV2 dpdServicesParamsV2, pl.com.dpd.dpdservices.AuthDataV1 authDataV1) throws java.rmi.RemoteException, pl.com.dpd.dpdservices.DPDServiceException{
    if (dPDPackageObjServices == null)
      _initDPDPackageObjServicesProxy();
    return dPDPackageObjServices.generateProtocolsWithDestinationsV2(dpdServicesParamsV2, authDataV1);
  }
  
  public pl.com.dpd.dpdservices.DocumentGenerationResponseV1 generateSpedLabelsV4(pl.com.dpd.dpdservices.DpdServicesParamsV1 dpdServicesParamsV1, pl.com.dpd.dpdservices.OutputDocFormatDSPEnumV1 outputDocFormatV1, pl.com.dpd.dpdservices.OutputDocPageFormatDSPEnumV1 outputDocPageFormatV1, pl.com.dpd.dpdservices.OutputLabelTypeEnumV1 outputLabelType, java.lang.String labelVariant, pl.com.dpd.dpdservices.AuthDataV1 authDataV1) throws java.rmi.RemoteException, pl.com.dpd.dpdservices.DPDServiceException{
    if (dPDPackageObjServices == null)
      _initDPDPackageObjServicesProxy();
    return dPDPackageObjServices.generateSpedLabelsV4(dpdServicesParamsV1, outputDocFormatV1, outputDocPageFormatV1, outputLabelType, labelVariant, authDataV1);
  }
  
  public pl.com.dpd.dpdservices.DocumentGenerationResponseV1 generateSpedLabelsV3(pl.com.dpd.dpdservices.DpdServicesParamsV1 dpdServicesParamsV1, pl.com.dpd.dpdservices.OutputDocFormatDSPEnumV1 outputDocFormatV1, pl.com.dpd.dpdservices.OutputDocPageFormatDSPEnumV1 outputDocPageFormatV1, pl.com.dpd.dpdservices.OutputLabelTypeEnumV1 outputLabelType, java.lang.String labelVariant, pl.com.dpd.dpdservices.AuthDataV1 authDataV1) throws java.rmi.RemoteException, pl.com.dpd.dpdservices.DPDServiceException{
    if (dPDPackageObjServices == null)
      _initDPDPackageObjServicesProxy();
    return dPDPackageObjServices.generateSpedLabelsV3(dpdServicesParamsV1, outputDocFormatV1, outputDocPageFormatV1, outputLabelType, labelVariant, authDataV1);
  }
  
  public pl.com.dpd.dpdservices.DocumentGenerationResponseV1 generateSpedLabelsV2(pl.com.dpd.dpdservices.DpdServicesParamsV1 dpdServicesParamsV1, pl.com.dpd.dpdservices.OutputDocFormatDSPEnumV1 outputDocFormatV1, pl.com.dpd.dpdservices.OutputDocPageFormatDSPEnumV1 outputDocPageFormatV1, java.lang.String outputLabelTypeV2, pl.com.dpd.dpdservices.AuthDataV1 authDataV1) throws java.rmi.RemoteException, pl.com.dpd.dpdservices.DPDServiceException{
    if (dPDPackageObjServices == null)
      _initDPDPackageObjServicesProxy();
    return dPDPackageObjServices.generateSpedLabelsV2(dpdServicesParamsV1, outputDocFormatV1, outputDocPageFormatV1, outputLabelTypeV2, authDataV1);
  }
  
  public pl.com.dpd.dpdservices.PackagesGenerationResponseV2 generatePackagesNumbersV6(pl.com.dpd.dpdservices.PackageOpenUMLFeV5[] openUMLFeV5, pl.com.dpd.dpdservices.PkgNumsGenerationPolicyV1 pkgNumsGenerationPolicyV1, java.lang.String langCode, pl.com.dpd.dpdservices.AuthDataV1 authDataV1) throws java.rmi.RemoteException, pl.com.dpd.dpdservices.DPDServiceException{
    if (dPDPackageObjServices == null)
      _initDPDPackageObjServicesProxy();
    return dPDPackageObjServices.generatePackagesNumbersV6(openUMLFeV5, pkgNumsGenerationPolicyV1, langCode, authDataV1);
  }
  
  public pl.com.dpd.dpdservices.ImportDeliveryBusinessEventResponseV1 importDeliveryBusinessEventV1(pl.com.dpd.dpdservices.DpdParcelBusinessEventV1 dpdParcelBusinessEventV1, pl.com.dpd.dpdservices.AuthDataV1 authDataV1) throws java.rmi.RemoteException, pl.com.dpd.dpdservices.SchemaValidationException, pl.com.dpd.dpdservices.DeniedAccessWSException, pl.com.dpd.dpdservices.DPDServiceException{
    if (dPDPackageObjServices == null)
      _initDPDPackageObjServicesProxy();
    return dPDPackageObjServices.importDeliveryBusinessEventV1(dpdParcelBusinessEventV1, authDataV1);
  }
  
  public pl.com.dpd.dpdservices.FindPostalCodeResponseV1 findPostalCodeV1(pl.com.dpd.dpdservices.PostalCodeV1 postalCodeV1, pl.com.dpd.dpdservices.AuthDataV1 authDataV1) throws java.rmi.RemoteException, pl.com.dpd.dpdservices.DPDServiceException{
    if (dPDPackageObjServices == null)
      _initDPDPackageObjServicesProxy();
    return dPDPackageObjServices.findPostalCodeV1(postalCodeV1, authDataV1);
  }
  
  public pl.com.dpd.dpdservices.PackagesGenerationResponseV1 generatePackagesNumbersV1(pl.com.dpd.dpdservices.PackageOpenUMLFeV1[] openUMLV1, pl.com.dpd.dpdservices.PkgNumsGenerationPolicyV1 pkgNumsGenerationPolicyV1, pl.com.dpd.dpdservices.AuthDataV1 authDataV1) throws java.rmi.RemoteException, pl.com.dpd.dpdservices.DPDServiceException{
    if (dPDPackageObjServices == null)
      _initDPDPackageObjServicesProxy();
    return dPDPackageObjServices.generatePackagesNumbersV1(openUMLV1, pkgNumsGenerationPolicyV1, authDataV1);
  }
  
  public pl.com.dpd.dpdservices.PackagesGenerationResponseV2 generatePackagesNumbersV2(pl.com.dpd.dpdservices.PackageOpenUMLFeV1[] openUMLV1, pl.com.dpd.dpdservices.PkgNumsGenerationPolicyV1 pkgNumsGenerationPolicyV1, java.lang.String langCode, pl.com.dpd.dpdservices.AuthDataV1 authDataV1) throws java.rmi.RemoteException, pl.com.dpd.dpdservices.DPDServiceException{
    if (dPDPackageObjServices == null)
      _initDPDPackageObjServicesProxy();
    return dPDPackageObjServices.generatePackagesNumbersV2(openUMLV1, pkgNumsGenerationPolicyV1, langCode, authDataV1);
  }
  
  public pl.com.dpd.dpdservices.PackagesGenerationResponseV2 generatePackagesNumbersV3(pl.com.dpd.dpdservices.PackageOpenUMLFeV2[] openUMLFeV2, pl.com.dpd.dpdservices.PkgNumsGenerationPolicyV1 pkgNumsGenerationPolicyV1, java.lang.String langCode, pl.com.dpd.dpdservices.AuthDataV1 authDataV1) throws java.rmi.RemoteException, pl.com.dpd.dpdservices.DPDServiceException{
    if (dPDPackageObjServices == null)
      _initDPDPackageObjServicesProxy();
    return dPDPackageObjServices.generatePackagesNumbersV3(openUMLFeV2, pkgNumsGenerationPolicyV1, langCode, authDataV1);
  }
  
  public pl.com.dpd.dpdservices.PackagesGenerationResponseV2 generatePackagesNumbersV4(pl.com.dpd.dpdservices.PackageOpenUMLFeV3[] openUMLFeV3, pl.com.dpd.dpdservices.PkgNumsGenerationPolicyV1 pkgNumsGenerationPolicyV1, java.lang.String langCode, pl.com.dpd.dpdservices.AuthDataV1 authDataV1) throws java.rmi.RemoteException, pl.com.dpd.dpdservices.DPDServiceException{
    if (dPDPackageObjServices == null)
      _initDPDPackageObjServicesProxy();
    return dPDPackageObjServices.generatePackagesNumbersV4(openUMLFeV3, pkgNumsGenerationPolicyV1, langCode, authDataV1);
  }
  
  public pl.com.dpd.dpdservices.PackagesGenerationResponseV2 generatePackagesNumbersV5(pl.com.dpd.dpdservices.PackageOpenUMLFeV4[] openUMLFeV4, pl.com.dpd.dpdservices.PkgNumsGenerationPolicyV1 pkgNumsGenerationPolicyV1, java.lang.String langCode, pl.com.dpd.dpdservices.AuthDataV1 authDataV1) throws java.rmi.RemoteException, pl.com.dpd.dpdservices.DPDServiceException{
    if (dPDPackageObjServices == null)
      _initDPDPackageObjServicesProxy();
    return dPDPackageObjServices.generatePackagesNumbersV5(openUMLFeV4, pkgNumsGenerationPolicyV1, langCode, authDataV1);
  }
  
  
}