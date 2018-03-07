package com.openbanking.api.ng.payload.directdebit;

import com.openbanking.api.ng.definition.ChannelType;
import com.openbanking.api.ng.definition.Currency;

import java.util.Date;

public class DirectDebitSetup {
    private String referenceId = "1";
    private String sourceAccount = "0123456789";
    private String sourceAccountName = "Sodiq Fagbola";
    private String sourceEmail = "sodiq@openbanking.com";
    private String sourcePhone = "09000000000";
    private String sourceBvn = "817398172";
    private String sourceAmount = "10000";
    private Currency sourceCurrency = Currency.NAIRA;
    private String sourceNation = "Nigeria";
    private String sourceNarration = "Transfer";
    private String destinationBankCode = "012";
    private String merchantId = "1";
    private String productName = "Laptio";
    private String merchantAccount = "0123456789";
    private String merchantAccountName = "Seun Ogunjimi";
    private String merchantEmail = "seun@openbanking.com";
    private String merchantPhone = "09000000000";
    private String merchantBvn = "8190181921";
    private String amount = "1000";
    private Currency currency = Currency.NAIRA;
    private String minimumAmount = "100";
    private String maximumAmount = "1000000";
    private int numberOfTransactions;
    private Date startDate;
    private Date endDate;
    private Date recurringDate;
    private String recurringPeriod;
    private String transactionFee;
    private ChannelType channel;
    private int latitude = 12;
    private int longitude = 82;

    public ChannelType getChannel() {
        return channel;
    }

    public void setChannel(ChannelType channel) {
        this.channel = channel;
    }

    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public String getSourceAccount() {
        return sourceAccount;
    }

    public void setSourceAccount(String sourceAccount) {
        this.sourceAccount = sourceAccount;
    }

    public String getSourceAccountName() {
        return sourceAccountName;
    }

    public void setSourceAccountName(String sourceAccountName) {
        this.sourceAccountName = sourceAccountName;
    }

    public String getSourceEmail() {
        return sourceEmail;
    }

    public void setSourceEmail(String sourceEmail) {
        this.sourceEmail = sourceEmail;
    }

    public String getSourcePhone() {
        return sourcePhone;
    }

    public void setSourcePhone(String sourcePhone) {
        this.sourcePhone = sourcePhone;
    }

    public String getSourceBvn() {
        return sourceBvn;
    }

    public void setSourceBvn(String sourceBvn) {
        this.sourceBvn = sourceBvn;
    }

    public String getSourceAmount() {
        return sourceAmount;
    }

    public void setSourceAmount(String sourceAmount) {
        this.sourceAmount = sourceAmount;
    }

    public Currency getSourceCurrency() {
        return sourceCurrency;
    }

    public void setSourceCurrency(Currency sourceCurrency) {
        this.sourceCurrency = sourceCurrency;
    }

    public String getSourceNation() {
        return sourceNation;
    }

    public void setSourceNation(String sourceNation) {
        this.sourceNation = sourceNation;
    }

    public String getSourceNarration() {
        return sourceNarration;
    }

    public void setSourceNarration(String sourceNarration) {
        this.sourceNarration = sourceNarration;
    }

    public String getDestinationBankCode() {
        return destinationBankCode;
    }

    public void setDestinationBankCode(String destinationBankCode) {
        this.destinationBankCode = destinationBankCode;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getMerchantAccount() {
        return merchantAccount;
    }

    public void setMerchantAccount(String merchantAccount) {
        this.merchantAccount = merchantAccount;
    }

    public String getMerchantAccountName() {
        return merchantAccountName;
    }

    public void setMerchantAccountName(String merchantAccountName) {
        this.merchantAccountName = merchantAccountName;
    }

    public String getMerchantEmail() {
        return merchantEmail;
    }

    public void setMerchantEmail(String merchantEmail) {
        this.merchantEmail = merchantEmail;
    }

    public String getMerchantPhone() {
        return merchantPhone;
    }

    public void setMerchantPhone(String merchantPhone) {
        this.merchantPhone = merchantPhone;
    }

    public String getMerchantBvn() {
        return merchantBvn;
    }

    public void setMerchantBvn(String merchantBvn) {
        this.merchantBvn = merchantBvn;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public String getMinimumAmount() {
        return minimumAmount;
    }

    public void setMinimumAmount(String minimumAmount) {
        this.minimumAmount = minimumAmount;
    }

    public String getMaximumAmount() {
        return maximumAmount;
    }

    public void setMaximumAmount(String maximumAmount) {
        this.maximumAmount = maximumAmount;
    }

    public int getNumberOfTransactions() {
        return numberOfTransactions;
    }

    public void setNumberOfTransactions(int numberOfTransactions) {
        this.numberOfTransactions = numberOfTransactions;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getRecurringDate() {
        return recurringDate;
    }

    public void setRecurringDate(Date recurringDate) {
        this.recurringDate = recurringDate;
    }

    public String getRecurringPeriod() {
        return recurringPeriod;
    }

    public void setRecurringPeriod(String recurringPeriod) {
        this.recurringPeriod = recurringPeriod;
    }

    public String getTransactionFee() {
        return transactionFee;
    }

    public void setTransactionFee(String transactionFee) {
        this.transactionFee = transactionFee;
    }
}
