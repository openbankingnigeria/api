package ng.openbanking.api.payload.card;

import javax.money.CurrencyUnit;
import javax.money.Monetary;

import ng.openbanking.api.payload.definition.CardBrand;

import lombok.Data;

@Data
public class CardType {
    private CardBrand cardBrand = CardBrand.MASTER_CARD;
    private String productId = "1";
    private ng.openbanking.api.payload.definition.CardType cardType = ng.openbanking.api.payload.definition.CardType.CREDIT;
    private String productName;
    private CurrencyUnit currency = Monetary.getCurrency("NGN");
    private String purchasePrice = "10000";
    private int validityPeriod = 1;
}
