package com.openbanking.api.ng.controller;

import com.openbanking.api.ng.definition.OperationStatus;
import com.openbanking.api.ng.payload.GenericServiceResponse;
import com.openbanking.api.ng.payload.GenericServiceResponseBuilder;
import com.openbanking.api.ng.payload.investment.Investment;
import com.openbanking.api.ng.payload.investment.InvestmentBook;
import com.openbanking.api.ng.payload.investment.InvestmentProduct;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;

@RestController
@RequestMapping("/investment")
@Api(value = "/investment", description = "investment related operations", consumes = "application/json", tags = {"investment"})

public class InvestmentController extends BaseApiController{
    @RequestMapping(value = "/product", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getInvestmentProduct() {
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(Collections.singletonList(new InvestmentProduct()))
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/{accountId}", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getInvestment(@PathVariable @ApiParam(value = "The Customer's Unique Identifier or Account Number") String accountId) {
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(Collections.singletonList(new Investment()))
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public ResponseEntity<GenericServiceResponse> bookInvestment(@RequestBody InvestmentBook investmentBook) {
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage("Investment booked successfully")
                .build());
    }

}

