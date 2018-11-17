package ng.openbanking.api.payload;

import ng.openbanking.api.payload.definition.OperationStatus;

import lombok.Data;

@Data
public class GenericServiceResponse<T> {

    private OperationStatus status;

    private String message;

    private T data;

   

}
