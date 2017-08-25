package com.openbanking.api.ng.payload.investment;

import com.openbanking.api.ng.definition.Currency;
import com.openbanking.api.ng.definition.InvestmentBookingType;

import java.util.Date;
public class Investment {
    private String investmentId;
    private String productId;
    private String accountNumber;
    private String amount;
    private Currency currency;
    private Date dateBooked;
    private Date maturityDate;
    private InvestmentBookingType bookingType;
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

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
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
