package com.openbanking.api.ng.controller;

import com.openbanking.api.ng.definition.OperationStatus;
import com.openbanking.api.ng.payload.GenericServiceResponse;
import com.openbanking.api.ng.payload.GenericServiceResponseBuilder;
import com.openbanking.api.ng.payload.card.Card;
import com.openbanking.api.ng.payload.card.CardLimit;
import com.openbanking.api.ng.payload.card.CardRequest;
import com.openbanking.api.ng.payload.card.CardType;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/card")
@Api(value = "/card", description = "CardType related operations", consumes = "application/json", tags = {"card"})

public class CardController {

    @RequestMapping(value = "/types", method = RequestMethod.GET)
    public List<CardType> getCardTypes() {
        return Collections.singletonList(new CardType());
    }

    @RequestMapping(value = "/{accountNumber}", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getCards(@PathVariable @ApiParam(value = "The Account Number tied to the Card") String accountNumber) {
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(Collections.singletonList(new Card()))
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ResponseEntity<GenericServiceResponse> requestCard(@RequestBody CardRequest cardRequest) {
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage("Card requested successfully")
                .build());
    }

    @RequestMapping(value = "/limit/{accountNumber}", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getCardLimit(@PathVariable @ApiParam(value = "The Account Number tied to the Card") String accountNumber) {
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(Collections.singletonList(new CardLimit()))
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/limit/{accountNumber}", method = RequestMethod.POST)
    public ResponseEntity<GenericServiceResponse> setCardLimit(@PathVariable @ApiParam(value = "The Account Number tied to the Card") String accountNumber,
                                                               @RequestBody CardLimit cardLimit) {
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage("Limit updated successfully")
                .build());
    }

}
