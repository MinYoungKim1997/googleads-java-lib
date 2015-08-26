
package com.google.api.ads.dfp.jaxws.v201411;

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
 *       Provides operations for creating, updating and retrieving {@link AdUnit}
 *       objects.
 *       
 *       <p>Line items connect a creative with its associated ad unit through
 *       targeting.
 *       
 *       <p>An ad unit represents a piece of inventory within a publisher.
 *       It contains all the settings that need to be associated with the
 *       inventory in order to serve ads. For example, the ad unit contains creative
 *       size restrictions and AdSense settings.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "InventoryServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface InventoryServiceInterface {


    /**
     * 
     *         Creates new {@link AdUnit} objects.
     *         
     *         @param adUnits the ad units to create
     *         @return the created ad units, with their IDs filled in
     *       
     * 
     * @param adUnits
     * @return
     *     returns java.util.List<com.google.api.ads.dfp.jaxws.v201411.AdUnit>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411")
    @RequestWrapper(localName = "createAdUnits", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411", className = "com.google.api.ads.dfp.jaxws.v201411.CreateAdUnits")
    @ResponseWrapper(localName = "createAdUnitsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411", className = "com.google.api.ads.dfp.jaxws.v201411.CreateAdUnitsResponse")
    public List<AdUnit> createAdUnits(
        @WebParam(name = "adUnits", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411")
        List<AdUnit> adUnits)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets a set of {@link AdUnitSize} objects that satisfy the given
     *         {@link Statement#query}. The following fields are supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code targetPlatform}</td>
     *         <td>{@link TargetPlatform}</td>
     *         </tr>
     *         </table>
     *         An exception will be thrown for queries with unsupported fields.
     *         
     *         Paging is not supported, as aren't the LIMIT and OFFSET PQL keywords.
     *         
     *         Only "=" operator is supported.
     *         
     *         @param filterStatement a Publisher Query Language statement used to filter
     *         a set of ad unit sizes
     *         @return the ad unit sizes that match the given filter
     *       
     * 
     * @param filterStatement
     * @return
     *     returns java.util.List<com.google.api.ads.dfp.jaxws.v201411.AdUnitSize>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411")
    @RequestWrapper(localName = "getAdUnitSizesByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411", className = "com.google.api.ads.dfp.jaxws.v201411.GetAdUnitSizesByStatement")
    @ResponseWrapper(localName = "getAdUnitSizesByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411", className = "com.google.api.ads.dfp.jaxws.v201411.GetAdUnitSizesByStatementResponse")
    public List<AdUnitSize> getAdUnitSizesByStatement(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets a {@link AdUnitPage} of {@link AdUnit} objects that satisfy the given
     *         {@link Statement#query}. The following fields are supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code adUnitCode}</td>
     *         <td>{@link AdUnit#adUnitCode}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link AdUnit#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link AdUnit#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code parentId}</td>
     *         <td>{@link AdUnit#parentId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link AdUnit#status}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code lastModifiedDateTime}</td>
     *         <td>{@link AdUnit#lastModifiedDateTime}</td>
     *         </tr>
     *         </table>
     *         
     *         @param filterStatement a Publisher Query Language statement used to filter
     *         a set of ad units
     *         @return the ad units that match the given filter
     *       
     * 
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201411.AdUnitPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411")
    @RequestWrapper(localName = "getAdUnitsByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411", className = "com.google.api.ads.dfp.jaxws.v201411.GetAdUnitsByStatement")
    @ResponseWrapper(localName = "getAdUnitsByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411", className = "com.google.api.ads.dfp.jaxws.v201411.GetAdUnitsByStatementResponse")
    public AdUnitPage getAdUnitsByStatement(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Performs actions on {@link AdUnit} objects that match the given
     *         {@link Statement#query}.
     *         
     *         @param adUnitAction the action to perform
     *         @param filterStatement a Publisher Query Language statement used to filter
     *         a set of ad units
     *         @return the result of the action performed
     *       
     * 
     * @param filterStatement
     * @param adUnitAction
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201411.UpdateResult
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411")
    @RequestWrapper(localName = "performAdUnitAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411", className = "com.google.api.ads.dfp.jaxws.v201411.PerformAdUnitAction")
    @ResponseWrapper(localName = "performAdUnitActionResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411", className = "com.google.api.ads.dfp.jaxws.v201411.PerformAdUnitActionResponse")
    public UpdateResult performAdUnitAction(
        @WebParam(name = "adUnitAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411")
        AdUnitAction adUnitAction,
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@link AdUnit} objects.
     *         
     *         @param adUnits the ad units to update
     *         @return the updated ad units
     *       
     * 
     * @param adUnits
     * @return
     *     returns java.util.List<com.google.api.ads.dfp.jaxws.v201411.AdUnit>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411")
    @RequestWrapper(localName = "updateAdUnits", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411", className = "com.google.api.ads.dfp.jaxws.v201411.UpdateAdUnits")
    @ResponseWrapper(localName = "updateAdUnitsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411", className = "com.google.api.ads.dfp.jaxws.v201411.UpdateAdUnitsResponse")
    public List<AdUnit> updateAdUnits(
        @WebParam(name = "adUnits", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411")
        List<AdUnit> adUnits)
        throws ApiException_Exception
    ;

}
