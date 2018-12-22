package ng.openbanking.api.payload.card;

import lombok.Data;
import ng.openbanking.api.payload.base.BasePayload;

@Data
public class CardLimit  extends BasePayload {
    private String cardToken;
    private String Channel;
    private CardType cardType = new CardType();
    private String transactionType;
    private String periodType;
    private int maximumTransaction = 1;
    private String maxAmountPerTransaction;
    private String maxCumulativeAmount;
    private String outstandingTransaction;
    private String outstandingCumulativeAmount;

}
