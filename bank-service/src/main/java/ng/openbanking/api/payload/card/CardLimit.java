package ng.openbanking.api.payload.card;

import lombok.Data;

@Data
public class CardLimit {
    private String cardToken;
    private String Channel;
    private CardType cardType = new CardType();
    private String transactionType = "";
    private String periodType;
    private int maximumTransaction = 1;
    private String maxAmountPerTransaction = "100000";
    private String maxCumulativeAmount = "1000000";
    private String outstandingTransaction = "1000000";
    private String outstandingCumulativeAmount = "10000";

}
