package com.openbanking.api.ng.payload.account;

public class AccountCreationResponse {
    private String accountNumber = "0123456789";
    private String customerId = "1";

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
}
