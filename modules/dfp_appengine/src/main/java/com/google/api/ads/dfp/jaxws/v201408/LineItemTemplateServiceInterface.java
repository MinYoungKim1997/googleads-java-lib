
package com.google.api.ads.dfp.jaxws.v201408;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       Provides methods for creating, updating and retrieving
 *       {@link LineItemTemplate} objects.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "LineItemTemplateServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v201408")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface LineItemTemplateServiceInterface {


    /**
     * 
     *         Gets a {@link LineItemTemplatePage} of {@link LineItemTemplate} objects
     *         that satisfy the given {@link Statement#query}. The following fields are
     *         supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link LineItemTemplate#id}</td>
     *         </tr>
     *         </table>
     *         
     *         @param filterStatement a Publisher Query Language statement used to filter
     *         a set of line item templates
     *         @return the line item templates that match the given filter
     *         @throws ApiException if a RuntimeException is thrown
     *       
     * 
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201408.LineItemTemplatePage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201408")
    @RequestWrapper(localName = "getLineItemTemplatesByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201408", className = "com.google.api.ads.dfp.jaxws.v201408.LineItemTemplateServiceInterfacegetLineItemTemplatesByStatement")
    @ResponseWrapper(localName = "getLineItemTemplatesByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201408", className = "com.google.api.ads.dfp.jaxws.v201408.LineItemTemplateServiceInterfacegetLineItemTemplatesByStatementResponse")
    public LineItemTemplatePage getLineItemTemplatesByStatement(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201408")
        Statement filterStatement)
        throws ApiException_Exception
    ;

}
