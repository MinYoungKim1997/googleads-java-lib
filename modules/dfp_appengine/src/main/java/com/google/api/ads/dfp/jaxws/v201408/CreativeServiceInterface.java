
package com.google.api.ads.dfp.jaxws.v201408;

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
 *       Provides methods for adding, updating and retrieving {@link Creative}
 *       objects.
 *       
 *       <p>For a creative to run, it must be associated with a {@link LineItem}
 *       managed by the {@link LineItemCreativeAssociationService}.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "CreativeServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v201408")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CreativeServiceInterface {


    /**
     * 
     *         Creates new {@link Creative} objects.
     *         
     *         @param creatives the creatives to create
     *         @return the created creatives with their IDs filled in
     *       
     * 
     * @param creatives
     * @return
     *     returns java.util.List<com.google.api.ads.dfp.jaxws.v201408.Creative>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201408")
    @RequestWrapper(localName = "createCreatives", targetNamespace = "https://www.google.com/apis/ads/publisher/v201408", className = "com.google.api.ads.dfp.jaxws.v201408.CreativeServiceInterfacecreateCreatives")
    @ResponseWrapper(localName = "createCreativesResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201408", className = "com.google.api.ads.dfp.jaxws.v201408.CreativeServiceInterfacecreateCreativesResponse")
    public List<Creative> createCreatives(
        @WebParam(name = "creatives", targetNamespace = "https://www.google.com/apis/ads/publisher/v201408")
        List<Creative> creatives)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets a {@link CreativePage} of {@link Creative} objects that satisfy the
     *         given {@link Statement#query}. The following fields are supported for
     *         filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link Creative#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link Creative#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code advertiserId}</td>
     *         <td>{@link Creative#advertiserId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code width}</td>
     *         <td>{@link Creative#size}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code height}</td>
     *         <td>{@link Creative#size}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code lastModifiedDateTime}</td>
     *         <td>{@link Creative#lastModifiedDateTime}</td>
     *         </tr>
     *         </table>
     *         
     *         @param filterStatement a Publisher Query Language statement used to filter
     *         a set of creatives
     *         @return the creatives that match the given filter
     *       
     * 
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201408.CreativePage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201408")
    @RequestWrapper(localName = "getCreativesByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201408", className = "com.google.api.ads.dfp.jaxws.v201408.CreativeServiceInterfacegetCreativesByStatement")
    @ResponseWrapper(localName = "getCreativesByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201408", className = "com.google.api.ads.dfp.jaxws.v201408.CreativeServiceInterfacegetCreativesByStatementResponse")
    public CreativePage getCreativesByStatement(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201408")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@link Creative} objects.
     *         
     *         @param creatives the creatives to update
     *         @return the updated creatives
     *       
     * 
     * @param creatives
     * @return
     *     returns java.util.List<com.google.api.ads.dfp.jaxws.v201408.Creative>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201408")
    @RequestWrapper(localName = "updateCreatives", targetNamespace = "https://www.google.com/apis/ads/publisher/v201408", className = "com.google.api.ads.dfp.jaxws.v201408.CreativeServiceInterfaceupdateCreatives")
    @ResponseWrapper(localName = "updateCreativesResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201408", className = "com.google.api.ads.dfp.jaxws.v201408.CreativeServiceInterfaceupdateCreativesResponse")
    public List<Creative> updateCreatives(
        @WebParam(name = "creatives", targetNamespace = "https://www.google.com/apis/ads/publisher/v201408")
        List<Creative> creatives)
        throws ApiException_Exception
    ;

}
