package ng.openbanking.api.payload.account;

import lombok.Data;

@Data
public class AccountCreationResponse {
    private String accountNumber = "0123456789";
    private String customerId = "1";

    
}
