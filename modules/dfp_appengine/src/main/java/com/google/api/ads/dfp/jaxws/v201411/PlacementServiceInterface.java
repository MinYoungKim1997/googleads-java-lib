
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
 *       Provides methods for creating, updating and retrieving {@link Placement}
 *       objects.
 *       
 *       <p>You can use a placement to group ad units. For example, you might have a
 *       placement that focuses on sports sites, which may be spread across different
 *       branches of your inventory. You might also have a "fire sale" placement that
 *       includes ad units that have not been selling and are consequently priced very
 *       attractively.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "PlacementServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PlacementServiceInterface {


    /**
     * 
     *         Creates new {@link Placement} objects.
     *         
     *         @param placements the placements to create
     *         @return the new placements, with their IDs filled in
     *       
     * 
     * @param placements
     * @return
     *     returns java.util.List<com.google.api.ads.dfp.jaxws.v201411.Placement>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411")
    @RequestWrapper(localName = "createPlacements", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411", className = "com.google.api.ads.dfp.jaxws.v201411.PlacementServiceInterfacecreatePlacements")
    @ResponseWrapper(localName = "createPlacementsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411", className = "com.google.api.ads.dfp.jaxws.v201411.PlacementServiceInterfacecreatePlacementsResponse")
    public List<Placement> createPlacements(
        @WebParam(name = "placements", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411")
        List<Placement> placements)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets a {@link PlacementPage} of {@link Placement} objects that satisfy the
     *         given {@link Statement#query}. The following fields are supported for
     *         filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code description}</td>
     *         <td>{@link Placement#description}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link Placement#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code isAdSenseTargetingEnabled}</td>
     *         <td>{@link Placement#isAdSenseTargetingEnabled}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link Placement#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code placementCode}</td>
     *         <td>{@link Placement#placementCode}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link Placement#status}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code lastModifiedDateTime}</td>
     *         <td>{@link Placement#lastModifiedDateTime}</td>
     *         </tr>
     *         </table>
     *         
     *         @param filterStatement a Publisher Query Language statement used to filter
     *         a set of placements
     *         @return the placements that match the given filter
     *       
     * 
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201411.PlacementPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411")
    @RequestWrapper(localName = "getPlacementsByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411", className = "com.google.api.ads.dfp.jaxws.v201411.PlacementServiceInterfacegetPlacementsByStatement")
    @ResponseWrapper(localName = "getPlacementsByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411", className = "com.google.api.ads.dfp.jaxws.v201411.PlacementServiceInterfacegetPlacementsByStatementResponse")
    public PlacementPage getPlacementsByStatement(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Performs actions on {@link Placement} objects that match the given
     *         {@link Statement#query}.
     *         
     *         @param placementAction the action to perform
     *         @param filterStatement a Publisher Query Language statement used to filter
     *         a set of placements
     *         @return the result of the action performed
     *       
     * 
     * @param placementAction
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201411.UpdateResult
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411")
    @RequestWrapper(localName = "performPlacementAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411", className = "com.google.api.ads.dfp.jaxws.v201411.PlacementServiceInterfaceperformPlacementAction")
    @ResponseWrapper(localName = "performPlacementActionResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411", className = "com.google.api.ads.dfp.jaxws.v201411.PlacementServiceInterfaceperformPlacementActionResponse")
    public UpdateResult performPlacementAction(
        @WebParam(name = "placementAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411")
        PlacementAction placementAction,
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@link Placement} objects.
     *         
     *         @param placements the placements to update
     *         @return the updated placements
     *       
     * 
     * @param placements
     * @return
     *     returns java.util.List<com.google.api.ads.dfp.jaxws.v201411.Placement>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411")
    @RequestWrapper(localName = "updatePlacements", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411", className = "com.google.api.ads.dfp.jaxws.v201411.PlacementServiceInterfaceupdatePlacements")
    @ResponseWrapper(localName = "updatePlacementsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411", className = "com.google.api.ads.dfp.jaxws.v201411.PlacementServiceInterfaceupdatePlacementsResponse")
    public List<Placement> updatePlacements(
        @WebParam(name = "placements", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411")
        List<Placement> placements)
        throws ApiException_Exception
    ;

}
