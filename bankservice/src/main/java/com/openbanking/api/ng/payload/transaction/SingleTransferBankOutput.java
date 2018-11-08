package com.openbanking.api.ng.payload.transaction;

import com.openbanking.api.ng.definition.OperationStatus;

import lombok.Data;

@Data
public class SingleTransferBankOutput {
    private OperationStatus responseCode = OperationStatus.SUCCESSFUL;
    private String responseMessage = "Successful";
    private String transactionReferenceId = "1";
}
