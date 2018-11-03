package com.openbanking.api.ng.payload.account;

import java.util.Date;

import javax.money.CurrencyUnit;
import javax.money.Monetary;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.openbanking.api.ng.definition.AccountType;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class Account {
    @ApiModelProperty(value = "10 digit NUBAN")
    private String accountNumber = "0123456789";

    @ApiModelProperty(value = "The Customer ID as defined by the Bank")
    private String customerId;

    @ApiModelProperty(value = "The BVN tied to the Account")
    private String bvn = "";

    @ApiModelProperty(value = "The full Name registered with the Account") 
    private String fullName = "Sodiq Fagbola";
    private String shortName = "Sodiq";
    private CurrencyUnit currency = Monetary.getCurrency("NGN");
    @JsonFormat
    (shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy hh:mm:ss")
    private Date accountOpeningDate = new Date();
    @JsonFormat
    (shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy hh:mm:ss")
    private Date lastTransactionDate = new Date();
    private String status = "Successful";
    private String bankSortCode = "012";
    private String accountBalance = "0123456789";
    private String phoneNumber = "090000000";
    private AccountType accountType = AccountType.CURRENT;
    private String accountManagerName = "Anaedu Anthony";
    private String accountManagerPhone = "08000000000";

   
}
