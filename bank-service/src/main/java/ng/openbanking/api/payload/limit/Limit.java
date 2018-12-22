package ng.openbanking.api.payload.limit;

import lombok.Data;
import ng.openbanking.api.payload.base.BasePayload;
import ng.openbanking.api.payload.definition.PeriodType;
import ng.openbanking.api.payload.definition.TransactionType;

@Data
public class Limit  extends BasePayload {
    private TransactionType transactionType;
    private PeriodType periodType;
    private int maxTransaction ;
    private String maxAmountPerTransaction ;
    private String maxCumulativeAmount;

}
