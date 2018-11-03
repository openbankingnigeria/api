package com.openbanking.api.ng.payload.transaction;

import java.util.Date;

import com.openbanking.api.ng.definition.OperationStatus;

import lombok.Data;

@Data
public class GetHoldOutput {

    private String accountNumber = "0123456789";
    private String holdReferenceId = "1";
    private OperationStatus responseCode = OperationStatus.SUCCESSFUL;
    private String respondeDescription = "Operation Successful";
    private String amount = "10000";
    private String reason;
    private Date startdate;
    private Date enddate;


}
