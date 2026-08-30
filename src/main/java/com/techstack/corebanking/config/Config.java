package com.techstack.corebanking.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import io.swagger.v3.oas.models.Operation;
import io.swagger.v3.oas.models.media.StringSchema;
import io.swagger.v3.oas.models.parameters.Parameter;
import org.springdoc.core.customizers.GlobalOperationCustomizer;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.web.method.HandlerMethod;

@Configuration
public class Config {

	@Value("${fcubs.customer-service-url}")
	private static String CUSTOMER_SERVICE_URL;

	 @Bean
	  public Jaxb2Marshaller marshaller() {
	    Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
	   // marshaller.setContextPath("com.techstack.corebanking.stub");
	    marshaller.setPackagesToScan("com.techstack.corebanking.stub");
	    return marshaller;
	  }
	 
	  @Bean
	  public SOAPConnector soapConnector(Jaxb2Marshaller marshaller) {
	    SOAPConnector client = new SOAPConnector();
	    client.setDefaultUri(CUSTOMER_SERVICE_URL);
	    client.setMarshaller(marshaller);
	    client.setUnmarshaller(marshaller);
	    return client;
	  }

	//@Bean
	public GlobalOperationCustomizer fcubsHeaders() {

		return (operation, handlerMethod) -> {

			addHeader(operation, "OPERATION", true, null);
			addHeader(operation, "SOURCE", false, "FCUBS");
			addHeader(operation, "UBSCOMP", false, "FCUBS");
			addHeader(operation, "MSGID", false, "3211411");
			addHeader(operation, "CORRELID", false, "null");
			addHeader(operation, "USERID", false, "TAKEON02");
			addHeader(operation, "MODULEID", false, "");
			addHeader(operation, "SERVICE", false, "FCUBSCustomerService");
			addHeader(operation, "BRANCH", false, "100");

			return operation;
		};
	}

	private void addHeader(
			Operation operation,
			String name,
			boolean required,
			String defaultValue) {

		Parameter parameter = new Parameter()
				.in("header")
				.name(name)
				.required(required)
				.schema(new StringSchema());

		if (defaultValue != null) {
			parameter.getSchema().setDefault(defaultValue);
		}

		operation.addParametersItem(parameter);
	}
}
