package com.openbanking.api.ng.payload.directdebit;

import java.util.Date;

import javax.money.CurrencyUnit;
import javax.money.Monetary;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.openbanking.api.ng.definition.ChannelType;

import lombok.Data;

@Data
public class DirectDebitSetup {
    private String referenceId = "1";
    private String sourceAccount = "0123456789";
    private String sourceAccountName = "Sodiq Fagbola";
    private String sourceEmail = "sodiq@openbanking.com";
    private String sourcePhone = "09000000000";
    private String sourceBvn = "817398172";
    private String sourceAmount = "10000";
    private CurrencyUnit sourceCurrency = Monetary.getCurrency("NGN");;
    private String sourceNation = "Nigeria";
    private String sourceNarration = "Transfer";
    private String destinationBankCode = "012";
    private String merchantId = "1";
    private String productName = "Laptio";
    private String merchantAccount = "0123456789";
    private String merchantAccountName = "Seun Ogunjimi";
    private String merchantEmail = "seun@openbanking.com";
    private String merchantPhone = "09000000000";
    private String merchantBvn = "8190181921";
    private String amount = "1000";
    private CurrencyUnit currency = Monetary.getCurrency("NGN");;
    private String minimumAmount = "100";
    private String maximumAmount = "1000000";
    private int numberOfTransactions;
    @JsonFormat
    (shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private Date startDate;
    @JsonFormat
    (shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private Date endDate;
    private Date recurringDate;
    private String recurringPeriod;
    private String transactionFee;
    private ChannelType channel;
    private double latitude = 12;
    private double longitude = 82;

}
