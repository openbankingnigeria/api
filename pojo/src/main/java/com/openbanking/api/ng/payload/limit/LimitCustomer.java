package com.openbanking.api.ng.payload.limit;

import com.openbanking.api.ng.definition.PeriodType;
import com.openbanking.api.ng.definition.TransactionType;

import lombok.Data;

@Data
public class LimitCustomer {
    private String channel;
    private TransactionType transactionType = TransactionType.DEPOSIT;
    private PeriodType periodType = PeriodType.DAY;
    private int maxTransaction;
    private String maxAmountPerTransaction;
    private String maxCumulativeAmount;
    private String outstandingTransaction;
    private String outstandingCumulativeAmount;
}