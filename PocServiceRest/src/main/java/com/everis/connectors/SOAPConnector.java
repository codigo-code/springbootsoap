package com.everis.connectors;

import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPException;

import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.saaj.SaajSoapMessageFactory;

public class SOAPConnector extends WebServiceGatewaySupport {

	public Object callWebService(String url, Object request) {

		try {
			SaajSoapMessageFactory messageFactory;
			messageFactory = new SaajSoapMessageFactory(MessageFactory.newInstance());

			WebServiceTemplate webServiceTemplate = new WebServiceTemplate(messageFactory);
			messageFactory.afterPropertiesSet();
			Jaxb2Marshaller marshaller = new Jaxb2Marshaller();

			marshaller.setContextPath("com.everis.model");
			marshaller.afterPropertiesSet();

			webServiceTemplate.setMarshaller(marshaller);
			webServiceTemplate.setUnmarshaller(marshaller);

			return webServiceTemplate.marshalSendAndReceive(url, request);

		} catch (SOAPException e) {
			// TODO Auto-generated catch block
			System.out.println("ROMPIO SOAPException: " + e.getMessage());
			e.printStackTrace();
			return e.getMessage();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("ROMPIO Exception e: " + e.getMessage());
			return e.getMessage();
		}
	}

}
