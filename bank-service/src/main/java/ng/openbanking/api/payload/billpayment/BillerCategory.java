package ng.openbanking.api.payload.billpayment;

import lombok.Data;
import ng.openbanking.api.payload.base.BasePayload;

@Data
public class BillerCategory  extends BasePayload {
    private String billingSystemId;
    private String categoryName;
    private String categoryDescription;

  
}
