package ng.openbanking.api.payload.directdebit;

import ng.openbanking.api.payload.definition.OperationStatus;

import lombok.Data;

@Data
public class DirectDebitSetupOutput {
    private OperationStatus responseCode;
    private String message;
    private String transactionReferenceId;

}
