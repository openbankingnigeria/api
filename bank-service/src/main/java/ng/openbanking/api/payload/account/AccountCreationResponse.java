package ng.openbanking.api.payload.account;

import lombok.Data;
import ng.openbanking.api.payload.base.BasePayload;

@Data
public class AccountCreationResponse  extends BasePayload {
    private String accountNumber = "0123456789";
    private String customerId = "1";

    
}
