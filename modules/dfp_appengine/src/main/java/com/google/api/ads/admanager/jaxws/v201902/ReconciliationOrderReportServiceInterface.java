// Copyright 2019 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.


package com.google.api.ads.admanager.jaxws.v201902;

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
 *       Provides methods for retrieving, reconciling, and reverting {@link ReconciliationOrderReport}
 *       objects.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "ReconciliationOrderReportServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v201902")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ReconciliationOrderReportServiceInterface {


    /**
     * 
     *         Gets an {@link ReconciliationOrderReportPage} of {@link ReconciliationOrderReport} objects
     *         that satisfy the given {@link Statement#query}.
     *         The following fields are supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code reconciliationReportId}</td>
     *         <td>{@link ReconciliationOrderReport#reconciliationReportId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link ReconciliationOrderReport#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code orderId}</td>
     *         <td>{@link ReconciliationOrderReport#orderId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code proposalId}</td>
     *         <td>{@link ReconciliationOrderReport#proposalId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link ReconciliationOrderReport#status}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code submissionDateTime}</td>
     *         <td>{@link ReconciliationOrderReport#submissionDateTime}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code submitterId}</td>
     *         <td>{@link ReconciliationOrderReport#submitterId}</td>
     *         </tr>
     *         </table>
     *         
     *         The {@code reconciliationReportId} field is required and can only be combined with an
     *         {@code AND} to other conditions. Furthermore, the results may only belong to
     *         one {@link ReconciliationReport}.
     *         
     *         @param filterStatement a Publisher Query Language statement used to filter
     *         a set of reconciliation order reports.
     *         @return the reconciliation order reports that match the given filter.
     *       
     * 
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v201902.ReconciliationOrderReportPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201902")
    @RequestWrapper(localName = "getReconciliationOrderReportsByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201902", className = "com.google.api.ads.admanager.jaxws.v201902.ReconciliationOrderReportServiceInterfacegetReconciliationOrderReportsByStatement")
    @ResponseWrapper(localName = "getReconciliationOrderReportsByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201902", className = "com.google.api.ads.admanager.jaxws.v201902.ReconciliationOrderReportServiceInterfacegetReconciliationOrderReportsByStatementResponse")
    public ReconciliationOrderReportPage getReconciliationOrderReportsByStatement(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201902")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Performs actions on the {@link ReconciliationOrderReport} objects that match the given
     *         {@link Statement#query}. The following fields are supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code orderId}</td>
     *         <td>{@link ReconciliationOrderReport#orderId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code proposalId}</td>
     *         <td>{@link ReconciliationOrderReport#proposalId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code reconciliationReportId}</td>
     *         <td>{@link ReconciliationOrderReport#reconciliationReportId}</td>
     *         </tr>
     *         </table>
     *         The following statement patterns are supported:
     *         <ul>
     *         <li>reconciliationReportId = :reconciliationReportId AND orderId = :orderId</li>
     *         <li>reconciliationReportId = :reconciliationReportId AND proposalId = :proposalId</li>
     *         <li>reconciliationReportId = :reconciliationReportId
     *         AND (orderId IN (...) OR proposalId IN (...))</li>
     *         </ul>
     *         The IN clause could be expanded to multiple OR expressions like
     *         (orderId = :orderId OR orderId = :orderId OR ...)
     *         Only orders to which the API user has access will be included.
     *         
     *         @param reconciliationOrderReportAction the action to perform.
     *         @param filterStatement a Publisher Query Language statement used to filter a set of orders and
     *         one reconciliation report.
     *         @return the result of the action performed.
     *       
     * 
     * @param reconciliationOrderReportAction
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v201902.UpdateResult
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201902")
    @RequestWrapper(localName = "performReconciliationOrderReportAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v201902", className = "com.google.api.ads.admanager.jaxws.v201902.ReconciliationOrderReportServiceInterfaceperformReconciliationOrderReportAction")
    @ResponseWrapper(localName = "performReconciliationOrderReportActionResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201902", className = "com.google.api.ads.admanager.jaxws.v201902.ReconciliationOrderReportServiceInterfaceperformReconciliationOrderReportActionResponse")
    public UpdateResult performReconciliationOrderReportAction(
        @WebParam(name = "reconciliationOrderReportAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v201902")
        ReconciliationOrderReportAction reconciliationOrderReportAction,
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201902")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates a list of {@link ReconciliationOrderReport reconciliation order reports}
     *         which belong to a {@link ReconciliationReport}.
     *         
     *         @param reconciliationOrderReports a list of
     *         {@link ReconciliationOrderReport reconciliation order reports} to update
     *         @return the updated reconciliation order reports
     *       
     * 
     * @param reconciliationOrderReports
     * @return
     *     returns java.util.List<com.google.api.ads.admanager.jaxws.v201902.ReconciliationOrderReport>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201902")
    @RequestWrapper(localName = "updateReconciliationOrderReports", targetNamespace = "https://www.google.com/apis/ads/publisher/v201902", className = "com.google.api.ads.admanager.jaxws.v201902.ReconciliationOrderReportServiceInterfaceupdateReconciliationOrderReports")
    @ResponseWrapper(localName = "updateReconciliationOrderReportsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201902", className = "com.google.api.ads.admanager.jaxws.v201902.ReconciliationOrderReportServiceInterfaceupdateReconciliationOrderReportsResponse")
    public List<ReconciliationOrderReport> updateReconciliationOrderReports(
        @WebParam(name = "reconciliationOrderReports", targetNamespace = "https://www.google.com/apis/ads/publisher/v201902")
        List<ReconciliationOrderReport> reconciliationOrderReports)
        throws ApiException_Exception
    ;

}
