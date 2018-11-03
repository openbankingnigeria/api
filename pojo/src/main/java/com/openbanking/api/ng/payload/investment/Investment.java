package com.openbanking.api.ng.payload.investment;

import com.openbanking.api.ng.definition.InvestmentBookingType;

import java.util.Date;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
public class Investment {
    private String investmentId = "1";
    private String productId = "1";
    private String accountNumber = "0123456780";
    private String amount = "5900";
    private CurrencyUnit currency = Monetary.getCurrency("EUR");
    private Date dateBooked;
    private Date maturityDate;
    private InvestmentBookingType bookingType = InvestmentBookingType.DISCOUNTED;
    private String interestDiscountRate;

    public String getInvestmentId() {
        return investmentId;
    }

    public void setInvestmentId(String investmentId) {
        this.investmentId = investmentId;
    }

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

    public InvestmentBookingType getBookingType() {
        return bookingType;
    }

    public void setBookingType(InvestmentBookingType bookingType) {
        this.bookingType = bookingType;
    }

    public String getInterestDiscountRate() {
        return interestDiscountRate;
    }

    public void setInterestDiscountRate(String interestDiscountRate) {
        this.interestDiscountRate = interestDiscountRate;
    }
}
