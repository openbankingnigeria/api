package ng.openbanking.api.payload.investment;
import ng.openbanking.api.payload.definition.InvestmentBookingType;

import lombok.Data;

@Data
public class InvestmentProduct {
    private String productId ;
    private String productName ;
    private String productType;
    private InvestmentBookingType bookingType;
    private String interestDiscountRate;

}
