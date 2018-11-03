package com.openbanking.api.ng.payload.transaction;

import java.util.Date;

import lombok.Data;

@Data
public class PlaceHold {
   

    private String accountNumber = "0123456789";
    private String holdReferenceId;
    private String amount = "10000";
    private String reason;
    private Date startdate;
    private Date enddate;
}
