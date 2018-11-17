package ng.openbanking.api.payload.billpayment;

import lombok.Data;

@Data
public class Biller {
    private String categoryId = "1";
    private String billerCategory = "Electricity";
    private String categoryDescription =  "Electricity Token";
    private String billerId = "1";
    private String nameOfBiller = "EKDEC";
    private String customerId = "1";
    private String currency = "NGN";

}
