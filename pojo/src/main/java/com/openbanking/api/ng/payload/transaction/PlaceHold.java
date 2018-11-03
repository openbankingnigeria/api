package com.openbanking.api.ng.payload.transaction;

import java.util.Date;

public class PlaceHold {
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHoldReferenceId() {
        return holdReferenceId;
    }

    public void setHoldReferenceId(String holdReferenceId) {
        this.holdReferenceId = holdReferenceId;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    private String accountNumber = "0123456789";
    private String holdReferenceId;
    private String amount = "10000";
    private String reason;
    private Date startdate;
    private Date enddate;
}
