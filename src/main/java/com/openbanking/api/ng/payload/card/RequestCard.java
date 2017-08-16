package com.openbanking.api.ng.payload.card;
import com.openbanking.api.ng.definition.CardPickupType;

public class RequestCard {
    private String accountNumber;
    private String productId;
    private CardPickupType cardPickupType;
    private String branchId;
    private String deliveryAddress;

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
}
