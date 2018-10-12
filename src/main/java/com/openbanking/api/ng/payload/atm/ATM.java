package com.openbanking.api.ng.payload.atm;

import javax.money.CurrencyUnit;
import javax.money.Monetary;

public class ATM {

    private String atmId = "1";

    private String terminalId = "1";

    private String atmName = "Igbosere ATM";

    private double longitude = 32;

    private double latitude = 67;

    private CurrencyUnit baseCurrency = Monetary.getCurrency("NGN");

    public String getAtmId() {
        return atmId;
    }

    public void setAtmId(String atmId) {
        this.atmId = atmId;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getAtmName() {
        return atmName;
    }

    public void setAtmName(String atmName) {
        this.atmName = atmName;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public CurrencyUnit getBaseCurrency() {
        return baseCurrency;
    }

    public void setBaseCurrency(CurrencyUnit baseCurrency) {
        this.baseCurrency = baseCurrency;
    }
}
