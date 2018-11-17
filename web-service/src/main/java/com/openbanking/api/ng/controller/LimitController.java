package com.openbanking.api.ng.controller;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.openbanking.api.ng.bank.exception.BankResourceNotFoundException;
import com.openbanking.api.ng.bank.exception.ServiceOperationNotSupported;
import com.openbanking.api.ng.bank.service.BankAccountService;
import com.openbanking.api.ng.definition.OperationStatus;
import com.openbanking.api.ng.payload.GenericServiceResponse;
import com.openbanking.api.ng.payload.GenericServiceResponseBuilder;
import com.openbanking.api.ng.payload.limit.Limit;
import com.openbanking.api.ng.payload.limit.LimitCustomer;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/limit")
@Api(value = "/limit", description = "Limit related operations", consumes = "application/json", tags = {"limit"})
public class LimitController extends BaseApiController{

	@Autowired
	BankAccountService bankAccountService;
	
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getGlobalTransactionLimit() throws ServiceOperationNotSupported  {
    	Limit limit=bankAccountService.getGlobalTransactionLimit();
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(Collections.singletonList(limit))
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/customer/{accountNumber}", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getCustomerTransactionLimit(@PathVariable @ApiParam(value = "The Customer's Account Number") String accountNumber) throws BankResourceNotFoundException,ServiceOperationNotSupported  {
    	LimitCustomer limit=bankAccountService.getCustomerTransactionLimit(accountNumber);
    	return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(Collections.singletonList(limit))
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

}
