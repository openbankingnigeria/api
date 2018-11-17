package com.openbanking.api.ng.payload.investment;

import java.util.Date;

import javax.money.CurrencyUnit;
import javax.money.Monetary;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.openbanking.api.ng.definition.InvestmentBookingType;

import lombok.Data;
@Data
public class Investment {
    private String investmentId;
    private String productId ;
    private String accountNumber;
    private String amount ;
    private String currency;
    @JsonFormat
    (shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy hh:mm:ss")
    private Date dateBooked;
    @JsonFormat
    (shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy hh:mm:ss")
    private Date maturityDate;
    private InvestmentBookingType bookingType;
    private String interestDiscountRate;

}
