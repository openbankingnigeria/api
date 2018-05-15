package com.openbanking.api.ng.payload.billpayment;

import javax.money.CurrencyUnit;
import javax.money.Monetary;

public class Biller {
    private String categoryId = "1";
    private String billerCategory = "Electricity";
    private String categoryDescription =  "Electricity Token";
    private String billerId = "1";
    private String nameOfBiller = "EKDEC";
    private String customerId = "1";
    private CurrencyUnit currency = Monetary.getCurrency("NGN");

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getBillerCategory() {
        return billerCategory;
    }

    public void setBillerCategory(String billerCategory) {
        this.billerCategory = billerCategory;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

    public String getBillerId() {
        return billerId;
    }

    public void setBillerId(String billerId) {
        this.billerId = billerId;
    }

    public String getNameOfBiller() {
        return nameOfBiller;
    }

    public void setNameOfBiller(String nameOfBiller) {
        this.nameOfBiller = nameOfBiller;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public CurrencyUnit getCurrency() {
        return currency;
    }

    public void setCurrency(CurrencyUnit currency) {
        this.currency = currency;
    }
}
