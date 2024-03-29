package org.superbiz.calculator.ws;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class Calculator
 */

import javax.ejb.Stateless;
import javax.jws.WebService;

@Stateless
@WebService(
               portName = "CalculatorPort",
               serviceName = "CalculatorService",
               targetNamespace = "http://superbiz.org/wsdl",
               endpointInterface = "org.superbiz.calculator.ws.CalculatorWs")
public class Calculator implements CalculatorWs {

    public int sum(int add1, int add2) {
        return add1 + add2;
    }

    public int multiply(int mul1, int mul2) {
        return mul1 * mul2;
    }

}
