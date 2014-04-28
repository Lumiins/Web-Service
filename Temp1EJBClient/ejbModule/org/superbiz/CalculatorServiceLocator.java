/**
 * CalculatorServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf251234.07 v82812182731
 */

package org.superbiz;

public class CalculatorServiceLocator extends com.ibm.ws.webservices.multiprotocol.AgnosticService implements com.ibm.ws.webservices.multiprotocol.GeneratedService, org.superbiz.CalculatorService {

    public CalculatorServiceLocator() {
        super(com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
           "http://superbiz.org/wsdl",
           "CalculatorService"));

        context.setLocatorName("org.superbiz.CalculatorServiceLocator");
    }

    public CalculatorServiceLocator(com.ibm.ws.webservices.multiprotocol.ServiceContext ctx) {
        super(ctx);
        context.setLocatorName("org.superbiz.CalculatorServiceLocator");
    }

    // Abrufen einer Proxy-Klasse für calculatorPort
    private final java.lang.String calculatorPort_address = "http://localhost:9080/RouterWebProject/services/CalculatorPort";

    public java.lang.String getCalculatorPortAddress() {
        if (context.getOverriddingEndpointURIs() == null) {
            return calculatorPort_address;
        }
        String overriddingEndpoint = (String) context.getOverriddingEndpointURIs().get("CalculatorPort");
        if (overriddingEndpoint != null) {
            return overriddingEndpoint;
        }
        else {
            return calculatorPort_address;
        }
    }

    private java.lang.String calculatorPortPortName = "CalculatorPort";

    // The WSDD port name defaults to the port name.
    private java.lang.String calculatorPortWSDDPortName = "CalculatorPort";

    public java.lang.String getCalculatorPortWSDDPortName() {
        return calculatorPortWSDDPortName;
    }

    public void setCalculatorPortWSDDPortName(java.lang.String name) {
        calculatorPortWSDDPortName = name;
    }

    public org.superbiz.CalculatorWs getCalculatorPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(getCalculatorPortAddress());
        }
        catch (java.net.MalformedURLException e) {
            return null; // Unwahrscheinlich, da URL in WSDL2Java validiert wurde.
        }
        return getCalculatorPort(endpoint);
    }

    public org.superbiz.CalculatorWs getCalculatorPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        org.superbiz.CalculatorWs _stub =
            (org.superbiz.CalculatorWs) getStub(
                calculatorPortPortName,
                (String) getPort2NamespaceMap().get(calculatorPortPortName),
                org.superbiz.CalculatorWs.class,
                "org.superbiz.CalculatorServiceSoapBindingStub",
                portAddress.toString());
        if (_stub instanceof com.ibm.ws.webservices.engine.client.Stub) {
            ((com.ibm.ws.webservices.engine.client.Stub) _stub).setPortName(calculatorPortWSDDPortName);
        }
        return _stub;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.superbiz.CalculatorWs.class.isAssignableFrom(serviceEndpointInterface)) {
                return getCalculatorPort();
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("WSWS3273E: Fehler: Es ist keine Stub-Implementierung für die Schnittstelle vorhanden:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        String inputPortName = portName.getLocalPart();
        if ("CalculatorPort".equals(inputPortName)) {
            return getCalculatorPort();
        }
        else  {
            throw new javax.xml.rpc.ServiceException();
        }
    }

    public void setPortNamePrefix(java.lang.String prefix) {
        calculatorPortWSDDPortName = prefix + "/" + calculatorPortPortName;
    }

    public javax.xml.namespace.QName getServiceName() {
        return com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://superbiz.org/wsdl", "CalculatorService");
    }

    private java.util.Map port2NamespaceMap = null;

    protected synchronized java.util.Map getPort2NamespaceMap() {
        if (port2NamespaceMap == null) {
            port2NamespaceMap = new java.util.HashMap();
            port2NamespaceMap.put(
               "CalculatorPort",
               "http://schemas.xmlsoap.org/wsdl/soap/");
        }
        return port2NamespaceMap;
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            String serviceNamespace = getServiceName().getNamespaceURI();
            for (java.util.Iterator i = getPort2NamespaceMap().keySet().iterator(); i.hasNext(); ) {
                ports.add(
                    com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                        serviceNamespace,
                        (String) i.next()));
            }
        }
        return ports.iterator();
    }

    public javax.xml.rpc.Call[] getCalls(javax.xml.namespace.QName portName) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            throw new javax.xml.rpc.ServiceException("WSWS3062E: Fehler: Das Argument \"portName\" darf nicht null sein.");
        }
        if  (portName.getLocalPart().equals("CalculatorPort")) {
            return new javax.xml.rpc.Call[] {
                createCall(portName, "multiply", "multiply"),
                createCall(portName, "sum", "sum"),
            };
        }
        else {
            throw new javax.xml.rpc.ServiceException("WSWS3062E: Fehler: Das Argument \"portName\" darf nicht null sein.");
        }
    }
}
