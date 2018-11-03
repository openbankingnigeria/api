package com.openbanking.api.ng.payload.general;

import javax.money.CurrencyUnit;
import javax.money.Monetary;

import lombok.Data;

@Data
public class GeneralGetProduct {
    private String productId = "1";
    private String Name = "Laptop";
    private String description = "Macbook Pro";
    private String eligibility;
    private CurrencyUnit currency = Monetary.getCurrency("EUR");

}
