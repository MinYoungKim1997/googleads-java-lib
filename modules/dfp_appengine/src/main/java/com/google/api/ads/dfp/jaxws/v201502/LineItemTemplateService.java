
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
@WebServiceClient(name = "LineItemTemplateService", targetNamespace = "https://www.google.com/apis/ads/publisher/v201502", wsdlLocation = "https://ads.google.com/apis/ads/publisher/v201502/LineItemTemplateService?wsdl")
public class LineItemTemplateService
    extends Service
{

    private final static URL LINEITEMTEMPLATESERVICE_WSDL_LOCATION;
    private final static WebServiceException LINEITEMTEMPLATESERVICE_EXCEPTION;
    private final static QName LINEITEMTEMPLATESERVICE_QNAME = new QName("https://www.google.com/apis/ads/publisher/v201502", "LineItemTemplateService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://ads.google.com/apis/ads/publisher/v201502/LineItemTemplateService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        LINEITEMTEMPLATESERVICE_WSDL_LOCATION = url;
        LINEITEMTEMPLATESERVICE_EXCEPTION = e;
    }

    public LineItemTemplateService() {
        super(__getWsdlLocation(), LINEITEMTEMPLATESERVICE_QNAME);
    }

    public LineItemTemplateService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns LineItemTemplateServiceInterface
     */
    @WebEndpoint(name = "LineItemTemplateServiceInterfacePort")
    public LineItemTemplateServiceInterface getLineItemTemplateServiceInterfacePort() {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v201502", "LineItemTemplateServiceInterfacePort"), LineItemTemplateServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns LineItemTemplateServiceInterface
     */
    @WebEndpoint(name = "LineItemTemplateServiceInterfacePort")
    public LineItemTemplateServiceInterface getLineItemTemplateServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v201502", "LineItemTemplateServiceInterfacePort"), LineItemTemplateServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (LINEITEMTEMPLATESERVICE_EXCEPTION!= null) {
            throw LINEITEMTEMPLATESERVICE_EXCEPTION;
        }
        return LINEITEMTEMPLATESERVICE_WSDL_LOCATION;
    }

}
