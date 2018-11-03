package com.openbanking.api.ng.payload.account;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

@Data
public class AccountBalance {
    private String accountNumber = "0123456789";;
    private String accountName = "Adamu Alliu";
    private BigDecimal availableBalance = new BigDecimal(1000000);
    private BigDecimal clearedBalance = new BigDecimal(1000000);
    private BigDecimal unClearedBalance = new BigDecimal(1000000);
    private BigDecimal lienBalance = new BigDecimal(1000000);
    private Date date = new Date();

   
}
