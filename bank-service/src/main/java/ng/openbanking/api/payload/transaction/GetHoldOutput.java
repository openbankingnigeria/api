package ng.openbanking.api.payload.transaction;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import ng.openbanking.api.payload.definition.OperationStatus;

import lombok.Data;

@Data
public class GetHoldOutput {

    private String accountNumber = "0123456789";
    private String holdReferenceId = "1";
    private OperationStatus responseCode = OperationStatus.SUCCESSFUL;
    private String respondeDescription = "Operation Successful";
    private String amount = "10000";
    private String reason;
    @JsonFormat
    (shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy hh:mm:ss")
    private Date startdate;
    @JsonFormat
    (shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy hh:mm:ss")
    private Date enddate;


}
