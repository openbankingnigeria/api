package ng.openbanking.api.payload.atm;

import lombok.Data;
import ng.openbanking.api.payload.base.BasePayload;

@Data
public class ATM  extends BasePayload {

    private String atmId;

    private String terminalId;

    private String atmName;

    private double longitude;

    private double latitude;

    private String baseCurrency;

}
