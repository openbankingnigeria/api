package com.openbanking.api.ng.payload.transaction;

public class SingleTransferBank extends SingleTransfer {
    private String destinationAccount = "0123456789";
    private String destinationAccountName = "Sodiq Fagbola";
    private String destinationBankCode = "012";

    public String getDestinationAccount() {
        return destinationAccount;
    }

    public void setDestinationAccount(String destinationAccount) {
        this.destinationAccount = destinationAccount;
    }

    public String getDestinationAccountName() {
        return destinationAccountName;
    }

    public void setDestinationAccountName(String destinationAccountName) {
        this.destinationAccountName = destinationAccountName;
    }

    public String getDestinationBankCode() {
        return destinationBankCode;
    }

    public void setDestinationBankCode(String destinationBankCode) {
        this.destinationBankCode = destinationBankCode;
    }
}
