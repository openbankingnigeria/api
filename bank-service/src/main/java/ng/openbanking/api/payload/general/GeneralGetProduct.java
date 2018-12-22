package ng.openbanking.api.payload.general;

import lombok.Data;
import ng.openbanking.api.payload.base.BasePayload;

@Data
public class GeneralGetProduct  extends BasePayload {
    private String productId;
    private String name;
    private String description;
    private String eligibility;
    private String currency;

}
