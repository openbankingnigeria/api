package com.openbanking.api.ng.payload.transaction;

import com.openbanking.api.ng.definition.OperationStatus;

import lombok.Data;

@Data
public class RemoveHoldOutput {
   
    private OperationStatus responseCode = OperationStatus.SUCCESSFUL;
    private String repsonseMessage = "Successful";
}
