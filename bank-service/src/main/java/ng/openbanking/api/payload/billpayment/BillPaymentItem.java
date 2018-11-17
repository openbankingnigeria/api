package ng.openbanking.api.payload.billpayment;

import lombok.Data;

@Data
public class BillPaymentItem {
    private String billingSystemId = "1";
    private String categoryId = "1";
    private String billerId = "1";
    private String billPaymentProductId = "1";
    private String billPaymentProductName = "Electricity";
    private String fixedOrVariableAmount = "1000";

}
