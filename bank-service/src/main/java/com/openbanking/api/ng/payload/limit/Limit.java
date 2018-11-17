package com.openbanking.api.ng.payload.limit;

import com.openbanking.api.ng.definition.PeriodType;
import com.openbanking.api.ng.definition.TransactionType;

import lombok.Data;

@Data
public class Limit {
    private TransactionType transactionType;
    private PeriodType periodType;
    private int maxTransaction ;
    private String maxAmountPerTransaction ;
    private String maxCumulativeAmount;

}
