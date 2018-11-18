package ng.openbanking.api.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import ng.openbanking.api.payload.GenericServiceResponse;
import ng.openbanking.api.payload.GenericServiceResponseBuilder;
import ng.openbanking.api.payload.bank.exception.BankResourceNotFoundException;
import ng.openbanking.api.payload.bank.exception.ServiceOperationNotSupported;
import ng.openbanking.api.payload.bank.service.BankTransactionService;
import ng.openbanking.api.payload.customer.PocessingOperationResponse;
import ng.openbanking.api.payload.definition.OperationStatus;
import ng.openbanking.api.payload.transaction.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/transaction")
@Api(value = "/transaction", description = "Transaction related operations", consumes = "application/json", tags = {"transaction"})
public class TransactionController extends BaseApiController{

	@Autowired
	private BankTransactionService bankTransactionService;
	
	
    @RequestMapping(value = "/transfer/intra-bank", method = RequestMethod.POST)
    public ResponseEntity<GenericServiceResponse> singleTransferWithinBank(@RequestBody SingleTransferBank singleTransferBank) throws BankResourceNotFoundException, ServiceOperationNotSupported {
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
