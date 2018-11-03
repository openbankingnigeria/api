package com.openbanking.api.ng.payload.investment;

import java.util.Date;

import javax.money.CurrencyUnit;
import javax.money.Monetary;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.openbanking.api.ng.definition.InvestmentBookingType;

import lombok.Data;
@Data
public class Investment {
    private String investmentId = "1";
    private String productId = "1";
    private String accountNumber = "0123456780";
    private String amount = "5900";
    private CurrencyUnit currency = Monetary.getCurrency("EUR");
    @JsonFormat
    (shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy hh:mm:ss")
    private Date dateBooked;
    @JsonFormat
    (shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy hh:mm:ss")
    private Date maturityDate;
    private InvestmentBookingType bookingType = InvestmentBookingType.DISCOUNTED;
    private String interestDiscountRate;

}
