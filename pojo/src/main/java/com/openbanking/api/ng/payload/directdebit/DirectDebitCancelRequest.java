package com.openbanking.api.ng.payload.directdebit;

import com.openbanking.api.ng.definition.DirectDebitCancelReason;

public class DirectDebitCancelRequest {

    private String accountNumber = "0123456789";

    private String referenceNumber;

    private DirectDebitCancelReason directDebitCancelReason;
}
