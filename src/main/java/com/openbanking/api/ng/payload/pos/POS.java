package com.openbanking.api.ng.payload.pos;

import com.openbanking.api.ng.definition.Currency;

import java.util.Date;

public class POS {
    private String terminalId;
    private String merchantId;
    private String merchantName;
    private String email;
    private String phone;
    private Date dateDeployed;
    private Currency currency;
    private String terminalType;
    private String ptsa;
    private String ptsp;
    private String status;
    private int latitude;
    private int longitude;

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

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
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
}
