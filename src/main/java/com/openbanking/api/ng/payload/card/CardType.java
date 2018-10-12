package com.openbanking.api.ng.payload.card;

import javax.money.CurrencyUnit;
import javax.money.Monetary;

import com.openbanking.api.ng.definition.CardBrand;

public class CardType {
    private CardBrand cardBrand = CardBrand.MASTER_CARD;
    private String productId = "1";
    private com.openbanking.api.ng.definition.CardType cardType = com.openbanking.api.ng.definition.CardType.CREDIT;
    private String productName;
    private CurrencyUnit currency = Monetary.getCurrency("NGN");
    private String purchasePrice = "10000";
    private int validityPeriod = 1;
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
    public CardBrand getCardBrand() {
        return cardBrand;
    }

    public void setCardBrand(CardBrand cardBrand) {
        this.cardBrand = cardBrand;
    }

    public com.openbanking.api.ng.definition.CardType getCardType() {
        return cardType;
    }

    public void setCardType(com.openbanking.api.ng.definition.CardType cardType) {
        this.cardType = cardType;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;

    }

    public CurrencyUnit getCurrency() {
        return currency;
    }

    public void setCurrency(CurrencyUnit currency) {
        this.currency = currency;
    }

    public String getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(String purchasePrice) {
        this.purchasePrice = purchasePrice;
    }
    public int getValidityPeriod() {
        return validityPeriod;
    }

    public void setValidityPeriod(int validityPeriod) {
        this.validityPeriod = validityPeriod;
    }


}
