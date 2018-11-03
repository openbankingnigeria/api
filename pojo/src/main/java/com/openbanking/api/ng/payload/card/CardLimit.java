package com.openbanking.api.ng.payload.card;

public class CardLimit {
    private String cardToken;
    private String Channel;
    private CardType cardType = new CardType();
    private String transactionType = "";
    private String periodType;
    private int maximumTransaction = 1;
    private String maxAmountPerTransaction = "100000";
    private String maxCumulativeAmount = "1000000";
    private String outstandingTransaction = "1000000";
    private String outstandingCumulativeAmount = "10000";

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

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getPeriodType() {
        return periodType;
    }

    public void setPeriodType(String periodType) {
        this.periodType = periodType;
    }

    public int getMaximumTransaction() {
        return maximumTransaction;
    }

    public void setMaximumTransaction(int maximumTransaction) {
        this.maximumTransaction = maximumTransaction;
    }

    public String getMaxAmountPerTransaction() {
        return maxAmountPerTransaction;
    }

    public void setMaxAmountPerTransaction(String maxAmountPerTransaction) {
        this.maxAmountPerTransaction = maxAmountPerTransaction;
    }

    public String getMaxCumulativeAmount() {
        return maxCumulativeAmount;
    }

    public void setMaxCumulativeAmount(String maxCumulativeAmount) {
        this.maxCumulativeAmount = maxCumulativeAmount;
    }

    public String getOutstandingTransaction() {
        return outstandingTransaction;
    }

    public void setOutstandingTransaction(String outstandingTransaction) {
        this.outstandingTransaction = outstandingTransaction;
    }

    public String getOutstandingCumulativeAmount() {
        return outstandingCumulativeAmount;
    }

    public void setOutstandingCumulativeAmount(String outstandingCumulativeAmount) {
        this.outstandingCumulativeAmount = outstandingCumulativeAmount;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }
}
