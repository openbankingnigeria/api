package ng.openbanking.api.payload.card;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import ng.openbanking.api.payload.base.BasePayload;
import ng.openbanking.api.payload.definition.CardType;

import java.util.Date;

@Data
public class Card  extends BasePayload {
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
