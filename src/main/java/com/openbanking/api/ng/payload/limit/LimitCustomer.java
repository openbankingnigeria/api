package com.openbanking.api.ng.payload.limit;

import com.openbanking.api.ng.definition.PeriodType;
import com.openbanking.api.ng.definition.TransactionType;

public class LimitCustomer {
    private String channel;
    private TransactionType transactionType;
    private PeriodType periodType;
    private int maxTransaction;
    private String maxAmountPerTransaction;
    private String maxCumulativeAmount;
    private String outstandingTransaction;
    private String outstandingCumulativeAmount;

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    public PeriodType getPeriodType() {
        return periodType;
    }

    public void setPeriodType(PeriodType periodType) {
        this.periodType = periodType;
    }

    public int getMaxTransaction() {
        return maxTransaction;
    }

    public void setMaxTransaction(int maxTransaction) {
        this.maxTransaction = maxTransaction;
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
}
