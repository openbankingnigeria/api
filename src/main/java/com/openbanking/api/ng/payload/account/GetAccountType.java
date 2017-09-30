package com.openbanking.api.ng.payload.account;

import com.openbanking.api.ng.definition.Currency;

public class GetAccountType {
    private String accountTypeId;
    private String accountTypeName;
    private String minimumBalance;
    private String maximumBalance;
    private String maximumTransactionLimit;
    private String maximumInFlow;
    private Currency currency;
    private String  kycLevel;
    private String  documentation;
    private String  cardProduct;
    private String  digitalProduct;

    public String getAccountTypeId() {
        return accountTypeId;
    }

    public void setAccountTypeId(String accountTypeId) {
        this.accountTypeId = accountTypeId;
    }

    public String getAccountTypeName() {
        return accountTypeName;
    }

    public void setAccountTypeName(String accountTypeName) {
        this.accountTypeName = accountTypeName;
    }

    public String getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(String minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    public String getMaximumBalance() {
        return maximumBalance;
    }

    public void setMaximumBalance(String maximumBalance) {
        this.maximumBalance = maximumBalance;
    }

    public String getMaximumTransactionLimit() {
        return maximumTransactionLimit;
    }

    public void setMaximumTransactionLimit(String maximumTransactionLimit) {
        this.maximumTransactionLimit = maximumTransactionLimit;
    }

    public String getMaximumInFlow() {
        return maximumInFlow;
    }

    public void setMaximumInFlow(String maximumInFlow) {
        this.maximumInFlow = maximumInFlow;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public String getKycLevel() {
        return kycLevel;
    }

    public void setKycLevel(String kycLevel) {
        this.kycLevel = kycLevel;
    }

    public String getDocumentation() {
        return documentation;
    }

    public void setDocumentation(String documentation) {
        this.documentation = documentation;
    }

    public String getCardProduct() {
        return cardProduct;
    }

    public void setCardProduct(String cardProduct) {
        this.cardProduct = cardProduct;
    }

    public String getDigitalProduct() {
        return digitalProduct;
    }

    public void setDigitalProduct(String digitalProduct) {
        this.digitalProduct = digitalProduct;
    }
}
