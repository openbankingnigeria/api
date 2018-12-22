package ng.openbanking.api.payload.billpayment;

import lombok.Data;
import ng.openbanking.api.payload.base.BasePayload;

@Data
public class Biller extends BasePayload {
    private String categoryId ;
    private String billerCategory;
    private String categoryDescription;
    private String billerId;
    private String nameOfBiller;
    private String customerId;
    private String currency;

}
