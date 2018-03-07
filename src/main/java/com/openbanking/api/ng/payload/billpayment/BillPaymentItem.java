package com.openbanking.api.ng.payload.billpayment;

public class BillPaymentItem {
    private String billingSystemId = "1";
    private String categoryId = "1";
    private String billerId = "1";
    private String billPaymentProductId = "1";
    private String billPaymentProductName = "Electricity";
    private String fixedOrVariableAmount = "1000";

    public String getBillingSystemId() {
        return billingSystemId;
    }

    public void setBillingSystemId(String billingSystemId) {
        this.billingSystemId = billingSystemId;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getBillerId() {
        return billerId;
    }

    public void setBillerId(String billerId) {
        this.billerId = billerId;
    }

    public String getBillPaymentProductId() {
        return billPaymentProductId;
    }

    public void setBillPaymentProductId(String billPaymentProductId) {
        this.billPaymentProductId = billPaymentProductId;
    }

    public String getBillPaymentProductName() {
        return billPaymentProductName;
    }

    public void setBillPaymentProductName(String billPaymentProductName) {
        this.billPaymentProductName = billPaymentProductName;
    }

    public String getFixedOrVariableAmount() {
        return fixedOrVariableAmount;
    }

    public void setFixedOrVariableAmount(String fixedOrVariableAmount) {
        this.fixedOrVariableAmount = fixedOrVariableAmount;
    }
}
