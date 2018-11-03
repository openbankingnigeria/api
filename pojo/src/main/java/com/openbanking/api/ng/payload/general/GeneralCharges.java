package com.openbanking.api.ng.payload.general;

import javax.money.CurrencyUnit;
import javax.money.Monetary;

import com.openbanking.api.ng.definition.TransactionType;

public class GeneralCharges {
    private String productName = "Laptop";
    private String productId = "1";
    private TransactionType transactionType = TransactionType.DEPOSIT;
    private String standardType;
    private String standardChargeType;
    private String minimumChargeType;
    private String minimumCharge;
    private String maximumCharge;
    private String MaximumChargeType;
    private String taxRate;
    private CurrencyUnit currency = Monetary.getCurrency("EUR");

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    public String getStandardType() {
        return standardType;
    }

    public void setStandardType(String standardType) {
        this.standardType = standardType;
    }

    public String getStandardChargeType() {
        return standardChargeType;
    }

    public void setStandardChargeType(String standardChargeType) {
        this.standardChargeType = standardChargeType;
    }

    public String getMinimumChargeType() {
        return minimumChargeType;
    }

    public void setMinimumChargeType(String minimumChargeType) {
        this.minimumChargeType = minimumChargeType;
    }

    public String getMinimumCharge() {
        return minimumCharge;
    }

    public void setMinimumCharge(String minimumCharge) {
        this.minimumCharge = minimumCharge;
    }

    public String getMaximumCharge() {
        return maximumCharge;
    }

    public void setMaximumCharge(String maximumCharge) {
        this.maximumCharge = maximumCharge;
    }

    public String getMaximumChargeType() {
        return MaximumChargeType;
    }

    public void setMaximumChargeType(String maximumChargeType) {
        MaximumChargeType = maximumChargeType;
    }

    public String getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(String taxRate) {
        this.taxRate = taxRate;
    }

    public CurrencyUnit getCurrency() {
        return currency;
    }

    public void setCurrency(CurrencyUnit currency) {
        this.currency = currency;
    }
}
