package ng.openbanking.api.payload.transaction;

import ng.openbanking.api.payload.definition.OperationStatus;

import lombok.Data;

@Data
public class RemoveHoldOutput {
   
    private OperationStatus responseCode = OperationStatus.SUCCESSFUL;
    private String repsonseMessage = "Successful";
}
