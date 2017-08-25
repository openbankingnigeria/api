package com.openbanking.api.ng.payload.billpayment;

public class BillerCategory {
    private String billingSystemId;
    private String categoryName;
    private String categoryDescription;

    public String getBillingSystemId() {
        return billingSystemId;
    }

    public void setBillingSystemId(String billingSystemId) {
        this.billingSystemId = billingSystemId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }
}
