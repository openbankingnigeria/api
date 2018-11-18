package ng.openbanking.api.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import ng.openbanking.api.payload.GenericServiceResponse;
import ng.openbanking.api.payload.GenericServiceResponseBuilder;
import ng.openbanking.api.payload.bank.exception.BankResourceNotFoundException;
import ng.openbanking.api.payload.bank.exception.ServiceOperationNotSupported;
import ng.openbanking.api.payload.bank.service.BankCardService;
import ng.openbanking.api.payload.card.Card;
import ng.openbanking.api.payload.card.CardLimit;
import ng.openbanking.api.payload.card.CardRequest;
import ng.openbanking.api.payload.card.CardType;
import ng.openbanking.api.payload.customer.PocessingOperationResponse;
import ng.openbanking.api.payload.definition.OperationStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

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
    public ResponseEntity<GenericServiceResponse> getCards(@PathVariable @ApiParam(value = "The Account Number tied to the Card") String accountNumber)   throws BankResourceNotFoundException, ServiceOperationNotSupported {
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
