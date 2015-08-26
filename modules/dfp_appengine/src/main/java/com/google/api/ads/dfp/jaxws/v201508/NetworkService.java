
package com.google.api.ads.dfp.jaxws.v201508;

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
@WebServiceClient(name = "NetworkService", targetNamespace = "https://www.google.com/apis/ads/publisher/v201508", wsdlLocation = "https://ads.google.com/apis/ads/publisher/v201508/NetworkService?wsdl")
public class NetworkService
    extends Service
{

    private final static URL NETWORKSERVICE_WSDL_LOCATION;
    private final static WebServiceException NETWORKSERVICE_EXCEPTION;
    private final static QName NETWORKSERVICE_QNAME = new QName("https://www.google.com/apis/ads/publisher/v201508", "NetworkService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://ads.google.com/apis/ads/publisher/v201508/NetworkService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        NETWORKSERVICE_WSDL_LOCATION = url;
        NETWORKSERVICE_EXCEPTION = e;
    }

    public NetworkService() {
        super(__getWsdlLocation(), NETWORKSERVICE_QNAME);
    }

    public NetworkService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns NetworkServiceInterface
     */
    @WebEndpoint(name = "NetworkServiceInterfacePort")
    public NetworkServiceInterface getNetworkServiceInterfacePort() {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v201508", "NetworkServiceInterfacePort"), NetworkServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns NetworkServiceInterface
     */
    @WebEndpoint(name = "NetworkServiceInterfacePort")
    public NetworkServiceInterface getNetworkServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v201508", "NetworkServiceInterfacePort"), NetworkServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (NETWORKSERVICE_EXCEPTION!= null) {
            throw NETWORKSERVICE_EXCEPTION;
        }
        return NETWORKSERVICE_WSDL_LOCATION;
    }

}
