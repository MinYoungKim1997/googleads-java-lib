
package com.google.api.ads.dfp.jaxws.v201502;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "ContentMetadataKeyHierarchyService", targetNamespace = "https://www.google.com/apis/ads/publisher/v201502", wsdlLocation = "https://ads.google.com/apis/ads/publisher/v201502/ContentMetadataKeyHierarchyService?wsdl")
public class ContentMetadataKeyHierarchyService
    extends Service
{

    private final static URL CONTENTMETADATAKEYHIERARCHYSERVICE_WSDL_LOCATION;
    private final static WebServiceException CONTENTMETADATAKEYHIERARCHYSERVICE_EXCEPTION;
    private final static QName CONTENTMETADATAKEYHIERARCHYSERVICE_QNAME = new QName("https://www.google.com/apis/ads/publisher/v201502", "ContentMetadataKeyHierarchyService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://ads.google.com/apis/ads/publisher/v201502/ContentMetadataKeyHierarchyService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CONTENTMETADATAKEYHIERARCHYSERVICE_WSDL_LOCATION = url;
        CONTENTMETADATAKEYHIERARCHYSERVICE_EXCEPTION = e;
    }

    public ContentMetadataKeyHierarchyService() {
        super(__getWsdlLocation(), CONTENTMETADATAKEYHIERARCHYSERVICE_QNAME);
    }

    public ContentMetadataKeyHierarchyService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns ContentMetadataKeyHierarchyServiceInterface
     */
    @WebEndpoint(name = "ContentMetadataKeyHierarchyServiceInterfacePort")
    public ContentMetadataKeyHierarchyServiceInterface getContentMetadataKeyHierarchyServiceInterfacePort() {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v201502", "ContentMetadataKeyHierarchyServiceInterfacePort"), ContentMetadataKeyHierarchyServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ContentMetadataKeyHierarchyServiceInterface
     */
    @WebEndpoint(name = "ContentMetadataKeyHierarchyServiceInterfacePort")
    public ContentMetadataKeyHierarchyServiceInterface getContentMetadataKeyHierarchyServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v201502", "ContentMetadataKeyHierarchyServiceInterfacePort"), ContentMetadataKeyHierarchyServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CONTENTMETADATAKEYHIERARCHYSERVICE_EXCEPTION!= null) {
            throw CONTENTMETADATAKEYHIERARCHYSERVICE_EXCEPTION;
        }
        return CONTENTMETADATAKEYHIERARCHYSERVICE_WSDL_LOCATION;
    }

}
