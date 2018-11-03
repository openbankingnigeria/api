package com.openbanking.api.ng.payload.card;
import com.openbanking.api.ng.definition.CardPickupType;

public class CardRequest {
    private String accountNumber = "0123456789";
    private String productId = "1";
    private CardPickupType cardPickupType = CardPickupType.HOME_DELIVERY;
    private CardType cardType = new CardType();
    private String branchId = "1";
    private String deliveryAddress = "Obalende, Lagos";

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public CardPickupType getCardPickupType() {
        return cardPickupType;
    }

    public void setCardPickupType(CardPickupType cardPickupType) {
        this.cardPickupType = cardPickupType;
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }
}
