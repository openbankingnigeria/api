package ng.openbanking.api.payload.transaction;

import lombok.Data;

@Data
public class SingleTransferBank extends SingleTransfer {
    private String destinationAccount;
    private String destinationAccountName;
    private String destinationBankCode;

}
