package ng.openbanking.api.payload.transaction;

import ng.openbanking.api.payload.base.BasePayload;
import ng.openbanking.api.payload.definition.OperationStatus;

import lombok.Data;

@Data
public class MultipleTransferBankOutput  extends BasePayload {
    private String batchId;
    private OperationStatus responseCode;
    private String responseMessage;
    private String numberOfTransaction;
    private String transactionId;

}
