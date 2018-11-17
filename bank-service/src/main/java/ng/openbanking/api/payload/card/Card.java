package ng.openbanking.api.payload.card;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import ng.openbanking.api.payload.definition.CardType;

import lombok.Data;

@Data
public class Card {
    private String accountNumber;
    private String maskedPan;
    private String token;
    @JsonFormat
    (shape = JsonFormat.Shape.STRING, pattern = "MM/yyyy")
    private Date expiry ;
    private String issuerNumber ;
    private String cardName;
    private CardType cardType;

}
