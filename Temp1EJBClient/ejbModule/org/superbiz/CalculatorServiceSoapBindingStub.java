/**
 * CalculatorServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf251234.07 v82812182731
 */

package org.superbiz;

public class CalculatorServiceSoapBindingStub extends com.ibm.ws.webservices.engine.client.Stub implements org.superbiz.CalculatorWs {
    public CalculatorServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws com.ibm.ws.webservices.engine.WebServicesFault {
        if (service == null) {
            super.service = new com.ibm.ws.webservices.engine.client.Service();
        }
        else {
            super.service = service;
        }
        super.engine = ((com.ibm.ws.webservices.engine.client.Service) super.service).getEngine();
        super.messageContexts = new com.ibm.ws.webservices.engine.MessageContext[2];
        java.lang.String theOption = (java.lang.String)super._getProperty("lastStubMapping");
        if (theOption == null || !theOption.equals("org.superbiz.CalculatorServiceSoapBinding")) {
                initTypeMapping();
                super._setProperty("lastStubMapping","org.superbiz.CalculatorServiceSoapBinding");
        }
        super.cachedEndpoint = endpointURL;
        super.connection = ((com.ibm.ws.webservices.engine.client.Service) super.service).getConnection(endpointURL);
    }

    private void initTypeMapping() {
        javax.xml.rpc.encoding.TypeMapping tm = super.getTypeMapping(com.ibm.ws.webservices.engine.Constants.URI_LITERAL_ENC);
        java.lang.Class javaType = null;
        javax.xml.namespace.QName xmlType = null;
        javax.xml.namespace.QName compQName = null;
        javax.xml.namespace.QName compTypeQName = null;
        com.ibm.ws.webservices.engine.encoding.SerializerFactory sf = null;
        com.ibm.ws.webservices.engine.encoding.DeserializerFactory df = null;
    }

