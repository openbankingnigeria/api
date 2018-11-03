package com.openbanking.api.ng.payload.card;
import com.openbanking.api.ng.definition.CardType;
import java.util.Date;

public class Card {
    private String accountNumber = "0123456789";
    private String maskedPan = "012345678901";
    private String token;
    private Date expiry = new Date();
    private String issuerNumber = "1";
    private String cardName = "Sodiq Fagbola";
    private CardType cardType = CardType.CREDIT;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getMaskedPan() {
        return maskedPan;
    }

    public void setMaskedPan(String maskedPan) {
        this.maskedPan = maskedPan;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Date getExpiry() {
        return expiry;
    }

    public void setExpiry(Date expiry) {
        this.expiry = expiry;
    }

    public String getIssuerNumber() {
        return issuerNumber;
    }

    public void setIssuerNumber(String issuerNumber) {
        this.issuerNumber = issuerNumber;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }
}
