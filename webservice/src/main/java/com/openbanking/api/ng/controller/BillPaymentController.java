package com.openbanking.api.ng.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.openbanking.api.ng.bank.exception.BankResourceNotFoundException;
import com.openbanking.api.ng.bank.exception.ServiceOperationNotSupported;
import com.openbanking.api.ng.bank.service.BillerInfoService;
import com.openbanking.api.ng.definition.OperationStatus;
import com.openbanking.api.ng.payload.GenericServiceResponse;
import com.openbanking.api.ng.payload.GenericServiceResponseBuilder;
import com.openbanking.api.ng.payload.billpayment.BillPaymentItem;
import com.openbanking.api.ng.payload.billpayment.Biller;
import com.openbanking.api.ng.payload.billpayment.BillerCategory;
import com.openbanking.api.ng.payload.billpayment.BillingSystem;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/billpayment")
@Api(value = "/billpayment", description = "billpayment", consumes = "application/json", tags = {"billpayment"})

public class BillPaymentController extends BaseApiController{
	
	@Autowired
	private BillerInfoService billerInfoService;
	
	
    @RequestMapping(value = "/systems", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getBillingSystem() throws ServiceOperationNotSupported{
    	List<BillingSystem> systems=billerInfoService.getBillingSystems();
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(systems)
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/billers/categories", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getBillerCategories() throws ServiceOperationNotSupported{
    	List<BillerCategory> categories=billerInfoService.getBillerCategories();
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(categories)
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/billers/category/{categoryId}", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getBillers(@PathVariable @ApiParam(value = "Category ID") String categoryId) throws BankResourceNotFoundException,ServiceOperationNotSupported{
    	List<Biller> billers=billerInfoService.getBillersByCategoryId(categoryId);
    	return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(billers)
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/biller/{billerId}/items", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getBillPaymentItem(@PathVariable @ApiParam(value = "Biller ID") String billerId) 
    		throws BankResourceNotFoundException,ServiceOperationNotSupported{
    	List<BillPaymentItem> bills=billerInfoService.getBillPaymentItemByBillerId(billerId);
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(bills)
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

}
