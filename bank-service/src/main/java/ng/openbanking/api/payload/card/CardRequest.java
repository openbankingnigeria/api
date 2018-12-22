package ng.openbanking.api.payload.card;
import ng.openbanking.api.payload.base.BasePayload;
import ng.openbanking.api.payload.definition.CardPickupType;

import lombok.Data;

@Data
public class CardRequest  extends BasePayload {
    private String accountNumber;
    private String productId;
    private CardPickupType cardPickupType;
    private CardType cardType = new CardType();
    private String branchId;
    private String deliveryAddress;

}
