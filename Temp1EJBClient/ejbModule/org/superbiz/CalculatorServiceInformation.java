/**
 * CalculatorServiceInformation.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf251234.07 v82812182731
 */

package org.superbiz;

public class CalculatorServiceInformation implements com.ibm.ws.webservices.multiprotocol.ServiceInformation {

    private static java.util.Map operationDescriptions;
    private static java.util.Map typeMappings;

    static {
         initOperationDescriptions();
         initTypeMappings();
    }

    private static void initOperationDescriptions() { 
        operationDescriptions = new java.util.HashMap();

        java.util.Map inner0 = new java.util.HashMap();

        java.util.List list0 = new java.util.ArrayList();
        inner0.put("multiply", list0);

        com.ibm.ws.webservices.engine.description.OperationDesc multiply0Op = _multiply0Op();
        list0.add(multiply0Op);

        java.util.List list1 = new java.util.ArrayList();
        inner0.put("sum", list1);

        com.ibm.ws.webservices.engine.description.OperationDesc sum1Op = _sum1Op();
        list1.add(sum1Op);

        operationDescriptions.put("CalculatorPort",inner0);
        operationDescriptions = java.util.Collections.unmodifiableMap(operationDescriptions);
    }

    private static com.ibm.ws.webservices.engine.description.OperationDesc _multiply0Op() {
        com.ibm.ws.webservices.engine.description.OperationDesc multiply0Op = null;
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
        multiply0Op = new com.ibm.ws.webservices.engine.description.OperationDesc("multiply", com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://superbiz.org/wsdl", "multiply"), _params0, _returnDesc0, _faults0, null);
        multiply0Op.setOption("portTypeQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://superbiz.org/wsdl", "CalculatorWs"));
        multiply0Op.setOption("inputName","multiply");
        multiply0Op.setOption("outputMessageQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://superbiz.org/wsdl", "multiplyResponse"));
        multiply0Op.setOption("ServiceQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://superbiz.org/wsdl", "CalculatorService"));
        multiply0Op.setOption("buildNum","cf251234.07");
        multiply0Op.setOption("ResponseNamespace","http://superbiz.org/wsdl");
        multiply0Op.setOption("targetNamespace","http://superbiz.org/wsdl");
        multiply0Op.setOption("outputName","multiplyResponse");
        multiply0Op.setOption("ResponseLocalPart","multiplyResponse");
        multiply0Op.setOption("inputMessageQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://superbiz.org/wsdl", "multiply"));
        multiply0Op.setStyle(com.ibm.ws.webservices.engine.enumtype.Style.WRAPPED);
        return multiply0Op;

    }

    private static com.ibm.ws.webservices.engine.description.OperationDesc _sum1Op() {
        com.ibm.ws.webservices.engine.description.OperationDesc sum1Op = null;
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
        sum1Op = new com.ibm.ws.webservices.engine.description.OperationDesc("sum", com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://superbiz.org/wsdl", "sum"), _params0, _returnDesc0, _faults0, null);
        sum1Op.setOption("portTypeQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://superbiz.org/wsdl", "CalculatorWs"));
        sum1Op.setOption("inputName","sum");
        sum1Op.setOption("outputMessageQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://superbiz.org/wsdl", "sumResponse"));
        sum1Op.setOption("ServiceQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://superbiz.org/wsdl", "CalculatorService"));
        sum1Op.setOption("buildNum","cf251234.07");
        sum1Op.setOption("ResponseNamespace","http://superbiz.org/wsdl");
        sum1Op.setOption("targetNamespace","http://superbiz.org/wsdl");
        sum1Op.setOption("outputName","sumResponse");
        sum1Op.setOption("ResponseLocalPart","sumResponse");
        sum1Op.setOption("inputMessageQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://superbiz.org/wsdl", "sum"));
        sum1Op.setStyle(com.ibm.ws.webservices.engine.enumtype.Style.WRAPPED);
        return sum1Op;

    }


    private static void initTypeMappings() {
        typeMappings = new java.util.HashMap();
        typeMappings = java.util.Collections.unmodifiableMap(typeMappings);
    }

    public java.util.Map getTypeMappings() {
        return typeMappings;
    }

    public Class getJavaType(javax.xml.namespace.QName xmlName) {
        return (Class) typeMappings.get(xmlName);
    }

    public java.util.Map getOperationDescriptions(String portName) {
        return (java.util.Map) operationDescriptions.get(portName);
    }

    public java.util.List getOperationDescriptions(String portName, String operationName) {
        java.util.Map map = (java.util.Map) operationDescriptions.get(portName);
        if (map != null) {
            return (java.util.List) map.get(operationName);
        }
        return null;
    }

}
