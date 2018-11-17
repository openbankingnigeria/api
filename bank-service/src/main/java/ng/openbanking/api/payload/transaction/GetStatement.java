package ng.openbanking.api.payload.transaction;

import lombok.Data;

@Data
public class GetStatement {
    private String accountNumber = "0123456789";
    private String startDateAndendDate_Or_lastNumberOfRecords;

}
