package com.openbanking.api.ng.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.openbanking.api.ng.bank.exception.BankResourceNotFoundException;
import com.openbanking.api.ng.bank.exception.ServiceOperationNotSupported;
import com.openbanking.api.ng.bank.service.CustomerInfoService;
import com.openbanking.api.ng.definition.OperationStatus;
import com.openbanking.api.ng.payload.GenericServiceResponse;
import com.openbanking.api.ng.payload.GenericServiceResponseBuilder;
import com.openbanking.api.ng.payload.customer.Customer;
import com.openbanking.api.ng.payload.customer.CustomerUpdateRequest;
import com.openbanking.api.ng.payload.customer.PocessingOperationResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/customer")
@Api(value = "/customer", description = "Customer related operations", consumes = "application/json", tags = {"customer"})
public class CustomerController extends BaseApiController {

	@Autowired
	private CustomerInfoService customerInfoService;
	
    @ApiOperation(value = "Finds a Customer by Customer ID",
            notes = "The Customer ID is the unique identifier for a customer as defined by a Bank",
            response = Customer.class)
    @ApiResponses(value = {@ApiResponse(code = 400, message = "Invalid Customer ID supplied"),
            @ApiResponse(code = 404, message = "Customer not found")})
    @RequestMapping(value = "/{customerId}", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getByCustomerId(@PathVariable @ApiParam(value = "The Customer's unique identifier", name = "customerId") String customerId) throws BankResourceNotFoundException,ServiceOperationNotSupported{
    	Customer data=customerInfoService.getByCustomerId(customerId);
    	return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(data)
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/phone/{phoneNumber}", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getByPhoneNumber(@PathVariable @ApiParam(value = "The Customer's Phone Number ex: +234") String phoneNumber) throws BankResourceNotFoundException,ServiceOperationNotSupported{
    	Customer data=customerInfoService.getByPhoneNumber(phoneNumber);
    	return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(data)
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/email/{email}", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getByEmail(@PathVariable @ApiParam(value = "The Customer's Email Address") String email) throws BankResourceNotFoundException,ServiceOperationNotSupported{
    	Customer data=customerInfoService.getByEmail(email);
    	return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(data)
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/bvn/{bvn}", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getByBVN(@PathVariable @ApiParam(value = "The Customer's Bank Verification Number") String bvn) throws BankResourceNotFoundException,ServiceOperationNotSupported{
    	Customer data=customerInfoService.getByBVN(bvn);
    	return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(data)
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ResponseEntity<GenericServiceResponse> updateCustomerInformation(@PathVariable @RequestBody CustomerUpdateRequest customerUpdateRequest) throws BankResourceNotFoundException,ServiceOperationNotSupported{
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage("Information updated successfully")
                .build());
    }

    @RequestMapping(value = "/block/{customerId}", method = RequestMethod.POST)
    public ResponseEntity<GenericServiceResponse> block(@PathVariable @ApiParam(value = "The Customer's unique identifier", name = "customerId") String customerId) throws BankResourceNotFoundException,ServiceOperationNotSupported{
    	PocessingOperationResponse data=customerInfoService.block(customerId);
    	return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(data)
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

}
