package com.openbanking.api.ng.controller;
import com.openbanking.api.ng.definition.OperationStatus;
import com.openbanking.api.ng.payload.directdebit.DirectDebitSetup;
import com.openbanking.api.ng.payload.directdebit.DirectDebitSetupOutput;
import com.openbanking.api.ng.payload.directdebit.GetDirectDebit;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/direct_debit")
@Api(value = "Direct Debit", description = "Direct Debit related operations", consumes = "application/json", tags = {"direct_debit"})

public class DirectDebitController {
    @RequestMapping(value = "/setupDirectDebit", method = RequestMethod.POST)
    public List<DirectDebitSetupOutput> setupDirectDebit(@RequestBody DirectDebitSetup directDebitSetup ){
        return Collections.singletonList(new DirectDebitSetupOutput());
    }
    @RequestMapping(value = "/getDirectDebit", method = RequestMethod.GET)
    public List<GetDirectDebit> getDirectDebit(@ApiParam(value = "Reference Number and Account Number") String referenceNumber, String accountNumber) {
        return Collections.singletonList(new GetDirectDebit());
    }
    @RequestMapping(value = "/cancelDirectDebit", method = RequestMethod.GET)
    public OperationStatus cancelDirectDebit(@ApiParam(value = "Reference ID and Cancelation Reason") String referenceId, String cancelationReason) {
        return OperationStatus.SUCCESSFUL;
    }


}
