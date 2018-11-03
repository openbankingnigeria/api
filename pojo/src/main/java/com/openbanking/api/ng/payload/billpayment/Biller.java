package com.openbanking.api.ng.payload.billpayment;

import javax.money.CurrencyUnit;
import javax.money.Monetary;

import com.openbanking.api.ng.definition.OperationStatus;
import com.openbanking.api.ng.payload.ErrorResponse;

import lombok.Data;

@Data
public class Biller {
    private String categoryId = "1";
    private String billerCategory = "Electricity";
    private String categoryDescription =  "Electricity Token";
    private String billerId = "1";
    private String nameOfBiller = "EKDEC";
    private String customerId = "1";
    private CurrencyUnit currency = Monetary.getCurrency("NGN");

}
