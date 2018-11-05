package com.openbanking.api.ng.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.openbanking.api.ng.bank.exception.BankResourceNotFoundException;
import com.openbanking.api.ng.bank.exception.ServiceOperationNotSupported;
import com.openbanking.api.ng.bank.service.InvestmentInfoService;
import com.openbanking.api.ng.definition.OperationStatus;
import com.openbanking.api.ng.payload.GenericServiceResponse;
import com.openbanking.api.ng.payload.GenericServiceResponseBuilder;
import com.openbanking.api.ng.payload.customer.PocessingOperationResponse;
import com.openbanking.api.ng.payload.investment.InvestmentBook;
import com.openbanking.api.ng.payload.investment.InvestmentProduct;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/investment")
@Api(value = "/investment", description = "investment related operations", consumes = "application/json", tags = {"investment"})

public class InvestmentController extends BaseApiController{
	
	@Autowired
	private InvestmentInfoService investmentInfoService;
	
    @RequestMapping(value = "/product", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getInvestmentProduct()   throws BankResourceNotFoundException,ServiceOperationNotSupported  {
    	List<InvestmentProduct> data=investmentInfoService.getInvestmentProduct();
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(data)
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/{accountId}", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getInvestment(@PathVariable @ApiParam(value = "The Customer's Unique Identifier or Account Number") String accountId) throws BankResourceNotFoundException, ServiceOperationNotSupported {
    	List<InvestmentProduct> data=investmentInfoService.getInvestmentByAccountId(accountId);
    	return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(data)
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public ResponseEntity<GenericServiceResponse> bookInvestment(@RequestBody InvestmentBook investmentBook) throws ServiceOperationNotSupported {
    	PocessingOperationResponse data=investmentInfoService.bookInvestment(investmentBook);
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage("Investment booked successfully")
                .build());
    }

}

