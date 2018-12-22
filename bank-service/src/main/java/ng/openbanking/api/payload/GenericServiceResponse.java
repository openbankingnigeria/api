package ng.openbanking.api.payload;

import ng.openbanking.api.payload.definition.OperationStatus;

import java.io.Serializable;


public class GenericServiceResponse<T> implements Serializable {

    private OperationStatus status;

    private String message;

    private T data;


    public OperationStatus getStatus() {
        return status;
    }

    public void setStatus(OperationStatus status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
