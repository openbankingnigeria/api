package ng.openbanking.api.payload.customer;

import ng.openbanking.api.payload.definition.OperationStatus;

import lombok.Data;

@Data
public class PocessingOperationResponse {
	
    private OperationStatus responseCode;
    private String message;
    private String transactionReferenceId;
    

   
}
