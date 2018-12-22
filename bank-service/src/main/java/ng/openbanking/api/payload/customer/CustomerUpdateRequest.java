package ng.openbanking.api.payload.customer;

import lombok.Data;
import ng.openbanking.api.payload.base.BasePayload;

@Data
public class CustomerUpdateRequest  extends BasePayload {

    private String customerId;

    private String customerName;

    private String email;

    private String phoneNumber;

    private String address;

   
}
