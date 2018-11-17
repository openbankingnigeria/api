package ng.openbanking.api.payload.directdebit;

import ng.openbanking.api.payload.definition.DirectDebitCancelReason;

import lombok.Data;

@Data
public class DirectDebitCancelRequest {

    private String accountNumber;

    private String referenceNumber;

    private DirectDebitCancelReason directDebitCancelReason;
}
