package com.openbanking.api.ng.payload.account;

import com.openbanking.api.ng.definition.AccountType;
import com.openbanking.api.ng.definition.Currency;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

public class Account {
    @ApiModelProperty(value = "10 digit NUBAN")
    private String accountNumber = "012345678";

    @ApiModelProperty(value = "The Customer ID as defined by the Bank")
    private String customerId;

    @ApiModelProperty(value = "The BVN tied to the Account")
    private String bvn = "";

    @ApiModelProperty(value = "The full Name registered with the Account")
    private String fullName = "Sodiq Fagbola";
    private String shortName = "Sodiq";
    private Currency currency = Currency.NAIRA;
    private Date accountOpeningDate;
    private Date lastTransactionDate;
    private String status = "Successful";
    private String bankSortCode = "012";
    private String accountBalance = "0123456789";
    private String phoneNumber = "090000000";
    private AccountType accountType = AccountType.CURRENT;
    private String accountManagerName = "Anaedu Anthony";
    private String accountManagerPhone = "08000000000";

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getBvn() {
        return bvn;
    }

    public void setBvn(String bvn) {
        this.bvn = bvn;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public Date getAccountOpeningDate() {
        return accountOpeningDate;
    }

    public void setAccountOpeningDate(Date accountOpeningDate) {
        this.accountOpeningDate = accountOpeningDate;
    }

    public Date getLastTransactionDate() {
        return lastTransactionDate;
    }

    public void setLastTransactionDate(Date lastTransactionDate) {
        this.lastTransactionDate = lastTransactionDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBankSortCode() {
        return bankSortCode;
    }

    public void setBankSortCode(String bankSortCode) {
        this.bankSortCode = bankSortCode;
    }

    public String getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(String accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public String getAccountManagerName() {
        return accountManagerName;
    }

    public void setAccountManagerName(String accountManagerName) {
        this.accountManagerName = accountManagerName;
    }

    public String getAccountManagerPhone() {
        return accountManagerPhone;
    }

    public void setAccountManagerPhone(String accountManagerPhone) {
        this.accountManagerPhone = accountManagerPhone;
    }
}
