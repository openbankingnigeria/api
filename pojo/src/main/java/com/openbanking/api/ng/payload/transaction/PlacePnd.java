package com.openbanking.api.ng.payload.transaction;

import com.openbanking.api.ng.definition.OperationStatus;

public class PlacePnd {
    private String pndReferenceId = "1";
    private OperationStatus responseCode = OperationStatus.SUCCESSFUL;
    private String responseMessage = "Successful";

    public String getPndReferenceId() {
        return pndReferenceId;
    }

    public void setPndReferenceId(String pndReferenceId) {
        this.pndReferenceId = pndReferenceId;
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
}
