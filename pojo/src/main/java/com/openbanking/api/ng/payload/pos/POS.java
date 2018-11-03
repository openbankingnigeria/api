package com.openbanking.api.ng.payload.pos;

import java.util.Date;

import javax.money.CurrencyUnit;
import javax.money.Monetary;

public class POS {
    private String terminalId = "1";
    private String merchantId = "1";
    private String merchantName = "Sodiq Fagbola";
    private String email = "sodiq@openbanking.com";
    private String phone = "09000000000";
    private Date dateDeployed;
    private CurrencyUnit currency = Monetary.getCurrency("NGN");
    private String terminalType;
    private String ptsa;
    private String ptsp;
    private String status;
    private double latitude = 100;
    private double longitude = 19;

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getDateDeployed() {
        return dateDeployed;
    }

    public void setDateDeployed(Date dateDeployed) {
        this.dateDeployed = dateDeployed;
    }

    public CurrencyUnit getCurrency() {
        return currency;
    }

    public void setCurrency(CurrencyUnit currency) {
        this.currency = currency;
    }

    public String getTerminalType() {
        return terminalType;
    }

    public void setTerminalType(String terminalType) {
        this.terminalType = terminalType;
    }

    public String getPtsa() {
        return ptsa;
    }

    public void setPtsa(String ptsa) {
        this.ptsa = ptsa;
    }

    public String getPtsp() {
        return ptsp;
    }

    public void setPtsp(String ptsp) {
        this.ptsp = ptsp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
