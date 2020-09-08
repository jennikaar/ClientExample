
package cz.muni.fi.pa053;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.1
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "UnknownUser", targetNamespace = "http://pa053.fi.muni.cz/")
public class UnknownUser_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private UnknownUser faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public UnknownUser_Exception(String message, UnknownUser faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public UnknownUser_Exception(String message, UnknownUser faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: cz.muni.fi.pa053.UnknownUser
     */
    public UnknownUser getFaultInfo() {
        return faultInfo;
    }

}
