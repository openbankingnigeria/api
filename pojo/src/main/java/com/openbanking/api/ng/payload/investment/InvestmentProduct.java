package com.openbanking.api.ng.payload.investment;
import com.openbanking.api.ng.definition.InvestmentBookingType;

import lombok.Data;

@Data
public class InvestmentProduct {
    private String productId = "1";
    private String productName = "Mutual Fund";
    private String productType;
    private InvestmentBookingType bookingType = InvestmentBookingType.DISCOUNTED;
    private String interestDiscountRate;

}
