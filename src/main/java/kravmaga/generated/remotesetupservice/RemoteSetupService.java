
package kravmaga.generated.remotesetupservice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * RemoteSetupService, is a utility service used to create and delete Booking API users, get system details and check server status.<br><br>This service is typically used during installation and deinstallation of 3rd Party Booking Integrations.
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "RemoteSetupService", targetNamespace = "http://tandberg.net/2004/02/tms/external/booking/remotesetup/", wsdlLocation = "http://vimimreg2.tms.lab/tms/external/booking/remotesetup/remotesetupservice.asmx?WSDL")
public class RemoteSetupService
    extends Service
{

    private final static URL REMOTESETUPSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(RemoteSetupService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = RemoteSetupService.class.getResource(".");
            url = new URL(baseUrl, "http://vimimreg2.tms.lab/tms/external/booking/remotesetup/remotesetupservice.asmx?WSDL");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://vimimreg2.tms.lab/tms/external/booking/remotesetup/remotesetupservice.asmx?WSDL', retrying as a local file");
            logger.warning(e.getMessage());
        }
        REMOTESETUPSERVICE_WSDL_LOCATION = url;
    }

    public RemoteSetupService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RemoteSetupService() {
        super(REMOTESETUPSERVICE_WSDL_LOCATION, new QName("http://tandberg.net/2004/02/tms/external/booking/remotesetup/", "RemoteSetupService"));
    }

    /**
     * 
     * @return
     *     returns RemoteSetupServiceSoap
     */
    @WebEndpoint(name = "RemoteSetupServiceSoap")
    public RemoteSetupServiceSoap getRemoteSetupServiceSoap() {
        return super.getPort(new QName("http://tandberg.net/2004/02/tms/external/booking/remotesetup/", "RemoteSetupServiceSoap"), RemoteSetupServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RemoteSetupServiceSoap
     */
    @WebEndpoint(name = "RemoteSetupServiceSoap")
    public RemoteSetupServiceSoap getRemoteSetupServiceSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://tandberg.net/2004/02/tms/external/booking/remotesetup/", "RemoteSetupServiceSoap"), RemoteSetupServiceSoap.class, features);
    }

}
