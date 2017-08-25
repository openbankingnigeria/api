package com.openbanking.api.ng.payload.transaction;

import com.openbanking.api.ng.definition.OperationStatus;

public class RemoveHoldOutput {
    public OperationStatus getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(OperationStatus responseCode) {
        this.responseCode = responseCode;
    }

    public String getRepsonseMessage() {
        return repsonseMessage;
    }

    public void setRepsonseMessage(String repsonseMessage) {
        this.repsonseMessage = repsonseMessage;
    }

    private OperationStatus responseCode;
    private String repsonseMessage;
}
