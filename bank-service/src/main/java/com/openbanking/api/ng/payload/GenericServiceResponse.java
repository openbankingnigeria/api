package com.openbanking.api.ng.payload;

import com.openbanking.api.ng.definition.OperationStatus;

import lombok.Data;

@Data
public class GenericServiceResponse<T> {

    private OperationStatus status;

    private String message;

    private T data;

   

}
