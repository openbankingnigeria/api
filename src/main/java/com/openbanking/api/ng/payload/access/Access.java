package com.openbanking.api.ng.payload.access;
import java.util.Timer;

public class Access {
    private String accessToken;
    private Timer expirationTime;
    private String tokenType;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public Timer getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(Timer expirationTime) {
        this.expirationTime = expirationTime;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }
}
