package ng.openbanking.api.payload.customer;

import lombok.Data;

@Data
public class CustomerUpdateRequest {

    private String customerId = "1";

    private String customerName = "Sodiq Fagbola";

    private String email = "sodiq@openbanking.com";

    private String phoneNumber = "0900000000";

    private String address = "Lagos, Nigeria";

   
}
