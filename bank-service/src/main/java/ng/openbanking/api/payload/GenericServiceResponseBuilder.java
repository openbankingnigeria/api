package ng.openbanking.api.payload;

import ng.openbanking.api.payload.definition.OperationStatus;

public final class GenericServiceResponseBuilder<T> {
    private OperationStatus status;
    private String message;
    private T data;

    private GenericServiceResponseBuilder() {
    }

    public static GenericServiceResponseBuilder aGenericServiceResponse() {
        return new GenericServiceResponseBuilder();
    }

    public GenericServiceResponseBuilder withStatus(OperationStatus status) {
        this.status = status;
        return this;
    }

    public GenericServiceResponseBuilder withMessage(String message) {
        this.message = message;
        return this;
    }

    public GenericServiceResponseBuilder withData(T data) {
        this.data = data;
        return this;
    }

    public GenericServiceResponse build() {
        GenericServiceResponse genericServiceResponse = new GenericServiceResponse();
        genericServiceResponse.setStatus(status);
        genericServiceResponse.setMessage(message);
        genericServiceResponse.setData(data);
        return genericServiceResponse;
    }
}
