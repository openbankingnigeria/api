package com.openbanking.api.ng.payload.transaction;

import com.openbanking.api.ng.definition.Currency;

import java.util.Date;

public class SingleTransfer {
    private String referenceId;
    private String sourceAccount;
    private String sourceAccountName;
    private String sourceAmount;
    private Currency sourcecurrency;
    private String courceNarration;
    private String destinationAccount;
    private String destinationAccountName;
    private String destinationAmount;
    private Currency currency;
    private String destinationNarration;
    private String transactionFee;
    private String channel;
    private int latitude;
    private int longitude;
    private Date transationDate;

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public String getSourceAccount() {
        return sourceAccount;
    }

    public void setSourceAccount(String sourceAccount) {
        this.sourceAccount = sourceAccount;
    }

    public String getSourceAccountName() {
        return sourceAccountName;
    }

    public void setSourceAccountName(String sourceAccountName) {
        this.sourceAccountName = sourceAccountName;
    }

    public String getSourceAmount() {
        return sourceAmount;
    }

    public void setSourceAmount(String sourceAmount) {
        this.sourceAmount = sourceAmount;
    }

    public Currency getSourcecurrency() {
        return sourcecurrency;
    }

    public void setSourcecurrency(Currency sourcecurrency) {
        this.sourcecurrency = sourcecurrency;
    }

    public String getCourceNarration() {
        return courceNarration;
    }

    public void setCourceNarration(String courceNarration) {
        this.courceNarration = courceNarration;
    }

    public String getDestinationAccount() {
        return destinationAccount;
    }

    public void setDestinationAccount(String destinationAccount) {
        this.destinationAccount = destinationAccount;
    }

    public String getDestinationAccountName() {
        return destinationAccountName;
    }

    public void setDestinationAccountName(String destinationAccountName) {
        this.destinationAccountName = destinationAccountName;
    }

    public String getDestinationAmount() {
        return destinationAmount;
    }

    public void setDestinationAmount(String destinationAmount) {
        this.destinationAmount = destinationAmount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public String getDestinationNarration() {
        return destinationNarration;
    }

    public void setDestinationNarration(String destinationNarration) {
        this.destinationNarration = destinationNarration;
    }

    public String getTransactionFee() {
        return transactionFee;
    }

    public void setTransactionFee(String transactionFee) {
        this.transactionFee = transactionFee;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    public Date getTransationDate() {
        return transationDate;
    }

    public void setTransationDate(Date transationDate) {
        this.transationDate = transationDate;
    }
}
