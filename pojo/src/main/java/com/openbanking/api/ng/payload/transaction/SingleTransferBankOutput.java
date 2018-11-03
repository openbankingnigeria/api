package com.openbanking.api.ng.payload.transaction;

import com.openbanking.api.ng.definition.OperationStatus;

public class SingleTransferBankOutput {
    private OperationStatus responseCode = OperationStatus.SUCCESSFUL;
    private String responseMessage = "Successful";
    private String transactionReferenceId = "1";

    public OperationStatus getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(OperationStatus responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public String getTransactionReferenceId() {
        return transactionReferenceId;
    }

    public void setTransactionReferenceId(String transactionReferenceId) {
        this.transactionReferenceId = transactionReferenceId;
    }
}
