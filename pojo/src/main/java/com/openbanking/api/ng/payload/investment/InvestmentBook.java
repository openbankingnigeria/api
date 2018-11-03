package com.openbanking.api.ng.payload.investment;

import java.util.Date;

import javax.money.CurrencyUnit;
import javax.money.Monetary;

public class InvestmentBook {
    private String productId = "0";
    private String accountNumber = "0123456789";
    private String amount = "5400"; // TODO should use MonetaryAmount here, too
    private CurrencyUnit currency = Monetary.getCurrency("EUR");
    private Date dateBooked;
    private Date maturityDate;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public CurrencyUnit getCurrency() {
        return currency;
    }

    public void setCurrency(CurrencyUnit currency) {
        this.currency = currency;
    }

    public Date getDateBooked() {
        return dateBooked;
    }

    public void setDateBooked(Date dateBooked) {
        this.dateBooked = dateBooked;
    }

    public Date getMaturityDate() {
        return maturityDate;
    }

    public void setMaturityDate(Date maturityDate) {
        this.maturityDate = maturityDate;
    }
}

