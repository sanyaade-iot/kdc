
package org.kiwi.dictao.webservices.dtss;

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
@WebService(name = "DTSSSoap", targetNamespace = "http://www.dictao.com/DTSS/Interface")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface DTSSSoap {


    /**
     * 
     * @param signatureParameter
     * @param transactionId
     * @param pluginParameter
     * @param requestId
     * @param tag
     * @param signature
     * @return
     *     returns org.kiwi.dictao.webservices.dtss.DTSSResponseEx
     */
    @WebMethod(action = "http://www.dictao.com/DTSS/Interface/insertTimeStampEx")
    @WebResult(name = "insertTimeStampExResult", targetNamespace = "http://www.dictao.com/DTSS/Interface")
    @RequestWrapper(localName = "insertTimeStampEx", targetNamespace = "http://www.dictao.com/DTSS/Interface", className = "org.kiwi.dictao.webservices.dtss.InsertTimeStampEx")
    @ResponseWrapper(localName = "insertTimeStampExResponse", targetNamespace = "http://www.dictao.com/DTSS/Interface", className = "org.kiwi.dictao.webservices.dtss.InsertTimeStampExResponse")
    public DTSSResponseEx insertTimeStampEx(
        @WebParam(name = "requestId", targetNamespace = "http://www.dictao.com/DTSS/Interface")
        String requestId,
        @WebParam(name = "transactionId", targetNamespace = "http://www.dictao.com/DTSS/Interface")
        String transactionId,
        @WebParam(name = "tag", targetNamespace = "http://www.dictao.com/DTSS/Interface")
        String tag,
        @WebParam(name = "signature", targetNamespace = "http://www.dictao.com/DTSS/Interface")
        DataType signature,
        @WebParam(name = "signatureParameter", targetNamespace = "http://www.dictao.com/DTSS/Interface")
        String signatureParameter,
        @WebParam(name = "pluginParameter", targetNamespace = "http://www.dictao.com/DTSS/Interface")
        ArrayOfPluginParameterStruct pluginParameter);

    /**
     * 
     * @param pluginParameter
     * @param archiveId
     * @param requestId
     * @return
     *     returns org.kiwi.dictao.webservices.dtss.DTSSArchiveResponseEx
     */
    @WebMethod(action = "http://www.dictao.com/DTSS/Interface/getArchiveEx")
    @WebResult(name = "getArchiveExResult", targetNamespace = "http://www.dictao.com/DTSS/Interface")
    @RequestWrapper(localName = "getArchiveEx", targetNamespace = "http://www.dictao.com/DTSS/Interface", className = "org.kiwi.dictao.webservices.dtss.GetArchiveEx")
    @ResponseWrapper(localName = "getArchiveExResponse", targetNamespace = "http://www.dictao.com/DTSS/Interface", className = "org.kiwi.dictao.webservices.dtss.GetArchiveExResponse")
    public DTSSArchiveResponseEx getArchiveEx(
        @WebParam(name = "requestId", targetNamespace = "http://www.dictao.com/DTSS/Interface")
        String requestId,
        @WebParam(name = "archiveId", targetNamespace = "http://www.dictao.com/DTSS/Interface")
        String archiveId,
        @WebParam(name = "pluginParameter", targetNamespace = "http://www.dictao.com/DTSS/Interface")
        ArrayOfPluginParameterStruct pluginParameter);

}
