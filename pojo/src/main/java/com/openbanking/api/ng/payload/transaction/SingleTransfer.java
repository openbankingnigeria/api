package com.openbanking.api.ng.payload.transaction;

import java.math.BigDecimal;
import java.util.Date;

import javax.money.CurrencyUnit;
import javax.money.Monetary;

import com.openbanking.api.ng.definition.PeriodType;

import lombok.Data;

@Data
public class SingleTransfer {
    private String referenceId = "1";
    private String sourceAccount = "0123456789";
    private String sourceAccountName = "Sodiq Fagbola";
    private String sourceAmount = "100000"; // TODO use MonetaryAmount
    private CurrencyUnit sourceCurrency = Monetary.getCurrency("NGN");
    private String sourceNarration = "Single Transfer";
    private BigDecimal amount = new BigDecimal(1000000); // TODO use MonetaryAmount
    private CurrencyUnit currency = Monetary.getCurrency("NGN");
    private String destinationNarration;
    private String transactionFee = "100";
    private String channel;
    private double latitude = 100;
    private double longitude = 101;
    private Date transactionDate;
    private PeriodType interval;
    private Date startDate;
    private Date endDate;
    private int numberOfTime = 1;
}
