package com.openbanking.api.ng.payload.billpayment;

public class BillingSystem {
    private String billingSystemId;
    private BillingSystem billingSystemName;

    public String getBillingSystemId() {
        return billingSystemId;
    }

    public void setBillingSystemId(String billingSystemId) {
        this.billingSystemId = billingSystemId;
    }

    public BillingSystem getBillingaSystemName() {
        return billingSystemName;
    }

    public void setBillingaSystemName(BillingSystem billingaSystemName) {
        this.billingSystemName = billingaSystemName;
    }
}
