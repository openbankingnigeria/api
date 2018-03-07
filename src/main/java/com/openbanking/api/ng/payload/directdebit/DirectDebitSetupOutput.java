package com.openbanking.api.ng.payload.directdebit;

import com.openbanking.api.ng.definition.OperationStatus;

public class DirectDebitSetupOutput {
    private OperationStatus responseCode = OperationStatus.SUCCESSFUL;
    private String message = "Successful";
    private String transactionReferenceId;

    public OperationStatus getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(OperationStatus responseCode) {
        this.responseCode = responseCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTransactionReferenceId() {
        return transactionReferenceId;
    }

    public void setTransactionReferenceId(String transactionReferenceId) {
        this.transactionReferenceId = transactionReferenceId;
    }
}
