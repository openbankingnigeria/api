package com.openbanking.api.ng.payload.card;
import com.openbanking.api.ng.definition.CardPickupType;

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
