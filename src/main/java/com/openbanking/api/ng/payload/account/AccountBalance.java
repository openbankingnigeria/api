package com.openbanking.api.ng.payload.account;

import java.math.BigDecimal;
import java.util.Date;

public class AccountBalance {
    private String accountNumber;
    private String accountName;
    private BigDecimal availiableBalance;
    private BigDecimal clearedBalance;
    private BigDecimal unClearedBalance;
    private BigDecimal lienBalance;
    private Date date;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public BigDecimal getAvailiableBalance() {
        return availiableBalance;
    }

    public void setAvailiableBalance(BigDecimal availiableBalance) {
        this.availiableBalance = availiableBalance;
    }

    public BigDecimal getClearedBalance() {
        return clearedBalance;
    }

    public void setClearedBalance(BigDecimal clearedBalance) {
        this.clearedBalance = clearedBalance;
    }

    public BigDecimal getUnClearedBalance() {
        return unClearedBalance;
    }

    public void setUnClearedBalance(BigDecimal unClearedBalance) {
        this.unClearedBalance = unClearedBalance;
    }

    public BigDecimal getLienBalance() {
        return lienBalance;
    }

    public void setLienBalance(BigDecimal lienBalance) {
        this.lienBalance = lienBalance;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
