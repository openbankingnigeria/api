package com.openbanking.api.ng.payload.transaction;

import com.openbanking.api.ng.definition.OperationStatus;

public class MultipleTransferBankOutput {
    private String batchId = "1";
    private OperationStatus responseCode = OperationStatus.SUCCESSFUL;
    private String responseMessage = "Transfer Successful";
    private String numberOfTransaction = "1";
    private String transactionId = "1";

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

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

    public String getNumberOfTransaction() {
        return numberOfTransaction;
    }

    public void setNumberOfTransaction(String numberOfTransaction) {
        this.numberOfTransaction = numberOfTransaction;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
}
