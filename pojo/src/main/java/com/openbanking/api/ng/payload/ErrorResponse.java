package com.openbanking.api.ng.payload;

import com.openbanking.api.ng.definition.OperationStatus;

import lombok.Data;

@Data
public class ErrorResponse {

    private OperationStatus status= OperationStatus.ERROR;

    private String message;

    private String code;



}
