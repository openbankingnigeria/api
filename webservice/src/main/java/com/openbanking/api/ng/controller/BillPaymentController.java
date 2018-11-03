package com.openbanking.api.ng.controller;

import com.openbanking.api.ng.definition.OperationStatus;
import com.openbanking.api.ng.payload.GenericServiceResponse;
import com.openbanking.api.ng.payload.GenericServiceResponseBuilder;
import com.openbanking.api.ng.payload.billpayment.BillPaymentItem;
import com.openbanking.api.ng.payload.billpayment.Biller;
import com.openbanking.api.ng.payload.billpayment.BillerCategory;
import com.openbanking.api.ng.payload.billpayment.BillingSystem;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@RestController
@RequestMapping("/billpayment")
@Api(value = "/billpayment", description = "billpayment", consumes = "application/json", tags = {"billpayment"})

public class BillPaymentController extends BaseApiController{
    @RequestMapping(value = "/systems", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getBillingSystem() {
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(Collections.singletonList(new BillingSystem()))
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/billers/categories", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getBillerCategories() {
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(Collections.singletonList(new BillerCategory()))
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/billers/category/{categoryId}", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getBillers(@PathVariable @ApiParam(value = "Category ID") String categoryId) {
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(Collections.singletonList(new Biller()))
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/biller/{billerId}/items", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getBillPaymentItem(@PathVariable @ApiParam(value = "Biller ID") String billerId) {
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(Collections.singletonList(new BillPaymentItem()))
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

}
