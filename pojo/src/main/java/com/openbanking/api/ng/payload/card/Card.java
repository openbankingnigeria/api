package com.openbanking.api.ng.payload.card;
import java.util.Date;

import com.openbanking.api.ng.definition.CardType;

import lombok.Data;

@Data
public class Card {
    private String accountNumber = "0123456789";
    private String maskedPan = "012345678901";
    private String token;
    private Date expiry = new Date();
    private String issuerNumber = "1";
    private String cardName = "Sodiq Fagbola";
    private CardType cardType = CardType.CREDIT;

}