    private static com.ibm.ws.webservices.engine.description.OperationDesc _multiplyOperation0 = null;
    private static com.ibm.ws.webservices.engine.description.OperationDesc _getmultiplyOperation0() {
        com.ibm.ws.webservices.engine.description.ParameterDesc[]  _params0 = new com.ibm.ws.webservices.engine.description.ParameterDesc[] {
         new com.ibm.ws.webservices.engine.description.ParameterDesc(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("", "arg0"), com.ibm.ws.webservices.engine.description.ParameterDesc.IN, com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false, false, false, true, false), 
         new com.ibm.ws.webservices.engine.description.ParameterDesc(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("", "arg1"), com.ibm.ws.webservices.engine.description.ParameterDesc.IN, com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false, false, false, true, false), 
          };
        _params0[0].setOption("inputPosition","0");
        _params0[0].setOption("partQNameString","{http://www.w3.org/2001/XMLSchema}int");
        _params0[0].setOption("partName","int");
        _params0[1].setOption("inputPosition","1");
        _params0[1].setOption("partQNameString","{http://www.w3.org/2001/XMLSchema}int");
        _params0[1].setOption("partName","int");
        com.ibm.ws.webservices.engine.description.ParameterDesc  _returnDesc0 = new com.ibm.ws.webservices.engine.description.ParameterDesc(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("", "return"), com.ibm.ws.webservices.engine.description.ParameterDesc.OUT, com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "int"), int.class, true, false, false, false, true, false); 
        _returnDesc0.setOption("outputPosition","0");
        _returnDesc0.setOption("partQNameString","{http://www.w3.org/2001/XMLSchema}int");
        _returnDesc0.setOption("partName","int");
        com.ibm.ws.webservices.engine.description.FaultDesc[]  _faults0 = new com.ibm.ws.webservices.engine.description.FaultDesc[] {
          };
        _multiplyOperation0 = new com.ibm.ws.webservices.engine.description.OperationDesc("multiply", com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://superbiz.org/wsdl", "multiply"), _params0, _returnDesc0, _faults0, "");
        _multiplyOperation0.setOption("portTypeQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://superbiz.org/wsdl", "CalculatorWs"));
        _multiplyOperation0.setOption("inputName","multiply");
        _multiplyOperation0.setOption("outputMessageQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://superbiz.org/wsdl", "multiplyResponse"));
        _multiplyOperation0.setOption("ServiceQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://superbiz.org/wsdl", "CalculatorService"));
        _multiplyOperation0.setOption("buildNum","cf251234.07");
        _multiplyOperation0.setOption("ResponseNamespace","http://superbiz.org/wsdl");
        _multiplyOperation0.setOption("targetNamespace","http://superbiz.org/wsdl");
        _multiplyOperation0.setOption("outputName","multiplyResponse");
        _multiplyOperation0.setOption("ResponseLocalPart","multiplyResponse");
        _multiplyOperation0.setOption("inputMessageQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://superbiz.org/wsdl", "multiply"));
        _multiplyOperation0.setUse(com.ibm.ws.webservices.engine.enumtype.Use.LITERAL);
        _multiplyOperation0.setStyle(com.ibm.ws.webservices.engine.enumtype.Style.WRAPPED);
        return _multiplyOperation0;

    }

    private int _multiplyIndex0 = 0;
    private synchronized com.ibm.ws.webservices.engine.client.Stub.Invoke _getmultiplyInvoke0(Object[] parameters) throws com.ibm.ws.webservices.engine.WebServicesFault  {
        com.ibm.ws.webservices.engine.MessageContext mc = super.messageContexts[_multiplyIndex0];
        if (mc == null) {
            mc = new com.ibm.ws.webservices.engine.MessageContext(super.engine);
            mc.setOperation(CalculatorServiceSoapBindingStub._multiplyOperation0);
            mc.setUseSOAPAction(true);
            mc.setSOAPActionURI("");
            mc.setEncodingStyle(com.ibm.ws.webservices.engine.Constants.URI_LITERAL_ENC);
            mc.setProperty(com.ibm.wsspi.webservices.Constants.SEND_TYPE_ATTR_PROPERTY, Boolean.FALSE);
            mc.setProperty(com.ibm.wsspi.webservices.Constants.ENGINE_DO_MULTI_REFS_PROPERTY, Boolean.FALSE);
            super.primeMessageContext(mc);
            super.messageContexts[_multiplyIndex0] = mc;
        }
        try {
            mc = (com.ibm.ws.webservices.engine.MessageContext) mc.clone();
        }
        catch (CloneNotSupportedException cnse) {
            throw com.ibm.ws.webservices.engine.WebServicesFault.makeFault(cnse);
        }
        return new com.ibm.ws.webservices.engine.client.Stub.Invoke(connection, mc, parameters);
    }

    public int multiply(int arg0, int arg1) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new com.ibm.ws.webservices.engine.NoEndPointException();
        }
        java.util.Vector _resp = null;
        try {
            _resp = _getmultiplyInvoke0(new java.lang.Object[] {new java.lang.Integer(arg0), new java.lang.Integer(arg1)}).invoke();

        } catch (com.ibm.ws.webservices.engine.WebServicesFault wsf) {
            Exception e = wsf.getUserException();
            throw wsf;
        } 
        try {
            return ((java.lang.Integer) ((com.ibm.ws.webservices.engine.xmlsoap.ext.ParamValue) _resp.get(0)).getValue()).intValue();
        } catch (java.lang.Exception _exception) {
            return ((java.lang.Integer) super.convert(((com.ibm.ws.webservices.engine.xmlsoap.ext.ParamValue) _resp.get(0)).getValue(), int.class)).intValue();
        }
    }

    private static com.ibm.ws.webservices.engine.description.OperationDesc _sumOperation1 = null;
    private static com.ibm.ws.webservices.engine.description.OperationDesc _getsumOperation1() {
        com.ibm.ws.webservices.engine.description.ParameterDesc[]  _params1 = new com.ibm.ws.webservices.engine.description.ParameterDesc[] {
         new com.ibm.ws.webservices.engine.description.ParameterDesc(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("", "arg0"), com.ibm.ws.webservices.engine.description.ParameterDesc.IN, com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false, false, false, true, false), 
         new com.ibm.ws.webservices.engine.description.ParameterDesc(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("", "arg1"), com.ibm.ws.webservices.engine.description.ParameterDesc.IN, com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false, false, false, true, false), 
          };
        _params1[0].setOption("inputPosition","0");
        _params1[0].setOption("partQNameString","{http://www.w3.org/2001/XMLSchema}int");
        _params1[0].setOption("partName","int");
        _params1[1].setOption("inputPosition","1");
        _params1[1].setOption("partQNameString","{http://www.w3.org/2001/XMLSchema}int");
        _params1[1].setOption("partName","int");
        com.ibm.ws.webservices.engine.description.ParameterDesc  _returnDesc1 = new com.ibm.ws.webservices.engine.description.ParameterDesc(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("", "return"), com.ibm.ws.webservices.engine.description.ParameterDesc.OUT, com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "int"), int.class, true, false, false, false, true, false); 
        _returnDesc1.setOption("outputPosition","0");
        _returnDesc1.setOption("partQNameString","{http://www.w3.org/2001/XMLSchema}int");
        _returnDesc1.setOption("partName","int");
        com.ibm.ws.webservices.engine.description.FaultDesc[]  _faults1 = new com.ibm.ws.webservices.engine.description.FaultDesc[] {
          };
        _sumOperation1 = new com.ibm.ws.webservices.engine.description.OperationDesc("sum", com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://superbiz.org/wsdl", "sum"), _params1, _returnDesc1, _faults1, "");
        _sumOperation1.setOption("portTypeQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://superbiz.org/wsdl", "CalculatorWs"));
        _sumOperation1.setOption("inputName","sum");
        _sumOperation1.setOption("outputMessageQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://superbiz.org/wsdl", "sumResponse"));
        _sumOperation1.setOption("ServiceQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://superbiz.org/wsdl", "CalculatorService"));
        _sumOperation1.setOption("buildNum","cf251234.07");
        _sumOperation1.setOption("ResponseNamespace","http://superbiz.org/wsdl");
        _sumOperation1.setOption("targetNamespace","http://superbiz.org/wsdl");
        _sumOperation1.setOption("outputName","sumResponse");
        _sumOperation1.setOption("ResponseLocalPart","sumResponse");
        _sumOperation1.setOption("inputMessageQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://superbiz.org/wsdl", "sum"));
        _sumOperation1.setUse(com.ibm.ws.webservices.engine.enumtype.Use.LITERAL);
        _sumOperation1.setStyle(com.ibm.ws.webservices.engine.enumtype.Style.WRAPPED);
        return _sumOperation1;

    }

    private int _sumIndex1 = 1;
    private synchronized com.ibm.ws.webservices.engine.client.Stub.Invoke _getsumInvoke1(Object[] parameters) throws com.ibm.ws.webservices.engine.WebServicesFault  {
        com.ibm.ws.webservices.engine.MessageContext mc = super.messageContexts[_sumIndex1];
        if (mc == null) {
            mc = new com.ibm.ws.webservices.engine.MessageContext(super.engine);
            mc.setOperation(CalculatorServiceSoapBindingStub._sumOperation1);
            mc.setUseSOAPAction(true);
            mc.setSOAPActionURI("");
            mc.setEncodingStyle(com.ibm.ws.webservices.engine.Constants.URI_LITERAL_ENC);
            mc.setProperty(com.ibm.wsspi.webservices.Constants.SEND_TYPE_ATTR_PROPERTY, Boolean.FALSE);
            mc.setProperty(com.ibm.wsspi.webservices.Constants.ENGINE_DO_MULTI_REFS_PROPERTY, Boolean.FALSE);
            super.primeMessageContext(mc);
            super.messageContexts[_sumIndex1] = mc;
        }
        try {
            mc = (com.ibm.ws.webservices.engine.MessageContext) mc.clone();
        }
        catch (CloneNotSupportedException cnse) {
            throw com.ibm.ws.webservices.engine.WebServicesFault.makeFault(cnse);
        }
        return new com.ibm.ws.webservices.engine.client.Stub.Invoke(connection, mc, parameters);
    }

    public int sum(int arg0, int arg1) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new com.ibm.ws.webservices.engine.NoEndPointException();
        }
        java.util.Vector _resp = null;
        try {
            _resp = _getsumInvoke1(new java.lang.Object[] {new java.lang.Integer(arg0), new java.lang.Integer(arg1)}).invoke();

        } catch (com.ibm.ws.webservices.engine.WebServicesFault wsf) {
            Exception e = wsf.getUserException();
            throw wsf;
        } 
        try {
            return ((java.lang.Integer) ((com.ibm.ws.webservices.engine.xmlsoap.ext.ParamValue) _resp.get(0)).getValue()).intValue();
        } catch (java.lang.Exception _exception) {
            return ((java.lang.Integer) super.convert(((com.ibm.ws.webservices.engine.xmlsoap.ext.ParamValue) _resp.get(0)).getValue(), int.class)).intValue();
        }
    }

    private static void _staticInit() {
        _sumOperation1 = _getsumOperation1();
        _multiplyOperation0 = _getmultiplyOperation0();
    }

    static {
       _staticInit();
    }
}
