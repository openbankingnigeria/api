package ng.openbanking.api.payload.transaction;

import ng.openbanking.api.payload.definition.OperationStatus;

import lombok.Data;

@Data
public class PlacePnd {
    private String pndReferenceId = "1";
    private OperationStatus responseCode = OperationStatus.SUCCESSFUL;
    private String responseMessage = "Successful";

}
