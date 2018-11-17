package ng.openbanking.api.payload.transaction;

import ng.openbanking.api.payload.definition.OperationStatus;

import lombok.Data;

@Data
public class MultipleTransferBankOutput {
    private String batchId = "1";
    private OperationStatus responseCode = OperationStatus.SUCCESSFUL;
    private String responseMessage = "Transfer Successful";
    private String numberOfTransaction = "1";
    private String transactionId = "1";

}
