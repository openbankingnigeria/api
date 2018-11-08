package com.openbanking.api.ng.payload.investment;
import com.openbanking.api.ng.definition.InvestmentBookingType;

import lombok.Data;

@Data
public class InvestmentProduct {
    private String productId ;
    private String productName ;
    private String productType;
    private InvestmentBookingType bookingType;
    private String interestDiscountRate;

}
