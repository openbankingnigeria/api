package ng.openbanking.api.payload.transaction;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import ng.openbanking.api.payload.base.BasePayload;
import ng.openbanking.api.payload.definition.OperationStatus;

import java.util.Date;

@Data
public class GetHoldOutput  extends BasePayload {

    private String accountNumber;
    private String holdReferenceId;
    private OperationStatus responseCode;
    private String respondeDescription;
    private String amount;
    private String reason;
    @JsonFormat
    (shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy hh:mm:ss")
    private Date startdate;
    @JsonFormat
    (shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy hh:mm:ss")
    private Date enddate;


}
