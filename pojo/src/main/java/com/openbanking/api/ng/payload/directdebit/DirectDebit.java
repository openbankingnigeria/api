package com.openbanking.api.ng.payload.directdebit;

import java.util.Date;

import javax.money.CurrencyUnit;
import javax.money.Monetary;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.openbanking.api.ng.definition.ChannelType;

import lombok.Data;

@Data
public class DirectDebit {
    private String status = "Successful";
    private String referenceId = "1";
    private String sourceAccount = "0123456789";
    private String sourceAccountName = "Sodiq Fagbola";
    private String sourceEmail = "sodiq@openbanking.com";
    private String sourcePhone = "09000000000";
    private String sourceBvn = "0000000000";
    private String sourceAmount = "100000";
    private CurrencyUnit sourceCurrency = Monetary.getCurrency("NGN");;
    private String sourceNation = "Nigeria";
    private String sourceNarration = "Payment";
    private String destinationBankCode = "012";
    private String merchantId = "1";
    private String productName = "Laptop";
    private String merchantAccount = "0123456789";
    private String merchantAccountName = "Seun Ogunjimi";
    private String merchantEmail = "seun@openbanking.com";
    private String merchantPhone = "09000000000";
    private String merchantBvn = "9817281762";
    private String amount = "1000";
    private CurrencyUnit currency = Monetary.getCurrency("EUR");
    private String minimumAmount = "1000";
    private String maximumAmount = "200000";
    private int numberOfTransactions;
    @JsonFormat
    (shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private Date startDate;
    @JsonFormat
    (shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private Date endDate;
    private Date recurringDate;
    private String recurringPeriod;
    private String transactionFee = "100";
    private ChannelType channel;
    private double latitude = 192;
    private double longitude = 61;

}
