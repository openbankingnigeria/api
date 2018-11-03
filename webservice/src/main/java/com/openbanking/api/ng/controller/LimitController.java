package com.openbanking.api.ng.controller;

import com.openbanking.api.ng.definition.OperationStatus;
import com.openbanking.api.ng.payload.GenericServiceResponse;
import com.openbanking.api.ng.payload.GenericServiceResponseBuilder;
import com.openbanking.api.ng.payload.limit.Limit;
import com.openbanking.api.ng.payload.limit.LimitCustomer;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@RestController
@RequestMapping("/limit")
@Api(value = "/limit", description = "Limit related operations", consumes = "application/json", tags = {"limit"})
public class LimitController extends BaseApiController{

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getGlobalTransactionLimit() {
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(Collections.singletonList(new Limit()))
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/customer/{accountNumber}", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getCustomerTransactionLimit(@PathVariable @ApiParam(value = "The Customer's Account Number") String accountNumber) {
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(Collections.singletonList(new LimitCustomer()))
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

}
