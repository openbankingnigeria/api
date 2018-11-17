package ng.openbanking.api.payload.billpayment;

import lombok.Data;

@Data
public class BillerCategory {
    private String billingSystemId;
    private String categoryName;
    private String categoryDescription;

  
}
