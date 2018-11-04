package com.openbanking.api.ng.payload.card;

import javax.money.CurrencyUnit;
import javax.money.Monetary;

import com.openbanking.api.ng.definition.CardBrand;

import lombok.Data;

@Data
public class CardType {
    private CardBrand cardBrand = CardBrand.MASTER_CARD;
    private String productId = "1";
    private com.openbanking.api.ng.definition.CardType cardType = com.openbanking.api.ng.definition.CardType.CREDIT;
    private String productName;
    private CurrencyUnit currency = Monetary.getCurrency("NGN");
    private String purchasePrice = "10000";
    private int validityPeriod = 1;
}
