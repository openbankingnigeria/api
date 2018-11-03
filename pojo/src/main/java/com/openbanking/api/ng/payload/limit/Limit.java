package com.openbanking.api.ng.payload.limit;

import com.openbanking.api.ng.definition.PeriodType;
import com.openbanking.api.ng.definition.TransactionType;

public class Limit {
    private TransactionType transactionType = TransactionType.DEPOSIT;
    private PeriodType periodType = PeriodType.DAY;
    private int maxTransaction = 10000000;
    private String maxAmountPerTransaction = "1000000000";
    private String maxCumulativeAmount = "1000000000";

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
}
