package ng.openbanking.api.payload.card;
import ng.openbanking.api.payload.definition.CardPickupType;

import lombok.Data;

@Data
public class CardRequest {
    private String accountNumber = "0123456789";
    private String productId = "1";
    private CardPickupType cardPickupType = CardPickupType.HOME_DELIVERY;
    private CardType cardType = new CardType();
    private String branchId = "1";
    private String deliveryAddress = "Obalende, Lagos";

}
