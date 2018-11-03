package com.openbanking.api.ng.controller;

import com.openbanking.api.ng.definition.OperationStatus;
import com.openbanking.api.ng.payload.GenericServiceResponse;
import com.openbanking.api.ng.payload.GenericServiceResponseBuilder;
import com.openbanking.api.ng.payload.transaction.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;

@RestController
@RequestMapping("/transaction")
@Api(value = "/transaction", description = "Transaction related operations", consumes = "application/json", tags = {"transaction"})
public class TransactionController extends BaseApiController{

    @RequestMapping(value = "/transfer/intra-bank", method = RequestMethod.POST)
    public ResponseEntity<GenericServiceResponse> singleTransferWithinBank(@RequestBody SingleTransferBank singleTransferBank) {
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(Collections.singletonList(new SingleTransferBankOutput()))
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/transfer/inter-bank", method = RequestMethod.POST)
    public ResponseEntity<GenericServiceResponse> singleTransferOtherBank(@RequestBody SingleTransferBank singleTransferBank) {
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(Collections.singletonList(new SingleTransferBankOutput()))
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/transfer/email/{email}", method = RequestMethod.POST)
    public ResponseEntity<GenericServiceResponse> singleTransferToEmail(@PathVariable String email, @RequestBody SingleTransfer singleTransfer) {
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(Collections.singletonList(new SingleTransferBankOutput()))
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/transfer/phone/{phone}", method = RequestMethod.POST)
    public ResponseEntity<GenericServiceResponse> singleTransferToPhone(@PathVariable String phone, @RequestBody SingleTransfer singleTransfer) {
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(Collections.singletonList(new SingleTransferBankOutput()))
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/transfers/inter-bank", method = RequestMethod.POST)
    public ResponseEntity<GenericServiceResponse> multipleTransferWithinBank(@RequestBody MultipleTransferBank multipleTransferBank) {
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(Collections.singletonList(new MultipleTransferBankOutput()))
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/transfers/intra-bank", method = RequestMethod.POST)
    public ResponseEntity<GenericServiceResponse> multipleTransferOtherBank(@RequestBody MultipleTransferBank multipleTransferBank) {
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(Collections.singletonList(new MultipleTransferBankOutput()))
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/transfer/emails", method = RequestMethod.POST)
    public ResponseEntity<GenericServiceResponse> multipleTransferToPhone(@RequestBody MultipleTransfer multipleTransfer) {
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(Collections.singletonList(new MultipleTransferBankOutput()))
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/multipleTransferToEmail", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> multipleTransferToEmail(@RequestBody MultipleTransfer multipleTransfer) {
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(Collections.singletonList(new MultipleTransferBankOutput()))
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/hold/place", method = RequestMethod.POST)
    public ResponseEntity<GenericServiceResponse> placeHold(@RequestBody PlaceHold placeHold) {
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(Collections.singletonList(new PlaceHoldOutput()))
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/hold", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getHold(@ApiParam(value = "Account Number and Hold Reference ID") String accountNumber, String holdReferenceId) {
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(Collections.singletonList(new GetHoldOutput()))
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/hold", method = RequestMethod.POST)
    public ResponseEntity<GenericServiceResponse> removeHold(@ApiParam(value = "Account Number and Reference ID") String accountNumber, String holdReferenceId) {
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(Collections.singletonList(new RemoveHoldOutput()))
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/pnd/place", method = RequestMethod.POST)
    public ResponseEntity<GenericServiceResponse> placePnd(@ApiParam(value = "Account Number, Reference ID, Amount and Reason") String accountNumber, String pndReferenceId, String amount, String reason) {
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(Collections.singletonList(new PlacePnd()))
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/statement", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getStatement(@RequestBody GetStatement getStatement) {
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(Collections.singletonList(new GetStatementOutput()))
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

}
