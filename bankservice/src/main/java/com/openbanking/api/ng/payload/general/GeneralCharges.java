package com.openbanking.api.ng.payload.general;

import javax.money.CurrencyUnit;
import javax.money.Monetary;

import com.openbanking.api.ng.definition.OperationStatus;
import com.openbanking.api.ng.definition.TransactionType;
import com.openbanking.api.ng.payload.ErrorResponse;

import lombok.Data;

@Data
public class GeneralCharges {
    private String productName;
    private String productId;
    private TransactionType transactionType;
    private String standardType;
    private String standardChargeType;
    private String minimumChargeType;
    private String minimumCharge;
    private String maximumCharge;
    private String MaximumChargeType;
    private String taxRate;
    private String currency;

}
