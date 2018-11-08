package com.openbanking.api.ng.payload.directdebit;

import com.openbanking.api.ng.definition.DirectDebitCancelReason;
import com.openbanking.api.ng.definition.OperationStatus;
import com.openbanking.api.ng.payload.ErrorResponse;

import lombok.Data;

@Data
public class DirectDebitCancelRequest {

    private String accountNumber;

    private String referenceNumber;

    private DirectDebitCancelReason directDebitCancelReason;
}
