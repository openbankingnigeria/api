package com.openbanking.api.ng.payload.account;

import java.util.Date;

public class AccountBalance {
    private String accountNumber;
    private String accountName;
    private String availiableBalance;
    private String clearedBalance;
    private String unClearedBalance;
    private String lienBalance;
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

    public String getAvailiableBalance() {
        return availiableBalance;
    }

    public void setAvailiableBalance(String availiableBalance) {
        this.availiableBalance = availiableBalance;
    }

    public String getClearedBalance() {
        return clearedBalance;
    }

    public void setClearedBalance(String clearedBalance) {
        this.clearedBalance = clearedBalance;
    }

    public String getUnClearedBalance() {
        return unClearedBalance;
    }

    public void setUnClearedBalance(String unClearedBalance) {
        this.unClearedBalance = unClearedBalance;
    }

    public String getLienBalance() {
        return lienBalance;
    }

    public void setLienBalance(String lienBalance) {
        this.lienBalance = lienBalance;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
