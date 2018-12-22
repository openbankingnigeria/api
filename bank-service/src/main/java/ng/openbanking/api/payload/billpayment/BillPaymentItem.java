package ng.openbanking.api.payload.billpayment;

import lombok.Data;
import ng.openbanking.api.payload.base.BasePayload;

@Data
public class BillPaymentItem  extends BasePayload {
    private String billingSystemId;
    private String categoryId;
    private String billerId;
    private String billPaymentProductId;
    private String billPaymentProductName;
    private String fixedOrVariableAmount;

}
