package com.openbanking.api.ng.controller;

import java.util.Collections;
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
import com.openbanking.api.ng.bank.service.BankTransactionService;
import com.openbanking.api.ng.definition.OperationStatus;
import com.openbanking.api.ng.payload.GenericServiceResponse;
import com.openbanking.api.ng.payload.GenericServiceResponseBuilder;
import com.openbanking.api.ng.payload.customer.PocessingOperationResponse;
import com.openbanking.api.ng.payload.transaction.GetStatement;
import com.openbanking.api.ng.payload.transaction.GetStatementOutput;
import com.openbanking.api.ng.payload.transaction.MultipleTransfer;
import com.openbanking.api.ng.payload.transaction.MultipleTransferBank;
import com.openbanking.api.ng.payload.transaction.MultipleTransferBankOutput;
import com.openbanking.api.ng.payload.transaction.PlaceHold;
import com.openbanking.api.ng.payload.transaction.SingleTransfer;
import com.openbanking.api.ng.payload.transaction.SingleTransferBank;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/transaction")
@Api(value = "/transaction", description = "Transaction related operations", consumes = "application/json", tags = {"transaction"})
public class TransactionController extends BaseApiController{

	@Autowired
	private BankTransactionService bankTransactionService;
	
	
    @RequestMapping(value = "/transfer/intra-bank", method = RequestMethod.POST)
    public ResponseEntity<GenericServiceResponse> singleTransferWithinBank(@RequestBody SingleTransferBank singleTransferBank) throws BankResourceNotFoundException,ServiceOperationNotSupported{
    	PocessingOperationResponse processResponse=bankTransactionService.singleTransferWithinBank(singleTransferBank);
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(processResponse)
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/transfer/inter-bank", method = RequestMethod.POST)
    public ResponseEntity<GenericServiceResponse> singleTransferOtherBank(@RequestBody SingleTransferBank singleTransferBank) throws BankResourceNotFoundException,ServiceOperationNotSupported{
    	PocessingOperationResponse processResponse=bankTransactionService.singleTransferOtherBank(singleTransferBank);
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(processResponse)
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/transfer/email/{email}", method = RequestMethod.POST)
    public ResponseEntity<GenericServiceResponse> singleTransferToEmail(@PathVariable String email, @RequestBody SingleTransfer singleTransfer) throws BankResourceNotFoundException,ServiceOperationNotSupported{
    	PocessingOperationResponse processResponse=bankTransactionService.singleTransferToEmail(email,singleTransfer);
    	return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(processResponse)
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/transfer/phone/{phone}", method = RequestMethod.POST)
    public ResponseEntity<GenericServiceResponse> singleTransferToPhone(@PathVariable String phone, @RequestBody SingleTransfer singleTransfer) throws BankResourceNotFoundException,ServiceOperationNotSupported{
    	PocessingOperationResponse processResponse=bankTransactionService.singleTransferToPhone(phone,singleTransfer);
    	return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(processResponse)
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/transfers/inter-bank", method = RequestMethod.POST)
    public ResponseEntity<GenericServiceResponse> multipleTransferWithinBank(@RequestBody MultipleTransferBank multipleTransferBank) throws BankResourceNotFoundException,ServiceOperationNotSupported{
    	PocessingOperationResponse processResponse=bankTransactionService.multipleTransferWithinBank(multipleTransferBank);
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(Collections.singletonList(new MultipleTransferBankOutput()))
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/transfers/intra-bank", method = RequestMethod.POST)
    public ResponseEntity<GenericServiceResponse> multipleTransferOtherBank(@RequestBody MultipleTransferBank multipleTransferBank) throws BankResourceNotFoundException,ServiceOperationNotSupported{
    	PocessingOperationResponse processResponse=bankTransactionService.multipleTransferOtherBank(multipleTransferBank);
    	return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(Collections.singletonList(new MultipleTransferBankOutput()))
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/transfer/emails", method = RequestMethod.POST)
    public ResponseEntity<GenericServiceResponse> multipleTransferToPhone(@RequestBody MultipleTransfer multipleTransfer) throws BankResourceNotFoundException,ServiceOperationNotSupported{
    	PocessingOperationResponse processResponse=bankTransactionService.multipleTransferToPhone(multipleTransfer);
    	return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(Collections.singletonList(new MultipleTransferBankOutput()))
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/multipleTransferToEmail", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> multipleTransferToEmail(@RequestBody MultipleTransfer multipleTransfer) throws BankResourceNotFoundException,ServiceOperationNotSupported{
    	PocessingOperationResponse processResponse=bankTransactionService.multipleTransferToEmail(multipleTransfer);
    	return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(Collections.singletonList(new MultipleTransferBankOutput()))
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/hold/place", method = RequestMethod.POST)
    public ResponseEntity<GenericServiceResponse> placeHold(@RequestBody PlaceHold placeHold) throws BankResourceNotFoundException,ServiceOperationNotSupported{
    	PocessingOperationResponse processResponse=bankTransactionService.placeHold(placeHold);
    	return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(processResponse)
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/hold", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getHold(@ApiParam(value = "Account Number and Hold Reference ID") String accountNumber, String holdReferenceId) throws BankResourceNotFoundException,ServiceOperationNotSupported{
    	PocessingOperationResponse processResponse=bankTransactionService.getHold(accountNumber,holdReferenceId);
    	return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(processResponse)
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/hold", method = RequestMethod.POST)
    public ResponseEntity<GenericServiceResponse> removeHold(@ApiParam(value = "Account Number and Reference ID") String accountNumber, String holdReferenceId) throws BankResourceNotFoundException,ServiceOperationNotSupported{
    	PocessingOperationResponse processResponse=bankTransactionService.removeHold(accountNumber,holdReferenceId);
    	return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(processResponse)
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/pnd/place", method = RequestMethod.POST)
    public ResponseEntity<GenericServiceResponse> placePnd(@ApiParam(value = "Account Number, Reference ID, Amount and Reason") String accountNumber, String pndReferenceId, String amount, String reason) throws BankResourceNotFoundException,ServiceOperationNotSupported{
    	PocessingOperationResponse processResponse=bankTransactionService.placePnd(accountNumber,pndReferenceId,amount,reason);
    	return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(processResponse)
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/statement", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getStatement(@RequestBody GetStatement getStatement) throws BankResourceNotFoundException,ServiceOperationNotSupported{
    	List<GetStatementOutput> statement=bankTransactionService.getStatement(getStatement);
    	return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(statement)
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

}
