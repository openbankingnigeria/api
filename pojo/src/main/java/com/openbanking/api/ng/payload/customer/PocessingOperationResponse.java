package com.openbanking.api.ng.payload.customer;

import com.openbanking.api.ng.definition.OperationStatus;

import lombok.Data;

@Data
public class PocessingOperationResponse {
	
    private OperationStatus responseCode = OperationStatus.SUCCESSFUL;
    private String message = "Successful";
    private String transactionReferenceId;
    

   
}
