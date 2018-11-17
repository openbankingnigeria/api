package com.openbanking.api.ng.payload.transaction;

import com.openbanking.api.ng.definition.OperationStatus;

import lombok.Data;

@Data
public class PlacePnd {
    private String pndReferenceId = "1";
    private OperationStatus responseCode = OperationStatus.SUCCESSFUL;
    private String responseMessage = "Successful";

}
