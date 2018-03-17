package com.openbanking.api.ng.controller;

import com.openbanking.api.ng.definition.OperationStatus;
import com.openbanking.api.ng.payload.GenericServiceResponse;
import com.openbanking.api.ng.payload.GenericServiceResponseBuilder;
import com.openbanking.api.ng.payload.directdebit.DirectDebit;
import com.openbanking.api.ng.payload.directdebit.DirectDebitCancelRequest;
import com.openbanking.api.ng.payload.directdebit.DirectDebitSetup;
import com.openbanking.api.ng.payload.directdebit.DirectDebitSetupOutput;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;

@RestController
@RequestMapping("/dd")
@Api(value = "Direct Debit", description = "Direct Debit related operations", consumes = "application/json", tags = {"direct_debit"})

public class DirectDebitController {
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ResponseEntity<GenericServiceResponse> setupDirectDebit(@RequestBody DirectDebitSetup directDebitSetup) {
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(Collections.singletonList(new DirectDebitSetupOutput()))
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/accountNumber/{accountNumber}/referenceNumber/{referenceNumber}", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getDirectDebit(@PathVariable @ApiParam(value = "Reference Number") String referenceNumber,
                                                                 @PathVariable @ApiParam(value = "Account Number") String accountNumber) {
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(new DirectDebit())
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/cancel", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> cancelDirectDebit(@RequestBody DirectDebitCancelRequest directDebitCancelRequest) {
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage("Direct Debit cancelled successfully")
                .build());
    }

}
