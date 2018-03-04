package com.openbanking.api.ng.controller;

import com.openbanking.api.ng.definition.OperationStatus;
import com.openbanking.api.ng.payload.directdebit.DirectDebit;
import com.openbanking.api.ng.payload.directdebit.DirectDebitCancelRequest;
import com.openbanking.api.ng.payload.directdebit.DirectDebitSetup;
import com.openbanking.api.ng.payload.directdebit.DirectDebitSetupOutput;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/dd")
@Api(value = "Direct Debit", description = "Direct Debit related operations", consumes = "application/json", tags = {"direct_debit"})

public class DirectDebitController {
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public List<DirectDebitSetupOutput> setupDirectDebit(@RequestBody DirectDebitSetup directDebitSetup) {
        return Collections.singletonList(new DirectDebitSetupOutput());
    }

    @RequestMapping(value = "/accountNumber/{accountNumber}/referenceNumber/{referenceNumber}", method = RequestMethod.GET)
    public List<DirectDebit> getDirectDebit(@PathVariable @ApiParam(value = "Reference Number") String referenceNumber,
                                            @PathVariable @ApiParam(value = "Account Number") String accountNumber) {
        return Collections.singletonList(new DirectDebit());
    }

    @RequestMapping(value = "/cancel", method = RequestMethod.GET)
    public OperationStatus cancelDirectDebit(@RequestBody DirectDebitCancelRequest directDebitCancelRequest) {
        return OperationStatus.SUCCESSFUL;
    }


}
