
package org.kiwi.dictao.webservices.d3s.Authority;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "DepositPort", targetNamespace = "http://www.dictao.com/d3s/wsdl/v2/Authority")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface DepositPort {


    /**
     * 
     * @param containerPath
     * @param deposit
     * @param motivation
     * @param applicantPath
     * @return
     *     returns java.lang.String
     * @throws EnvironmentFaultException
     * @throws UserFaultException
     */
    @WebMethod(action = "Deposit:create")
    @WebResult(name = "createdResourcePath", targetNamespace = "")
    @RequestWrapper(localName = "createDeposit", targetNamespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", className = "org.kiwi.dictao.webservices.d3s.Authority.CreateDeposit")
    @ResponseWrapper(localName = "createDepositResponse", targetNamespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", className = "org.kiwi.dictao.webservices.d3s.Authority.CreateResponse")
    public String createDeposit(
        @WebParam(name = "applicantPath", targetNamespace = "")
        String applicantPath,
        @WebParam(name = "motivation", targetNamespace = "")
        String motivation,
        @WebParam(name = "containerPath", targetNamespace = "")
        String containerPath,
        @WebParam(name = "deposit", targetNamespace = "")
        Deposit deposit)
        throws EnvironmentFaultException, UserFaultException
    ;

    /**
     * 
     * @param resourcePath
     * @param motivation
     * @param applicantPath
     * @return
     *     returns org.kiwi.dictao.webservices.d3s.Authority.Deposit
     * @throws EnvironmentFaultException
     * @throws UserFaultException
     */
    @WebMethod(action = "Deposit:read")
    @WebResult(name = "deposit", targetNamespace = "")
    @RequestWrapper(localName = "readDeposit", targetNamespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", className = "org.kiwi.dictao.webservices.d3s.Authority.Read")
    @ResponseWrapper(localName = "readDepositResponse", targetNamespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", className = "org.kiwi.dictao.webservices.d3s.Authority.ReadDepositResponse")
    public Deposit readDeposit(
        @WebParam(name = "applicantPath", targetNamespace = "")
        String applicantPath,
        @WebParam(name = "motivation", targetNamespace = "")
        String motivation,
        @WebParam(name = "resourcePath", targetNamespace = "")
        String resourcePath)
        throws EnvironmentFaultException, UserFaultException
    ;

    /**
     * 
     * @param resourcePath
     * @param deposit
     * @param motivation
     * @param applicantPath
     * @return
     *     returns java.lang.String
     * @throws EnvironmentFaultException
     * @throws UserFaultException
     */
    @WebMethod(action = "Deposit:updateMetadata")
    @WebResult(name = "updatedResourcePath", targetNamespace = "")
    @RequestWrapper(localName = "updateDepositMetadata", targetNamespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", className = "org.kiwi.dictao.webservices.d3s.Authority.UpdateDepositMetadata")
    @ResponseWrapper(localName = "updateDepositMetadataResponse", targetNamespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", className = "org.kiwi.dictao.webservices.d3s.Authority.UpdateResponse")
    public String updateDepositMetadata(
        @WebParam(name = "applicantPath", targetNamespace = "")
        String applicantPath,
        @WebParam(name = "motivation", targetNamespace = "")
        String motivation,
        @WebParam(name = "resourcePath", targetNamespace = "")
        String resourcePath,
        @WebParam(name = "deposit", targetNamespace = "")
        Deposit deposit)
        throws EnvironmentFaultException, UserFaultException
    ;

    /**
     * 
     * @param resourcePath
     * @param deposit
     * @param motivation
     * @param applicantPath
     * @return
     *     returns java.lang.String
     * @throws EnvironmentFaultException
     * @throws UserFaultException
     */
    @WebMethod(action = "Deposit:update")
    @WebResult(name = "updatedResourcePath", targetNamespace = "")
    @RequestWrapper(localName = "updateDeposit", targetNamespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", className = "org.kiwi.dictao.webservices.d3s.Authority.UpdateDeposit")
    @ResponseWrapper(localName = "updateDepositResponse", targetNamespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", className = "org.kiwi.dictao.webservices.d3s.Authority.UpdateResponse")
    public String updateDeposit(
        @WebParam(name = "applicantPath", targetNamespace = "")
        String applicantPath,
        @WebParam(name = "motivation", targetNamespace = "")
        String motivation,
        @WebParam(name = "resourcePath", targetNamespace = "")
        String resourcePath,
        @WebParam(name = "deposit", targetNamespace = "")
        Deposit deposit)
        throws EnvironmentFaultException, UserFaultException
    ;

    /**
     * 
     * @param resourcePath
     * @param motivation
     * @param applicantPath
     * @throws EnvironmentFaultException
     * @throws UserFaultException
     */
    @WebMethod(action = "Deposit:delete")
    @RequestWrapper(localName = "deleteDeposit", targetNamespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", className = "org.kiwi.dictao.webservices.d3s.Authority.Delete")
    @ResponseWrapper(localName = "deleteDepositResponse", targetNamespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", className = "org.kiwi.dictao.webservices.d3s.Authority.DeleteResponse")
    public void deleteDeposit(
        @WebParam(name = "applicantPath", targetNamespace = "")
        String applicantPath,
        @WebParam(name = "motivation", targetNamespace = "")
        String motivation,
        @WebParam(name = "resourcePath", targetNamespace = "")
        String resourcePath)
        throws EnvironmentFaultException, UserFaultException
    ;

    /**
     * 
     * @param resourcePath
     * @param motivation
     * @param applicantPath
     * @throws EnvironmentFaultException
     * @throws UserFaultException
     */
    @WebMethod(action = "Deposit:discard")
    @RequestWrapper(localName = "discardDeposit", targetNamespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", className = "org.kiwi.dictao.webservices.d3s.Authority.DiscardDeposit")
    @ResponseWrapper(localName = "discardDepositResponse", targetNamespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", className = "org.kiwi.dictao.webservices.d3s.Authority.DiscardDepositResponse")
    public void discardDeposit(
        @WebParam(name = "applicantPath", targetNamespace = "")
        String applicantPath,
        @WebParam(name = "motivation", targetNamespace = "")
        String motivation,
        @WebParam(name = "resourcePath", targetNamespace = "")
        String resourcePath)
        throws EnvironmentFaultException, UserFaultException
    ;

    /**
     * 
     * @param resourcePath
     * @param motivation
     * @param applicantPath
     * @throws EnvironmentFaultException
     * @throws UserFaultException
     */
    @WebMethod(action = "Deposit:restore")
    @RequestWrapper(localName = "restoreDeposit", targetNamespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", className = "org.kiwi.dictao.webservices.d3s.Authority.RestoreDeposit")
    @ResponseWrapper(localName = "restoreDepositResponse", targetNamespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", className = "org.kiwi.dictao.webservices.d3s.Authority.RestoreDepositResponse")
    public void restoreDeposit(
        @WebParam(name = "applicantPath", targetNamespace = "")
        String applicantPath,
        @WebParam(name = "motivation", targetNamespace = "")
        String motivation,
        @WebParam(name = "resourcePath", targetNamespace = "")
        String resourcePath)
        throws EnvironmentFaultException, UserFaultException
    ;

    /**
     * 
     * @param orderBy
     * @param criteria
     * @param searchPath
     * @param motivation
     * @param maxResult
     * @param applicantPath
     * @return
     *     returns org.kiwi.dictao.webservices.d3s.Authority.FindDepositsResponse
     * @throws EnvironmentFaultException
     * @throws UserFaultException
     */
    @WebMethod(action = "Deposit:find")
    @WebResult(name = "findDepositsResponse", targetNamespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority")
    @RequestWrapper(localName = "findDeposits", targetNamespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", className = "org.kiwi.dictao.webservices.d3s.Authority.FindDeposits")
    @ResponseWrapper(localName = "findDepositsResponseContent", targetNamespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", className = "org.kiwi.dictao.webservices.d3s.Authority.FindDepositsResponseContent")
    public FindDepositsResponse findDeposits(
        @WebParam(name = "applicantPath", targetNamespace = "")
        String applicantPath,
        @WebParam(name = "motivation", targetNamespace = "")
        String motivation,
        @WebParam(name = "searchPath", targetNamespace = "")
        String searchPath,
        @WebParam(name = "criteria", targetNamespace = "")
        List<Criterion> criteria,
        @WebParam(name = "orderBy", targetNamespace = "")
        List<OrderBy> orderBy,
        @WebParam(name = "maxResult", targetNamespace = "")
        int maxResult)
        throws EnvironmentFaultException, UserFaultException
    ;

    /**
     * 
     * @param cursor
     * @return
     *     returns org.kiwi.dictao.webservices.d3s.Authority.FindDepositsResponse
     * @throws EnvironmentFaultException
     * @throws UserFaultException
     */
    @WebMethod(action = "Deposit:next")
    @WebResult(name = "findDepositsResponse", targetNamespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority")
    @RequestWrapper(localName = "nextDeposits", targetNamespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", className = "org.kiwi.dictao.webservices.d3s.Authority.NextDeposits")
    @ResponseWrapper(localName = "nextDepositsResponseContent", targetNamespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", className = "org.kiwi.dictao.webservices.d3s.Authority.NextDepositsResponseContent")
    public FindDepositsResponse nextDeposits(
        @WebParam(name = "cursor", targetNamespace = "")
        byte[] cursor)
        throws EnvironmentFaultException, UserFaultException
    ;

    /**
     * 
     * @param containerPath
     * @param isCurrentVersion
     * @param depositProof
     * @param motivation
     * @param applicantPath
     * @return
     *     returns org.kiwi.dictao.webservices.d3s.Authority.ImportDepositResponse
     * @throws EnvironmentFaultException
     * @throws UserFaultException
     */
    @WebMethod(action = "Deposit:import")
    @WebResult(name = "importDepositResponse", targetNamespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority")
    @RequestWrapper(localName = "importDeposit", targetNamespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", className = "org.kiwi.dictao.webservices.d3s.Authority.ImportDeposit")
    @ResponseWrapper(localName = "importDepositResponseContent", targetNamespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", className = "org.kiwi.dictao.webservices.d3s.Authority.ImportDepositResponseContent")
    public ImportDepositResponse importDeposit(
        @WebParam(name = "applicantPath", targetNamespace = "")
        String applicantPath,
        @WebParam(name = "motivation", targetNamespace = "")
        String motivation,
        @WebParam(name = "containerPath", targetNamespace = "")
        String containerPath,
        @WebParam(name = "depositProof", targetNamespace = "")
        DepositProof depositProof,
        @WebParam(name = "isCurrentVersion", targetNamespace = "")
        boolean isCurrentVersion)
        throws EnvironmentFaultException, UserFaultException
    ;

    /**
     * 
     * @param resourcePath
     * @param accessPermissions
     * @param motivation
     * @param applicantPath
     * @throws EnvironmentFaultException
     * @throws UserFaultException
     */
    @WebMethod(action = "Deposit:changeAccessPermissions")
    @RequestWrapper(localName = "changeAccessPermissions", targetNamespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", className = "org.kiwi.dictao.webservices.d3s.Authority.ChangeAccessPermissions")
    @ResponseWrapper(localName = "changeAccessPermissionsResponse", targetNamespace = "http://www.dictao.com/d3s/wsdl/v2.1/Authority", className = "org.kiwi.dictao.webservices.d3s.Authority.ChangeAccessPermissionsResponse")
    public void changeAccessPermissions(
        @WebParam(name = "applicantPath", targetNamespace = "")
        String applicantPath,
        @WebParam(name = "motivation", targetNamespace = "")
        String motivation,
        @WebParam(name = "resourcePath", targetNamespace = "")
        String resourcePath,
        @WebParam(name = "AccessPermissions", targetNamespace = "")
        AccessPermissions accessPermissions)
        throws EnvironmentFaultException, UserFaultException
    ;

}
