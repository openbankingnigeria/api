package ng.openbanking.api.payload.transaction;

import lombok.Data;
import ng.openbanking.api.payload.base.BasePayload;

import java.util.List;

@Data
public class MultipleTransfer  extends BasePayload {
    private String batchId;

    private String numberOfTransaction ;

    List<SingleTransfer> singleTransfer;

   
}
