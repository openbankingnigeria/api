package com.openbanking.api.ng.payload.general;

import javax.money.CurrencyUnit;
import javax.money.Monetary;

public class GeneralGetProduct {
    private String productId = "1";
    private String Name = "Laptop";
    private String description = "Macbook Pro";
    private String eligibility;
    private CurrencyUnit currency = Monetary.getCurrency("EUR");

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEligibility() {
        return eligibility;
    }

    public void setEligibility(String eligibility) {
        this.eligibility = eligibility;
    }

    public CurrencyUnit getCurrency() {
        return currency;
    }

    public void setCurrency(CurrencyUnit currency) {
        this.currency = currency;
    }
}
