package com.openbanking.api.ng.payload.card;

public class CardLimit {
    private String cardToken;
    private String Channel;
    private String transactiontype;
    private String periodtype;
    private int maximumTransaction;
    private String MaxAmountPerTransaction;
    private String MaxCumulativeAmount;
    private String outstandingTranscation;
    private String outstandingCumulativeAmount;

    public String getCardToken() {
        return cardToken;
    }

    public void setCardToken(String cardToken) {
        this.cardToken = cardToken;
    }

    public String getChannel() {
        return Channel;
    }

    public void setChannel(String channel) {
        Channel = channel;
    }

    public String getTransactiontype() {
        return transactiontype;
    }

    public void setTransactiontype(String transactiontype) {
        this.transactiontype = transactiontype;
    }

    public String getPeriodtype() {
        return periodtype;
    }

    public void setPeriodtype(String periodtype) {
        this.periodtype = periodtype;
    }

    public int getMaximumTransaction() {
        return maximumTransaction;
    }

    public void setMaximumTransaction(int maximumTransaction) {
        this.maximumTransaction = maximumTransaction;
    }

    public String getMaxAmountPerTransaction() {
        return MaxAmountPerTransaction;
    }

    public void setMaxAmountPerTransaction(String maxAmountPerTransaction) {
        MaxAmountPerTransaction = maxAmountPerTransaction;
    }

    public String getMaxCumulativeAmount() {
        return MaxCumulativeAmount;
    }

    public void setMaxCumulativeAmount(String maxCumulativeAmount) {
        MaxCumulativeAmount = maxCumulativeAmount;
    }

    public String getOutstandingTranscation() {
        return outstandingTranscation;
    }

    public void setOutstandingTranscation(String outstandingTranscation) {
        this.outstandingTranscation = outstandingTranscation;
    }

    public String getOutstandingCumulativeAmount() {
        return outstandingCumulativeAmount;
    }

    public void setOutstandingCumulativeAmount(String outstandingCumulativeAmount) {
        this.outstandingCumulativeAmount = outstandingCumulativeAmount;
    }
}
