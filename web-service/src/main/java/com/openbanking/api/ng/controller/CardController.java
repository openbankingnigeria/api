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
import com.openbanking.api.ng.bank.service.BankCardService;
import com.openbanking.api.ng.definition.OperationStatus;
import com.openbanking.api.ng.payload.GenericServiceResponse;
import com.openbanking.api.ng.payload.GenericServiceResponseBuilder;
import com.openbanking.api.ng.payload.card.Card;
import com.openbanking.api.ng.payload.card.CardLimit;
import com.openbanking.api.ng.payload.card.CardRequest;
import com.openbanking.api.ng.payload.card.CardType;
import com.openbanking.api.ng.payload.customer.PocessingOperationResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/card")
@Api(value = "/card", description = "CardType related operations", consumes = "application/json", tags = {"card"})

public class CardController extends BaseApiController{
	
	@Autowired
	private BankCardService bankCardService;

    @RequestMapping(value = "/types", method = RequestMethod.GET)
    public List<CardType> getCardTypes() {
        return Collections.singletonList(new CardType());
    }

    @RequestMapping(value = "/{accountNumber}", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getCards(@PathVariable @ApiParam(value = "The Account Number tied to the Card") String accountNumber)   throws BankResourceNotFoundException,ServiceOperationNotSupported {
    	List<Card> cards=bankCardService.getCardsByAccountNumber(accountNumber);
    	return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(cards)
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ResponseEntity<GenericServiceResponse> requestCard(@RequestBody CardRequest cardRequest)  throws BankResourceNotFoundException,ServiceOperationNotSupported {
    	PocessingOperationResponse processResponse=bankCardService.requestCard(cardRequest);
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage("Card requested successfully")
                .build());
    }

    @RequestMapping(value = "/limit/{accountNumber}", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getCardLimit(@PathVariable @ApiParam(value = "The Account Number tied to the Card") String accountNumber) throws BankResourceNotFoundException,ServiceOperationNotSupported  {
    	List<CardLimit> cardLimits=bankCardService.getCardLimit(accountNumber);
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(cardLimits)
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/limit/{accountNumber}", method = RequestMethod.POST)
    public ResponseEntity<GenericServiceResponse> setCardLimit(@PathVariable @ApiParam(value = "The Account Number tied to the Card") String accountNumber,
                                                               @RequestBody CardLimit cardLimit) throws BankResourceNotFoundException,ServiceOperationNotSupported {
    	PocessingOperationResponse processResponse=bankCardService.setCardLimit(cardLimit);
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage("Limit updated successfully")
                .build());
    }

}
