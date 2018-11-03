package com.openbanking.api.ng.payload.investment;

import java.util.Date;

import javax.money.CurrencyUnit;
import javax.money.Monetary;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class InvestmentBook {
    private String productId = "0";
    private String accountNumber = "0123456789";
    private String amount = "5400"; // TODO should use MonetaryAmount here, too
    private CurrencyUnit currency = Monetary.getCurrency("EUR");
    
    @JsonFormat
    (shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy hh:mm:ss")
    private Date dateBooked;
    @JsonFormat
    (shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy hh:mm:ss")
    private Date maturityDate;

}

