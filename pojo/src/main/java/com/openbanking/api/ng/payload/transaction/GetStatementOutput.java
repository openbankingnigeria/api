package com.openbanking.api.ng.payload.transaction;

import java.sql.Time;
import java.util.Date;

import javax.money.CurrencyUnit;
import javax.money.Monetary;

import lombok.Data;


@Data
public class GetStatementOutput {
   

    private String accountNumber = "0123456789";
    private String transactionType;
    private CurrencyUnit currency = Monetary.getCurrency("NGN");
    private String narration = "Transfer";
    private String amount = "10000"; // TODO use MonetaryAmount
    private String channel;
    private String debitOrCredit;
    private String referenceId = "1";
    private Time transactionTime;
    private Date valueDate;
    private Date bookDate;
}
