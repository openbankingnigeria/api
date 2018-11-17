package ng.openbanking.api.payload;

import ng.openbanking.api.payload.definition.OperationStatus;

import lombok.Data;

@Data
public class ErrorResponse {

    private OperationStatus status= OperationStatus.ERROR;

    private String message;

    private String code;



}
