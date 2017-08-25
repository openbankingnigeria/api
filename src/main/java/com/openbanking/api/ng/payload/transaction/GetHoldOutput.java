package com.openbanking.api.ng.payload.transaction;

import com.openbanking.api.ng.definition.OperationStatus;

import java.util.Date;

public class GetHoldOutput {
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

    public OperationStatus getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(OperationStatus responseCode) {
        this.responseCode = responseCode;
    }

    public String getRespondeDescription() {
        return respondeDescription;
    }

    public void setRespondeDescription(String respondeDescription) {
        this.respondeDescription = respondeDescription;
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

    private String accountNumber;
    private String holdReferenceId;
    private OperationStatus responseCode;
    private String respondeDescription;
    private String amount;
    private String reason;
    private Date startdate;
    private Date enddate;
}
