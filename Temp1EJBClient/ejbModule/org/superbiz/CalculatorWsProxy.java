package org.superbiz;

public class CalculatorWsProxy implements org.superbiz.CalculatorWs {
  private boolean _useJNDI = true;
  private boolean _useJNDIOnly = false;
  private String _endpoint = null;
  private org.superbiz.CalculatorWs __calculatorWs = null;
  
  public CalculatorWsProxy() {
    _initCalculatorWsProxy();
  }
  
  private void _initCalculatorWsProxy() {
  
    if (_useJNDI || _useJNDIOnly) {
      try {
        javax.naming.InitialContext ctx = new javax.naming.InitialContext();
        __calculatorWs = ((org.superbiz.CalculatorService)ctx.lookup("java:comp/env/service/CalculatorService")).getCalculatorPort();
      }
      catch (javax.naming.NamingException namingException) {
        if ("true".equalsIgnoreCase(System.getProperty("DEBUG_PROXY"))) {
          System.out.println("JNDI lookup failure: javax.naming.NamingException: " + namingException.getMessage());
          namingException.printStackTrace(System.out);
        }
      }
      catch (javax.xml.rpc.ServiceException serviceException) {
        if ("true".equalsIgnoreCase(System.getProperty("DEBUG_PROXY"))) {
          System.out.println("Unable to obtain port: javax.xml.rpc.ServiceException: " + serviceException.getMessage());
          serviceException.printStackTrace(System.out);
        }
      }
    }
    if (__calculatorWs == null && !_useJNDIOnly) {
      try {
        __calculatorWs = (new org.superbiz.CalculatorServiceLocator()).getCalculatorPort();
        
      }
      catch (javax.xml.rpc.ServiceException serviceException) {
        if ("true".equalsIgnoreCase(System.getProperty("DEBUG_PROXY"))) {
          System.out.println("Unable to obtain port: javax.xml.rpc.ServiceException: " + serviceException.getMessage());
          serviceException.printStackTrace(System.out);
        }
      }
    }
    if (__calculatorWs != null) {
      if (_endpoint != null)
        ((javax.xml.rpc.Stub)__calculatorWs)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
      else
        _endpoint = (String)((javax.xml.rpc.Stub)__calculatorWs)._getProperty("javax.xml.rpc.service.endpoint.address");
    }
    
  }
  
  
  public void useJNDI(boolean useJNDI) {
    _useJNDI = useJNDI;
    __calculatorWs = null;
    
  }
  
  public void useJNDIOnly(boolean useJNDIOnly) {
    _useJNDIOnly = useJNDIOnly;
    __calculatorWs = null;
    
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (__calculatorWs == null)
      _initCalculatorWsProxy();
    if (__calculatorWs != null)
      ((javax.xml.rpc.Stub)__calculatorWs)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public int multiply(int arg0, int arg1) throws java.rmi.RemoteException{
    if (__calculatorWs == null)
      _initCalculatorWsProxy();
    return __calculatorWs.multiply(arg0, arg1);
  }
  
  public int sum(int arg0, int arg1) throws java.rmi.RemoteException{
    if (__calculatorWs == null)
      _initCalculatorWsProxy();
    return __calculatorWs.sum(arg0, arg1);
  }
  
  
  public org.superbiz.CalculatorWs getCalculatorWs() {
    if (__calculatorWs == null)
      _initCalculatorWsProxy();
    return __calculatorWs;
  }
  
}