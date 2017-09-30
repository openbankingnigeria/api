package com.openbanking.api.ng.payload.transaction;

public class GetStatement {
    private String accountNumber;
    private String startDateAndendDate_Or_lastNumberOfRecords;

    public String getStartDateAndendDate_Or_lastNumberOfRecords() {
        return startDateAndendDate_Or_lastNumberOfRecords;
    }

    public void setStartDateAndendDate_Or_lastNumberOfRecords(String startDateAndendDate_Or_lastNumberOfRecords) {
        this.startDateAndendDate_Or_lastNumberOfRecords = startDateAndendDate_Or_lastNumberOfRecords;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }




}
