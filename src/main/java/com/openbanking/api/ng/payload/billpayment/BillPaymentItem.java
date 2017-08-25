package com.openbanking.api.ng.payload.billpayment;

public class BillPaymentItem {
    private String billingSystemId;
    private String categoryId;
    private String billerId;
    private String billPaymentProductId;
    private String billPaymentProductName;
    private String fixedOrVariableAmount;

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
