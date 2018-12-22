package ng.openbanking.api.payload.general;

import ng.openbanking.api.payload.base.BasePayload;
import ng.openbanking.api.payload.definition.TransactionType;
import lombok.Data;

@Data
public class GeneralCharges  extends BasePayload {
    private String productName;
    private String productId;
    private TransactionType transactionType;
    private String standardType;
    private String standardChargeType;
    private String minimumChargeType;
    private String minimumCharge;
    private String maximumCharge;
    private String MaximumChargeType;
    private String taxRate;
    private String currency;

}
