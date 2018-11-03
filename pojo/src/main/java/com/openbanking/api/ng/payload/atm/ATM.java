package com.openbanking.api.ng.payload.atm;

import javax.money.CurrencyUnit;
import javax.money.Monetary;

import com.openbanking.api.ng.definition.OperationStatus;
import com.openbanking.api.ng.payload.ErrorResponse;

import lombok.Data;

@Data
public class ATM {

    private String atmId = "1";

    private String terminalId = "1";

    private String atmName = "Igbosere ATM";

    private double longitude = 32;

    private double latitude = 67;

    private CurrencyUnit baseCurrency = Monetary.getCurrency("NGN");

}
