package ng.openbanking.api.payload.atm;

import lombok.Data;

@Data
public class ATM {

    private String atmId;

    private String terminalId;

    private String atmName;

    private double longitude;

    private double latitude;

    private String baseCurrency;

}
