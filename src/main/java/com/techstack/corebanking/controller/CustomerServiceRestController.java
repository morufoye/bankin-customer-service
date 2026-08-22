package com.techstack.corebanking.controller;

import com.techstack.corebanking.dto.CustomerCreateRequest;
import com.techstack.corebanking.service.CustomerServiceClient;
import com.techstack.corebanking.stub.CREATECUSTOMERFSFSRES;
import com.techstack.corebanking.stub.FCUBSHEADERType;
import com.techstack.corebanking.util.RequestUtil;
import jakarta.validation.Valid;
import org.apache.commons.lang3.time.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
public class CustomerServiceRestController {

	@Autowired
	private CustomerServiceClient customerserviceclient ;

	@PostMapping("/api/v1/createcust")
	public CREATECUSTOMERFSFSRES CreateCustomer (@Valid @RequestBody CustomerCreateRequest customercreaterequest,
												 @RequestHeader Map<String, String> requestHeaders) {

		FCUBSHEADERType fcubsHeader =
				RequestUtil.getRequestURL(requestHeaders);
		CREATECUSTOMERFSFSRES responseMsg =  customerserviceclient.createCust(customercreaterequest, fcubsHeader);
		return responseMsg;
	}
}
