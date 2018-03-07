package com.openbanking.api.ng.payload.transaction;

public class PlaceHoldOutput {
    private String holdReferenceId = "1";
    private String responseCode = "00";
    private String responseDescription = "Successful";

    public String getHoldReferenceId() {
        return holdReferenceId;
    }

    public void setHoldReferenceId(String holdReferenceId) {
        this.holdReferenceId = holdReferenceId;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseDescription() {
        return responseDescription;
    }

    public void setResponseDescription(String responseDescription) {
        this.responseDescription = responseDescription;
    }
}
