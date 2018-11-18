package ng.openbanking.api.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import ng.openbanking.api.payload.GenericServiceResponse;
import ng.openbanking.api.payload.GenericServiceResponseBuilder;
import ng.openbanking.api.payload.bank.exception.BankResourceNotFoundException;
import ng.openbanking.api.payload.bank.exception.ServiceOperationNotSupported;
import ng.openbanking.api.payload.bank.service.BankAccountService;
import ng.openbanking.api.payload.customer.PocessingOperationResponse;
import ng.openbanking.api.payload.definition.OperationStatus;
import ng.openbanking.api.payload.directdebit.DirectDebit;
import ng.openbanking.api.payload.directdebit.DirectDebitCancelRequest;
import ng.openbanking.api.payload.directdebit.DirectDebitSetup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;

@RestController
@RequestMapping("/dd")
@Api(value = "Direct Debit", description = "Direct Debit related operations", consumes = "application/json", tags = {"direct_debit"})

public class DirectDebitController extends BaseApiController{
	
	@Autowired
	private BankAccountService bankAccountService;
	
	
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ResponseEntity<GenericServiceResponse> setupDirectDebit(@RequestBody DirectDebitSetup directDebitSetup) throws BankResourceNotFoundException, ServiceOperationNotSupported {
    	PocessingOperationResponse pResponse=bankAccountService.setupDirectDebit(directDebitSetup);
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(Collections.singletonList(pResponse))
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/accountNumber/{accountNumber}/referenceNumber/{referenceNumber}", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getDirectDebit(@PathVariable @ApiParam(value = "Reference Number") String referenceNumber,
                                                                 @PathVariable @ApiParam(value = "Account Number") String accountNumber) throws BankResourceNotFoundException, ServiceOperationNotSupported {
    	DirectDebit pResponse=bankAccountService.getDirectDebit(accountNumber,referenceNumber);
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(new DirectDebit())
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/cancel", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> cancelDirectDebit(@RequestBody DirectDebitCancelRequest directDebitCancelRequest) throws BankResourceNotFoundException, ServiceOperationNotSupported {
    	PocessingOperationResponse pResponse=bankAccountService.cancelDirectDebit(directDebitCancelRequest);
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(pResponse)
        		.withStatus(OperationStatus.SUCCESSFUL)
                .withMessage("Direct Debit cancelled successfully")
                .build());
    }

}
