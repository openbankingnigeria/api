package ng.openbanking.api.payload.limit;

import ng.openbanking.api.payload.base.BasePayload;
import ng.openbanking.api.payload.definition.PeriodType;
import ng.openbanking.api.payload.definition.TransactionType;

import lombok.Data;

@Data
public class LimitCustomer  extends BasePayload {
    private String channel;
    private TransactionType transactionType;
    private PeriodType periodType;
    private int maxTransaction;
    private String maxAmountPerTransaction;
    private String maxCumulativeAmount;
    private String outstandingTransaction;
    private String outstandingCumulativeAmount;
}
