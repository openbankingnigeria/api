package ng.openbanking.api.payload.customer;

import ng.openbanking.api.payload.definition.OperationStatus;

import lombok.Data;

@Data
public class PocessingOperationResponse {
	
    private OperationStatus responseCode = OperationStatus.SUCCESSFUL;
    private String message = "Successful";
    private String transactionReferenceId;
    

   
}
