package com.openbanking.api.ng.controller;
import com.openbanking.api.ng.definition.ChannelType;
import com.openbanking.api.ng.definition.OperationStatus;
import com.openbanking.api.ng.payload.card.Card;
import com.openbanking.api.ng.payload.card.GetCard;
import com.openbanking.api.ng.payload.card.RequestCard;
import com.openbanking.api.ng.payload.card.CardLimit;
import com.openbanking.api.ng.payload.card.SetCardLimit;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
@RestController
@RequestMapping("/card")
@Api(value = "/card", description = "Card related operations", consumes = "application/json", tags = {"card"})

public class CardController {
    @RequestMapping(value = "/getCardProductByBank", method = RequestMethod.GET)
    public List<Card> getBranches() {
        return Collections.singletonList(new Card());
    }
    @RequestMapping(value = "/getCards", method = RequestMethod.GET)
    public List<GetCard> getCards(@ApiParam(value = "The Account Number tied to Card") String accountNumber) {
        return Collections.singletonList(new GetCard());
    }
    @RequestMapping(value = "/requestCard", method = RequestMethod.GET)
    public List<RequestCard> requestCard(@ApiParam(value = "The Account Number tied to Card") String cardToken) {
        return Collections.singletonList(new RequestCard());
    }
    @RequestMapping(value = "/getCardLimit", method = RequestMethod.GET)
    public List<CardLimit> getCardLimit() {
        return Collections.singletonList(new CardLimit());
    }

    @RequestMapping(value = "/setCardLimit", method = RequestMethod.POST)
    public OperationStatus setCardLimit(@RequestBody SetCardLimit setCardLimit) {
        return OperationStatus.SUCCESSFUL;
    }




}
