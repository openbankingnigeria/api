package ng.openbanking.api.payload.transaction;

import lombok.Data;
import ng.openbanking.api.payload.base.BasePayload;

@Data
public class GetStatement  extends BasePayload {
    private String accountNumber ;
    private String startDateAndendDate_Or_lastNumberOfRecords;

}
