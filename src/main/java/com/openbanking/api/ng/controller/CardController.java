package com.openbanking.api.ng.controller;

import com.openbanking.api.ng.definition.OperationStatus;
import com.openbanking.api.ng.payload.card.Card;
import com.openbanking.api.ng.payload.card.CardLimit;
import com.openbanking.api.ng.payload.card.CardRequest;
import com.openbanking.api.ng.payload.card.CardType;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
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
    public List<Card> getCards(@PathVariable @ApiParam(value = "The Account Number tied to the Card") String accountNumber) {
        return Collections.singletonList(new Card());
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public OperationStatus requestCard(@RequestBody CardRequest cardRequest) {
        return OperationStatus.SUCCESSFUL;
    }

    @RequestMapping(value = "/limit/{accountNumber}", method = RequestMethod.GET)
    public List<CardLimit> getCardLimit(@PathVariable @ApiParam(value = "The Account Number tied to the Card") String accountNumber) {
        return Collections.singletonList(new CardLimit());
    }

    @RequestMapping(value = "/limit/{accountNumber}", method = RequestMethod.POST)
    public OperationStatus setCardLimit(@PathVariable @ApiParam(value = "The Account Number tied to the Card") String accountNumber,
                                        @RequestBody CardLimit cardLimit) {
        return OperationStatus.SUCCESSFUL;
    }

}
