package com.openbanking.api.ng.payload.limit;

import com.openbanking.api.ng.definition.PeriodType;
import com.openbanking.api.ng.definition.TransactionType;

import lombok.Data;

@Data
public class Limit {
    private TransactionType transactionType = TransactionType.DEPOSIT;
    private PeriodType periodType = PeriodType.DAY;
    private int maxTransaction = 10000000;
    private String maxAmountPerTransaction = "1000000000";
    private String maxCumulativeAmount = "1000000000";

}
