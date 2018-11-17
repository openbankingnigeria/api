package ng.openbanking.api.payload.transaction;

import java.util.List;

import lombok.Data;

@Data
public class MultipleTransfer {
    private String batchId = "1";

    private String numberOfTransaction = "1";

    List<SingleTransfer> singleTransfer;

   
}
