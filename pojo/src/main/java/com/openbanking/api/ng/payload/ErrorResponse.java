package com.openbanking.api.ng.payload;

import com.openbanking.api.ng.definition.OperationStatus;

import java.io.Serializable;

public class ErrorResponse implements Serializable {

    private OperationStatus status;

    private String message;

    private String code;


    public ErrorResponse() {
        this.status = OperationStatus.ERROR;
    }

    public OperationStatus getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


}
