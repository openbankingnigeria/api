package com.openbanking.api.ng.payload.investment;
import com.openbanking.api.ng.definition.InvestmentBookingType;

public class InvestmentProduct {
    private String productId = "1";
    private String productName = "Mutual Fund";
    private String productType;
    private InvestmentBookingType bookingType = InvestmentBookingType.DISCOUNTED;
    private String interestDiscountRate;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public InvestmentBookingType getBookingType() {
        return bookingType;
    }

    public void setBookingType(InvestmentBookingType bookingType) {
        this.bookingType = bookingType;
    }

    public String getInterestDiscountRate() {
        return interestDiscountRate;
    }

    public void setInterestDiscountRate(String interestDiscountRate) {
        this.interestDiscountRate = interestDiscountRate;
    }
}
