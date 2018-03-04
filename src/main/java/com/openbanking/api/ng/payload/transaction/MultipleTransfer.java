package com.openbanking.api.ng.payload.transaction;

import java.util.List;

public class MultipleTransfer {
    private String batchId;

    private String numberOfTransaction;

    List<SingleTransfer> singleTransfer;

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public String getNumberOfTransaction() {
        return numberOfTransaction;
    }

    public void setNumberOfTransaction(String numberOfTransaction) {
        this.numberOfTransaction = numberOfTransaction;
    }

    public List<SingleTransfer> getSingleTransfer() {
        return singleTransfer;
    }

    public void setSingleTransfer(List<SingleTransfer> singleTransfer) {
        this.singleTransfer = singleTransfer;
    }
}
