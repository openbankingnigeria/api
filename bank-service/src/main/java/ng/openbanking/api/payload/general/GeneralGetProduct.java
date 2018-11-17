package ng.openbanking.api.payload.general;

import javax.money.CurrencyUnit;
import javax.money.Monetary;

import lombok.Data;

@Data
public class GeneralGetProduct {
    private String productId;
    private String name;
    private String description;
    private String eligibility;
    private String currency;

}
