package ng.openbanking.api.payload.transaction;

import lombok.Data;
import ng.openbanking.api.payload.base.BasePayload;

@Data
public class PlaceHoldOutput  extends BasePayload {
    private String holdReferenceId;
    private String responseCode;
    private String responseDescription;

}
