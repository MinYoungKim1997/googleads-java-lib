
package com.google.api.ads.adwords.jaxws.v201506.cm;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       Service used to manage extensions at the customer level. The extensions are managed by AdWords
 *       using existing feed services, including creating and modifying feeds, feed items, and customer
 *       feeds for the user.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "CustomerExtensionSettingServiceInterface", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201506")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CustomerExtensionSettingServiceInterface {


    /**
     * 
     *         Returns a list of CustomerExtensionSettings that meet the selector criteria.
     *         
     *         @param selector Determines which CustomerExtensionSettings to return. If empty, all
     *         CustomerExtensionSettings are returned.
     *         @return The list of CustomerExtensionSettings specified by the selector.
     *         @throws ApiException Indicates a problem with the request.
     *       
     * 
     * @param selector
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201506.cm.CustomerExtensionSettingPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201506")
    @RequestWrapper(localName = "get", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201506", className = "com.google.api.ads.adwords.jaxws.v201506.cm.CustomerExtensionSettingServiceInterfaceget")
    @ResponseWrapper(localName = "getResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201506", className = "com.google.api.ads.adwords.jaxws.v201506.cm.CustomerExtensionSettingServiceInterfacegetResponse")
    public CustomerExtensionSettingPage get(
        @WebParam(name = "selector", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201506")
        Selector selector)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Applies the list of mutate operations (add, remove, and set).
     *         
     *         @param operations The operations to apply. The same {@link CustomerExtensionSetting} cannot be
     *         specified in more than one operation.
     *         @return The changed {@link CustomerExtensionSetting}s.
     *         @throws ApiException Indicates a problem with the request.
     *       
     * 
     * @param operations
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201506.cm.CustomerExtensionSettingReturnValue
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201506")
    @RequestWrapper(localName = "mutate", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201506", className = "com.google.api.ads.adwords.jaxws.v201506.cm.CustomerExtensionSettingServiceInterfacemutate")
    @ResponseWrapper(localName = "mutateResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201506", className = "com.google.api.ads.adwords.jaxws.v201506.cm.CustomerExtensionSettingServiceInterfacemutateResponse")
    public CustomerExtensionSettingReturnValue mutate(
        @WebParam(name = "operations", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201506")
        List<CustomerExtensionSettingOperation> operations)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Returns a list of CustomerExtensionSettings that match the query.
     *         
     *         @param query The SQL-like AWQL query string.
     *         @return The list of CustomerExtensionSettings specified by the query.
     *         @throws ApiException Indicates a problem with the request.
     *       
     * 
     * @param query
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201506.cm.CustomerExtensionSettingPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201506")
    @RequestWrapper(localName = "query", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201506", className = "com.google.api.ads.adwords.jaxws.v201506.cm.CustomerExtensionSettingServiceInterfacequery")
    @ResponseWrapper(localName = "queryResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201506", className = "com.google.api.ads.adwords.jaxws.v201506.cm.CustomerExtensionSettingServiceInterfacequeryResponse")
    public CustomerExtensionSettingPage query(
        @WebParam(name = "query", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201506")
        String query)
        throws ApiException_Exception
    ;

}
