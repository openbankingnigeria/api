package ng.openbanking.api.payload.transaction;

import ng.openbanking.api.payload.base.BasePayload;
import ng.openbanking.api.payload.definition.OperationStatus;

import lombok.Data;

@Data
public class RemoveHoldOutput  extends BasePayload {
   
    private OperationStatus responseCode;
    private String repsonseMessage;
}
