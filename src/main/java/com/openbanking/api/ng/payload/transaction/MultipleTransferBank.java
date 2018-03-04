package com.openbanking.api.ng.payload.transaction;

import java.util.List;

public class MultipleTransferBank {

    private String batchId;

    private String numberOfTransaction;

    List<SingleTransferBank> singleTransferBanks;

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

    public List<SingleTransferBank> getSingleTransferBanks() {
        return singleTransferBanks;
    }

    public void setSingleTransferBanks(List<SingleTransferBank> singleTransferBanks) {
        this.singleTransferBanks = singleTransferBanks;
    }
}
