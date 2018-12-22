package ng.openbanking.api.payload.card;

import lombok.Data;
import ng.openbanking.api.payload.base.BasePayload;
import ng.openbanking.api.payload.definition.CardBrand;

import javax.money.CurrencyUnit;
import javax.money.Monetary;

@Data
public class CardType  extends BasePayload {
    private CardBrand cardBrand;
    private String productId;
    private ng.openbanking.api.payload.definition.CardType cardType = ng.openbanking.api.payload.definition.CardType.CREDIT;
    private String productName;
    private CurrencyUnit currency = Monetary.getCurrency("NGN");
    private String purchasePrice;
    private int validityPeriod;
}
