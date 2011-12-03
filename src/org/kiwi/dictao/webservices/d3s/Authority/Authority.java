
package org.kiwi.dictao.webservices.d3s.Authority;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "Authority", targetNamespace = "http://www.dictao.com/d3s/wsdl/v2/Authority", wsdlLocation = "file:/C:/local_projects/java/librairies/dictao/wsdl/v2_1_Authority.wsdl")
public class Authority
    extends Service
{

    private final static URL AUTHORITY_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(org.kiwi.dictao.webservices.d3s.Authority.Authority.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = org.kiwi.dictao.webservices.d3s.Authority.Authority.class.getResource(".");
            url = new URL(baseUrl, "file:/C:/local_projects/java/librairies/dictao/wsdl/v2_1_Authority.wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'file:/C:/local_projects/java/librairies/dictao/wsdl/v2_1_Authority.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        AUTHORITY_WSDL_LOCATION = url;
    }

    public Authority(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Authority() {
        super(AUTHORITY_WSDL_LOCATION, new QName("http://www.dictao.com/d3s/wsdl/v2/Authority", "Authority"));
    }

    /**
     * 
     * @return
     *     returns SafeboxPort
     */
    @WebEndpoint(name = "SafeboxPort")
    public SafeboxPort getSafeboxPort() {
        return super.getPort(new QName("http://www.dictao.com/d3s/wsdl/v2/Authority", "SafeboxPort"), SafeboxPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SafeboxPort
     */
    @WebEndpoint(name = "SafeboxPort")
    public SafeboxPort getSafeboxPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.dictao.com/d3s/wsdl/v2/Authority", "SafeboxPort"), SafeboxPort.class, features);
    }

    /**
     * 
     * @return
     *     returns OrgunitPort
     */
    @WebEndpoint(name = "OrgunitPort")
    public OrgunitPort getOrgunitPort() {
        return super.getPort(new QName("http://www.dictao.com/d3s/wsdl/v2/Authority", "OrgunitPort"), OrgunitPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns OrgunitPort
     */
    @WebEndpoint(name = "OrgunitPort")
    public OrgunitPort getOrgunitPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.dictao.com/d3s/wsdl/v2/Authority", "OrgunitPort"), OrgunitPort.class, features);
    }

    /**
     * 
     * @return
     *     returns UserPort
     */
    @WebEndpoint(name = "UserPort")
    public UserPort getUserPort() {
        return super.getPort(new QName("http://www.dictao.com/d3s/wsdl/v2/Authority", "UserPort"), UserPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UserPort
     */
    @WebEndpoint(name = "UserPort")
    public UserPort getUserPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.dictao.com/d3s/wsdl/v2/Authority", "UserPort"), UserPort.class, features);
    }

    /**
     * 
     * @return
     *     returns DepositPort
     */
    @WebEndpoint(name = "DepositPort")
    public DepositPort getDepositPort() {
        return super.getPort(new QName("http://www.dictao.com/d3s/wsdl/v2/Authority", "DepositPort"), DepositPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DepositPort
     */
    @WebEndpoint(name = "DepositPort")
    public DepositPort getDepositPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.dictao.com/d3s/wsdl/v2/Authority", "DepositPort"), DepositPort.class, features);
    }

    /**
     * 
     * @return
     *     returns CertificatePort
     */
    @WebEndpoint(name = "CertificatePort")
    public CertificatePort getCertificatePort() {
        return super.getPort(new QName("http://www.dictao.com/d3s/wsdl/v2/Authority", "CertificatePort"), CertificatePort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CertificatePort
     */
    @WebEndpoint(name = "CertificatePort")
    public CertificatePort getCertificatePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.dictao.com/d3s/wsdl/v2/Authority", "CertificatePort"), CertificatePort.class, features);
    }

    /**
     * 
     * @return
     *     returns SecretPort
     */
    @WebEndpoint(name = "SecretPort")
    public SecretPort getSecretPort() {
        return super.getPort(new QName("http://www.dictao.com/d3s/wsdl/v2/Authority", "SecretPort"), SecretPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SecretPort
     */
    @WebEndpoint(name = "SecretPort")
    public SecretPort getSecretPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.dictao.com/d3s/wsdl/v2/Authority", "SecretPort"), SecretPort.class, features);
    }

}
