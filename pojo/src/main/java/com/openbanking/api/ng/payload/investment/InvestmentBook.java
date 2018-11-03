package com.openbanking.api.ng.payload.investment;

import java.util.Date;

import javax.money.CurrencyUnit;
import javax.money.Monetary;

import com.openbanking.api.ng.definition.OperationStatus;
import com.openbanking.api.ng.payload.ErrorResponse;

import lombok.Data;

@Data
public class InvestmentBook {
    private String productId = "0";
    private String accountNumber = "0123456789";
    private String amount = "5400"; // TODO should use MonetaryAmount here, too
    private CurrencyUnit currency = Monetary.getCurrency("EUR");
    private Date dateBooked;
    private Date maturityDate;

}

