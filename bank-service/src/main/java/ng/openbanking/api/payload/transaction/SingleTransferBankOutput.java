package ng.openbanking.api.payload.transaction;

import ng.openbanking.api.payload.definition.OperationStatus;

import lombok.Data;

@Data
public class SingleTransferBankOutput {
    private OperationStatus responseCode = OperationStatus.SUCCESSFUL;
    private String responseMessage = "Successful";
    private String transactionReferenceId = "1";
}
