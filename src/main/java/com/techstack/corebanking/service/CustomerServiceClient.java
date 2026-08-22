package com.techstack.corebanking.service;

import com.techstack.corebanking.dto.CustomerCreateRequest;
import com.techstack.corebanking.stub.CREATECUSTOMERFSFSREQ;
import com.techstack.corebanking.stub.CREATECUSTOMERFSFSRES;
import com.techstack.corebanking.stub.CustomerFullType;
import com.techstack.corebanking.stub.FCUBSHEADERType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

@Service
public class CustomerServiceClient {

	private static final Logger LOGGER =
			LoggerFactory.getLogger(CustomerServiceClient.class);

	@Value("${fcubs.customer-service-url}")
	private static String CUSTOMER_SERVICE_URL;

	private static final DateTimeFormatter DATE_FORMATTER =
			DateTimeFormatter.ofPattern("yyyy-MM-dd");

	private final WebServiceTemplate webServiceTemplate;

	public CustomerServiceClient(Jaxb2Marshaller marshaller) {
		this.webServiceTemplate = new WebServiceTemplate(marshaller);
	}

	public CREATECUSTOMERFSFSRES createCust(
			CustomerCreateRequest request,
			FCUBSHEADERType fcubsHeader) {

		CREATECUSTOMERFSFSREQ soapRequest =
				buildCustomerRequest(request, fcubsHeader);

		LOGGER.info(
				"Creating customer: {}",
				request.getFullname()
		);

		return (CREATECUSTOMERFSFSRES)
				webServiceTemplate.marshalSendAndReceive(
						CUSTOMER_SERVICE_URL,
						soapRequest
				);
	}

	private CREATECUSTOMERFSFSREQ buildCustomerRequest(
			CustomerCreateRequest request,
			FCUBSHEADERType fcubsHeader) {

		CREATECUSTOMERFSFSREQ soapRequest =
				new CREATECUSTOMERFSFSREQ();

		soapRequest.setFCUBSHEADER(fcubsHeader);

		CustomerFullType customer =
				buildCustomer(request);

		CREATECUSTOMERFSFSREQ.FCUBSBODY body =
				new CREATECUSTOMERFSFSREQ.FCUBSBODY();

		body.setCustomerFull(customer);

		soapRequest.setFCUBSBODY(body);

		return soapRequest;
	}

	private CustomerFullType buildCustomer(
			CustomerCreateRequest request) {

		CustomerFullType customer =
				new CustomerFullType();

		customer.setADDRLN1(request.getAddrln1());
		customer.setCOUNTRY(request.getCountry());
		customer.setCCATEG("INDV");
		customer.setFULLNAME(request.getFullname());
		customer.setMEDIA("MAIL");
		customer.setLOC(request.getLoc());
		customer.setSNAME(request.getSname());
		customer.setNLTY(request.getNlty());

		CustomerFullType.Custpersonal personal =
				new CustomerFullType.Custpersonal();

		personal.setDOB(parseDate(request.getBirthdate()));
		personal.setLANG("ENG");
		personal.setGENDR(request.getGendr());

		customer.setCustpersonal(personal);

		return customer;
	}

	private XMLGregorianCalendar parseDate(String birthdate) {

		if (birthdate == null || birthdate.isBlank()) {
			return null;
		}

		try {
			LocalDate date = LocalDate.parse(
					birthdate,
					DATE_FORMATTER
			);

			return DatatypeFactory.newInstance()
					.newXMLGregorianCalendar(
							date.toString()
					);

		} catch (DateTimeParseException e) {

			LOGGER.error(
					"Invalid birthdate format: {}. Expected yyyy-MM-dd",
					birthdate
			);

			throw new IllegalArgumentException(
					"Invalid birthdate. Expected format yyyy-MM-dd",
					e
			);

		} catch (Exception e) {

			LOGGER.error(
					"Unable to convert birthdate to XMLGregorianCalendar",
					e
			);

			throw new IllegalStateException(
					"Unable to process birthdate",
					e
			);
		}
	}
}