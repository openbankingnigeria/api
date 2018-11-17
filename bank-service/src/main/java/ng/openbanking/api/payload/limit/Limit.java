package ng.openbanking.api.payload.limit;

import ng.openbanking.api.payload.definition.PeriodType;
import ng.openbanking.api.payload.definition.TransactionType;

import lombok.Data;

@Data
public class Limit {
    private TransactionType transactionType;
    private PeriodType periodType;
    private int maxTransaction ;
    private String maxAmountPerTransaction ;
    private String maxCumulativeAmount;

}
