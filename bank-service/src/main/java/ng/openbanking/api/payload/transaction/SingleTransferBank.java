package ng.openbanking.api.payload.transaction;

import lombok.Data;

@Data
public class SingleTransferBank extends SingleTransfer {
    private String destinationAccount = "0123456789";
    private String destinationAccountName = "Sodiq Fagbola";
    private String destinationBankCode = "012";

}
